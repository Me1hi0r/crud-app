(defproject crud-app "0.1.0-SNAPSHOT"
  :description "Demo crud app for health samurai"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/java.jdbc "0.7.11"]
                  [org.postgresql/postgresql "42.2.18"]]
  :source-paths ["src"]
  :test-paths ["test"]
  :clean-targets ^{:protect false} ["resources/public/cljs-out/"
                                    :target]
  :injections [(use 'demo.crud-test)]
  :repl-options {:init-ns demo.crud-test}
  :profiles {:uberjar {:aot :all}

             :cljs {:source-paths ["src"]

                    :dependencies [[org.clojure/clojurescript "1.10.773"]
                                   [thheller/shadow-cljs "2.11.4"]
                                   [binaryage/devtools "1.0.2"]]}})

