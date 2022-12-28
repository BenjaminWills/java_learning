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
