(ns Hello
  (:gen-class)
  (:require [clojure.set :as set]))

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

(defn checkFileExist [] (println (.exists (clojure.java.io/file "Example.txt"))))

(defn strFormat [] (format "Hello %s" "World"))

(defn strCount [] (count "Hello World"))

(defn strSubs [] (subs "Hello World" 0 3))

(defn strCompare [] (compare "am" "ad"))

(defn strLowerCase [] (clojure.string/lower-case "Hello World"))

(defn strUpperCase [] (clojure.string/upper-case "hello world"))

(defn strJoin [] (clojure.string/join "," [1, 2, 3, 4]))

(defn strSplit [] (clojure.string/split "1,2,3,4" #","))

(defn strSplitLine [] (clojure.string/split-lines "Hello\nWorld"))

(defn strReverse [] (clojure.string/reverse "123456789"))

(defn strReplace [] (clojure.string/replace "Hello World" #" " ","))

(defn strTrim [] (clojure.string/trim "   H e l l o W o r l d  1"))

(defn listSample [] (list 1 2 3 4))

(defn listConcat [] (list* 1 [4, 5, 6]))

(defn listFirst [] (first [-1, 7, 9]))

(defn indexList [] (nth [1, 2, 3] 0))

(defn listCons [] (cons 0 (list 1 2 3)))

(defn listConj [] (conj [1, 2, 3] 4 5 6))

(defn listRest [] (rest (list 2 3 4 5)))

(defn listContains [] (contains? [1 2 3] 2))

(defn setSample [] (set '(1 1 2 2 3 3 4 4)))

(defn setSort [] (sorted-set 1 1 2 2 3 3 4 4))

(defn indexSet []
  (println (set '(1 2 3)))
  (println (get (set '(1 2 3)) 1))
  (println (get (set '(1 2 3)) 2))
  (println (get (set '(1 2 3)) 3)))

(defn setContains [] (contains? (set '(1 2 3)) 4))

(defn setConj [] (conj (set '(1 2 3)) 4 5 6 1))

(defn setDisj [] (disj (set '(1 2 3)) 2))

(defn setUnion [] (set/union #{1 2} #{2 3} #{4 5}))

(defn setDiff [] (set/difference #{1 2} #{2 3}))

(defn setInter [] (set/intersection #{1 2} #{2 3}))

(defn setSubset [] (println (set/subset? #{1 2} #{2 3})) (println (set/subset? #{1 2} #{1 2 3})))

(defn setSuper [] (println (set/superset? #{1 2 3} #{1 2})) (println (set/superset? #{1 2 3} #{2 3 4})))

(defn vectorOfDemo [] (vector-of :char 65 66 67))

(defn indexVector [] (nth (vector 1 2 3) 0))

(defn vectorConj [] (conj (vector 1 2 3) 5 6 7))

(defn vectorPop [] (pop (vector 1 2 3)))

(defn vectorSub [] (subvec (vector 1 2 3 4 5) 1 3))

(defn mapDemo [] (def simpleMap (hash-map "z" "1" "x" "2" "a" "3")) (println simpleMap))

(defn sortMapDemo [] (def sortMap (sorted-map "z" "1" "x" "2" "a" "2")) (println sortMap))


(def simpleMap (hash-map "a" "1" "b" "2" "c" "3"))

(defn mapGet [] (get simpleMap "a"))

(defn mapContains [] (contains? simpleMap "z"))

(defn mapFind [] (find simpleMap "a"))

(defn mapKeys [] (keys simpleMap))

(defn mapValues [] (vals simpleMap))

(defn mapRemoveKey [] (println (dissoc simpleMap "b")) (println simpleMap))

(defn mapMerge [] (def map1 (hash-map "a" 1 "b" 2 "c" 3)) (def map2 (hash-map "a" 2 "b" 3 "d" 10 "z" 20)) (merge-with - map1 map2))

(defn mapKeyRename [] (println (set/rename-keys simpleMap {"a" "newA" "b" "newB"})))


(defn maoRevert [] (println (clojure.set/map-invert simpleMap)))

(maoRevert)


