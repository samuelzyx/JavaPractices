What is a constructor and wich is his porpuse?
A contructor is a method created inside the class that have the same name that the class and receive all the necesary parameters defined in class this helps us to create new instances of the classes with initializated properties

Difference beetween interface and abstract?
Interface are a class that define the struct methods of the implemetation but not force to implement all methods and we can overwrite the methods if is needed

Abstract can define logic inside the methods of the implementation and force to implement all methods and we cant overwrite methods

What is inheritance in java and how is implemented?

inheritance in java is the way that the program oriented object works because we can share properties (methods or fields) from one class to another and combine this properties and reuse code, is implemented when in the class we use the extends keyworkd after name the class to indicate the inheritance that we need to use

What is overcharge methods and how are differenced about of overwriting methods?
Overcharge methods are used to fix the datatype return and the overwriting methods are related to change the logic inside of the method when it will be implemented

Mention new characteristics of java 8?
Lambda expresions
Functional interfaces
Method references
Stream api
Javascript core

What is a lambda expresion and gives a example of use?
Lambda expressions are methods without access name, without datatype return or receive params datatype gives the opportunity to use program functional, that are more readeable, clean
Yes we can implement a lambda to compare two elements inside of the method 
(a,b){
    if(a>b){
        return a;
    }
    return b;
}

What is stream api and how is used?
Stream api is a library used for the lambda expresions, that implement methods that helps us with handle of collections, like reverse(), sort(), etc, we need to create a instance of the StreamApi class and use the methods that we want

Which is the porpuse of the functional interface and wich anotation are used to mark as functional interface?
The porpuse are to only have one abstract method
@FunctionalInteraface

Write a code to use expresion lambda to sort list of string 

// Sort list using lambda expression
Collections.sort(lista, (s1, s2) -> s1.compareTo(s2));


import java.util.ArrayList;
import java.util.Collections;

public class OrdenarListaStrings {

  public static void main(String[] args) {
    // Lista de strings
    ArrayList<String> lista = new ArrayList<>();
    lista.add("Manzana");
    lista.add("Naranja");
    lista.add("Uva");
    lista.add("Fresa");
    lista.add("Banana");

    // Sort list using lambda expression
    Collections.sort(lista, (s1, s2) -> s1.compareTo(s2));

    // Print sorted list
    System.out.println("Lista ordenada alfabéticamente:");
    for (String fruta : lista) {
      System.out.println(fruta);
    }
  }
}