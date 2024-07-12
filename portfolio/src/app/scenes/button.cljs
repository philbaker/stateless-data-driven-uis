(ns app.scenes.button
  (:require [app.ui.button :as button]
            [portfolio.dumdom :as portfolio :refer-macros [defscene]]))

(portfolio/configure-scenes
 {:title "Button scenes"})

(defscene standard-button
  (button/Button {:text "Submit"
                  :enabled? true}))

(defscene disabled-button
  (button/Button {:text "Submit"
                  :enabled? false}))
