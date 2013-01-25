(defproject yolk-flies "0.0.1"
  :description "Yolk flies like bacon"
  :url "https://github.com/wilkes/yolk-flies"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [jayq "1.0.0"]
                 [prismatic/dommy "0.0.1"]]
  :plugins [[lein-cljsbuild "0.3.0"]]
  :hooks [leiningen.cljsbuild]
  :cljsbuild
  {:builds
   {:dev  {:source-paths ["src"]
           :compiler {:output-to "resources/js/main-debug.js"
                      :optimizations :whitespace
                      :pretty-print true}}
    :prod {:source-paths ["src"]
           :compiler {:output-to "resources/js/main.js"
                      :externs ["externs/jquery-1.8.js"
                                "externs/bacon.js"]
                      :optimizations :advanced
                      :pretty-print false}}}})
