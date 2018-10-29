# TD7

Ce TD reprend le code du TD6. Il a pour objectif de mettre en place les évènements **métiers** et les évènements **application**.

## Consignes

Les modifications que vous devez apporter au code doivent être compilées (directement en utilisant javac ou gradle).

## évènement application

Mettez en place les évènements application permettant de savoir qu'une commande à bien été réalisée (pour l'ajout d'une référencee).

En outre vous devez (dans le package application):

* Construire une interface CommandMonitor qui contiendra la méthode commandIsExecuted(). Cette méthode sera appelée lorsqu'une commande sera exécutée.
* Modifier la classe Command pour faire en sorte qu'on puisse enregistrer des CommandMonitor sur une commande. Cette classe devra être une classe abstraite car il faudra ajouter et coder la méthode addMonitor(CommandMonitor monitor) dans la classe Commande.
* Modifier la classe Command pour faire en sorte qu'une commande notifie les monitors lorsque l'exécution de la commande est réalisée. Il faudra alors ajouter et coder la méthode notifyMonitor() dans la classe Commande.
* Modifier la classe Command pour faire en sorte que la notification soit appelée dès que l'exécution est terminée. Il faudra alors modifier et coder la méthode execute() et faire qu'elle appelle notifyMonitor()
* Vous pourrez modifier la classe Command et lui donner un id. Ainsi l'id sera précisé lors de la notification (envoyé comme argument de la méthode commandIsExecuted()).

## évènement métier

Vous allez définir un nouveau sous-système qui permet de gérer les Basket permettant de réaliser des achats dans un site de eCommerce. Un Basket contient plusieurs références et pour chaque référence il précise une quantité (nombre d'éléments achétés pour la référence).

Vous devez alors :

* Construire un nouveau package fr.ubordeaux.ao.ordermanagement
* ajouter dans ce package le model (package fr.ubordeaux.ao.ordermanagement.domain.model)
* Ajouter dans ce package la classe Reference (qui ressemble à la classe Reference du sous système referencemanagement)
* Ajouter dans ce package la classe Basket (qui contient une HashMap avec les références comme clés et la quantité comme valeur)

Mettez en place les évènements métiers (EventSourcing) sur le Basket.
On considérera les évènements : Ajout d'une référence dans un panier avec une quantié donnée.

Vous devez construire (dans le package domain.model) :

* La classe abtraite Event
* L'interface EventSourcing (le dépot d'event)
* La classe ReferenceAddedToBasket qui hérite d'Event
* La classe ReferenceRemovedFromBasket qui hérite d'Event

Enfin, dans la couche application vous allez appliquer le pattern CQRS (similaire au sous système referencemanagement):

* Construire la classe Command
* Construire la classe Gateway
* Construire la classe Handler
* Construire la classe AddRerenceToBasket qui hérite de Command. La méthode execute() de cette classe ajoute simplement un ReferenceAddedToBasket dans l'EventStore
* Construire la classe RemoveReferenceToBasket qui hérite de Command. La méthode execute() de cette classe ajoute simplement un ReferenceRemovedFromBasket dans l'EventStore
* La classe BasketQueryManager qui propose la requête buildBasketFromId(). Cette méthode récupère les Event de l'EventStore et construit le Basket.
