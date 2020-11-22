# TD7

Ce TD reprend le code du TD6. Il a pour objectif de mettre en place une couche UI CLI selon le pattern MVC.

Les modifications que vous devez apporter au code doivent être compilées (directement en utilisant javac ou gradle).

## Le Model

Construisez une classe représetant le modèle de votre UI.

Cette classe devra contenir toutes les données nécessaires à la gestion de l'interface graphique.

En outre, vous pouvez ajouter une propriété qui va encoder l'étape dans laquelle se situe l'utilisateur (il vient de démarrer l'UI, il a créé un panier, il est en train d'ajouter des produits dedans, etc.)

Vous pouvez aussi ajouter des propriétés qui vont permettre de garder les informations nécessaires à la communication avec la couche application (lien vers la couche application, référence du panier si celui est créé, etc.) et les informations relatives au contexte d'utilisation (nom de l'utilisateur, etc.)


## La Vue

Construisez une classe représentant la vue.

En suivant le pattern MVC, la vue est couplée avec le model et le controller (elle dispose donc de références vers eux).

Une façon de faire est de coder une méthode **refresh** qui affichera les éléments visibles en fonction des données contenues dans le Model.

Par exemple, le code suivant présente une partie du code de la méthode refresh qui affiche le message de bienvenu quand le Model précise que l'utilisateur est dans l'étape initiale.

```java
    public void refresh() {
        if (model.getStep() == Step.INITIAL_STEP) {
            System.out.println("Bienvenu "+model.getUserName()+" tappez (1) pour créer un panier ou (2) pour ouvrir panier existant");
        }
    }
```

La vue doit faire le lien avec le controller pour gérer les interactions avec l'utilisateur. Dans le cas d'une interface CLI on peut imaginer que la méthode **refesh** délègue au Controller la gestion de la lecture des réponses aux questions.


## Le Controller

Construisez la classe du Controller.

Le controller est lié à la vue qui lui délègue le trainement pour gérer les interactions de l'utilisateur.

Le controller, pour gérer ces interactions, va intéragir avec la couche traitement puis mettre à jours le modèle et enfin demander à la vue de se rafraichir (appel de la méthode refresh).

