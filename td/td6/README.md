# TD6

Ce TD reprend le code du TD5. Il a pour objectif de construire la couche application.

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

* Soit avec une Gateway qui va dispatcher les commandes vers des Handler
    * Construire la classe abstraite Command. Cette classe doit proposer une méthode abstraite execute()
    * Construire la commande concrète AddProduct. La méthode execute() de cette commande consiste à ajouter un produit dans le panier.
    * Construire la classe Handler qui réalisera l'exécution des Command (command.execute()) quand la Gateway lui demandera de le faire (via sa méthode handleCommand(Command command)).
    * Construire la classe Gateway qui recevra les commandes et qui les dispatchera vers les Handlers. 
* Soit avec des Worker qui vont récupérer les commandes
    * Construire la classe abstraite Command. Cette classe doit proposer une méthode abstraite execute()
    * Construire la commande concrète AddProduct. La méthode execute() de cette commande consiste à ajouter un produit dans le panier.
    * Construire la classe Worker (thread) qui réalisera l'exécution des Command (via command.execute()). Cette classe devra avoir une méthode de thread (run() dont le but est d'aller récupérer une commande dans la liste et de l'exécuter) 
    * Construire la classe Commands qui permet d'ajouter des commandes (pushCommand()) et de retirer des commandes (getCommand())
    

## Les query (optionnel)

Ajouter une classe permettant de requêter les catalogues. En outre cette classe disposera de son propre cache. De plus, elle permettra à la couche ui d'accéder aux références par pages de 10, 20 ou 50 références.
