# Java

- [Java](#java)
  - [Syntax](#syntax)
  - [Variable types](#variable-types)
  - [Java Naming Conventions](#java-naming-conventions)
  - [Java Data Types](#java-data-types)
  - [Casting Data](#casting-data)
  - [Logic in Java](#logic-in-java)
    - [if else](#if-else)
    - [if elseif](#if-elseif)
    - [Shorthand if else](#shorthand-if-else)
    - [switch](#switch)
  - [Loops](#loops)
  - [Arrays](#arrays)
- [Methods](#methods)
  - [Calling methods](#calling-methods)
  - [Paramaters](#paramaters)
  - [Method Overloading](#method-overloading)
  - [Recursion](#recursion)
- [Classes](#classes)
  - [Creating Classes](#creating-classes)
  - [Creating Objects](#creating-objects)
    - [Using Multiple Classes](#using-multiple-classes)
  - [Attributes](#attributes)
  - [Methods](#methods-1)
  - [Constructors](#constructors)
  - [Modifiers](#modifiers)
    - [Access Modifiers](#access-modifiers)
    - [Non Access Modifiers](#non-access-modifiers)
  - [Encapsulation](#encapsulation)
    - [Get and Set](#get-and-set)
  - [Packages and API](#packages-and-api)
    - [Built-in Packages](#built-in-packages)
    - [User-defined Packages](#user-defined-packages)
  - [Inheritance](#inheritance)
  - [Polymorphism](#polymorphism)
  - [Inner Classes](#inner-classes)
  - [Abstraction](#abstraction)
  - [Interfaces](#interfaces)

## Syntax

Every file must contain a class that has the same name as the file. All code within the:

```java
main()
```

function will be executed when the code is run. The println method stands for `print line` which will print a value to the screen. Each statement should end with `;`

## Variable types

- `String`: double quotes
- `int`
- `float`
- `char`:single characters surrounded by single quotes
- `boolean`

Declaring variables:

```java
type variableName = value;
```

You can also assign no value to a variable as follows

```java
type variableName;
```

and assign a value later on. The `final` keyword is essentially the `const` keyword from JavaScript, it does not allow changes in the variable.

```java
final type variableName = value;
```

finally to declare multiple variables (of the same datatype) we can write

```java
type variableOne = a,variableTwo = b;
```

## Java Naming Conventions

- Names can contain letters,digits,underscores and dollar signs
- Names must begin with a letter
- Names should start with a lowercase letter, $ or \_
- Reserved words cannot be used in names

## Java Data Types

| Data Type | Size    | Description                                                                       |
| --------- | ------- | --------------------------------------------------------------------------------- |
| byte      | 1 byte  | Stores whole numbers from -128 to 127                                             |
| short     | 2 bytes | Stores whole numbers from -32,768 to 32,767                                       |
| int       | 4 bytes | Stores whole numbers from -2,147,483,648 to 2,147,483,647                         |
| long      | 8 bytes | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float     | 4 bytes | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits           |
| double    | 8 bytes | Stores fractional numbers. Sufficient for storing 15 decimal digits               |
| boolean   | 1 bit   | Stores true or false values                                                       |
| char      | 2 bytes | Stores a single character/letter or ASCII values                                  |

## Casting Data

Datatypes can be changed by simply declaring new variables being equal to variables of a different datatype. `Widening Casting` is the process of converting a bytewise smaller datatype to a larger one, and `Narrowing Casting` is the opposite.

```java
type variableName = (newType)(variable);
```

## Logic in Java

Java has a few conditional statements:

- Use `if`,`else` if you only have two conditions
- Use `if`, `elseif` to specify a new condition to test
- Use `switch` to specify many alternative blocks of code to be executed

### if else

```Java
if (conditionOne) {
    outcomeOne
} else {
    outcomeTwo
}
```

### if elseif

```java
if (conditionOne){
    outcomeOne
} elseif (conditionTwo){
    outcomeTwo
} ... else{
    finalOutcome
}
```

### Shorthand if else

These are called `ternary operators`:

```java
variable = (condition) ? expressionTrue:expressionFalse
```

this is equivalent to

```java
if (condition){
    expressionTrue
} else{
    expressionFalse
}
```

### switch

```java
switch(expression){
    case x:
        outputOne
        break;
    case y:
        outputTwo
        break;
    default:
        outputThree
}
```

## Loops

While loops:

```java
while (condition){
    // code
}
```

For loops:

```java
for (statementOne; statementTwo, statementThree){
    // code
}
```

- statement one is executed before the code block (usually the declaration of the starting index)
- statement two is the condition for termination of the code block
- statement three is executed every time the code block is, i.e on each loop (usually an iterator i++)

For each loops:
This loop is exclusively used to loop through an array.

```java
for (type variableName : arrayName){
    // code
}
```

## Arrays

To define an array we use `[]` at varuable declaration.

```java
type[] variableName = {x,y,z};
```

for multidimensional arrays, we need to add more notation

```java
type[][] variableName = {{x,y,z},{w,p,q}}
```

# Methods

Since Java is `object oriented` functions are actually methods, a method is defined as follows:

```java
public class Main {
    static void myMethod(){
        // Code
    }
}
```

- `static` means that the method belongs to the Main class, and is not an object of the main class
- `void` means that the method does not have a `return` value

## Calling methods

```java
public class Main {
    // comment
    static void myMethod() {
        System.out.println("Hello");
    }
    public static void main(String[] args){
        myMethod();
    }
}
```

## Paramaters

A method can have multiple paramaters, they must be typed.

```java
static String myMethod(String name, int age){
        return name + " is " + age + " years old!";
    }
```

Note that `void` has become `String` as we have a return value now, of type `String`.

## Method Overloading

We can allow a function to be capable of returning more than one datatype by overloading it.

```java
static int plusMethod(int x, int y){
    return x + y;
}
static double plusMethod(double x, double y){
    return x + y;
}
public static void main(String[] args) {
    int myNum1 = plusMethod(8,5);
    double myNum2 = plusmethod(1.2,3.1)
}
```

## Recursion

Recursion works like it does anywhere else.

# Classes

Java is an object oriented language, so all functionality comes from classes.

## Creating Classes

We can create a class with the name `Car` with some variable `seats`:

```java
public class Car {
    int seats = 5;
}
```

## Creating Objects

As we know, classes are blueprints for objects to be created on. A class can be a car and the object would be a specific model of a car. Following on from our `Car` example, we can create a new car:

```java
public class Car {
    int seats = 5;

    public static void main(String[] args) {
        Car newCar = new Car();
    }
}
```

We use the `new` key word to instantiate an object from a class.

### Using Multiple Classes

A class name should be identical to the file name, and java files should be organised in folders.

## Attributes

Our car class has one attribute which is `seats`, we can access these using `.` notation:

```java
public class Car {
    int seats = 5;

    public static void main(String[] args) {
        Car newCar = new Car();
        System.out.println(newCar.seats);
    }
}
```

We can also `modify` attributes:

```java
public class Car {
    int seats = 5;

    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.x = 4;
        System.out.println(newCar.seats);
    }
}
```

of course using the `final` keyword will stop this from happening.

## Methods

A method is a function assosiated with a class, we've met them before.

```java
public class Car {
    int seats = 5;
    boolean isDriving = false;

    static void drive() {
        isDriving = true;
    }

    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.x = 4;
        System.out.println(newCar.seats);
    }
}
```

Here the drive method makes the car drive.

A `static` method can be accessed without creating an object of the class, whereas a `public` method can only be accessed
by an object.

## Constructors

We can create class constructors to make life easier for our code:

```java
public class Car {
    int seats;
    boolean isDriving;

    public Car() { // the constructor filling attributes of Car
        seats = 4;
        isDriving = false;
    }

    public static void main(String[] args) {
        Car newCar = new Car();
        System.out.println(newCar.seats);
    }
}
```

The constructor must match the class name. Further they can have parameters which allows for more creative objects.

```java
public class Car {
    int seats;
    boolean isDriving;

    public Car(int carSeats, boolean carIsDriving) { // the constructor filling attributes of Car
        seats = carSeats;
        isDriving = carIsDriving;
    }

    public static void main(String[] args) {
        Car newCar = new Car(4,false);
        System.out.println(newCar.seats);
    }
}
```

## Modifiers

The public keyword is an `access modifier` meaning that it is used to set the access level for classes, attributes, methods and constructors. We have 2 types of modifiers

- Access Modifiers
- Non-Access Modifiers

### Access Modifiers

a `public` class is accessable by ANY other class, whereas by default it is only accessable to classes in the same package.

**Attributes**, **methods** and **constructors** we have a few more:

- `public` - accessible to all classes
- `private` - only accessible to declared class
- `default` - only accessable in same class
- `protected` - only accessable in subclasses and within the same package

### Non Access Modifiers

For **classes** we have:

- `final` - makes class non inheritable
- `abstract` - cannot create objects with this class

For **attributes** and **methods**:

- `final` - attributes/methods cannot be overwritten
- `static` - attributes/methods belong to the class not the object
- `abstract` - can only be used in an abstract class on methods.
- `transient` - attributes and methods are skipped when seriealzin (compiling) the object containing them
- `synchronized` - methods can only be accessed by one thread at a time
- `volatile` - the value of an attribute is not cached thread-locally and is always read from memory

## Encapsulation

This is the method of hiding `sensitive` data. The process consists of 2 steps:

- declare class variables/attributes as `private`
- provide public **get**/**set** methods to access and update the value of a private variable

### Get and Set

A `get` method returns the variables value, a `set` method sets the variables value.

```java
public class Car {
    private int seats;
    private boolean isDriving;

    // Getter
    public int getSeats() {
        return seats;
    }

    // Setter
    public void setSeats(int number){
        this.seats = number;
    }
}
```

So this allows for control of read/write only data.

## Packages and API

A `package` in java is a directory in which related classes are stored, there are two types:

- Built-in packages (java API)
- User-defined packages

### Built-in Packages

Java comes with some prewritten packages, just as most languages do. To get access to these we need the `import` keyword.

```java
import package.name.Class; // importing a singular class
import package.name.*; // importing the whole package
```

### User-defined Packages

To create a package we use the `package` keyword within each class in the package.

```java
package mypack;
```

To save the package we need to specify a destination upon compilation:

```sh
javac -d . packageClassName.java
```

Now to run a class in this package we need to run:

```sh
java mypack.packageClassName
```

## Inheritance

Classes can inherit from other classes, meaning that methods and attributes are shared from parent to child, we categorise this:

- subclass (child) - The inheriter
- superclass (parent) - The class being inherited from

To inherit a class we use the `extends` keyword. For example, a `car` is a `vehicle`, thus our car class should inherit from a vehicle class.

```java
class Vehicle {
    protected String brand = "ford";
    public void honk() {
        System.out.println("HONK")
    }
}

class Car extends Vehicle {
    private String modelName = "mustang";
    public static void main(String[] args){
        Car myCar = new Car();

        myCar.honk() // inherited method

        System.out.println(myCar.brand + " " + myCar.modelName) //inherited attribute
    }
}
```

The `final` keyword stops inheritance from classes.

## Polymorphism

This is just the case of redefining certain methods when inheriting from another class.

## Inner Classes

In java you can nest classes, these can be `private` and thus only accessable to the parent class.

```java
class OuterClass{
    int x = 12;

    class InnerClass{
        int y = 14;
    }
}

public class Main{
    public static void main(String[] args){
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
    }
}
```

## Abstraction

Abstraction is the process of splitting up code into many different functions to make the code more readable for the user. The `abstract` keyword is used for classes and methods:

- Abstract Classes are restricted to not be used to make objects, to access them they must be used in inheritance
- Abstreat methods can only be used in an abstract class and have no body. An abstract class is almost a blueprint for the blueprint

```java
abstract class Animal {
    public abstract void animalSound();
    public int howManyLegs(int legs){
        return legs;
    }
}
class Pig extends Animal {
    public void animalSound(){
        System.out.println("oink");
    }
}
```

## Interfaces

This is another way to achieve abstraction in Java, it is a **completely** abstract class. We use the `implements` key word is used instead of `extends` here.

```java
interface Animal {
    public void animalSound();
    public void sleep();
}

interface Mamal {
    public void isPregnant();
}

Pig implements Animal, Mamal {
    public void animalSound() {
        System.out.println("OINK");
    }
}
```

These are used entirely for inheritance.
