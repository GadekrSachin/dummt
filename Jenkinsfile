pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build Application'
            }
        }
         stage('Test') {
            steps {
                echo 'Test Application'
            }
        }
         stage('Deploy') {
            steps {
                echo 'Deploy Application'
            }
        }
        
        
    }
    
    post {
        always {
            emailext body: 'test body in mail ', subject: 'Pipeline status ', to: 'gadekar9503@gmail.com'
        }
    }
}
