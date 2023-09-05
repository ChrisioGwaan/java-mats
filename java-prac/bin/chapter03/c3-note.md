# Chapter 3 - Basic III

* I. [Logics & Conditions](#1-lc)
* II. [Boolean](#2-bool)
* III. [if-else](#3-elif)
* IV. [Switch](#4-switch)
* V. [Q & A](#5-qa)

<h2 id="1-lc">I. Logics & Conditions</h2>

> AND `&&`

|     | T   | F   |
| --- | --- | --- |
| T   | T   | F   |
| F   | F   | F   |

> OR `||`

|     | T   | F   |
| --- | --- | --- |
| T   | T   | T   |
| F   | T   | F   |

> Relational Operators

**(for integers or floating-point values, only comparing the values)**

**(for char, only comparing their ASCII values)**

* `>=`, greater than or equal to
* `<=`, less than or equal to
* `>`, greater than
* `<`, less than
* `==`, equal to
* `!=`, not equal to

> Comparing String (in details - Memory Allocation)

* Using `==` operator

:bulb: **There's a terminology for this, reference comparison**

It checks if two references point to the same memory location , such as if they refer to the exact same object in memory.

:bookmark_tabs: Check out the following code snippet

```
String str1 = "Late Night Snacks";
String str2 = "Late Night Snacks";

String new_str1 = new String("Late Night Snacks");

// str1 == str2 will return true
// However, st1 == new_str1 will return false, because they are not in the same String object in memory.
```

:bulb: **In general, it compares the memory addresses of the string objects rather than their actual content.**

* Using `equals()` operator

:bulb: How to use? Let's use the same code snippet provided on above

`str1.equals(new_str1)` means that the actual contents of `str1` and `new_str1` are now comparing, which will return **true**.

**My suggestion is that every time when you're doing String comparison, it would be better to use `equals()` rather than `==` in order to avoid some potential issues or unexpected behaviours.**

<h2 id="2-bool">II. Boolean</h2>

> Data type

:bulb: The result of a relational operator is one of two special values: `true` or `false`, which belongs to the data type `boolean`.

> Declaration

:bookmark_tabs: Check out the following code snippet

```
boolean isLegit = true;

boolean result = 2 < 3; // false. You can also do this, because the result of a condition is a boolean data type.

// Multiple conditions
boolean result2 = (5 < 8 && 9 > 10 || 7 == 12); // EXAMPLE, it'll be false
```

<h2 id="3-elif">III. if-else</h2>

> Syntax (In Good Practice)

:bookmark_tabs: Check out the following code snippet

```
if (condition1) {
    playMinecraft();
} else if (condition2) {
    haveLNS();
} else {
    goToSleep();
}
```

`if-else` syntax in Java is pretty similar to other languages like C/C++, C# etc.

> Common Logical Issue

:bookmark_tabs: Check out the following code snippet

```
String food1 = "Ramen";
String food2 = "Chicken Katsu";
String food3 = "Tempura";
String food4 = "Daifuku";
String food5 = "Dorayaki";

if (food1.equals("Ramen")) {
    System.out.println("Ramen for late night snack!");
} else if (food2.equals("Chicken Katsu")) {
    System.out.println("Chicken Katsu for late night snack!");
} else if (food3.equals("Tempura")) {
    System.out.println("Tempura for late night snack!");
} else if (food4.equals("Daifuku")) {
    System.out.println("Daifuku for late night snack!");
} else if (food5.equals("Dorayaki")) {
    System.out.println("Dorayaki for late night snack!");
} else {
    System.out.println("Maccas for late night snack!");
}
```

Java is a programming language that follows a sequential execution model, which means that it executes statements in the order they appear in the code, one after the other.

Since `food1.equals("Ramen")` is the first condition in `if-else` statement, if the condition is true, then it will directly return `Ramen for late night snack!` and ignore other conditions.

:bookmark_tabs: There's a solution for the issue above:

```
...
boolean LNS = false;

if (!LNS) { // !false = true, which means it will be always true as long as the LNS is false as default.
    if (food1.equals("Ramen")) {
        System.out.println("Ramen for late night snack!");
    }
    if (food2.equals("Chicken Katsu")) {
        System.out.println("Chicken Katsu for late night snack!");
    }
    if (food3.equals("Tempura")) {
        System.out.println("Tempura for late night snack!");
    }
    if (food4.equals("Daifuku")) {
        System.out.println("Daifuku for late night snack!");
    }
    if (food5.equals("Dorayaki")) {
        System.out.println("Dorayaki for late night snack!");
    } 
} else {
    System.out.println("Maccas for late night snack!");
}
```

:bulb: With this solution, all conditions will be checked. You might notice the `!LNS`. The `if-else` parentheses inside must be a condition and the results is either false or true. `LNS = false` is declared as default, by using `!LNS` can satisfy the first `if` and continue to do other operations.

> Short Hand Form

:grey_exclamation: Before explaning that, I personally not recommend this to programming beginners. So write `if-else` in a normal form for now and if there's one day that you think you are familiar with coding it, you could start getting used to the short hand form.

:bulb: Suppose we have a variable `boolVal`, it could be any data types.

```
boolVal = (condition) ? doSomethingTrue :  dosomethingFalse;
```

Translated in plain English, it means:

* If condition is true, `boolVal` equals to `doSomethingTrue`
* If condition is false, `boolVal` equals to `dosomethingFalse`

:bulb: Example

```
String today = "Monday";
String toListen = (today.equals("Monday")) ? "Listen to +study album" : "Listen to +sentimental.ballads album";
```

In normal form:

```
String today = "Monday";

if (today.equals("Monday")) {
    String toListen = "Listen to +study album";
} else {
    String toListen = "Listen to +sentimental.ballads album";
}
```

Looks the same right.

<h2 id="4-switch">IV. Switch</h2>

> Syntax (In Good Practice)

:bookmark_tabs: Check out the following code snippet

```
switch (number) {
    case 1:                 // number == 1 ?
        word = "one";
        break;
    case 2:                 // number == 2 ?
        word = "two";
        break;
    case 3:                 // number == 3 ?
        word = "three";
        break;
    default:                // else
        word = "unknown";
        break;
}
```

Similar to the form in `if-else`:

```
if (number == 1) {
    word = "one";
} else if (number == 2) {
    word = "two";
} else if (number == 3) {
    word = "three";
} else {
    word = "unknown";
}
```

> multiple cases

```
...
switch (food) {
    case "dango":
    case "ramen": // OR
    case "Tempura": // OR
        System.out.println("Jap Fav!");
        break;
    case "HK Style French Toast": // OR
    case "Milk Tea": // OR
    case "Instant Noodle": // OR
        System.out.println("Canto Fav!");
        break;
}
```

Translated to `if-else`:

```
...
if (food.equals("dango") || food.equals("ramen") || food.equals("Tempura")) {
    System.out.println("Jap Fav!");
} else if (food.equals("HK Style French Toast") || food.equals("Milk Tea) || food.equals("Instant Noodle")) {
    System.out.println("Canto Fav!!");
}
```

<h2 id="5-qa">V. Q & A</h2>

Q1: TBA

A1: TBA
