(ns knightly.core
  (:gen-class))

(comment "
  Knightly
  --------
  A choose your own adventure.
  ============================

  TODO:
  -----
  * Base enemy type
  * Fighting mechanics
  * Extended enemy types
  * Random encounters
  * World map
  * World objects
  * Base neutral type
  * Extended neutral types
  * Trading mechanics
  * Looting mechanics
  * Crime mechanics
  * Player movements
  * Tests
  * Base Questline
  * Extended Questlines
  * Player journal
  * Fast-travel mechanic

")
X
(def player
  ; Health, Magic
  (list 100 100))

(defn get-player-health
  []
  (nth player 0))

(defn player-alive?
  []
  (if (pos? (get-player-health))
    true
    false))

(defn get-player-magic
  []
  (nth player 1))

(defn player-can-magic?
  []
  (if (pos? (get-player-magic))
    true
    false))

(defn set-player-health
  [amount]
  (def player (list amount (get-player-magic))))

(defn set-player-magic
  [amount]
  (def player (list (get-player-health) amount)))

(defn -main
  "The entry point of our players"
  [& args]
  (while true
    (if (player-alive?)
      ((fn []
        (println "Game goes here.")
        (set-player-health (dec (get-player-health)))
      ))
      ((fn []
        (println "You died.")
        (System/exit 0))))))
