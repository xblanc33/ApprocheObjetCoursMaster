# TD5

Ce TD a pour objectif de :

* Coder une application en suivant les patterns tactiques du DDD
* Notamment, il vous faudra créer les classes du domaine en respectant les patterns Value Object, Entity et Aggregate

## Consignes

Les modifications que vous devez apporter au code doivent être compilées (directement en utilisant javac ou gradle)

## Références, Panier et ligne de commande

Dans ce TD vous allez développer le catalogue de références ainsi que la gestion d'un panier d'un magasin de eCommerce .

## Couche domain

La couche model contient les concepts métiers suivants:

Reference : Une référence produit 
* ref: le numéro unique de la référence (une chaîne de caractères constituée de 20 caractères alphanumérique)
* nom: le nom court de la référence (20 caractères au max)
* description: la description de la référence (200 caratères au max)
* prix (entier positif) 

On considère qu'aucune propriété de la référence ne change avec le temps. le prix d'une référence ne change pas. C'est le prix de base. Plusieurs promotions pourront être faites sur le panier lors de la commande mais le prix d'une référence ne change pas.


Basket : le panier electronique
* Un panier contient des lignes de commandes.
  * Une ligne de commande cible une seule référence
  * Une ligne de commande préciser une quantité (entier strictement positif)
  * Une ligne de commande a un montant qui correspond au prix de la référence multiplié par la quantité
* Un panier a un montant qui correspond à la somme des lignes de commandes
* Un panier ne peut pas avoir des lignes de commande qui ciblent la même référence
* On peut ajouter une référence avec une quantité à un panier
* On peut supprimer une référence d'un panier
* On peut valider un panier (il n'est alors plus possible de le modifier)

Codez ces concepts en précisant leur pattern tactique du DDD.

