# TD7

Ce TD reprend le code du TD6. Il a pour objectif de construire la couche application en appliquant le pattern CQRS.

En particulier, vous allez devoir :

* Définir le service de la couche application
* Coder des commandes
* Coder des requêtes (optionnel)

## Consignes

Les modifications que vous devez apporter au code doivent être compilées (directement en utilisant javac ou gradle).

## Le Service de la couche application

Créer le package application (au même niveau que domain). Dans ce package :

* Construire la classe PanierService.
* Proposez les méthodes (signature) de cette classe qui sont des services applicatifs (les paramètres sont soit des VO, soit des id)
* Codez ces méthodes

## Les commandes

L'objectif est d'améliorer la classe PanierService en appliquant l'approche CQRS

* Pour chaque service de la classe PanierService distinguez les parties query (read dans le repository), des partie command (write dans le repository)

Construisez les classes nécessaires à la mise en place du pattern command en local :

* Construire la classe abstraite Command. Cette classe doit proposer une méthode abstraite execute()
* Construire l'interface Handler qui réalisera l'exécution des Command lorsqu'on lui demandera via la méthode (handle()). Il faut donc ajouter la méthode handle() à cette interface.
* Construire l'interface Gateway qui permettra d'ajouter des commandes (pushCommand()) et de gérer un ensemble de Handler (addCommandHandler())
* Construire la commande concrète AddReference. La méthode execute() de cette commande consiste à ajotuer une commande dans le catalogue.

Dans le package infrastructure :

* Coder l'implémentation de la classe Handler (HandlerImpl). Cette classe réalise la méthode handle() ce qui permet donc d'exécuter la commande (command.execute())
* Coder l'implémentation de la classe Gateway (GatewayImpl). Cette classe réalise l'ajout des Handler (addCommandHandler()) dans une structure de données (Set ou List). Elle réalise aussi l'ajout d'une nouvelle commande, et appelle les handler pour exécuter les commandes ajoutées. Ici on considère que la Gateway appelle un handler (le choix du handler est fait aléatoirement) dès qu'une nouvelle commande est ajoutée.

## Les query (optionnel)

Ajouter une classe permettant de requêter les catalogues. En outre cette classe disposera de son propre cache. De plus, elle permettra à la couche ui d'accéder aux références par pages de 10, 20 ou 50 références.
