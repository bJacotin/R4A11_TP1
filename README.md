# R4A11_TP1

QUESTION 1 :
Le ficher XML se trouve dans le dossier "res/layout" sous le nom : activity_main.xml

QUESTION 2 : 
        android:text="Coucou j'ai trouvé comment faire"
Il fallait modifier une variable "android:text" dans le TextView

QUESTION 3 : 
Pour changer l'icône, j'ai modifié le fichier : AndroidManifest.xml avec les deux lignes suivantes : 
        android:icon="@mipmap/ic_launcher"
        android:roundIcon="@mipmap/ic_launcher_round"

Et pour cela, j'ai dû modifier les fichiers : ic_launcher & ic_launcher_round pour ajouter mon image pour l'icône

QUESTION 4 : 
Non, il n'est pas nécessaire de cliquer sur le bouton valider pour afficher le texte saisi sur la seconde activité. Il n'y a pas de listener et même quand on appuie pas sur valider, ça met le texte qu'on a commencé à écrire

QUESTION 5 : 
Non, ce n'est pas normal, on doit pouvoir cliquer pour mettre à jour, pas que ça se fasse tout seul

QUESTION 6 : 
Pour ne pas afficher le nouveau texte sur la 2è activité tant que le bouton valider n'a pas été cliquer, il est possible d'effectuer des conditions dans les listeners des boutons valider & next. On initalise une variable "var" texteValide. On va essayer via des conditions pour vérifier si le texte n'est pas vide. S'il ne l'est pas, on changer le editText par texteValide dans l'écouteur du bouton valider. Ensuite, on vérifie si texteValide n'est pas vide. Si ce n'est pas le cas, on passe à vue suivante en cliquant sur "Next". Sinon, il n'est pas possible de passer à la vue suivante.
