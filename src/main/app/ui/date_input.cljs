(ns app.ui.date-input
  (:require [dumdom.core :as d]))

(d/defcomponent DateInput [{:keys [class message error? value placeholder input-actions blur-actions label]}]
  [:div {:class class}
   [:div {:class "flex flex-col mr-4"}
    [:label {:class "text-sm pl-1"
             :for (str "date-input-" label)}
     label]
    [:input {:class (str "rounded placeholder:text-gray-400 relative p-2 "
                         (if error? "border-red-500" "border-gray-200" ))
             :id (str "date-input-" label)
             :type "text"
             :value value
             :placeholder placeholder
             :on-input input-actions
             :on-blur blur-actions}]]
   (when message
     [:p {:class (str "absolute text-sm mt-1 "
                      (if error? "text-red-500" "text-gray-800"))}
      message])])
