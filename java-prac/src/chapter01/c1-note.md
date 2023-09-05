# Chapter 1

:flags:

* [Print](#1-Output)
* [Declaration & Memory Allocation](#2-DMA)
* [Input](#3-Input)
* [Maths](#4-Maths)
* [Reminder](#5-Reminder)

<h2 id="1-Output">Print</h2>

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

> Printf specifiers

| Specifier   | Data Type     |
|-------------|---------------|
| `%d`        | int           |
| `%s`        | String        |
| `%c`        | char          |
| `%f`        | float, double         |
| `%e`        | Exponential, scientific notation, float or double |
| `%o`        | Octal number  |
| `%x`        | Hexadecimal number |
| `%%`        | Preserve percentage sign |
| `%n`        | New line |

> Additional Printf specifiers - **int**

```
int population = 8500000; // EXAMPLE
```

| Specifier  |     Output     | Explain                      |
|------------|----------------|------------------------------|
| `%,12d`    | `   8,500,000` | 12 spaces in the String, will leave spaces at front if possible, includes grouping separators |
| `%+,12d`   | `  +8,500,000` | Add a positive sign `+` at front, 12 spaces in the String, will leave spaces at front if possible |
| `%-+,12d`  | `+8,500,000  ` | Add a positive sign `+` at front, 12 spaces in the String, will leave spaces at end if possible |
| `%012d`    | `000008500000` | 12 spaces in the String, will leave `0` at front if possible |
| `%o`       | `40331440`     | Octal |
| `%x`       | `81b320`       | Hexadecimal |

> Additional Printf specifiers - **int**

```
double pearls_sell = 15.2; // EXAMPLE, in Java, mostly use double type instead of float
```

| Specifier |     Output     | Explain                      |
|-----------|----------------|------------------------------|
| `%.4f`    | `15.2000`      | 4 decimal places             |

> Additional Printf specifiers - **String**

```
String name = "dango" // EXAMPLE
```

| Specifier |     Output     | Explain                      |
|-----------|----------------|------------------------------|
| `%7s`     | ` dango` | 7 spaces in the String, will leave spaces at front if possible |
| `%-7s`    | `dango ` | 7 spaces in the String, will leave spaces at end if possible  |
| `%-7S`    | ` DANGO` | `S` will uppercase `dango` |

As you may notice that some specifiers work in all data types, for instance, `%2d`, `%2f`, `%2s`, even `%-2d`.

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

No `String` there right? That's because, **in programming, a String is made up of multiple characters.**

Did I mention `double` is preferable in Java? Statistically say YES, because the range of `double` is `1.7e-308 to 1.7e+308` and `float` one is `3.4e-038 to 3.4e+038`.

Apparently, `double` has a larger range than `float`.

**Science Notation** yes will be explained here.

For example, `1.5e+3` in maths will be `1500`

$$1.5 * 10^{3}$$

How about `1.5e-3`, it'll be `0.0015`

$$1.5 * 10^{-3}$$

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

1. **Ignore good practices only when doing challenges.**
2. **Understand the question step by step.**
3. **Quickly come up with a solution and try it out, even if it might be wrong. (Hopefully not)**
4. **Keep debugging and practicing.**