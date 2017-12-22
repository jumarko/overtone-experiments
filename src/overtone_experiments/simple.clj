(ns overtone-experiments.simple
  (:require [overtone.core :as o]))

;; boot server first
(o/boot-internal-server)

;; or boot external server
#_(o/boot-external-sever)

;; or connect - you need to run server from SuperCollider app first
#_(o/connect-external-server 57110)


;;; Getting Started: https://github.com/overtone/overtone/wiki/Getting-Started
(o/definst foo [] (o/saw 220))

;; check `saw` documentation
(o/odoc o/saw)

;; make sound
(foo)

;; kill sound
(o/kill foo)

;; call `stop` if you need to kill audio fast
#_(o/stop)


;; insts can take arguments
(o/definst bar [freq 220] (o/saw freq))
(bar 110)
(o/kill bar)

;; multiple synths
(o/definst baz [freq 440] (* 0.3 (o/saw freq)))
(baz 220)
(baz 660)
(baz 990)
(o/kill baz)
