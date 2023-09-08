# Chapter 6

:tea:

* [Method](#1-Method)
  * [Define](#1-a)
    * [Void](#1-aa)
    * [Return](#1-ab)
  * [Convention of Method's Name](#1-ac)
  * [Incremental Development](#1-ad)
  * [Argument & Parameter](#1-ae)
  * [Static & Instance Method](#1-af)
  * [Method & Function](#1-ag)
  * [Invoke (or Call)](#1-ah)
  * [Overload](#1-ai)
  * [Override](#1-aj)
* [Class](#2-class)
    * [Field Initialisation](#2-a)
    * [Default Constructor](#2-b)
    * [Implicit Parameter - <code>this</code>](#2-c)
    * [Overload Constructor](#2-d)
* [Inheritance](#3-inheritance)
    * [UML Class Diagram](#3-a)
    * [Example of using inheritance](#3-b)
    * [Completed Implementation with UML Class Diagram](#3-c)
* [ArrayList](#4-ArrayList)
    * [Primitives & References type](#4-a)
    * [Declaration](#4-b)
    * [Common ArrayList methods](#4-c)
        * [add(element)](#4-ca)
        * [add(index, element)](#4-cb)
        * [get(index)](#4-cc)
        * [set(index, element)](#4-cd)
        * [size()](#4-ce)
        * [clear()](#4-cf)
    * [ArrayList vs Array](#4-d)
* [Q & A](#5-qa)

<h2 id="1-Method">Method</h2>

<h3 id="1-a">Define</h3>

* A **method** is to carry out a sequence of actions.
* It can be defined **with** or **without** parameters.

<h4 id="1-aa">Void</h4>

A **void** method is a method that does not return a value.

```
public static void printHello() {
    System.out.println("Howdy!");
}

// name is a parameter as a String type
public static void printName(String name) {
    System.out.println("Good day, " + name);
}
```

<h4 id="1-ab">Return</h4>

A **return** method is a method that returns a value.

```
public static int add(int a, int b) {
    return a + b;
} // Return type is int

public static double add(double a, double b) {
    return a + b;
} // Return type is double

public static String add(String a, String b) {
    return a + b;
} // Return type is String

public static boolean add(boolean a, boolean b) {
    return a && b;
} // Return type is boolean

public static char add(char a, char b) {
    return a + b;
} // Return type is char

// etc...
```

<h3 id="1-b">Convention of Method's Name</h3>

* Method names begin with a **lowercase** letter and the rest of the name is in **camel case**, e.g. `calculateSalaryForFullTimeEmployee()`.
* You can use any names for the methods, **except the `main` and any other built-in keywords in Java.**

<h3 id="1-c">Incremental Development</h3>

Sometimes we might make mistakes when writing too much code at once before compiling and running the program, which leads to spending a lot of time to debug. Incremental development is a better approach in software development to avoid this problem. It shall follow:

* Write a few lines of code and start testing if there is an error, make incremental changes.
* Utilise variables to store intermediate values for debugging.
* Consolidate multiple statements into compound expressions if and only if the program is working correctly and it won't affect the readability of the code.

For example, if we want to calculate the total of 6 numbers, the following method has so many parameters in one line. We can write an outline for this method, it is called **stub**.

```
public static int sumTotal
        (int a, int b, int c, int d, int e, int f) {
    return a + b + c + d + e + f;
}
```

<h3 id="1-d">Argument & Parameter</h3>

* **Argument** is the **actual value** that is passed to the method, e.g. `printName("Dango");`. `"Dango"` is the argument.
* **Parameter** is the **variable** that is declared in the method, e.g. `public static void printName(String name)`. `name` is the parameter.

<h3 id="1-e">Static & Instance Method</h3>

* **Static** method is a method that can be called **without** creating an instance of the class. It is declared **with** the keyword `static`.
* **Instance** method is a method that can **only** be called by creating an instance of the class. It is declared **without** the keyword `static`.

<h3 id="1-f">Method & Function</h3>

In programming, the terms *method* and *function* are often used **interchangeably**.

The term *method* is commonly used in Java to refer to blocks of code associated with classes and objects, the term *function* is often used more broadly to describe reusable code that performs a specific task. In Java, you typically work with *methods*, and the usage of *function* might be more prevalent in languages that don't use classes and objects as extensively as Java does.

<h3 id="1-g">Invoke (or Call)</h3>

After a method is defined, it can be **invoked** (or **called**) by using the method name and passing the arguments.

```
public static void main(String[] args) {
    printHello();
    printName("Dango");
}
```

<h3 id="1-h">Overload</h3>

* **Overload** is a feature that allows a class to have **more than one** method having the same name, if their argument lists are different.

```
public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
```

<h3 id="1-i">Override</h3>

* **Override** is a feature that allows a subclass or child class to provide a **specific implementation** of a method that is already provided by one of its superclasses or parent classes.
* `@Override` **annotation** is used to override a method in Java. The compiler checks if there is any method in the superclass that is overridden in the subclass, and if not, it throws a compile-time error.

```
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}
```

<h2 id="2-class">Class</h2>

<h3 id="2-a">Field Initialisation</h3>

```
class Car {
    // Initialised field [Start]
    private Model model;
    private String name;
    // Initialised field [End]

    // Default Constructor
    ...
}
```

<h3 id="2-b">Default Constructor (without any arguments)</h3>

```
class Car {
    ...
    // Initialised fields

    // Default Constructor [Start]
    public Car() {
        // Initialised variables or instances to default values
        model = new Model();
        name = "";
    }
    // Default Constructor [End]

    // Getter, Setter & other methods
    ...
}
```

Suppose there's a class called `City`. In order to access the members of `City`, we need to create an instance, `City metropolitan = new City();`. 

* `metropolitan` is an instance.
* `City()` is a default constructor from main class `City`.

<h3 id="2-c">Implicit Parameter - <code>this</code></h3>

Using `this` allows you to access class members. It's pretty necessary when field members and parameters share the same name.

Even when field members and parameters do not share the same name, it is recommended to use `this` for accessing class members.

<h3 id="2-d">Overload Constructor</h3>

In `Food.java` for example,

```
class Food {
    private String name;

    public Food() {
        name = "";
    }

    // Overload Constructor, with argument(s)
    public Food(String name) {
        this.name = name; // field member and parameter share the same name
    }

    public void setName(String name) {
        this.name = name
    }

    public String getName() {
        return this.name;
    }

    // other methods
    ...
}
```

In `main.java` for example,

```
String name = "Dango";

// Using Default Constructor
Food food1 = new Food();
food1.setName(name);

// Using Overload Constructor
Food food2 = new Food(name);
```

<h2 id="3-inheritance">Inheritance</h2>

<h3 id="3-a">UML Class Diagram</h3>

* Object explaination

![](/java-prac/lib/img/uml-base-class-and-object-explained.png)

* Notations

![](/java-prac/lib/img/relationships-between-classes.png)

* Public, Private and Protected

![](/java-prac/lib/img/class-attributes-with-different-visibility.png)

* Signature

![](/java-prac/lib/img/class-notation.png)

* Attributes and methods

![](/java-prac/lib/img/class-notation-with-examples.png)

![](/java-prac/lib/img/parameter-directionality.png)

* 3 kinds of UML Class Diagram

![](/java-prac/lib/img/perspective-of-class-diagram.png)

<h3 id="3-b">Example of using inheritance</h3>

![](/java-prac/lib/img/ex1.jpeg)

`SalariedEmployee` and `CasualEmployee` are the subclasses of `Employee`.

When creating instances of subclasses, you **can** also use their main class methods without declaring an instance of main class. 

On the other hand, you **cannot** use subclasses methods if an instance is declared and refers to the main class.

<h3 id="3-c">Completed Implementation with UML Class Diagram</h3>

![](/java-prac/lib/img/ex2.jpeg)

The following follows `Strategy` Pattern of Behavioral Pattern in object-oriented software design. 

`calculateStrategy` interface declares the `calculateSalary()` method, which is implemented by abstract employee class `Employee`. 

Each concrete class extends the `Employee` and provides the specific implementation of the `calculateSalary()` method for its corresponding employee type. 

The `calculateSalary()` method is defined as a family of algorithms in the interface and it has been put into each employee type's class so that we can make employee objects interchangeable.

Code has been provided in `oosd` folder. Those are conceptional code and you don't need to implement the `TODO` methods.

<h2 id="4-ArrayList">ArrayList</h2>

<h3 id="4-a">Primitives & References type</h3>

`int`, `double`, `char`, and `boolean` are primitive types.

* **Reference**, refers to an instance of a class, aka an **object**.
* **Primitive**, directly stores the data for that variable type.

| Reference | Primitive |
|-----------|-----------|
| Character | char      |
| Integer   | int       |
| Double    | double    |
| Boolean   | boolean   |
| Long      | long      |

<h3 id="4-b">Declaration</h3>

```
ArrayList<Object> vals = new ArrayList<Object>()
```

When declaring an ArrayList, creates reference variable `vals` and that refers to a new ArrayList object.

As mentioned previously, reference is also known as an object. Primitive type is not allowed.

<h3 id="4-c">Common ArrayList methods</h3>

```
ArrayList<Integer> list = new ArrayList<Integer>();
```

<h4 id="4-ca"><code>add(element)</code></h4>

Appends the specified element to the end of this list.

```
list.add(1);
list.add(2);

// 1, 2
```

<h4 id="4-cb"><code>add(index, element)</code></h4>

Inserts the specified element at the specified position in this list.

```
list.add(1);
list.add(2);
list.add(1, 5); // Insert val 5 into index 1

// 1, 5, 2
```

<h4 id="4-cc"><code>get(index)</code></h4>

Returns the element at the specified position in this list.

```
list.add(1);
list.add(2);

a = list.get(1)

// a stores the value of 2, from index 1 in arraylist
```

<h4 id="4-cd"><code>set(index, element)</code></h4>

Replaces the element at the specified position in this list with the specified element.

```
list.add(1);
list.add(2);

list.set(1, 12)

// Replaces index 1 val into 12
```

<h4 id="4-ce"><code>size()</code></h4>

Returns the number of elements in this list.

```
list.add(12);
list.add(7);

System.out.println(list.size()); // print 2
```

<h4 id="4-cf"><code>clear()</code></h4>

Removes all of the elements from this list.

```
list.add(89);
list.add(56);
list.add(34);
list.add(59);

list.clear();

// null
```

<h3 id="4-d">ArrayList vs Array</h3>

| Array                       | ArrayList        |
|-----------------------------|------------------|
| Fixed Size                  | Dynamic Size     |
| Contiguous memory locations | Underlying array |
| Faster access               | Slower access    |

Basically, **Array** needs a specified size to be declared, but **ArrayList** doesn't have to.



<h2 id="5-qa">Q & A</h2>

Q1: How do **class** and **ArrayList** actually work together?

A1:

First, we start from looking at a simple **ArrayList**

```
ArrayList<Integer> example1 = new ArrayList<Integer>();
example1.add(1);
example1.add(12);
example1.add(122);
example1.add(1222);
```

In memory it would look like

```
[0]: 1
[1]: 12
[2]: 122
[3]: 1222
```

On the other hand, when the data type of an **ArrayList** is a **class**,

```
ArrayList<Food> foodlist = ArrayList<Food>();

foodName = "Dango";
foodCalories = 12.0;
foodQuantity = 2;
foodisHealthy = true;

foodlist.add(new Food(foodName, foodCalories, foodQuantity, foodisHealthy));
foodlist.add(new Food("Ramen", 890.12, 1, true));
...
```

In memory: 

```
[0]: {"dango", 12.0, 2, true}
[1]: {"ramen", 890.12, 1, true}
[2]: {...}
[3]: {...}
```

Since each element contains multiple variables belongs to Food class,
that's why we need an instance to access them.

Assume the instance is exam1, `exam1.getFoodName();` to get the food name in Food class getter method.


Q2: ?

A2: ?
