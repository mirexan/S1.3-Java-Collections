# S1.3-Java-Collections

## 📄 **Description**

This project has two exercises about exceptions and error management. In which i've learned to throw an
own exception class and to make a try catch in uncertain situations.

![image](https://images.unsplash.com/photo-1524779709304-40b5a3560c60?q=80&w=1376&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D)

### **Level 01**

**Exercise 01**

    Create a class named Month with an attribute "name" (which will store the name of the month).

    Add 11 Month objects (each with a different name) to an ArrayList,
    excluding the object with the name "August".
    
    Then, insert that month in its correct position and demonstrate that
    the ArrayList maintains the correct order.
    
    Convert the ArrayList from the previous exercise into a HashSet and make sure
    it does not allow duplicates.
    
    Traverse the list using both a for loop and an iterator.

**Exercise 02**

    Create and fill a List<Integer>.

    Create a second List<Integer> and insert the elements from the first list
    into the second one in reverse order.
    
    Use ListIterator objects to read the elements from the first list
    and insert them into the second.

**Exercise 03**

    Given the file countries.txt (see the resources section), which contains countries
    and their capitals, the program must read the file and store the data in a
    HashMap<String, String>.
    
    The program should ask for the user's name, then randomly display a country
    stored in the HashMap.
    
    The user must enter the capital city of the given country.
    If the answer is correct, the user scores a point. This process is repeated 10 times.
    
    After 10 random questions, the program must save the user's name and their score
    in a file called classification.txt.

### **Level 02**

**Exercise 01**
    
    Create a class called Restaurant with two attributes: name (String) and score (int).

    Implement the necessary methods so that it's not possible to add Restaurant objects
    with both the same name and the same score to a HashSet created in the application's main() method.
    
    Important:
    Restaurants may have the same name with different scores,
    but there cannot be restaurants with the same name and same score.

**Exercise 01**

    Using the class from the previous exercise, create the necessary implementation so that
    Restaurant objects are ordered by name and by score in descending order.
    
    Example:
    
    name: restaurant1, score: 8
    
    name: restaurant1, score: 7


## 💻 **Used technologies**

- Java
- Git

## 📋 **Requirements**

- Oracle OpenJDK 21.0.8

## 🛠️ **Install**

1. Clone this repo: **>  [git clone](https://github.com/mirexan/S1.2-Exceptions.git)**
2. Acces to the directories in: S1.3-Java-Collections
