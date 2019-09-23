# TD4

Ce TD a pour objectif de :

* Coder un test Unitaire
* Réaliser les corrections proposées par un linter

## Consignes

Les modifications que vous devez apporter au code doivent être compilées (directement en utilisant javac ou gradle)

## Test Unitaire

Le code fourni représente la gestion d'un catalogue. L'interface **Catalog** représente le catalogue qui contient les références. La classe **Reference** représente les références contenues dans le catalogue.
La classe **CatalogImpl** implémente l'interface **Catalog** et permet de stocker le catalog en mémoire.


Vous allez changer l'interface Catalog et sa classe d'implantation CatalogImpl pour faire en sorte qu'un catalogue respecte les besoins suivants:

* Un catalogue a un nom (composé uniquement de lettres minuscules, minimum 3 lettres maximum 10 lettres)
* Un catalogue peut avoir plusieurs sous-catalogues
* Les noms des catalogues frères (sous-catalogues d'un même catalogue) doivent avoir des noms différents
* On peut obtenir la liste des références contenues directement par un catalogue (getOwnReferences) ou avoir les références contenues par un catalogue et toute sa descendance (getAllReferences)  
  
Tester Unitairement la classe Catalogue en veillant à ce que les besoins soient bien respectés.

## Linter

Exécuter le linter Checkstyle

    gradle checkstyleMain

Réalisez les recommandations qu'il vous propose pour la classe **Reference.java**. Pour lire les recommandations, il faut aller dans le répertoire **build/reports**

Exécuter le linter SpotBugs

    gradle spotbugsMain

Réalisez les recommandations **Correctness Warnings** qu'il vous propose. Pour lire les recommandations, il faut aller dans le répertoire **build/reports**
