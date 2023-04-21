How many methods in Object class that can be overridden?

Object : Parent class - methods
toString() - imp (default behavior)
hashCode() - imp (default behavior)
equals(Object) - imp (default behavior )
finalize()
clone()

          notifyAll(), notify(), wait() : work with threads - why Object class?

To manage multiple objects in the memory for running some code on all the objects?

Answer - Arrange the objects in a structure, all languages support the structure called as Array.

Array is a collection of similar data or objects stored in a sequential form.

# 0 1 2 3 4 (index)

| 10 | 20 | 30 | 40 |
| |
| |
======================================================

Limitations of Array are:

- As data grows, the size of array is limited.

Array of Students
Student[3]; in C. C++

Student[] array;

array = new Student[3];

or

Student[] array = new Student[3];

Array is a feature in Java language

java.util.Arrays - is a class called as Utility class that provides methods to manipulate data in array

eg : sorting and searching

      sort() and binarySearch()

link - https://www.geeksforgeeks.org/array-class-in-java/
http://www.beginwithjava.com/java/arrays-arraylist/arrays-of-objects.html

===========================================================================
We cannot increase the size of array dynamically (runtime)

Why we need collections?

- 1.  Retrieve data by index or position
      get(index) - ArrayList

  dictionary - retrieve data from it?
  EX: DRY - Don't Repeat Yourself
  Key - value

50 (initial capacity)
ArrayList

# 0 1 2 3 4 (index) 5 6 7 8 9 10

| 10 | 20 | 30 | 40 |
|  
|  
 ======================================================

Retrieval mechanism:

- index or position-based access
- key based access
- hash-based access

2. Data is Mutable or not Mutable - decide collections

3. Uniqueness of data
   - no duplicates allowed
4. Ordering matters - as you add, same order is used retrieved
   Vs
   UnOrdering matters

5. sorting the data - some algorithm / collections that come with the behavior in the collection

6. Concurrency (access data in a multi-threaded env.)

7. Increasing size of structure based on data

===================================================================

Collection Types : Define the contract of the collection - List - Data to be added in specific order, data can be duplicated, null data are allowed - Set - order does not matters (unordered) , duplicates not allowed - Map - retrieved / stored based on Key-Values - Queue - FIFO

Implementations of these types:
How it will actually work?

- Concrete classes with implementation of the contract

  List (I)

  - - ArrayList (C) , LinkedList (C), Vectors, Stack

  Set (I)

  - HashSet (C), HastTable (C),NavigationSet

  Set (I)  
   |
  SortedSet(I) - TreeSet(C) - implementations are doing sorting internally

  Map (I)

  - HashMap (C)
    SortedMap (I)
  - TreeMap(C)

  Queue (I) - PriorityQueue (C)

# Collection Framework ij Java contains

- Collection Types
- Implementations classes
- Utility class - Collections as a class (sorting, Searching)
  Java 8 - A new api called as Stream API based on Lambda expressions

Next Session (s) - focus on the implementation classes and performance
