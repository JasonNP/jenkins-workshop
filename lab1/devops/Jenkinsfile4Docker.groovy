
node{
    stage("init"){

    }
    stage("checkout"){
        withCredentials([string(credentialsId:"jason-token",variable:"token1")]){
            echo "${token1}"

            tokentmp = token1.split('\\|')
            tok1 = tokentmp[0]
            tok2 = tokentmp[1]

            echo " ${tok1} ---- ${tok2}"
        }

    }

    stage("deploy"){
        docker.image("hashicorp/terraform:0.12.12").withRun("-version"){
            container -> sh "docker logs ${container.id}"

        }
    }
}

/*
password2019|jj9_35@hotmail.com|123456
*/