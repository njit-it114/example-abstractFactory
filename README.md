# example-abstractFactory
Example maven Java project created via maven archetype quickstart, showing how to;
- implement "Abstract Factory" design pattern
- create a factory (FruitFactoryProducer) of factories (AppleFruitFactory, OrangeFruitFactory) specified by an enum (FruitFactoryType) input
- create factory (AppleFruitFactory) that returns a specific concrete implementation of an interface (Apple) specified by an enum (OrangeType) input
- create factory (OrangeFruitFactory) that returns a specific concrete implementation of an interface (Orange) specified by an enum (OrangeType) input
- use these factories to get instances created
- set JDK version something other than default(1.5) in pom.xml, 
- set junit 4.x as junit dependency version in pom.xml, 
- modify build in pom.xml to create executable jar upon running maven goal 'package', 
- create junit 3.x and 4.x tests/testCases/testSuites,
- enhance default the testCase file name patterns in pom.xml,
- how to run junit 3.x and 4.x together
- how to run unit tests from maven (issue "mvn install test" at bash in this project's dir)

## Setup dependencies
Make sure on your machine, you have;
- git installed
- a working unix shell (like git bash. If not there install git and use its git bash)
- working JDK installed (with JAVA_HOME env variable added, and PATH env variable prefixed with %JAVA_HOME%/bin)
- working maven (type "mvn -version" at bash command line and see some results about java version etc) 

## How to use it  (NOTE in below the directory structure and names are suggested)
### Make sure you created the directory structure you want to store example projects in
As example, at bash command line issue;<br>
mkdir -p /c/it114/exampleProjects

### cd to where you put your example projects
As example, at bash command line issue;<br>
cd /c/it114/exampleProjects ) <br>
git clone https://github.com/njit-it114/example-abstractFactory.git <br>
or<br>
git clone https://github.com/njit-it114/example-abstractFactory.git  whateverDirectoryNameYouWantStuffToBeClonedInto
