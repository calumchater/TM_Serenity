#language: fr  
    
Fonctionnalité: Filtrer par prix
  En tant qu'étudiant cherchant à faire un cadeau
  Je souhaite voir des articles coutant un certain prix
  Afin de trouver un cadeau qui rentre dans mon petit budget étudiant


	Scenario: Trier par prix
		Soit un utilisateur sur la page de résultats pour le mot clé "Drone"
		Lorsqu'il sélectionne Trier par prix décroissant
		Alors les prix devraient etre triés par ordre décroissant
		
		
	Scenario: Filtrer par prix
		Soit un utilisateur sur la page de résultats pour le mot clé "Drone"
		Lorsqu'il sélectionne 100 euros comme prix min
		Lorsqu'il sélectionne 500 euros comme prix max
		Alors il devrait obtenir des résultats entre 100 et 500 euros

    