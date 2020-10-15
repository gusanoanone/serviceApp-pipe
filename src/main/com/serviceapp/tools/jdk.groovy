package main.com.serviceapp.tools

def setJavaHome(VERSION){
    try{
       env.JAVA_HOME="${tool "${VERSION}"}"
       env.PATH="${env.JAVA_HOME}/bin:${env.PATH}"
       sh 'java -version'
    }
    catch (error){
      print "Failed to set the JAVA_HOME"
      throw error
    }
}