#language:fr

Fonctionnalite: 
	En tant qu'utilisateur souhaitant connaitre le prix de sa commande
	Je souhaite pouvoir voir le montant actuel
	Afin de savoir si j'ai dépasse mon budget
	
	Scenario: Mise a jour du prix ajout objet
		Soit un utilisateur ayant un panier vide
		Lorsqu'il ajoute un objet à son panier
		Alors son montant de commande devrait etre le prix de l'objet
	
	
	Scenario: Mise a jour du prix achat de plus d'objets
		Soit un utilisateur ayant ajouté un objet à son panier
		Lorsqu'il change la quantité de l'objet dans son panier
		Alors le montant devrait se mettre à jour 