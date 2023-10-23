# Chapter 3

:dango:

* [Logics & Conditions](#1-lc-)
  * [Logical Operators](#1-a)
    * [NOT](#1-aa)
    * [AND](#1-ab)
    * [OR](#1-ac)  
    * [XOR](#1-ad)
  * [Relational Operators](#1-d)
  * [String Comparison](#1-e)
    * [== operator](#1-ea)
    * [equals()](#1-eb)
    * [compareTo()](#1-ec)
    * [equalsIgnoreCase()](#1-ed)
    * [compareToIgnoreCase()](#1-ef)
  * [Short-circuit Evaluation](#1-f)
  * [Floating-point Numbers Comparison](#1-g)
    * [Issue with == operator](#1-ga)
    * [BigDecimal](#1-gb)
* [Boolean](#2-bool)
  * [Return Type](#2-a)
  * [Initialisation](#2-b)
* [If-else](#3-elif)
  * [Syntax](#3-a)
  * [Common Logical Issue](#3-b)
  * [Short Hand Form](#3-c)
* [Switch](#4-switch)
  * [Syntax](#4-a)
  * [Multiple Conditions](#4-b)
* [Q & A](#5-qa)

<h2 id="1-lc-">Logics & Conditions <a href="#top">&#128205;</a></h2>

<h3 id="1-a">Logical Operators <a href="#top">&#128205;</a></h3>

<h4 id="1-aa">NOT <code>!</code> <a href="#top">&#128205;</a></h4>

This operator negates a Boolean value, changing **True** to **False** and **False** to **True**.

```
boolean a = !((1 + 1) == 2);
                // a will be false.
```

<h4 id="1-ab">AND <code>&&</code> <a href="#top">&#128205;</a></h4>

|     | **T**   | **T**   |
| --- | --- | --- |
| **T**   | T   | F   |
| **T**   | F   | F   |

```
// Suppose a = 0, b = 5, c = 10, d = 15

boolean result = ((!(a > b)) && ((c + b + a) == 15));
                // result will be false.
```

<h4 id="1-ac">OR <code>||</code> <a href="#top">&#128205;</a></h4>

|     | **T**   | **F**   |
| --- | --- | --- |
| **T**   | T   | T   |
| **F**   | T   | F   |

```
// Suppose a = 0, b = 5, c = 10, d = 15

boolean result = ((!(a > b)) && ((c + b + a) == 15)) || (d % 10 != 5);
                // result will be true.
```

<h4 id="1-ad">XOR <code>^</code> <a href="#top">&#128205;</a></h4>

**XOR** ( `^` in Java Syntax) means **exclusive or**, it takes two boolean operands and returns true if, and only if, the operands are different.

That is, whether you're right or I am right, there's no such a place for both of us that are right.

| A   | B   | A XOR B   |
| --- | --- | --- |
| T   | T   | F   |
| F   | T   | T   |
| T   | F   | T   |
| F   | F   | F   |

```
// Suppose a = 0, b = 5, c = 10, d = 15

boolean result = ((!(a > b)) && ((c + b + a) == d)) || (d % c != b) ^ (c % c == a);
                // result will be true. OR operator has the highest precedence.
```

<h3 id="1-d">Relational Operators <a href="#top">&#128205;</a></h3>

**(for integers or floating-point values, only comparing the values)**

**(for char, only comparing their ASCII values)**

* `>=`, greater than or equal to
* `<=`, less than or equal to
* `>`, greater than
* `<`, less than
* `==`, equal to
* `!=`, not equal to

<h3 id="1-e">String Comparison <a href="#top">&#128205;</a></h3>

<h4 id="1-ea"><code>==</code> operator <a href="#top">&#128205;</a></h4>

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

<h4 id="1-eb"><code>equals()</code> <a href="#top">&#128205;</a></h4>

`str1.equals(new_str1)` means that the actual contents of `str1` and `new_str1` are now comparing, which will return **true**.

<h4 id="1-ec"><code>compareTo()</code> <a href="#top">&#128205;</a></h4>

Suppose we have four Strings as follows. Remember that `compareTo()` is case sensitive.

```
String str1 = "oreo";
String str2 = "ore";
String str3 = "oreo";
String str4 = "oreooo";

System.out.println(str1.compareTo(str2)); // 1, str1 has 1 more character than str2
System.out.println(str1.compareTo(str3)); // 0
System.out.println(str1.compareTo(str4)); // -2, str1 has 2 less characters than str4
```

<h4 id="1-ed"><code>equalsIgnoreCase()</code> <a href="#top">&#128205;</a></h4>

Two strings are considered equal ignoring case if they are of the same length and corresponding characters in the two strings are equal ignoring case.

<h4 id="1-ef"><code>compareToIgnoreCase()</code> <a href="#top">&#128205;</a></h4>

Same as `compareTo()`, but it ignores case.

<h3 id="1-f">Short-circuit Evaluation <a href="#top">&#128205;</a></h3>

:bulb: **Short-circuit evaluation** is the process of evaluating the second argument only when needed.

Suppose we have two variables `x` and `y` as follows.

```
if (x > 0 && y > 0) {
    System.out.println("Both x and y are positive");
}
```

* If `x > 0` is false, then `y > 0` will not be evaluated, because the result of `false && y > 0` will always be false.
* If `x > 0` is true, then `y > 0` will be evaluated, because the result of `true && y > 0` depends on the value of `y`.

<h3 id="1-g">Floating-point Numbers Comparison <a href="#top">&#128205;</a></h3>

<h4 id="1-ga">Issue with <code>==</code> operator <a href="#top">&#128205;</a></h4>

It is **NOT** recommended to use `==` operator to compare floating-point numbers, because the result might be unexpected. Floating-point numbers should be compared for a **close enough** value, like `Math.abs(a - b) < 1e-10` as an example. **Epislon** is to avoid the issue of floating-point numbers and it is expected to be a very small number. (Commonly $0.0001$)

If you are interested discovering the actual floating numbers, you can try the following code on your own machine.

```
double a = 0.1;

System.out.println("The value of a is " + a);
System.out.println("The actual floating value of a is " + new.BigDecimal(a));
```

<h4 id="1-gb"><code>BigDecimal</code> <a href="#top">&#128205;</a></h4>

`BigDecimal` is a **class** in Java that provides operations on double numbers for arithmetic, scale handling, rounding, comparison, hashing, and format conversion. It is commonly used for financial calculations. That is, `BigDecimal` is a good choice for representing **monetary** values in Java.

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

<h2 id="4-switch">Switch <a href="#top">&#128205;</a></h2>

- [x] Switch statements can only test for **equality**
- [x] It is possible to write **nested** switch statements
- [x] The default case is **optional** in switch statement, in Java.
- [x] In a switch statement, each case label must have a **unique** constant value.

<h3 id="4-a">Syntax (In Good Practice) <a href="#top">&#128205;</a></h3>

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

<h3 id="4-b">Multiple Conditions <a href="#top">&#128205;</a></h3>

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
