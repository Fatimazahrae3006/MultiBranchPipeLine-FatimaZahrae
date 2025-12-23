# \# MultiBranch Pipeline - Jenkins

# 

# \## 📋 Informations du projet

# 

# \- \*\*Nom du projet\*\* : MultiBranchPipeLine-FatimaZahrae

# \- \*\*Étudiante\*\* : OUAHMAN Fatima Zahrae

# \- \*\*Type\*\* : TP Jenkins - MultiBranch Pipeline

# \- \*\*Date\*\* : Décembre 2025

# 

# ---

# 

# \## 🎯 Objectif du TP

# 

# Ce projet démontre l'utilisation d'un \*\*MultiBranch Pipeline\*\* dans Jenkins pour gérer automatiquement plusieurs branches Git. Le pipeline compile, teste et package une application Java Maven sur différentes branches.

# 

# ---

# 

# \## 🏗️ Architecture du projet

# 

# \### Structure du code :

# ```

# MultiBranchPipeLine-FatimaZahrae/

# ├── src/

# │   ├── main/

# │   │   └── java/

# │   │       └── com/

# │   │           └── example/

# │   │               └── App.java

# │   └── test/

# │       └── java/

# │           └── com/

# │               └── example/

# │                   └── AppTest.java

# ├── pom.xml

# ├── Jenkinsfile

# └── README.md

# ```

# 

# \### Branches Git :

# \- \*\*main\*\* : Branche principale de production

# \- \*\*develop\*\* : Branche de développement

# \- \*\*feature/new-function\*\* : Branche de fonctionnalité (ajout de la fonction soustraction)

# 

# ---

# 

# \## 🔧 Configuration technique

# 

# \### Technologies utilisées :

# \- \*\*Java\*\* : Version 21

# \- \*\*Maven\*\* : Outil de build

# \- \*\*JUnit\*\* : Tests unitaires

# \- \*\*Jenkins\*\* : Serveur d'intégration continue

# \- \*\*Docker\*\* : Conteneurisation de Jenkins

# \- \*\*Git/GitHub\*\* : Gestion de versions

# 

# \### Prérequis :

# \- Docker installé

# \- Git installé

# \- Compte GitHub

# 

# ---

# 

# \## 🚀 Pipeline Jenkins

# 

# \### Étapes du pipeline (5 stages) :

# 

# 1\. \*\*Checkout\*\* : Récupération du code depuis GitHub

# 2\. \*\*Build\*\* : Compilation du projet avec Maven (`mvn clean compile`)

# 3\. \*\*Test\*\* : Exécution des tests unitaires (`mvn test`)

# 4\. \*\*Package\*\* : Création du fichier JAR (`mvn package`)

# 5\. \*\*Archive\*\* : Archivage des artefacts dans Jenkins

# 

# \### Jenkinsfile :

# Le pipeline est défini dans le fichier `Jenkinsfile` à la racine du projet. Il utilise la syntaxe déclarative de Jenkins Pipeline.

# 

# ---

# 

# \## 📊 Captures d'écran

# 

# \### 1. Vue d'ensemble du MultiBranch Pipeline

# !\[MultiBranch Overview](01-multibranch-overview.png)

# 

# \*Cette capture montre les 3 branches détectées automatiquement par Jenkins avec leurs statuts de build.\*

# 

# ---

# 

# \### 2. Étapes du Pipeline (Pipeline Steps)

# !\[Pipeline Steps](02-pipeline-steps.png)

# 

# \*Détail de l'exécution du pipeline montrant toutes les étapes (Checkout, Build, Test, Package, Archive) avec leurs logs.\*

# 

# ---

# 

# \### 3. Console Output - Build réussi

# !\[Console Output](03-console-output.png)

# 

# \*Log complet montrant l'exécution réussie du pipeline avec "BUILD SUCCESS" et "Finished: SUCCESS".\*

# 

# ---

# 

# \### 4. Repository GitHub

# !\[Repository GitHub](04-repository.png)

# 

# \*Vue du dépôt GitHub montrant la structure du projet avec le code source, le Jenkinsfile, et le README.\*

# ---

# 

# \## 🔄 Workflow du projet

# 

# 1\. \*\*Développement\*\* :

# &nbsp;  - Création de branches pour les nouvelles fonctionnalités

# &nbsp;  - Commits et push vers GitHub

# 

# 2\. \*\*Détection automatique\*\* :

# &nbsp;  - Jenkins scanne le dépôt GitHub toutes les minutes

# &nbsp;  - Détecte les nouvelles branches et les modifications

# 

# 3\. \*\*Build automatique\*\* :

# &nbsp;  - Lancement automatique du pipeline pour chaque branche

# &nbsp;  - Compilation, tests et packaging

# 

# 4\. \*\*Feedback\*\* :

# &nbsp;  - Statut visible dans l'interface Jenkins

# &nbsp;  - Notifications en cas de succès ou d'échec

# 

# ---

# 

# \## 📝 Instructions de déploiement

# 

# \### 1. Cloner le dépôt :

# ```bash

# git clone https://github.com/Fatimazahrae3006/MultiBranchPipeLine-FatimaZahrae.git

# cd MultiBranchPipeLine-FatimaZahrae

# ```

# 

# \### 2. Démarrer Jenkins avec Docker :

# ```bash

# docker start jenkins

# ```

# Ou créer un nouveau conteneur :

# ```bash

# docker run -d -p 8080:8080 -p 50000:50000 --name jenkins -v jenkins\_home:/var/jenkins\_home jenkins/jenkins:lts

# ```

# 

# \### 3. Configurer Jenkins :

# \- Accéder à `http://localhost:8080`

# \- Créer un projet "Multibranch Pipeline"

# \- Configurer la source Git : `https://github.com/Fatimazahrae3006/MultiBranchPipeLine-FatimaZahrae.git`

# \- Activer le scan périodique (1 minute)

# 

# \### 4. Exécuter le pipeline :

# Le pipeline se lance automatiquement pour toutes les branches détectées.

# 

# ---

# 

# \## ✅ Résultats obtenus

# 

# \- ✅ 3 branches détectées et configurées automatiquement

# \- ✅ Pipeline exécuté avec succès sur toutes les branches

# \- ✅ Compilation réussie (BUILD SUCCESS)

# \- ✅ 3 tests unitaires passés

# \- ✅ Artefacts (JAR) créés et archivés

# 

# ---

# 

# \## 🎓 Compétences développées

# 

# \- Configuration et utilisation de Jenkins MultiBranch Pipeline

# \- Intégration continue (CI) avec GitHub

# \- Automatisation des builds et tests

# \- Gestion des branches Git

# \- Utilisation de Docker pour Jenkins

# \- Configuration de Maven dans un environnement CI/CD

# 

# ---

# 

# \## 🔗 Liens utiles

# 

# \- \*\*Dépôt GitHub\*\* : \[https://github.com/Fatimazahrae3006/MultiBranchPipeLine-FatimaZahrae](https://github.com/Fatimazahrae3006/MultiBranchPipeLine-FatimaZahrae)

# \- \*\*Documentation Jenkins\*\* : https://www.jenkins.io/doc/

# \- \*\*Maven\*\* : https://maven.apache.org/

# 

# ---

# 

# \## 👩‍💻 Auteur

# 

# \*\*OUAHMAN Fatima Zahrae\*\*

# \- GitHub : \[@Fatimazahrae3006](https://github.com/Fatimazahrae3006)

# 

# ---

# 

# \## 📄 Licence

# 

# Ce projet est réalisé dans le cadre d'un travail pratique académique.

