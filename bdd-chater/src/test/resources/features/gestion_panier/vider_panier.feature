#language:fr

Fonctionnalité
	En tant qu'utilisateur pauvre du site
	Je souhaite pouvoir enlever des objets de mon panier
	Afin de ne pas etre à découvert
	
	
	Scenario: Retirer un objet du panier
		Soit un utilisateur ayant ajouté un objet à son panier
		Lorsqu'il consulte son panier
		Et qu'il clique sur Supprimer sur l'objet
		Alors l'objet devrait disparaitre de son panier
	
	
	Scenario: Mettre de côté
		Soit un utilisateur ayant ajouté un objet à son panier
		Lorsqu'il consulte son panier
		Et qu'il clique sur Mettre de coté sur l'objet
		Alors l'objet devrait disparaitre de son panier