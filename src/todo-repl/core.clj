(ns todo-repl.core)

(defn new-task [name due-by due-after context url]
  {:name name
	 :due-after due-after
   :due-by due-by
   :context context
	 :url []
   :created (str (java.util.Date.))
	 })

;(new-task "Do the dishes" "today")

(defn new-task-better [{:keys [name due-after due-by context url]
                   :or {due-by "never"
												due-after "never"
                        context nil
												url [{"" "http://"}]}}]
  (new-task name due-after due-by context url))

(defn add-new-task-to [x y]
	(cons (new-task-better x) y))

;; I want a function that evals ":name do the dishes :due today"
;; to {:name "do the dishes" :due "today"}
