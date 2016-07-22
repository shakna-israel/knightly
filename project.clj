(defproject knightly "0.1.0-SNAPSHOT"
  :description "A choose your own adventure."
  :url "https://github.com/shakna-israel/knightly"
  :license {:name "MIT License"
            :url "https://mit-license.org/"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot knightly.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
