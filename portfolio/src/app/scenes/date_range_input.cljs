(ns app.scenes.date-range-input
  (:require [app.ui.date-range-input :refer [DateRangeInput]]
            [portfolio.dumdom :as portfolio :refer-macros [defscene]]))

(portfolio/configure-scenes
 {:title "Date range input scenes"})

(defscene standard-input
  (DateRangeInput
    {:from {:label "From"
            :placeholder "YYYY-MM-DD"}
     :to {:label "To"
          :placeholder "YYYY-MM-DD"}}))

(defscene range-error
  (DateRangeInput
    {:from {:label "From"
            :value "2024-09-17"
            :placeholder "YYYY-MM-DD"
            :error? true}
     :to {:label "To"
          :value "2024-09-08"
          :placeholder "YYYY-MM-DD"}
     :message "The start date should be earlier than the end date"
     :error? true}))
