# Java

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
