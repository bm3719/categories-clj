(ns categories-clj.core
  (:require [cats.core :as cats]
            [cats.monad.maybe :as maybe]))

;; Hi, I'm genderfluid.  Thanks to Tumblr and George Mason University, I've
;; accumulated a list of the genders I fluidly fluctuate between.
(def my-genders [;; Your gender can only be described as "you".
                 "egogender"
                 ;; A gender that seems there but shallow, then upon inspection
                 ;; is naught but a wisp of the gender you thought it was.
                 "vapogender"
                 ;; Similar to a boy, but on a non-intersecting plane.
                 "proxvir"
                 ;; Being of all genders at once.
                 "omnigender"
                 ;; Having a feeling of a lack of a gender that feels neutral.
                 "neutrois"
                 ;; Feeling a small part of a gender, but the rest being other.
                 "nanogender"
                 ;; A soft, subdued gender.
                 "molligender"
                 ;; Similar to a girl, but on a non-intersecting plane.
                 "juxera"
                 ;; A gender that shares qualities with water.
                 "hydrogender"])

;; Luckily, it's completely random which gender I am at any time.  The only
;; problem is that I'm no gender at all about half the time.
(defn query-gender []
  (rand-nth [(rand-nth my-genders) nil]))

;; One problem though, I've discovered that I'm meta-phasing genderfluid to
;; demifluid!  All my genders are now demi-genders!
