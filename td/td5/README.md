# TD5

Ce TD a pour objectif de :

* Réaliser les corrections proposées par un linter
* Coder un test d'acceptation
* Coder un test Unitaire

## Consignes

Les modifications que vous devez apporter au code doivent être compilées (directement en utilisant javac ou gradle)

## Linter

Exécuter le linter Checkstyle

    gradle checkstyleMain

Réalisez les recommandations qu'il vous propose pour la classe **Reference.java**. Pour lire les recommandations, il faut aller dans le répertoire **build/reports**

Exécuter le linter Findbugs

    gradle findbugsMain

Réalisez les recommandations **Correctness Warnings** qu'il vous propose. Pour lire les recommandations, il faut aller dans le répertoire **build/reports**


## Test d'acceptation

En reprenant le code du TD4, testez les scénarios suivants :

* Ajout d'une référence dans le catalogue
* Recherche d'une référence

## Test Unitaire

Vous allez changer l'interface Catalog et sa classe d'implantation CatalogImpl pour faire en sorte qu'un catalogue respecte les besoins suivants:

* Un catalogue a un nom (composé uniquement de lettres minuscules, minimum 3 lettres maximum 10 lettres)
* Un catalogue peut avoir plusieurs sous-catalogues
* Les noms des catalogues frères (sous-catalogues d'un même catalogue) doivent avoir des noms différents
* On peut obtenir la liste des références contenues directement par un catalogue (getOwnReferences) ou avoir les références contenues par un catalogue et toute sa descendance (getAllReferences)  
  
Tester Unitairement la classe Catalogue en veillant à ce que les besoins soient bien respectés.
