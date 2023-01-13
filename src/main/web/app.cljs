(ns web.app)

(defn ^:export start []
  (-> (js/document.getElementById "app")
      (.-innerText)
      (set! "All systems are GO!")))
