# TD8

Ce TD reprend le code du TD7. Il a pour objectif de mettre en place un lien vers une base de données (système de fichier).

## Consignes

Les modifications que vous devez apporter au code doivent être compilées (directement en utilisant javac ou gradle).

## Base de donnée / Sauvegarde Fichier

Vous allez devoir mettre en place une infrastructure qui sauvegarde les catalogues dans un fichier CSV.

Pour se faire vous allez ajouter un nouveau package dans la couche infrastructure : le package persistence.csv

Vous devez dans un premier temps définir la structuration de votre fichier CSV qui sera la sauvegarde du catalog. Charge à vous de définir les colonnes.

Vous allez ensuite construire une nouvelle implémentation de la classe Catalogue (CatalogImpl)

* L'instantiation de ce Catalogue devra prendre en paramètre le nom d'un fichier de sauvegarde
* L'appel à la méthode (add(Reference)) devra ajouter une nouvelle ligne dans votre fichier CSV
* L'appel à la méthode (size()) devra compter le nombre de ligne de votre fichier.
* L'appel à la méthode (getReference()) devra lire le fichier et construire le l'ensemble des réferences (Set<Reference>)

## Optimisation (Optionnel)

Vous pouvez améliorer votre conception en proposant une mémoire cache et/ou en ne sauvegardant que temporairement dans le fichier.
