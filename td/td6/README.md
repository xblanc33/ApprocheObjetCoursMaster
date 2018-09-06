# TD6

Ce TD reprend le code du TD5. Il a pour objectif de construire la couche application en appliquant le pattern CQRS.

En particulier, vous allez devoir :
  
* Coder des commandes
* Coder des requêtes

## Consignes

Les modifications que vous devez apporter au code doivent être compilées (directement en utilisant javac ou gradle).

## Les commandes

Construisez les classes nécessaires à la mise en place du pattern command en local :

* L'interface Command
* La classe Gateway
* La classe Handler

Construisez les classes de deux commandes :

* Ajout d'une référence dans un catalogue
* Ajout d'un sous catalogue

## Les query

Ajouter une classe permettant de requêter les catalogues. En outre cette classe disposera de son propre cache. De plus, elle permettra à la couche ui d'accéder aux références par pages de 10, 20 ou 50 références.