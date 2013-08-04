(ns todo-repl.core-test
  (:use clojure.test
        todo-repl.core))

(def test-tasklist
  (map new-task-better [{:name "Do the dishes"
                         :due-by "1-1-2000"
                         :context "cleaning"}
                        {:name "Wipe the kitchen counters"
                         :due-by "1-1-2000"
                         :context "cleaning"}
                        {:name "Call back that dude"
                         :due-after "1-3-2000"
                         :context "contact"}
                        {:name "Go to the grocery store"
                         :due-after "1-1-2000"
                         :context "errands"}
                        {:name "Check out this mix"
                         :context "music"
                         :url [{:label "link"
                                :url "https://soundcloud.com/"}]}]))


(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))
