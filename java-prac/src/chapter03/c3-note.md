# Chapter 3 - Basic III

:dango:

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

> Common Logical Error

> Common Maths practice

```
int p = 5;
```

If `p` is even, print out `5 is even`
If `p` is odd, print out `5 is odd`

Obviously, the code will only run the second line. But how could we do that using if-else?

To determine whether a number is odd or even, we just need to check `5 % 2 == 0 ?`.




