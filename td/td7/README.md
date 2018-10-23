# TD7

Ce TD reprend le code du TD6. Il a pour objectif de mettre en place les évènements **métiers** et les évènements **application**.

## Consignes

Les modifications que vous devez apporter au code doivent être compilées (directement en utilisant javac ou gradle).

## évènement application

Mettez en place les évènements application permettant de savoir qu'une commande à bien été réalisée (pour l'ajout d'une référencee).

## évènement métier

Vous allez définir un nouveau sous-système qui permet de gérer les Basket permettant de réaliser des achats dans un site de eCommerce.

Un Basket contient plusieurs références et pour chaque référence il précise une quantité (nombre d'éléments achétés pour la référence).

Mettez en place les évènements métiers (EventSourcing) sur le Basket.

On considérera les évènements : Création de panier, Ajout d'une référence dans un panier avec une quantié donnée.

Vous devez construire :

Dans la couche métier (domain) 

* Une classe correspondat à chaque évènement : Event, BasketCreated, ReferenceAddedToBasket
* Une classe pour stocker les évènements : EventStore
* Une classe qui représente l'état : Basket
  
Dans la couche application (application du CQRS)
* Une interface permettant de requéter les panier BasketQueryManager qui contient la méthode permettant de construire un panier à partir de l'EventStore
* Les command permettant d'ajouter les évènements dans le store