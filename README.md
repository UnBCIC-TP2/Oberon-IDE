## Oberon IDE

This is the XText-based IDE implementation of the Oberon language. It integrates the XText approach with an existing implementation of the Oberon language (https://github.com/UnBCIC-TP2/Oberon-Scala). Currently, this implementation exports a C program from an Oberon module---using our existing implementation of Oberon.

Future work:

   * [ ] integrate the type checker feature (from a context menu)
   * [ ] integrate the interpreter feature (from a context menu)
   * [ ] export the C code for a specific output directory (using the auto-save mechanism)
   * [ ] add the parser test cases previous implemented by some students

### Requirements

This project was successfully built with:


(a) Java Development Kit

openjdk version "11.0.10" 2021-01-19
OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.10+9)
OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.10+9, mixed mode)

(b) Eclipse DSL

Eclipse DSL Tools (includes Incubating components)

Version: 2021-03 (4.19.0)
Build id: 20210312-0638

Eclipse Xtext VERSION: 2.25.0.v20210301-0928

(c) Maven

Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: /usr/local/Cellar/maven/3.6.3_1/libexec
Java version: 11.0.10, vendor: AdoptOpenJDK, runtime: /Users/rbonifacio/.sdkman/candidates/java/11.0.10.hs-adpt
Default locale: pt_BR, platform encoding: UTF-8
OS name: "mac os x", version: "10.16", arch: "x86_64", family: "mac"
