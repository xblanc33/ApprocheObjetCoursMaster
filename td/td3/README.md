# TD3
Ce TD a pour objectif de :

* Coder une délégation de classes (couplage faible)

## Consignes

Les modifications que vous devez apporter au code doivent être compilées (directement en utilisant javac ou gradle)

## Point2D et ColoredPoint2D

Coder la classe **Point2D** qui représente les points 2D. Chaque point a deux coordonnées dans le plan (x,y) qui sont des entiers positifs. On considère que le point (0,0) est situé en haut à gauche de l'écran.

Coder la classe **ColoredPoint2D** qui représente les points 2D avec couleur (RGB) en utilisant l'héritage et la délégation. Pour chacune des deux approches précisez combien d'objets seront présents en mémoire pour avoir un point coloré. De plus précisez pourquoi les appels aux méthodes sont plus lentes dans le cas de la délégation.

## Benchmark d'algorithmes de tri

On souhaite mesurer la rapidité d'algorithmes de tri. 

La classe **InsertTri** représente un algorithme de tri par insertion.
Coder cette classe sachant que la signature de la méthode de tri est : __String[] sort(String[] unsorted)__

La classe **SortBenchmark** représente le benchmark. Cette classe possède les méthodes suivantes:
* addAlgorithm() qui permet d'ajouter un algorithme de tri au bencmark
* bench() qui permet de lancer le benchmark

Coder cette classe en précisant les types des méthodes **addAlgorithm** et **bench**.

Coder un autre algorithme (BubleSort) pour pouvoir exécuter un benchmark.

Pourquoi on peut dire que **SortBenchmark** délègue le tri aux algorithmes ? A quel pattern du GOF cela vous fait-il penser ?

