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
Stocker tout cela dans une variable que l'on affecte au bouton. C'est une fois uniquement que le bouton a été solicité, que le texte se met à jour
