(defproject todo-repl "0.1.0-SNAPSHOT"
  :description "todo-repl"
  :url "https://github.com/Pance/todo-repl"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.ocpsoft.prettytime/prettytime-nlp "3.0.2.Final"]]
  :repl-options {:init (do
                          (load "/todo-repl/core")
                          (use 'todo-repl.core)
                          (load-file "test/todo-repl/core_test.clj")
                          (use 'todo-repl.core-test))})
