<h1 id="#top">Chapter 1</h1>

:flags:

* [Print](#1-Output)
  * [Fo sho, hello world!](#1-a)
  * [Short-cut](#1-b)
  * [Printf specifiers](#1-c)
    * [Int specifiers](#1-ca)
    * [Float specifiers](#1-cb)
    * [String specifiers](#1-cc)
* [Declaration & Memory Allocation](#2-DMA)
  * [Sizes of Common Data Types](#2-a)
  * [Java Primitive Type Data Range](#2-b)
    * [short](#2-ba)
    * [int](#2-bb)
    * [long](#2-bc)
    * [float](#2-bd)
    * [double](#2-be)
    * [char](#2-bf)
    * [byte](#2-bg)
    * [void](#2-bh)
  * [Science Notation](#2-c)
  * [Initialisation](#2-d)
* [Input](#3-Input)
  * [Library](#3-a)
  * [Create a Scanner object](#3-b)
  * [Methods](#3-c)
* [Maths](#4-Maths)
  * [Library](#4-a)
  * [Commonly Used Methods](#4-b)
* [Reminder](#5-Reminder)

<h2 id="1-Output">Print <a href="#top">&#128205;</a></h2>

<h3 id="1-a">Fo sho, hello world! <a href="#top">&#128205;</a></h3>

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

4. Print a single character at a time (without a `\n` at the end) | **Optional**

```
char c = 'a';

System.out.write(c);
```

5. Logging framework to print log messages to the console | **Optional**

```
import java.util.logging.Logger;

Logger logger = Logger.getLogger("MyLogger");
logger.info("[INFO] Welcome to my program!");
```

6. Print a specified string as a ***error message*** and appends a newline character at the end | **Optional**

```
System.err.println("404 NOT FOUND"); // Just an example
```

<h3 id="1-b">Short-cut for <code>System.out.println()</code> on VS Code <a href="#top">&#128205;</a></h3>

* Type `sysout` and press ***tab***

<h3 id="1-c">Printf specifiers <a href="#top">&#128205;</a></h3>

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

<h4 id="1-ca">Additional Printf specifiers - <b>int</b> <a href="#top">&#128205;</a></h4>

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

<h4 id="1-cb">Additional Printf specifiers - <b>float</b> <a href="#top">&#128205;</a></h4>

```
double pearls_sell = 15.2; // EXAMPLE, in Java, mostly use double type instead of float
```

| Specifier |     Output     | Explain                      |
|-----------|----------------|------------------------------|
| `%.4f`    | `15.2000`      | 4 decimal places             |

<h4 id="1-cc">Additional Printf specifiers - <b>String</b> <a href="#top">&#128205;</a></h4>

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

<h2 id="2-DMA">Declaration & Memory Allocation <a href="#top">&#128205;</a></h2>

<h3 id="2-a">Sizes of Common Data Types <a href="#top">&#128205;</a></h3>

| Data Type | Size in Bytes |
|-----------|---------------|
| char      | 1             |
| short     | 2             |
| int       | 4             |
| long      | 8             |
| float     | 4             |
| double    | 8             |
| bool      | 1             |

* **A String is made up of multiple characters.**

<h3 id="2-b">Java Primitive Type Data Range <a href="#top">&#128205;</a></h3>

<h4 id="2-ba">short <a href="#top">&#128205;</a></h4>

* Signed $16$ bits
* $-32768$ to $32767$

<h4 id="2-bb">int <a href="#top">&#128205;</a></h4>

* Signed $32$ bits
* $-2147483648$ ~ $2147483647$

<h4 id="2-bc">long <a href="#top">&#128205;</a></h4>

* Signed $64$ bits
* $-9223372036854775808$ ~ $9223372036854775807$

<h4 id="2-bd">float <a href="#top">&#128205;</a></h4>

* $32$ bits
* $1.40239846\mathrm{e}{-45}f$ ~ $3.40282347\mathrm{e}{+38}f$

<h4 id="2-be">double <a href="#top">&#128205;</a></h4>

* $64$ bits
* $4.94065645841246544\mathrm{e}{-324}$ ~ $1.79769313486231570\mathrm{e}{+308}$

<h4 id="2-bf">char <a href="#top">&#128205;</a></h4>

* Unsigned $16$ bits
* $0('\backslash u 0000')$ ~ $65535 ('\backslash uffff')$

<h4 id="2-bg">byte <a href="#top">&#128205;</a></h4>

* Signed $8$ bits
* $-128$ ~ $127$

<h4 id="2-bh">void <a href="#top">&#128205;</a></h4>

* n/a
* n/a

<h3 id="2-c">Science Notation <a href="#top">&#128205;</a></h3>

For example, `1.5e+3` in maths will be `1500`

$$1.5 * 10^{3}$$

How about `1.5e-3`, it'll be `0.0015`

$$1.5 * 10^{-3}$$

<h3 id="2-d">Initialisation (in details) <a href="#top">&#128205;</a></h3>

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

<h2 id="3-Input">Input <a href="#top">&#128205;</a></h2>

<h3 id="3-a">Library <a href="#top">&#128205;</a></h3>

```
import java.util.Scanner;
```

<h3 id="3-b">Create a Scanner object <a href="#top">&#128205;</a></h3>

```
Scanner scnr = new Scanner(System.in);
```

The `scnr` represents as an **instance** of the `Scanner` class.

<h3 id="3-c">Methods <a href="#top">&#128205;</a></h3>

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

<h2 id="4-Maths">Maths <a href="#top">&#128205;</a></h2>

<h3 id="4-a">Library <a href="#top">&#128205;</a></h3>

```
import java.lang.Math;
```

<h3 id="4-b">Commonly Used Methods <a href="#top">&#128205;</a></h3>

* `Math.sqrt()`, square root
* `Math.sin()`, sine
* `Math.cos()`, cosine
* `Math.tan()`, tangent
* `Math.pow()`, power
* `Math.abs()`, absolute value
* `Math.PI`, the value of π
* `Math.E`, the value of e
* `Math.floor()`, round down
* `Math.ceil()`, round up

<h2 id="5-Reminder">Reminder <a href="#top">&#128205;</a></h2>

1. **Ignore good practices only when doing challenges.**
2. **Understand the question step by step.**
3. **Quickly come up with a solution and try it out, even if it might be wrong. (Hopefully not)**
4. **Keep debugging and practicing.**