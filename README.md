# Java Object-Oriented Shapes Program

## Description

The **Java Object-Oriented Shapes Program** is a command-line application that allows users to construct various **2D and 3D geometric shapes** and calculate their **area or volume**. The program uses a menu-driven interface and applies **object-oriented programming (OOP)** principles such as **inheritance**, **abstraction**, and **polymorphism**.

Users select a shape from the menu, provide the required dimensions, and receive the calculated result. The program supports both **two-dimensional** and **three-dimensional** shapes through a structured class hierarchy.

---

## How It Works

1. When the program starts, the user is presented with a numbered menu of available shapes.
2. The user selects a shape by entering the corresponding number.
3. The program prompts for the necessary dimensions (e.g., radius, side length, height).
4. A shape object is created using the appropriate class.
5. The program computes and displays:

   * **Area** for 2D shapes
   * **Volume** for 3D shapes
6. The user can choose to continue constructing shapes or exit the program.
7. Upon exit, the program displays the current date and time.

---

## Supported Shapes

### Two-Dimensional Shapes (Area)

* Circle
* Rectangle
* Square
* Equilateral Triangle

### Three-Dimensional Shapes (Volume)

* Sphere
* Cube
* Cone
* Cylinder
* Torus

---

## Program Structure

### Core Classes

* **`shape`**

  * Abstract base class for all shapes
  * Stores number of dimensions
  * Defines `getName()`

* **`TwoDimensionalShape`**

  * Abstract subclass of `shape`
  * Defines `getArea()`

* **`ThreeDimensionalShape`**

  * Abstract subclass of `shape`
  * Defines `getVolume()`

### Concrete Shape Classes

* 2D: `circle`, `rectangle`, `square`, `triangle`
* 3D: `sphere`, `cube`, `cone`, `cylinder`, `torus`

Each concrete class:

* Extends the appropriate abstract class
* Implements the required area or volume calculation
* Overrides `getName()`

### Driver Class

* **`project1`**

  * Contains the `main` method
  * Displays the menu
  * Handles user input
  * Controls program flow

---

## How to Run

1. Place all `.java` files in the same directory.
2. Compile the program:

   ```bash
   javac *.java
   ```
3. Run the program:

   ```bash
   java project1
   ```
4. Follow the on-screen prompts to select shapes and enter dimensions.

---

## Example Output

```
You have selected a Sphere
What is the Radius?: 3
The volume of the Sphere is 113.097.
```

---

## Screenshots

1. **Main Menu Display**

   * Shows the full list of shape options.
   * <img width="406" height="247" alt="Screenshot 2025-12-24 163024" src="https://github.com/user-attachments/assets/6a6487b5-8d56-4c3b-b09d-a6304ea76799" />

2. **2D Shape Example**

   * Selecting a Circle or Square
   * Entering dimensions
   * Displayed area result
   * <img width="407" height="351" alt="Screenshot 2025-12-24 163154" src="https://github.com/user-attachments/assets/0bbcbfd5-ea5b-42f7-b179-26a6af28bf8e" />

3. **3D Shape Example**

   * Selecting a Sphere, Cube, or Torus
   * Entering dimensions
   * Displayed volume result
   * <img width="406" height="348" alt="Screenshot 2025-12-24 163249" src="https://github.com/user-attachments/assets/7b57b28b-541d-463e-9a98-5bfa410aa7b2" />

4. **Continue / Exit Prompt**

   * Shows user choosing whether to continue.
   * <img width="410" height="292" alt="Screenshot 2025-12-24 163402" src="https://github.com/user-attachments/assets/199c2433-91bc-410a-8d6a-d0f100ea8395" />

5. **Program Exit Message**

   * Displays the date and time when exiting.
   * <img width="490" height="53" alt="Screenshot 2025-12-24 163459" src="https://github.com/user-attachments/assets/b218c2de-d4a2-4b79-b442-d02195da89f2" />

---

## Concepts Demonstrated

* Object-Oriented Programming (OOP)
* Abstract classes and inheritance
* Polymorphism
* Method overriding
* User input with `Scanner`
* Menu-driven program design
* Mathematical computation in Java
