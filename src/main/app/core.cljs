(ns app.core
  (:require [clojure.walk :as walk]
            [dumdom.core :as d]
            [app.form :as form]
            [app.demo :as demo]
            [app.ui.date-form :refer [DateForm]]))

(defonce store (atom {}))
(defonce element (js/document.getElementById "app"))

(defn execute-actions [store actions]
  (doseq [[action & args] actions]
    (apply prn 'Execute action args)
    (case action
      :action/save (apply swap! store assoc-in args))))

(defn register-actions [store]
  (d/set-event-handler!
   (fn [e actions]
     (->> actions
          (walk/postwalk
           (fn [x]
             (if (= :event/target.value x)
               (some-> e .-target .-value)
               x)))
          (execute-actions store)))))

(defn render [element state]
  (d/render (DateForm (form/prepare-ui-data state)) element))

(defn start [store element]
  (register-actions store)
  (add-watch store ::app
    (fn [_ _ _ state]
      (render element state)))
  (render element @store))

(defn ^:export main []
  (start store element))
