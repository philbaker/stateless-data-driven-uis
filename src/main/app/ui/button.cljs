(ns app.ui.button
  (:require [dumdom.core :as d]))

(d/defcomponent Button [{:keys [class text enabled? actions]}]
  [:button {:class (str class " p-2 rounded text-sm "
                     (if enabled? 
                       "bg-gray-800 text-white"
                       "bg-gray-200 cursor-not-allowed text-gray-400"))
            :disabled (false? enabled?)
            :on-click actions}
   text])
