# Chapter 6 - Basic VI

* I. [Class](#1-class)
* II. [Method](#2-Method)
* III. [ArrayList](#3-ArrayList)
* IV. [Inheritance](#4-inheritance)
* V. [Q & A](#5-qa)

<h2 id="1-class">I. Class</h2>

> Field Initialisation

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

> Default Constructor (without any arguments)

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

You may wonder how default constructor works in main program. We usually initialise  an object, for example, a class called `City`. If we want to use the class, we need to declare an instance, `City melbourne = new City();`. `melbourne` is an instance, and `City()` is calling a default constructor from `City` class.

> Implicit Parameter - `this`

Using `this` allows you to access class members. It's pretty necessary when field members and parameters share the same name.

Even when field members and parameters do not share the same name, it is recommended to use `this` for accessing class members.

> Overload Constructor

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

<h2 id="2-Method">II. Method</h2>

TBD

<h2 id="3-ArrayList">III. ArrayList</h2>

> Primitives & References type

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

> Declaration

```
ArrayList<Object> vals = new ArrayList<Object>()
```

When declaring an ArrayList, creates reference variable `vals` and that refers to a new ArrayList object.

As mentioned previously, reference is also known as an object. Primitive type is not allowed.

> Common ArrayList methods

```
ArrayList<Integer> list = new ArrayList<Integer>();
```

1. `add(element)`

Appends the specified element to the end of this list.

```
list.add(1);
list.add(2);

// 1, 2
```

2. `add(index, element)`

Inserts the specified element at the specified position in this list.

```
list.add(1);
list.add(2);
list.add(1, 5); // Insert val 5 into index 1

// 1, 5, 2
```

3. `get(index)`

Returns the element at the specified position in this list.

```
list.add(1);
list.add(2);

a = list.get(1)

// a stores the value of 2, from index 1 in arraylist
```

4. `set(index, element)`

Replaces the element at the specified position in this list with the specified element.

```
list.add(1);
list.add(2);

list.set(1, 12)

// Replaces index 1 val into 12
```

5. `size()`

Returns the number of elements in this list.

```
list.add(12);
list.add(7);

System.out.println(list.size()); // print 2
```

6. `clear()`

Removes all of the elements from this list.

```
list.add(89);
list.add(56);
list.add(34);
list.add(59);

list.clear();

// null
```

> ArrayList vs Array

| Array                       | ArrayList        |
|-----------------------------|------------------|
| Fixed Size                  | Dynamic Size     |
| Contiguous memory locations | Underlying array |
| Faster access               | Slower access    |

Basically, **Array** needs a specified size to be declared, but **ArrayList** doesn't have to.

<h2 id="4-inheritance">IV. Inheritance</h2>

> UML Class Diagram

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

> Example of using inheritance

![](/java-prac/lib/img/ex1.jpeg)

`SalariedEmployee` and `CasualEmployee` are the subclasses of `Employee`.

When creating instances of subclasses, you **can** also use their main class methods without declaring an instance of main class. 

On the other hand, you **cannot** use subclasses methods if an instance is declared and refers to the main class.

> Completed Implementation UML Class Diagram of the example

![](/java-prac/lib/img/ex2.jpeg)

The following follows `Strategy` Pattern of Behavioral Pattern in object-oriented software design. 

`calculateStrategy` interface declares the `calculateSalary()` method, which is implemented by abstract employee class `Employee`. 

Each concrete class extends the `Employee` and provides the specific implementation of the `calculateSalary()` method for its corresponding employee type. 

The `calculateSalary()` method is defined as a family of algorithms in the interface and it has been put into each employee type's class so that we can make employee objects interchangeable.

Code has been provided in `oosd` folder. Those are conceptional code and you don't need to implement the `TODO` methods.

<h2 id="5-qa">V. Q & A</h2>

Q1: How do classes actually work with `ArrayList`?

A1:

First, we start from looking at a simple `ArrayList`

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

On the other hand, when the data type of an ArrayList is a class,

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
that's why we need an instance to access them

Assume the instance is exam1, `exam1.getFoodName();` in Food class getter method


Q2: ?

A2: ?
