(ns user
  (:require [shadow.cljs.devtools.api :as shadow]
            [server.main :as server])
  (:import [org.eclipse.jetty.server Server]))


#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn repl-web []
  (shadow/repl :web))


(def jetty-server (atom nil))


(defn reset []
  (require 'server.main :reload)
  (swap! jetty-server (fn [^Server jetty]
                        (when jetty
                          (.stop jetty))
                        (server/start))))


(comment

  (reset)
  (.stop @jetty-server)

  ;
  )