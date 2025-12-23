pipeline {
    agent any
    
    tools {
        maven 'Maven'
        jdk 'JDK11'
    }
    
    stages {
        stage('Checkout') {
            steps {
                echo "=== Récupération du code depuis GitHub ==="
                checkout scm
                echo "Branche actuelle: ${env.BRANCH_NAME}"
            }
        }
        
        stage('Build') {
            steps {
                echo "=== Compilation du projet ==="
                bat 'mvn clean compile'
            }
        }
        
        stage('Test') {
            steps {
                echo "=== Exécution des tests ==="
                bat 'mvn test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
        
        stage('Package') {
            steps {
                echo "=== Création du package JAR ==="
                bat 'mvn package -DskipTests'
            }
        }
        
        stage('Archive') {
            steps {
                echo "=== Archivage des artefacts ==="
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }
    
    post {
        success {
            echo "✅ Pipeline exécuté avec succès pour la branche ${env.BRANCH_NAME}!"
        }
        failure {
            echo "❌ Le pipeline a échoué pour la branche ${env.BRANCH_NAME}"
        }
        always {
            echo "=== Nettoyage ==="
            cleanWs()
        }
    }
}