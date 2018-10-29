# TD9

Ce TD reprend le code du TD7. Il a pour objectif de mettre en place une couche UI Web.

## Consignes

Les modifications que vous devez apporter au code doivent être compilées (directement en utilisant javac ou gradle).

## Interface Textuelle

Le code du package ui (cf TD5) contient une interface utilisateur très limitée en mode ligne de commande.

Complétez cette interface utilisateur et éxécutez la afin de vérifier qu'elle fonctionne.

## Mode Socket

Ajouter la classe SocketServerMain qui permet de construire un serveur de socket et qui connecte l'input et l'output de la socket à l'interface utilisateur.

Vous pouvez vérifier que cela marche en utilisant l'outil **netcat**

    nc localhost 8080


## Multi-thread (optionnel)

Lancez deux clients (deux netcat en parallèle) et vérifiez que le serveur reste bloqué sur un des clients.

Modifiez l'architecture du serveur pour faire en sorte qu'il puisse supporter plusieurs Thread en parallèle et ainsi assurer plusieurs clients en parallèle.
