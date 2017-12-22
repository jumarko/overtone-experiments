(defproject overtone-experiments "0.1.0-SNAPSHOT"
  :description "Simple experiments with overtone music library."
  :url "https://github.com/jumarko/overtone-experiments"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [overtone "0.10.3"]]
  :main ^:skip-aot overtone-experiments.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
