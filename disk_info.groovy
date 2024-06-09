pipeline {
    agent any 
    stages {
        stage('Clone') {
            steps {
                sh(script: 'echo clone')
            }
        }
        stage('Deploy') { 
            steps {
                sh(script: 'echo deploy')
                sh(script: 'df -h')
            }
        }
    }
}