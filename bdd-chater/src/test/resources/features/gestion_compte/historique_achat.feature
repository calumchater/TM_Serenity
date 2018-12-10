#language:fr
Fonctionnalité: Consulter son historique d'achats
  En tant que client
  Je souhaite consulter mon historique d'achats
  Afin de voir les articles que j'ai acheté dans le passé

   Scenario: 
      Soit un utilisateur connecté sur la page de gestion de compte
      Quand l'utilisateur clique sur Vos Commandes
      Alors il devrait voir ses commandes passées

	
   Scenario:
   	  Soit un utilisateur connecté sur son historique de commandes
   	  Lorsque l'utilisateur clique sur Masquer la premiere commande
   	  Alors il ne devrait plus voir la première commande