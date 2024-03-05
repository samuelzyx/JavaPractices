What are you long term goals?

- Im looking continue grow up as Dev, my nex step is be part of the tech leads roles and after that be arquitect
- Obtain more experience from different projects and technologies

Difference beetween hard work and smart work?

- For me hard work is related to discipline, is like, all days, all time we need to continue improve our selves in any discipline that we want to be better, there is not another way to improve as the hard work
- And smart work is related to but with planning your goals, to short goals, long goals, and put priorities
- Hard just do it and smart do it with direction

Do you have experience in Java 8 or 10?

- My experience are more related to Java 7 or less

What are JVM, JDK and JRE?

- The JVM is the Java Virtual Machine, that gives the chance to run the programs that we write in code of lenguage Java, allowing the variables values in memory and handle the resources for that running program
- The JDK is the Java Development Kit that contains all the libraries and the core of the Java code to start to develop and execute programs on our operative system so is required for specefici version.
- The JRE is the Java Runtime Environment that contains all the necesary libraries to execute code programs in Java.

Java include pointers?

- No, pointers are related to C or Golang, these lenguage use that to allocate memory address porpuses, but Java uses the JVM to handle that automatically.

In Java have date and times APIs?

There are three types
- Local Date (Days,Months,Years,etc)
- Local Time (Hours,Mins,Seconds,etc)
- Local Date Time (Combined date and time)

what is the Default Method in Java and when does it get used?

- The default method is defined in a interface with the restrict word key: default
- We can define logic inside of the method but we can overwrite in the implementation if is needed
- Is accessible from the instance that is implemented
- Give us the opportunity to reuse code by defect and share it by another interfaces

Can you mention the main classes implementing the list interface?

- ArrayList: Array internally that it will resize automatically (hard to insert and delete in the middle of the list)
- LinkedList: Based in the algoritm linked list (easy to insert and delete, but not efficient to access by index)
- Vector: Class inherited from ArrayList is synchronized by use in subprocess (less efficient that Array List )
- Stack: Class inherited from Vector implements a struct of data LIFO (Last in enter, first in exit) used to implement piles/stack
- CopyOnWriteArrayList: Inmutable class that is secure to use in subprocess with out sync (less efficient that Array List)


Can you explain what is an array?

- Array is a collection of values of the same data type, defined by a variable that have specific length 

Can you explain what is a linked list?
- Linked list is based in the algoritm linked list that uses the array list interface, but in algortim is a collection of elements that have nodes, and each node points to the next and before node, is like a circuit of nodes

Java support linked list?

- Yes, are part of the interfaces that implements Array List

What is recursion?

- Recursion is the way that one method are calling by itself until the condition that is defined inside it breaks the call and get result

What is the best sorting algoritm according to you?

From my perspective there is not a best sorting algoritm itselve, because all the sorting algortims are define to resolve specific problems sorting, but I like the Quick sort algoritm that have a pivote to know the great and low values in the collection.

Difference beetween System.out System.err and System.in?

- System.out is used to print messages in terminal
- System.out is used to print error messages in terminal
- System.in is used to capture entry values from the keyboard

Syntax on how to create a linked list and a vector in Java?
LinkedList<DataType> nameList = new LinkedList<>();
Vector<DataType> nameList = new Vector<>();

How to find the highest number that exist in a list?

- We need to have a variable maxNumb and start to compare that value with each element in the list
until found the highest number.
- Or using the library Collections with the method max: Collections.max(list)

How do you reverse a string in Java?

- We can convert string to array of char: use a while that compares the endPosition < startPosition inside, we can store the endPosition of the string in to the aux variable and assing the startPosion to the endPosition and the aux to the startPosiiton and decrease the endPositon and increment the startPosition to do that 
- We can use a StringBuilder library and use the reverse method: 
String str = "Hello";
StringBuilder reverseStr = new StringBuilder(str);
reverseStr.reverse();
System.out.println(reverseStr);

How many objects can a hashmap have?

- It will be defined by the memory limitations and the data types that contains and also the different keys that the collection because the keys are unique

How to create a Hashmap?

- HashMap<Datatype><Datatype> map = new HashMap<>();


Can you tell me what are you greatest strength and weaknesses?

- Greatest experience in a lot of technologies, frameworks, diciplinary and self motiveted person
- Weakness not much experience with the technology stack but im interested in improve that

Where are you seen in five years?

- With more experience maybe be part of Tech Leads or Arquitect roles

Why should we hire you?

- I found that the culture of the company and the requirements in the vacancy are matched with me so I will give my best effort

Do you have any questions to the interviewer?

- Tell me more about the posibble project and the task that we will have to do in the sprints