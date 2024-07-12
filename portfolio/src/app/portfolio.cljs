(ns app.portfolio
  (:require [portfolio.ui :as ui]
            [portfolio.ui.search :as search]
            [app.scenes.button]
            [app.scenes.date-form]
            [app.scenes.date-input]
            [app.scenes.date-range-input]))

::app.scenes.date-form/keep
::app.scenes.button/keep
::app.scenes.date-input/keep
::app.scenes.date-range-input/keep

(defn ^:dev/after-load start []
  (ui/start!
    {:config 
     {:css-paths ["/app.css"]
      :viewport/options [{:title "Auto"
                          :value {:viewport/width "100%"
                                  :viewport/height "100%"}}
                         {:title "Medium"
                          :value {:viewport/width 768
                                  :viewport/height 600}}
                         {:title "iPhone 12 / 13 Pro"
                          :value {:viewport/width 390
                                  :viewport/height 844}}
                         {:title "iPhone SE"
                          :value {:viewport/width 375
                                  :viewport/height 667}}]
      :viewport/defaults {:viewport/padding [32 32 16 16]}}
     :index (search/create-index)}))

(defn ^:export main []
  (start)
)
