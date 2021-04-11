(ns Hello
  (:gen-class)
  )

(defn hello-world "hell world program" [world] (println (format "Hello, %s" world)))

(defn printExample []
  (def x 1)
  (def y 1.25)
  (def str1 "Hello")
  (def status true)
  (println x)
  (println y)
  (println str1)
  (println status)
  )

(defn whileExample []
  (def x (atom 1))
  (while (< @x 5)
    (println @x)
    (swap! x inc)

    )
  )

(def n [1 2 3])
(defn foreExample []
  (doseq [m n]
    (println m)
    )
  )

(defn foriExample []
  (dotimes [n 5]
    (println n)
    )

  )
(defn multiJudgement []
  (if (and (= 2 2) (< 3 3))
    (do (println "equals") (println "true"))
    (do (println "not equals") (println "false"))
    )
  )

(defn condExample [m]
  (cond
    (= m 5) (println "m = 5")
    (= m 10) (println "m = 10")
    :else (println "x is not defined")
    ))

(defn anonymousFun [] (
                   (fn [x] (* x 2)) 3
                   ))

(defn multiParamFunc [x y] (println (* 2 x y)))

(defn unfixedParamFunc [message & other]
  (str message (clojure.string/join "," other))
  )



(defn typeCheck [] (def x 5) (def y 5.25) (println (type x)) (println (type y)))

(defn recursion []
  (loop [i 0]
    (when (< i 5)
      (println i)
      (recur (inc i))
      )
    )
  )

(defn readFileAll []
  (def string1 (slurp "Example.txt"))
  (println string1)
  )

(defn readFileLineByLine []
  (with-open [rdr (clojure.java.io/reader "Example.txt")]
    (reduce conj [] (line-seq rdr))))

(defn writeFileCover [] (spit "Example.txt" "you are best"))


(defn writeFileAppend [] (with-open [w (clojure.java.io/writer "Example.txt" :append true)]
                     (.write w (str "\r\nhello" "\r\nworld"
                                    ))))

(defn checkFileExist [] )

(example15)