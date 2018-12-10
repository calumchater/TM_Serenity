#language:fr

Feature: Ajout panier
	En tant qu'utilisateur sur la page d'informations d'un objet
	Je souhaite pouvoir ajouter des objets a mon panier
	Afin de pouvoir les acheter tous en meme temps
	
	
	Scenario: Ajouter un objet au panier
		Soit un utilisateur sur la page d'accueil
		Lorsqu'il consulte les Ventes Flash et qu'il ajoute le premier objet à son panier
		Alors l'objet devrait etre ajouté à son panier
	
	Scenario: Ouvrir le panier
		Soit un utilisateur sur la page d'accueil
		Et qu'il a ajouté un objet à son panier
		Lorsqu'il clique sur Voir son panier
		Alors il devrait voir l'objet dans son panier

	Scenario: Acheter plus d'objets du meme type
		Soit un utilisateur ayant ajouté un objet à son panier
		Lorsqu'il consulte son panier
		Et qu'il sélectionne un autre nombre d'objets que initialement
		Alors le nombre d'objets de ce type devrait se mettre à jour