# Chapter 3

:dango:

* [Logics & Conditions](#1-lc)
  * [AND](#1-a)
  * [OR](#1-b)
  * [Relational Operators](#1-c)
  * [String Comparison](#1-d)
    * [== operator](#1-da)
    * [equals() operator](#1-db)
* [Boolean](#2-bool)
  * [Return Type](#2-a)
  * [Initialisation](#2-b)
* [if-else](#3-elif)
  * [Syntax](#3-a)
  * [Common Logical Issue](#3-b)
  * [Short Hand Form](#3-c)
* [Switch](#4-switch)
  * [Syntax](#4-a)
  * [Additional Cases](#4-b)
* [Q & A](#5-qa)

<h2 id="1-lc">Logics & Conditions <a href="#top">&#128205;</a></h2>

<h3 id="1-a">AND <code>&&</code> <a href="#top">&#128205;</a></h3>

|     | T   | F   |
| --- | --- | --- |
| T   | T   | F   |
| F   | F   | F   |

<h3 id="1-b">OR <code>||</code> <a href="#top">&#128205;</a></h3>

|     | T   | F   |
| --- | --- | --- |
| T   | T   | T   |
| F   | T   | F   |

<h3 id="1-c">Relational Operators <a href="#top">&#128205;</a></h3>

**(for integers or floating-point values, only comparing the values)**

**(for char, only comparing their ASCII values)**

* `>=`, greater than or equal to
* `<=`, less than or equal to
* `>`, greater than
* `<`, less than
* `==`, equal to
* `!=`, not equal to

<h3 id="1-d">String Comparison <a href="#top">&#128205;</a></h3>

<h4 id="1-da"><code>==</code> operator <a href="#top">&#128205;</a></h4>

:bulb: **AKA reference comparison**

It checks if two **references** point to the same memory location.

```
String str1 = "Late Night Snacks";
String str2 = "Late Night Snacks";

String new_str1 = new String("Late Night Snacks");

// str1 == str2 will return true
// However, st1 == new_str1 will return false, because they are not in the same String object in memory.
```

:bulb: **In general, it compares the memory addresses of the string objects rather than their actual content.**

<h4 id="1-db"><code>equals()</code> operator <a href="#top">&#128205;</a></h4>

`str1.equals(new_str1)` means that the actual contents of `str1` and `new_str1` are now comparing, which will return **true**.

<h2 id="2-bool">Boolean <a href="#top">&#128205;</a></h2>

<h3 id="2-a">Return type <a href="#top">&#128205;</a></h3>

:bulb: The result of a relational operator is one of two special values: `true` or `false`, which belongs to the data type `boolean`.

<h3 id="2-b">Initialisation <a href="#top">&#128205;</a></h3>

```
boolean isLegit = true;

boolean result = 2 < 3; // false. You can also do this, because the result of a condition is a boolean data type.

// Multiple conditions
boolean result2 = (5 < 8 && 9 > 10 || 7 == 12); // EXAMPLE, it'll be false
```

<h2 id="3-elif">if-else <a href="#top">&#128205;</a></h2>

<h3 id="3-a">Syntax (In Good Practice) <a href="#top">&#128205;</a></h3>

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

<h3 id="3-b">Common Logical Issue <a href="#top">&#128205;</a></h3>

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

<h3 id="3-c">Short Hand Form <a href="#top">&#128205;</a></h3>

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

<h2 id="4-switch">Switch <a href="#top">&#128205;</a></h2>

<h3 id="4-a">Syntax (In Good Practice) <a href="#top">&#128205;</a></h3>

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

<h3 id="4-b">Additional Cases <a href="#top">&#128205;</a></h3>

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

<h2 id="5-qa">Q & A <a href="#top">&#128205;</a></h2>

Q1: ?

A1: !
