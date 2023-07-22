# Chapter 3 - Basic III

:dango:

* I. [Logics & Conditions](#1-lc)
* II. [Boolean](#2-bool)
* III. [if-else](#3-elif)
* IV. [Switch](#4-switch)
* V. [Q & A](#5-qa)

<h2 id="1-lc">I. Logics & Conditions</h2>

> AND `&&`

|   | T | F |
|---|---|---|
| T | T | F |
| F | F | F |

> OR `||`

|   | T | F |
|---|---|---|
| T | T | T |
| F | T | F |

> Comparing integers or floating-point values or char

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