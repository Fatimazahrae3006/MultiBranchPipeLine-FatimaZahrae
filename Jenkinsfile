pipeline {
    agent any
    
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
                sh 'mvn clean compile'
            }
        }
        
        stage('Test') {
            steps {
                echo "=== Exécution des tests ==="
                sh 'mvn test'
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
                sh 'mvn package -DskipTests'
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
    }
}