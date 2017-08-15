(ns site.core
  (:require [reagent.core :as r]
            [site.state :refer [app-state]]))


(r/render [app] (.getElementById "app" js/document))

(defn -main []
  (println "hello world"))
