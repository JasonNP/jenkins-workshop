
node{

        withEnv(["ENV_CLIENTID=123456789-123456-123456"]){
            stage("init"){
                echo "${ENV_CLIENTID}"
                sh "printenv"
            }

        }
        
        stage("checkout"){
            println "===========TODO==========="
            git(
                branch : "master",
                credentialsId: "jason-github",
                url: "https://github.com/jasonNP/aks-rbac-example.git"
            )
            sh "ls -lta"
        }
    }

