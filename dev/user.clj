;;;; This is a dev namespace to contain utility functions useful for
;;;; interacting with the data at the REPL, or for general development.
(ns user
  (:require [categories-clj.core :as core]
            [cats.core :as cats]
            [cats.monad.maybe :as maybe]))

;; Let's make some Maybe objects.
(maybe/just 2)
(maybe/nothing)

;; What's the type of these things?

;; Oh, we're deftyping two classes.

;; We need functions like maybe/maybe? to tie them together.

;; We even have this:
(maybe/from-maybe (maybe/just 1))

;; In Haskell, that would be a function of type:
;; from-maybe :: (Maybe m) => m a -> a
;; which is not possible.

;; What about fmap?
(cats/fmap #(+ % 1) (maybe/just 1))

(cats/fmap #(+ % 1) (maybe/nothing))

