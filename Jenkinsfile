pipeline {
    agent any

    stages {
        stage('checkout scm') {
            steps {
                echo 'Checkout'
                git credentialsId: '88cc3edb-71ea-4ac9-b648-6c0c36cbbb32', url: 'https://github.com/CheikhSamb/dronesManagement.git'
            }
        }
        stage('build') {
            steps {
                echo 'Build'
                sh './mvnw clean install'
            }
        }
         stage('SonarQube Analysis') {
                steps {
             sh './mvnw clean verify sonar:sonar -Dsonar.projectKey=demo  -Dsonar.host.url=http://192.168.11.88/sonarqube -Dsonar.login=admin -Dsonar.password=pad-dev'
                }
        }
        stage('build images') {
            steps {
                 sh 'docker build -t drones/medoc:latest .'
            }
        }
    }
}