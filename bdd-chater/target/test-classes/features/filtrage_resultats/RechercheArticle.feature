# language: fr
Fonctionnalité: Rechercher par mot clé
  En tant que client
  Je souhaite trouver des articles par mots clés
  Afin de voir que des articles qui m'interessent


  Scenario Outline: Recherche un produit
    Given L'utilisateur est sur la page home d'amazon
    When L'utilisateur recherche le produit <produit>
    Then L'utilisateur est sur la page du produit

    Examples:
      | produit |
      | Drone|
      | Laser|

  Scenario Outline: Recherche un produit qui n'existe pas
    Given L'utilisateur est sur la page home d'amazon
    When L'utilisateur recherche le produit <produit>
    Then Un message d'erreur s'affiche

    Examples:
      | produit |
      | dcugfnosdcfgo |	

  Scenario: Filtrer par type
    Soit un utilisateur ayant recherché par mot clé Drone
    Lorsqu'il filtre les résultats par <Matière>
	Alors il devrait voir des résultats que de type <Matière>
   
  Examples:
    | Matière     |
    | Plastique   |
    | Métal       |
    

  Scenario: Consulter la page de détails d'un objet
    Soit un utilisateur ayant recherché par mot clé Drone
    Lorsqu'il sélectionne un résultats
    Alors il devrait voir la page d'informations de l'objet


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
       

    
    
    
    