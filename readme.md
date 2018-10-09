# HibernateHelloWorld

1. [Introduction](#title1)
2. [Création de la base de données](#title2)
3. [Création du projet Java](#title3)

   [La classe persistante 'Lecturer.java'](#subtitle1)
   
   [Fichier de mappage 'Lecturer.hbm.xml'](#subtitle2)
   
   [Le fichier de configuration 'hibernate.cfg.xml'](#subtitle3)
   
   [La classe de test 'SimpleTest.java'](#subtitle4)

## <a name="title1">Introduction</a>

Cette application sert à ajouter des informations à une base de données sur des maîtres de conférence d'une université.

## <a name="title2">Création de la base de données</a>

En amont, il faut créer une base de données *universite* et une table *Lecturer*.

Sous mySQL WorkBench :
CREATE DATABASE `universite`;

USE `universite`;

CREATE TABLE `lecturer` (
ID int NOT NULL auto_increment,
FName VARCHAR(50) NULL,
LName varchar(50) NULL,
PRIMARY KEY (ID)
);   

Il est possible de ne pas spécifier les champs *FName* et *LName* qui seront automatiquement créés au lancement de l'application.

## <a name="title3">Création du projet Java</a>

### <a name="subtitle1">La classe persistante 'Lecturer.java'</a>

Cette classe est notre classe modèle.
Elle est aussi appelée classe persistante.
Elle correspond à la table *Lecturer* de notre base de données.
Elle est placée dans le package *model*.

### <a name="subtitle2">Fichier de mappage 'Lecturer.hbm.xml'</a>

Ce fichier est disponible [ici](https://github.com/Dolois/HibernateHelloWorld/blob/master/src/Lecturer.hbm.xml).
Il permet d'indiquer à Hibernate quelle classe représente quelle table et quelle variable instantanée correspond à quelle colonne. 

Dans le tag *class*, l'attribut name correspond au nom de la classe persistante et table spécifie au nom de la table de la base de données.

Dans le tag *property*, l'attribut name correspond à l'attribut de la classe persistante et column spécifie le nom du champ dans la base de données.
L'attribut type permet de définir le type de données (ici, string).

/!\ **Attention**, avec le nom de la classe il faut penser à ajouter le nom du package.
Ici, le nom de la classe est *model.Lecturer*.

### <a name="subtitle3">Le fichier de configuration 'hibernate.cfg.xml'</a>

Ce fichier est disponible [ici](https://github.com/Dolois/HibernateHelloWorld/blob/master/src/hibernate.cfg.xml). Il permet de définir les configurations Hibernate.

/!\ **Attention**, il faut modifier :

- le nom de la base de données dans la propriété *connection.url*
- le nom de l'utilisateur du serveur MySQL dans la propriété *connection.username* car il est *root* par défaut
- le mot de passe du serveur MySQL dans la propriété *connection.password*


### <a name="subtitle4">La classe de test 'SimpleTest.java'</a>

Le fichier pour cette classe est disponible [ici](https://github.com/Dolois/HibernateHelloWorld/blob/master/src/SimpleTest.java). 
Il s'agit de la classe qui contient la méthode main. Elle est placée dans le package *default package*.
