# chainVote
Using blockchain technology in a voting app. We use the hyperledger fabric framework to create a Java based app that takes in voting data from constituents in a safe, decentralized fashion. Voters can vote on what their represantatives in governement positions should support. In the current version, we have not added login credentials but it will be a vital part of a future update. Our blockchain network is premade using docker for demo purposes.
## Getting Started
Follow these instructions if you want to get a copy of the project up and running on your local machine. If you would like to know how to deploy this on a live system, see deployment notes.
### Prerequisites
You will need Docker, Gradle, and SoapUI if you want to use this for development or testing.

To install gradle with homebrew: 
```
$ brew update && brew install gradle
```
with SDKMAN!:
```
$ sdk install gradle 2.14
```
or you can just visit the [Gradle](https://gradle.org/install/) manually from their website.

You can install the [Mac](https://www.docker.com/docker-mac) or [Windows](https://www.docker.com/docker-windows) version of Docker, depending on your needs.

You can download [SoapUI](https://www.soapui.org/downloads/soapui.html) from their website as well.
### Installing
To get a development environment up and running on your local machine, first you will need to start the blockchain network.
I have already provided the paths and the files necessary to get the network running. 
```
docker-compose up
```
The next step is to make sure gradle builds the necessary resources needed to execute Java on your machine.
Navigate to $*whereYouHaveSavedTheChainVoteFile*/src/github.com/hyperledger/fabric/core/chaincode/shim/java.
```
gradle -b build.gradle clean
gradle -b build.gradle build
```
This should add the shim client JAR to your local Maven repository.
## Running the tests
*Currently our app does not have a connection with the blockchain network we created. But we can still log voter data using a RESTful api such as SoapUI.*
## Deployment
*Additional notes on how to add this to a live system will be incorporated once the app has reached the point of authenticating user data. It needs to make sure the contituents are allowed to vote.*
## Built With
* [Docker](https://www.docker.com/) - The container used for the blockchain network.
* [Gradle](https://gradle.org/) - The build system used to work with the Java code.
* [SoapUI](https://www.soapui.org/) - Used to test RESTful code.
* [Eclipse](https://www.eclipse.org/) - Used as the Java code developement environment.
* [Hyperledger Fabric](https://hyperledger-fabric.readthedocs.io/en/release/) - The blockchain framework used.
## Authors
* **Harsh Bhatt** - *Back-End* - [hbhatt687](https://github.com/hbhatt687)
* **Anthony Hsia** - *Front-End* - [ahsia3](https://github.com/ahsia3)
## License
This project is licensed under the apache license - see the LICESNE.md file for details.
## Acknowledgements
* Thanks to IBM developerWorks for their [Java Blockchain](https://www.ibm.com/developerworks/library/j-chaincode-for-java-developers/index.html) tutorial.
