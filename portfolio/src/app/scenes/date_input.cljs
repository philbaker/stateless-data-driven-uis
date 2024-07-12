(ns app.scenes.date-input
  (:require [app.ui.date-input :refer [DateInput]]
            [portfolio.dumdom :as portfolio :refer-macros [defscene]]))

(portfolio/configure-scenes
 {:title "Date input scenes"})

(defscene standard-input
  (DateInput {:placeholder "YYYY-MM-DD"}))

(defscene invalid-input
  (DateInput {:placeholder "YYYY-MM-DD"
              :value "31-31"
              :message "Format should be YYYY-MM-DD"
              :error? true}))

(defscene date-hint
  (DateInput {:placeholder "YYYY-MM-DD"
              :value "31"
              :message "Hint about date"}))
