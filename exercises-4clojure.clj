;;; Put your solutions to the assigned 4Clojure exercises here and commit
;;; back up to your fork on Github.

;;; What you enter is what whatever you'd put in the "Code which fills in the blank"
;;; box in 4Clojure. You're welcome to include other things here (helper definitions,
;;; scratch computations you found helpful, etc.), SO MAKE SURE YOU LABEL YOUR
;;; "ANSWERS" clearly.

;;; I've included a few examples below just to give you a sense of what I'm looking
;;; for.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #162: Logical falsity and true

; What I pasted in the box:

1

; because all the given expressions returned 1, for example:

(= 1 (if [] 1 0))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #15: Double Down

; What I pasted in the box:

#(* 2 %)

; which is an anonymous function that doubles its argument, for example:

(= (#(* 2 %) 11) 22)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem #10
20

;; problem 16
(fn [x] (str "Hello, " x "!"))

;; problem 17
'(6 7 8)

;; Problem 18
'(6 7)

;; Problem 20
#(nth % (- (count %) 2))

;; Problem 21
(fn nthy[x, y] (if (> y 0) (nthy (rest x) (- y 1)) (first x)))

;; Problem 23
(fn reverseList[x] (if (= (peek (vec x)) nil) [] (conj (reverseList (subvec (vec x) 1 (count (vec x)))) (get (vec x) 0) )))

;; Problem 25
filter odd?

;; Problem 37
"ABC"

;; Problem 40
(fn interp[x, y] (if (> (count y) 1) (concat (vector (get y 0) x) (interp x (subvec y 1 (count y)))) (vector (get y 0))))

;; Problem 43
(fn lol[t, p] (reverse ((fn blah [z, f] 
      (if (> (count z) 1) 
        (blah (first (rest z)) (conj f (first z))) 
        (conj f (first z)))) ((fn interleaveMain[x, y & [c]]
  (if (= c y)
  nil
  (remove nil? (list   
   ((fn interleaveHelper[l, c] 
      (if (< c (count l)) 
         (concat (list (nth l c)) (interleaveHelper l (+ c y))) 
         nil)) x 0 ) 
   (interleaveMain (rest x) y (if c (+ c 1) 1)) ) ) )) t p) '())))

;; Problem 44
(fn rotate[x, y] (
      if (< x 0)
        (rotate (+ x 1) (concat (list (last y)) (subvec (vec y) 0 (- (count y) 1))))
        (if (> x 0)
          (rotate (- x 1) (concat (rest y) (list (first y))))
          y
        )
      )
)

;; Problem 46
(fn [x] ((fn [y z] (x z y))))

;; Problem 47
4




