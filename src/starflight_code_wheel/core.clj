(ns starflight-code-wheel.core)

(def outer-column-headings
  ["Arth" "Thoss/Eleran" "Harrison's\nBase" "Sphexi" "Spewta" "Earth" "Mardan 2"
   "NewnScotland" "Koann 3" "Heaven" "Uhlek\nBrain World" "Gaal" "Akteron"
   "Nirvana" "The Staff" "The Cross" "Pythagoras" "The 4\nSeedlings" "The Axe"
   "City of\nAncients" "Mars" "Crystal\nPlanet" "Elan" "Votiputox"])

(def inner-column-headings
  ["Dodeca-\nhedron" "Black\nBox" "Moebius\nDevice" "Crystal\nOrb"
   "Frightening\n Apparatus" "Rod\nDevice" "Red\nCylinder" "Rubber\nWidget"
   "Throbbing\nMass" "Surprising\nUtensil" "Wee Green\nBlobbie" "Tesseract"
   "Whining\nOrb" "Bladed\nToy" "Nice\nThing" "Ellipsoid" "Humming\nGizzy"
   "Glowing\nDisk" "Black\nEgg" "Amazing\nArtifact" "ShimmeringnBall"
   "Flat\nDevice" "Blue\nBauble" "Crystal\nCone"])

(def races
  ["Velox" "Thrynn" "Elowan" "Mechans" "Spemin" "Gazurtoid" "Uhlek" "Minstrels"
   "Mysterions"])

(def codes
  [[877443 100119 780433 10174 10180 93385 47038 7754 9303]
   [336818 743593 991615 90610 70354 10190 36602 9291 3165]
   [944682 981215 562162 51932 62683 66682 62394 6532 1941]
   [536992 555412 864256 72507 74048 90020 10210 8073 5324]
   [100139 133909 875009 12957 10200 75292 45830 7160 4104]
   [259789 218651 100151 79279 67312 18200 95267 3793 9026]
   [298483 726134 100163 33548 84209 76235 10240 5647 9038]
   [556684 100175 701897 10230 97117 40944 93144 7503 6596]
   [600601 347633 877210 10246 48934 10260 19173 2300 5691]
   [334143 307434 483347 64296 69521 60319 21033 4160 2946]
   [532485 632874 210444 96244 84584 42226 90742 1110 9413]
   [153669 404795 100253 15218 35793 62817 22917 3895 1760]
   [810980 602834 100277 83396 59456 46570 62237 6375 1170]
   [924289 256564 902494 22943 73911 87734 32177 8550 1810]
   [100022 873662 889321 77617 92052 90218 77027 8885 5522]
   [922505 100052 461700 10721 89933 49417 89337 3082 1868]
   [876180 100084 987316 90880 17820 23968 56213 7412 8347]
   [250241 537286 758635 76792 97060 15713 21556 7139 7767]
   [975718 313212 124102 10209 18811 16670 90360 2877 8110]
   [776513 100192 298209 69498 10253 65214 84565 3836 1701]
   [100232 228865 462801 86116 87657 31791 76623 9095 3583]
   [153078 137421 834006 76948 88006 10036 10046 5146 6081]
   [444465 382451 800894 17127 10072 10080 71490 5190 6739]
   [157773 850672 270444 69977 71518 22713 26100 1245 3101]])

(defn decode [outer-column inner-column race]
  (let [row (mod (- outer-column inner-column) 24)]
    (get-in codes [row race])))