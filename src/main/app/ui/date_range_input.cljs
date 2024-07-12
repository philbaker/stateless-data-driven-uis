(ns app.ui.date-range-input
  (:require [dumdom.core :as d]
            [app.ui.date-input :refer [DateInput]]))

(d/defcomponent DateRangeInput [{:keys [class from to message error?]}]
  [:div {:class class}
   [:div {:class "flex flex-col sm:flex-row sm:items-center space-y-2 sm:space-y-0"}
    (DateInput from)
    (DateInput to)]
   (when message
     [:p {:class (when error? "absolute text-red-500 text-sm mt-1")}
      message])])
