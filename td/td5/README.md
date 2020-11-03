# TD5

Ce TD reprend le code du TD4. Il a pour objectif de mettre en place un lien vers une base de données (système de fichier).

## Consignes

Les modifications que vous devez apporter au code doivent être compilées (directement en utilisant javac ou gradle).

## Couche Infra

Vous allez devoir mettre en place une infrastructure qui sauvegarde les paniers :
* en mémoire vive
* dans un fichier JSON.

Pour se faire vous allez :
* Définir un repository pour les paniers (BasketRepository) à l'aide d'une interface dans la couche domain
  
De plus vous allez ajouter deux nouveaux implementations dans la couche infrastructure : `inmemory` et `json`

