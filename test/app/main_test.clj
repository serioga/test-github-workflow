(ns app.main-test
  (:require [app.main :as main]
            [clojure.test :as test :refer [deftest]]))

(set! *warn-on-reflection* true)

(declare thrown?)

(deftest hello-test

  (test/is (= "Hello" (main/hello)))

  )
