## Table of Contents

- [About](#about)
- [Getting Started](#getting_started)

## About <a name = "about"></a>

This project is composed of 4 files: QuoteServer.java, QuoteClient.java, QuoteServer.java, and QuoteClient.java.

It is a program that sets up a client and server connection for them to communicate with each other. The client submits a message and the server repeats it back.

## Getting Started <a name = "getting_started"></a>

These instructions will get you a copy of the project up and running on your local machine.

### Prerequisites

Have the latest version of Java. Have a terminal to compile and run. Check java version.

```
java --version
```

### Running 

A step by step series of examples that tell you how to get a the code up and running.

Compile and run each Server file in its own terminal. This is because once the Server file is compiled and run the terminal will be in an idle state or in other words waiting for a connection.

```java
javac QuoteServer.java
java QuoteServer
```

And in a seperate terminal, compile and run its client counterpart.
```java 
javac QuoteCLient.java 
java QuoteClient
```
