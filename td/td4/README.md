# TD4

Ce TD a pour objectif de :

* Coder une application en suivant l'achitecture hexagonale
* Rendre indépendant l'insfrastructure

## Consignes

Les modifications que vous devez apporter au code doivent être compilées (directement en utilisant javac ou gradle)

## Catalogue de Références, et stock de produits

Dans ce TD vous allez développer le catalogue de références d'un magasin de eCommerce.

## Couche domain

La couche model contient les concepts métiers suivants:

* Reference : Une référence produit (id, nom, description, prix). On considère que le prix d'une référence ne change pas. C'est le prix de base. Plusieurs promotions pourront être faites lors de la commande mais le prix ne change pas.
* Catalog : le catalogue des références

## Couche infrastructure

Cette couche se fera en mémoire. Elle contient donc les classes d'infrastructure permettant de gérer en mémoire vive le catalogue et le stock.

## Couche UI

Cette couche se fera en ligne de commande. Elle proposera une interaction simple permettant à un utilisateur d'intéragir avec l'application (créer une référence, l'ajouter dans le catalogue, la supprimer du catalogue).

## Couche Domain

Si vous avez le temps, vous pouvez proposer un service métier : le moteur de recherche.

