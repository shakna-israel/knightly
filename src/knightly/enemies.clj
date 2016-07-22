(ns knightly.enemies
  (:gen-class))

(defn new-base-enemy
  []
  (list (+ 50 (rand-int 50)) (+ 50 (rand-int 50))))

(def enemy-attack-statements
  (list
    "The enemy attacked you!"
))

(defn enemy-attack
  [enemy-health enemy-magic]
  (println (rand-nth (enemy-attack-statements)))
  (rand-int 10)
)

(defn encounter
  [player-health player-magic]
)
