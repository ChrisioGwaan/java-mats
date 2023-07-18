# Chapter 1 - Basic I

Extract some important notes and append additional concepts here, hope it could be useful.

* [Output](#1-Output)
* [Declaration & Memory Allocation](#2-DMA)
* [Input](#3-Input)
* [Maths](#4-Maths)
* [Reminder](#5-Reminder)

<h2 id="1-Output">Output</h2>

> Fo sho, hello world!

1. Print a specified string and appends a newline character at the end.

```
int a = 0;
System.out.println("The value of a is " + a);
```

2. Print a specified string (without a `\n` at the end).

```
System.out.print();
```

3. Print a specified string with variables that needs to be formatting using format specifiers (without a `\n` at the end).

```
String item_name = "Golden Apple";
int amount = 12;

System.out.printf("We got %d %s in the barrel!", amount, item_name);
```

4. `<Optional>` Print a single character at a time (without a `\n` at the end).

```
char c = 'a';

System.out.write(c);
```

5. `<Optional>` Logging framework to print log messages to the console.

```
import java.util.logging.Logger;

Logger logger = Logger.getLogger("MyLogger");
logger.info("JAVA ?!");
```

6. `<Optional>` Print a specified string as a ***error message*** and appends a newline character at the end.

```
System.err.println("404 NOT FOUND"); // Just an example
```

> Short-cut for `System.out.println()` on VS Code

* Type `sysout` and press ***tab***

> ***GOOD PRACTICE***

**Always preserve a newline at the end of a program.**

<h2 id="2-DMA">Declaration & Memory Allocation</h2>

> Sizes of common variable types

| Data Type | Size in Bytes |
|-----------|---------------|
| char      | 1             |
| short     | 2             |
| int       | 4             |
| long      | 8             |
| float     | 4             |
| double    | 8             |
| bool      | 1             |

No `String` there right? Remember a sentence: **In programming, a String is made up of multiple characters.**

> Initialisation (in details)

Look at the following code snippet:
```
int min; // Declare an integer variable without initialising
int max = 0; // Set a default integer value to 0
```

`min` variable is created but not initialised, which means that the vlaue it contains is undefined. That is, the actual value of `min` could be any arbitrary value that happened to be stored in that memory location.

Well on the other hand, `max` is created and has a well-defined initial value.

In both cases, on most systems, an `int` typically occupies 4 bytes of memory. The memory allocated for `min` and `max` are typically located on the stack (local variables) or the heap (dynamically allocated variables).

> ***GOOD PRACTICE***

**It's worth noting for declareing a variable without being assigned to a value.**

<h2 id="3-Input">Input</h2>

> Import the library first

```
import java.util.Scanner;
```

> Create a Scanner object

```
Scanner scnr = new Scanner(System.in);
```

The `scnr` represents as an **instance** of the `Scanner` class.

> Methods

* `scnr.nextInt()`, integer input
* `scnr.nextDouble()`, double input
* `scnr.next()`, string input but in the same line
* `scnr.nextLine()`, string input for the whole line
* `scnr.next().charAt(0)`, char input

> ***GOOD PRACTICE***

```
scnr.close();
```

**To release system resources as soon as you're finished with them to ensure efficient resource utilization and prevent any potential issues.**

<h2 id="4-Maths">Maths</h2>

> Import the library first

```
import java.lang.Math;
```

> Commonly Used Methods

* `Math.sqrt()`
* `Math.sin()`
* `Math.cos()`
* `Math.tan()`
* `Math.pow()`
* `Math.abs()`, absolute value
* `Math.PI`, the value of π

<h2 id="5-Reminder">Reminder</h2>

**Forget about the good practice things while you're doing challenges.** \
**Try to understand the questions.** \
**Come up with a quick solution and try that out even if it is wrong.** \
**Keep debugging, practicing.**

