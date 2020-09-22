# TD6

Ce TD reprend le code du TD5. Il a pour objectif de mettre en place un lien vers une base de données (système de fichier).

## Consignes

Les modifications que vous devez apporter au code doivent être compilées (directement en utilisant javac ou gradle).

## Couche Infra

Vous allez devoir mettre en place une infrastructure qui sauvegarde les catalogues et les panier :
* en mémoire vive
* dans un fichier JSON.

Pour se faire vous allez :
* Définir un repository pour les paniers (BasketRepository) à l'aide d'une interface dans la couche domain
* Définir un repository pour les catalogues. 
  
De plus vous allez ajouter deux nouveaux packages dans la couche infrastructure : `inmemory` et `json`

## InMemory

Dans le package `inmemory` constuisez les classes d'implantation pour vos repository

## CSV

Vous devez dans un premier temps définir la structuration de vos fichiers JSON qui seront la sauvegarde des repository. 

Dans le package `json` vous allez ensuite construire une nouvelle implémentation des repository.


## Optimisation (Optionnel)

Vous pouvez améliorer votre conception en proposant une mémoire cache et/ou en ne sauvegardant que temporairement dans le fichier.
