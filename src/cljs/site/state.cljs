(ns site.state
  (:require [reagent.core :as r]))

(defonce app-state (r/atom {:page "home"}))
