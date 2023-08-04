pipeline {
   agent any
   stages {
      stage('setup') {
         steps {
            browserstack(credentialsId: '45c4dd6e-bdd4-453d-9a89-3de15b79d916') {
               echo "hello"
            }
            // Enable reporting in Jenkins
             browserStackReportPublisher 'automate'
         }
      }
    }
  }
