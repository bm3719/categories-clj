(defproject categories-clj "0.1.0-SNAPSHOT"
  :description "Categories for Clojure presentation codebase."
  :license {:name "GNU Public License Version 3"
            :url "http://www.gnu.org/copyleft/gpl.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [funcool/cats "2.0.0"]]
  :repl-options {:init-ns user}
  :global-vars {*print-length* 100}
  :profiles {:dev {:resource-paths ["dev"]
                   :dependencies [[org.clojure/tools.namespace "0.2.11"]]}})
