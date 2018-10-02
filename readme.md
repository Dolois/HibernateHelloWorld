# HibernateHelloWorld

1. [Introduction](#title1)
2. [Cr�ation de la base de donn�es](#title2)
3. [Cr�ation du projet Java](#title3)

   [La classe persistante 'Lecturer.java'](#subtitle1)
   
   [Fichier de mappage 'Lecturer.hbm.xml'](#subtitle2)
   
   [Le fichier de configuration 'hibernate.cfg.xml'](#subtitle3)
   
   [La classe de test 'SimpleTest.java'](#subtitle4)

## <a name="title1">Introduction</a>

Cette application sert � ajouter des informations � une base de donn�es sur des ma�tres de conf�rence d'une universit�.

## <a name="title2">Cr�ation de la base de donn�es</a>

En amont, il faut cr�er une base de donn�es *universite* et une table *Lecturer*.
Le script pour le faire est disponible [ici](https://github.com/vanessahuhn/HibernateHelloWorld/blob/master/SQL/createDB%20%2B%20table.sql). Il est possible de ne pas sp�cifier les champs *FName* et *LName* qui seront automatiquement cr��s au lancement de l'application.

## <a name="title3">Cr�ation du projet Java</a>

### <a name="subtitle1">La classe persistante 'Lecturer.java'</a>

Cette classe est notre classe mod�le.
Elle est aussi appel�e classe persistante.
Elle correspond � la table *Lecturer* de notre base de donn�es.
Elle est plac�e dans le package *model*.

### <a name="subtitle2">Fichier de mappage 'Lecturer.hbm.xml'</a>

Ce fichier est disponible [ici](https://github.com/vanessahuhn/HibernateHelloWorld/blob/master/src/Lecturer.hbm.xml).
Il permet d'indiquer � Hibernate quelle classe repr�sente quelle table et quelle variable instantan�e correspond � quelle colonne. 

Dans le tag *class*, l'attribut name correspond au nom de la classe persistante et table sp�cifie au nom de la table de la base de donn�es.

Dans le tag *property*, l'attribut name correspond � l'attribut de la classe persistante et column sp�cifie le nom du champ dans la base de donn�es.
L'attribut type permet de d�finir le type de donn�es (ici, string).

/!\ **Attention**, avec le nom de la classe il faut penser � ajouter le nom du package.
Ici, le nom de la classe est *model.Lecturer*.

### <a name="subtitle3">Le fichier de configuration 'hibernate.cfg.xml'</a>

Ce fichier est disponible [ici](https://github.com/dolois/HibernateHelloWorld/blob/master/src/hibernate.cfg.xml). Il permet de d�finir les configurations Hibernate.

/!\ **Attention**, il faut modifier :

- le nom de la base de donn�es dans la propri�t� *connection.url*
- le nom de l'utilisateur du serveur MySQL dans la propri�t� *connection.username* car il est *root* par d�faut
- le mot de passe du serveur MySQL dans la propri�t� *connection.password*


### <a name="subtitle4">La classe de test 'SimpleTest.java'</a>

Le fichier pour cette classe est disponible [ici](https://github.com/dolois/HibernateHelloWorld/blob/master/src/SimpleTest.java). 
Il s'agit de la classe qui contient la m�thode main. Elle est plac�e dans le package *default package*.

/!\ **Attention**, il faut importer la classe persistante.
