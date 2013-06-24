(ns todo-repl.core)

(defn new-task [name due-date context]
  {:name name
   :due due-date
   :context context
   :created (str (java.util.Date.))})

;(new-task "Do the dishes" "today")

(defn new-task-better [{:keys [name due context]
                   :or {due "never"
                        context ""}}]
  (new-task name due context))


;; I want a function that evals ":name do the dishes :due today"
;; to {:name "do the dishes" :due "today"}

