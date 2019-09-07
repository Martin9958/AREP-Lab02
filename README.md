### INTRODUCTION TO COMPUTER SYSTEM DESIGN
### Laboratory Requirement
Using maven and git, a program is created to calculate the mean and the standard deviation of a set of n real numbers in a file, using a linked list implementation to store the n numbers for the calculations.

### Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes:
- Install into the maven repo: `$ mvn install`
- Compiling the project: `$ mvn clean compile`
- Create the .jar: `$ mvn package`
- Run the application `$ java -cp target/psp0-1.0-SNAPSHOT.jar edu.escuelaing.arem.App `
- Generate the javadoc: `$ mvn javadoc:javadoc`

### Prerequisites
- Java 1.8
- Apache Maven 3.6.0

### Architecture

#### Linked list implementation:

![](https://github.com/Martin9958/psp0/blob/master/src/main/resources/LinkedList.png)

A linked list is a way to store a collection of elements. Each element in a linked list is stored in the form of a node, where the node is a collection of two sub elements (A data that stores the element and a next node that stores the link to the next node); a linked list is formed when many such nodes are linked together. The first node is always the head of the linked list and the last node point is the tail (in this case is null); this implementation are in two classes in the model linked list package: Mylinkedlist and Node. 

#### Project architecture:

![](https://github.com/Martin9958/psp0/blob/master/src/main/resources/psp0%20model.png)

### Running the tests
- The command to running the test is: `$ mvn test`

### Built With
- Maven : Dependency Management

### Heroku deployment
- Link : 

### Authors
- Andres Martin Cantor Urrego

### License
This project is licensed under the MIT License - see the LICENSE.md file for details

### Acknowledgments
- Maven and git
- Java
- Problem Abstraction

