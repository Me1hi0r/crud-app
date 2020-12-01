(ns core)

(defn ^:dev/after-load start []
  (js/console.log "start"))

(defn ^:export init []
  (js/console.log "init")
  (start))

(js/alert "Test-cljs")

(defn ^:dev/before-load stop []
  (js/console.log "stop"))
