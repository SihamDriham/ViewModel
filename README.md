# Application de compteur (Incrémentation / Décrémentation)
Cette application mobile Android est une simple application de compteur permettant d'incrémenter et de décrémenter une valeur. Elle est conçue pour illustrer l'utilisation de ViewModel, LiveData, et SavedStateHandle dans une application Android.
# Fonctionnalités
1. Incrémentation d'un compteur en appuyant sur un bouton.
2. Décrémentation du compteur en appuyant sur un autre bouton.
3. Sauvegarde de l'état du compteur, même après une rotation de l'écran ou la fermeture de l'application.
# Structure du projet
1. Package view: contient les composants de l'interface utilisateur (MainActivity).
2. Package viewmodel: contient la logique de gestion des données de l'application (CounterViewModel).
# Concepts clés
1. ViewModel: Dans cette application, le ViewModel est utilisé pour stocker la valeur actuelle du compteur. Ainsi, cette valeur est préservée même si l'écran est tourné.
2. LiveData: Dans l'application de compteur, la valeur du compteur est stockée dans une LiveData, permettant ainsi à l'interface utilisateur de se mettre à jour automatiquement à chaque changement.
3. SavedStateHandle: Dans notre application, SavedStateHandle est utilisé pour restaurer la valeur du compteur lorsque l'application est redémarrée.
# Technologies Utilisées
1. Java pour le langage de programmation.
2. ViewModel pour la gestion des données.
3. LiveData pour l'observation des données.
4. SavedStateHandle pour la persistance de l'état.

https://github.com/user-attachments/assets/db0e336a-bb7d-4927-af19-c2b60db5d64b
