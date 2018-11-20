# TD Noté

Pour réaliser ce TD noté vous devez corriger le code source qui vous est donné afin que les 4 tests passent.

## Contexte

Le code donné (répertoire main) correspond à une application  permettant de constuire des examens en QCM (Questionnaire à Choix Multiple). Le métier de cette application (package domain) est constitué des classes suivantes :

* Question.java : Cette classe représente une question (question, description, réponses possibles, réponses justes). Une question est un value object.
* Questionnary.java : Cette classe représente un questionnaire (id, questions à répondre, réponses données par un candidat).
* QuestionRespository.java : Cette classe représente le dépôt des questions. Elle est donc codé par une interface qui est réalisé par la couche infrastructure. Cette interface contient une factory: méthode de construction aléatoire d'un questionnaire. 

Chacune de ces trois classes dispose d'une classe de test qui contient le ou les tests unitaire pour la classe.

## La classe QuestionTest (2 Tests)

Cette classe contient deux tests unitaires pour la clase Question.

Le test **encapsulationShouldBePreserved** vérifie le principe de l'encapsulation et visiblement celui-ci n'a pas été respecté.

Le test **trueAnswerShouldBelongToCandidateAnswerSet** vérifie que les réponses justes d'une question sont bien incluses dans les réponses possibles. Là encore le code donné contient une erreur.

## La classe QuestionnaryTest (1 Test)

Cette classe contient un test unitaire pour la classe Questionnary

Le test **shouldComputeScore** vérifie que le calcul du score ne contient pas de faute, ce qui est malheuresement le cas ici. En lisant le code du test vous pourrez facilement comprendre la méthode de calcul du score.

## La classe QuestionRepositoryInMemoryTest (1 Test)

Cette classe contient un test unitaire pour la classe QuestionRepositoryInMemory

Le test **shouldNotCreateQuestionnaryIfTooFewQuestion** vérifie que la factory ne peut pas construire de questionnaire quand le dépôt contient trop peu de questions. En outre, il devrait être impossible de construire un questionnaire avec 2 questions quand le dépôt n'en contient qu'une. Le code donné souffre d'une terrible erreur.

## Consignes

Pour exécuter les tests vous devez utiliser la commande gradle :

    gradle test

Gradle construira le rapport de résultat montrant que les 4 tests ont tous échoué.

Charge à vous de corriger le code pour que ces tests passent.

Vous ne devez pas toucher au code des tests.
