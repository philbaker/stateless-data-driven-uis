(ns app.ui.date-form
  (:require [app.ui.button :refer [Button]]
            [app.ui.date-input :refer [DateInput]]
            [app.ui.date-range-input :refer [DateRangeInput]]
            [dumdom.core :as d]))

(d/defcomponent DateForm [{:keys [date-field date-range button]}]
  [:div {:class "p-4 mx-auto"}
   (DateInput (assoc date-field :class "mt-4"))
   (DateRangeInput (assoc date-range :class "mt-10"))
   (Button (assoc button :class "mt-10"))])
