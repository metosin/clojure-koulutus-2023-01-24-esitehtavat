(ns server.main
  (:gen-class)
  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [ring.adapter.jetty :as jetty]))


(defn ping [request]
  (when (= (:uri request) "/ping")
    {:status  200
     :body    "pong"
     :headers {"Content-Type" "text/plain; charset=utf-8"}}))


(defn index [{:keys [uri]}]
  (when (= uri "/")
    {:status  200
     :body    (-> (io/resource "public/index.html")
                  (io/input-stream))
     :headers {"Content-Type" "text/html; charset=utf-8"}}))


(defn js [{:keys [uri]}]
  (when (str/ends-with? uri ".js")
    (when-let [resource (io/resource (str "public" uri))]
      {:status  200
       :body    (io/input-stream resource)
       :headers {"Content-Type" "application/javascript; charset=utf-8"}})))


(defn not-found [request]
  {:status 404
   :body   (str "No route for " (:request-method request) " " (:uri request))})


(def handler (some-fn ping index js not-found))


(defn start []
  (jetty/run-jetty handler {:host  "localhost"
                            :port  3000
                            :join? false}))


(defn -main [& args]
  (println "Starting HTTP server on port 3000...")
  (start)
  (println "Server listening at http://localhost:3000"))
