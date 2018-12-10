#language:fr

Fonctionnalite:
	En tant qu'utilisateur sur la page d'accueil
	Je souhaite pouvoir changer mes informations de livraison
	Afin de pouvoir connaitre les possibilités d'envoi des objets sans me connecter
	
	Scenario: Ouvrir le changement d'adresse
		Soit un utilisateur sur la page d'accueil
		Lorsqu'il clique sur Son Adresse de Livraison actuelle
		Alors une page de changement d'adresse devrait s'afficher
		
	Scenario: Modifier le code postal de l'adresse actuelle
		Soit un utilisateur sur la page d'accueil
		Et qu'il a cliqué sur son Adresse de Livraison actuelle
		Lorsqu'il change la valeur du code postal à 59120
		Alors le code postal actuel devrait etre 59120
		
	Scenario: Modifier le pays de l'adresse
		Soit un utilisateur sur la page d'accueil
		Et qu'il a cliqué sur son Adresse de Livraison actuelle
		Lorsqu'il clique sur la liste de pays
		Alors une liste de tous les pays devrait s'afficher