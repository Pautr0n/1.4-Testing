# **Sprint 1, Task 4 - Testing**

## Exercise Description:

- ***Level 1: Junit***
  - **Exercise 1:**
    - Create a Class to manage a books Store. The class must have the following functionalities:
      - Add new books to the collection.
      - Obtain the entire books' collection.
      - Obtain a book's title given a book's position.
      - Add a book to a certain position.
      - Delete a book by providing its title.
    - Verify correct behavior through Junit:
      - Check that the list of books is not null after including an object (book).
      - Check that the size of the list is correct after include some books.
      - Check that the list has a given book in the correct position.
      - Check that there ar not duplicated books.
      - Check that we can retrieve a book giving its position.
      - Check that including a new book properly modifies the list.
      - Check that eliminating books decreases books' list size.
      - Check that adding or deleting a book does not change the alphabetically sorted books' list.
  - **Exercise 2:**
    - Create a class to calculate the Spanish ID card final letter after receiving the ID card number as a parameter.
    - Create a Junit class to verify that the class mentioned above works properly. Parametrize it to make the test receives 10 ID numbers to be validated.
  - **Exercise 3:**
    - Create a class that throws an ArrayIndexOutOfBoundsException
    - Check that it works properly through a Junit test
- ***Level 2: AssertJ:***
  - **Exercise 1:**
    - Make an assertion to demonstrate that the values of two objects are the same and the opposite as well.
      - Clarification: We are comparing that the values of two different objects of the same class are the same. For examples class Person has name and age. Person 1 name and Age are Equals to Person 2 name and age.
  - **Exercise 2:**
    - Make an assertion to demonstrate that two references are pointing at the same object and the opposite as well.
  - **Exercise 3:**
    - Make an assertion to demonstrate that two Arrays of integers are equal.
  - **Exercise 4:**
    - Create an ArrayList<Object> and fulfill it with diverse objects:
      - Make an assertion to verify that the position of the objects inside the ArrayList follow the order of insertion into it.
      - Make an assertion to verify that the objects that have been included into the ArrayList are in there, no matter the position.
      - Verify that one of the objects has been added just one time.
      - Do not add one of the Objects into the ArrayList and verify that the Object is not in the ArrayList.
    - **Exercise 5:**
      - Create a Map and verify that it has one of the keys that has been added.
    - **Exercise 6:**
      - Trigger an ArrayIndexOutOfBoundsException in any class. Create an assertion that verifies the exception is thrown when appropriate.
    - **Exercise 7:**
      - Create an empty Optional object. Write the correct assertion to verify that it is indeed empty.


## **Technologies Used**
- JDK 21
- IntelliJ IDE
- Git & GitHub
- Maven

## **Requirements**
- JDK 21 or greater. (JRE 21 +)
- Maven dependencies:
  - 

## **Installation**
n/a

## **Execution**
- **Using an IDE (from source code without building the project):**
    - Download the repository.
    - Open the project with the IDE
    - Execute the main or the testing classes inside test/java directory.

## **Deployment**
n/a

## **Contributions**
This code has been written by a novice, I will really appreciate your contributions:
1. Fork the repository
2. Create a new branch
3. Commit your contributions
4. Upload them to your branch
5. Execute a pull request
