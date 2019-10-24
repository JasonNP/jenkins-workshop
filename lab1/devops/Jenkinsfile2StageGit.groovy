
node{

        withEnv(["ENV_CLIENTID=123456789-123456-123456"]){
            stage("init"){
                echo "${ENV_CLIENTID}"
            }

        }
        
        stage("checkout"){
            PRINTLN "todo"
        }
    }
}
