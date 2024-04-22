//How To Install Java with Apt on Ubuntu 22.04

Installing the Default JRE/JDK

To install the OpenJDK version of Java, first update your apt package index:

sudo apt update

Next, check if Java is already installed:

java -version

If Java is not currently installed, you’ll get the following output:

Output
Command 'java' not found, but can be installed with:

sudo apt install default-jre              # version 2:1.11-72build1, or
sudo apt install openjdk-11-jre-headless  # version 11.0.14+9-0ubuntu2
sudo apt install openjdk-17-jre-headless  # version 17.0.2+8-1
sudo apt install openjdk-18-jre-headless  # version 18~36ea-1
sudo apt install openjdk-8-jre-headless   # version 8u312-b07-0ubuntu1
Execute the following command to install the JRE from OpenJDK 11:

sudo apt install default-jre
The JRE will allow you to run almost all Java software.

Verify the installation with:

java -version
You’ll receive output similar to the following:

Output
openjdk version "11.0.14" 2022-01-18
OpenJDK Runtime Environment (build 11.0.14+9-Ubuntu-0ubuntu2)
OpenJDK 64-Bit Server VM (build 11.0.14+9-Ubuntu-0ubuntu2, mixed mode, sharing)
You may need the JDK in addition to the JRE in order to compile and run some specific Java-based software. To install the JDK, execute the following command, which will also install the JRE:

sudo apt install default-jdk
Verify that the JDK is installed by checking the version of javac, the Java compiler:

javac -version
You’ll see the following output:

Output
javac 11.0.14
