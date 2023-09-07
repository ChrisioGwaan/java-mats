# Chapter 2

:gem:

* [Char](#1-Char)
  * [Basic](#1-a)
  * [Input](#1-b)
    * [Good Practice](#1-ba)
    * [Common Mistake](#1-bb)
  * [ASCII Table](#1-c)
  * [Escape Sequences](#1-d)
* [String](#2-String)
  * [Basic](#2-a)
  * [String Input](#2-b)
  * [Operations](#2-c)
    * [`indexOf()`](#2-ca)
    * [`lastIndexOf()`](#2-cb)
    * [`substring()`](#2-cc)
    * [`charAt()`](#2-cd)
    * [`concat()`](#2-ce)
    * [`length()`](#2-cf)
    * [`replace()`](#2-cg)
    * [`+=` operator](#2-ch)
* [Double](#3-double)
  * [Division by Zero](#3-a)
  * [Formatted Output](#3-b)
* [Q & A](#4-qa)

<h2 id="1-Char">Char <a href="#top">&#128205;</a></h2>

<h3 id="1-a">Basic <a href="#top">&#128205;</a></h3>

* A **character literal** is surrounded with single quotes

<h3 id="1-b">Input <a href="#top">&#128205;</a></h3>

Suppose there are 3 char variables,

```
char a;
char b;
char c;

a = scnr.next().charAt(0);
b = scnr.next().charAt(1);
c = scnr.next().charAt(2);

System.out.print("" + a + b + c);
```

The code snippet above doesn't contain any syntax errors but logical one.

:bulb: **`""` shows in front of the 3 characters, that's because Java will consider it as arithmetic, which means the program will show the sum of [ASCII](https://www.ascii-code.com/) number(DEC) of those 3 characters. Adding `""` at front can be considered as a String.**

<h4 id="1-ba">Good Practice <a href="#top">&#128205;</a></h4>

Input:

```
java cpp python
```

Output:

```
jpt
```

Each `scnr.next()` is a single input, separated by whitespace(s). \
First input is `java`, it'll take the `0` element - `j`. \
Second input is `cpp`, it'll take the `1` element - `p`. \
Third input is `python`, it'' take the `2` element - `t`.

<h4 id="1-bb">Common Mistake <a href="#top">&#128205;</a></h4>

Input:

```
hi sup yo
```

Output:

```
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range:
...
```

First input is `hi`, it'll take the `0` element - `h`. \
Second input is `sup`, it'll take the `1` element - `u`. \
Third input is `yo`, `2` element is not found. That is, the String index is out of range.

:bulb: It shows `String` while using `char` as inputs. As mentioned previously, a String is made up of multiple characters. This concepts can involve the knowledge of Array as follows.

```
char[] charArray = {'H', 'e', 'l', 'l', 'o'};

String word = "Hello";

// Similar right
```

<h3 id="1-c">ASCII Table <a href="#top">&#128205;</a></h3>

| DEC | CHAR |-| DEC | CHAR |-| DEC | CHAR |
| --- | ---- |-| --- | ---- |-| --- | ---- |
| 32  | Space |-| 64 | @  |-| 96 | ` |
| 33  | !   |-| 65 | A  |-| 97 | a |
| 34  | "   |-| 66 | B  |-| 98 | b |
| 35  | #   |-| 67 | C  |-| 99 | c |
| 36  | $   |-| 68 | D  |-| 100 | d |
| 37  | %   |-| 69 | E  |-| 101 | e |
| 38  | &   |-| 70 | F  |-| 102 | f |
| 39  | '   |-| 71 | G  |-| 103 | g |
| 40  | (   |-| 72 | H  |-| 104 | h |
| 41  | )   |-| 73 | I  |-| 105 | i |
| 42  | *   |-| 74 | J  |-| 106 | j |
| 43  | +   |-| 75 | K  |-| 107 | k |
| 44  | ,   |-| 76 | L  |-| 108 | l |
| 45  | -   |-| 77 | M  |-| 109 | m |
| 46  | .   |-| 78 | N  |-| 110 | n |
| 47  | /   |-| 79 | O  |-| 111 | o |
| 48  | 0   |-| 80 | P  |-| 112 | p |
| 49  | 1   |-| 81 | Q  |-| 113 | q |
| 50  | 2   |-| 82 | R  |-| 114 | r |
| 51  | 3   |-| 83 | S  |-| 115 | s |
| 52  | 4   |-| 84 | T  |-| 116 | t |
| 53  | 5   |-| 85 | U  |-| 117 | u |
| 54  | 6   |-| 86 | V  |-| 118 | v |
| 55  | 7   |-| 87 | W  |-| 119 | w |
| 56  | 8   |-| 88 | X  |-| 120 | x |
| 57  | 9   |-| 89 | Y  |-| 121 | y |
| 58  | :   |-| 90 | Z  |-| 122 | z |
| 59  | ;  |-| 91 | [  |-| 123 | { |
| 60  | <  |-| 92 | \  |-| 124 | \| |
| 61  | =  |-| 93 | ]  |-| 125 | } |
| 62  | >  |-| 94 | ^  |-| 126 | ~ |
| 63  | ?  |-| 95 | _  |-| ...| ...|

* More [ASCII](https://www.ascii-code.com/) if interested.

<h3 id="1-d">Escape Sequences <a href="#top">&#128205;</a></h3>

| Escape Sequence | CHAR |
| --- | --- |
| \t  | Inserts a tab |
| \b  | Inserts a backspace |
| \n  | Inserts a newline |
| \r  | Inserts a carriage return |
| \f  | Inserts a form feed |
| \\'  | Inserts a single quote |
| \\"  | Inserts a double quote |
| \\  | Inserts a backslash |

<h2 id="2-String">String <a href="#top">&#128205;</a></h2>

<h3 id="2-a">Basic <a href="#top">&#128205;</a></h3>

* A **String literal** is surrounded with double quotes.

<h3 id="2-b">String Input <a href="#top">&#128205;</a></h3>

Review the animation on Z-2.12.7 `Mixing next() and nextLine()`.

:bookmark_tabs: Check out the following code snippet

```
...
int year = scnr.nextInt();
String itemName = scnr.nextLine();

System.out.println("Year: " + year);
System.out.println("Item name: " + itemName);
```

:arrow_right: Input:

```
2023
Cola
```

:arrow_left: Output:

```
Year: 2023
Item name: 
```

:heavy_exclamation_mark: This is a Scanner bug.

```
                nextLine() reads only \n
                   |
                   V
--------------------------------------
| 2 | 0 | 2 | 3 | \n | C | o | l | a |
--------------------------------------
```

:white_check_mark: Solution:

```
...
int year = scnr.nextInt();
scnr.nextLine(); // read the newline
String itemName = scnr.nextLine();

System.out.println("Year: " + year);
System.out.println("Item name: " + itemName);
```

<h3 id="2-c">Operations <a href="#top">&#128205;</a></h3>

<h4 id="2-ca"><code>indexOf()</code> <a href="#top">&#128205;</a></h4>

* `indexOf(ch, index)`
* `ch` is the target to be searched.
* `index` is an **optional** parameter, and indicates where in the string to start looking.
* Return the index of the **first** occurrence of the character in the string.

```
String flower = "poppy";
int index1 = flower.indexOf('p'); // 0
int index2 = flower.indexOf('p', 1); // 2, because it starts to search from index 1 
```

```
String quote = "Pleasant words are like a honeycomb";
int index1 = quote.indexOf('e'); // 2
int index2 = quote.indexOf('e', 17); // 2, because it starts to search from index 5 
```

<h4 id="2-cb"><code>lastIndexOf()</code> <a href="#top">&#128205;</a></h4>

* `lastIndexOf(ch)`
* `ch` is the target to be searched.
* Return the index of the **last** occurrence of the character in the string.

```
String quote = "Honesty is the best policy";
int index = quote.lastIndexOf('t'); // 21
```

<h4 id="2-cc"><code>substring()</code> <a href="#top">&#128205;</a></h4>

* `substring(beginIndex, endIndex)`
* `endIndex` is not included, and it is an **optional** parameter.
* Return a **new String** that is a substring of this String.

```
String quote = "Sweetness to the soul and health to the bones";

String quote_split1 = quote.substring(26); // health to the bones
String quote_split2 = quote.substring(0, 8); // Sweetness, the index 8 element is not included
```

<h4 id="2-cd"><code>charAt()</code> <a href="#top">&#128205;</a></h4>

* `charAt(index)`
* `index` is the position of the character.
* Return the **character** at the specified index.

```
String city = "Melbourne";
char firstLetter = city.charAt(0); // Store first element of city
char fifthLetter = city.charAt(4); // Store fifth element of city
```

<h4 id="2-ce"><code>concat()</code> <a href="#top">&#128205;</a></h4>

* `concat(str)`
* `str` is the String that is concatenated to the end of this String.
* Return a **new String** that represents the concatenation of this String and the `str` argument.
* The `+` operator can also be used to concatenate two strings.

```
String str1 = "Hello";
System.out.println(str1.concat(" World")); // Hello World
```

<h4 id="2-cf"><code>length()</code> <a href="#top">&#128205;</a></h4>

* `length()`
* Return the length of a String.

```
System.out.println("Loveleh".length()); // 7
```

<h4 id="2-cg"><code>replace()</code> <a href="#top">&#128205;</a></h4>

* `replace(oldChar, newChar)`
  * `oldChar` is the old character.
  * `newChar` is the new character.
  * Return a **new String** resulting from replacing all occurrences of `oldChar` in this string with `newChar`.

```
String str1 = "I need to drink some wa'er";
System.out.println(str1.replace('\'', 't')); // I need to drink some water
```

* `replace(oldstr, newstr)`
  * `oldstr` is the old string.
  * `newstr` is the new string.
  * Return a **new String** resulting from replacing all occurrences of `oldstr` in this string with `newstr`.

```
String str1 = "Today's late night snack is cookie";
System.out.println(str1.replace("cookie", "ramen")); // Today's late night snack is ramen
```

<h4 id="2-ch"><code>+=</code> operator <a href="#top">&#128205;</a></h4>

* `+=` operator is used to concatenate another string itself.

```
String str1 = "Hello";
str1 += "!!!"; // Hello!!!
```

<h2 id="3-double">Double <a href="#top">&#128205;</a></h2>

<h3 id="3-a">Division by Zero <a href="#top">&#128205;</a></h3>

In mathematics, the **division by zero** can be expressed as $\frac{a}{b}$, where $b = 0$. The expression has no meaning and it is also considered as undefined. In **Java**, the program will print a floating-point number `NaN` (Not a Number).

<h3 id="3-b">Formatted Output <a href="#top">&#128205;</a></h3>

```
double pi = 3.14159265358979323846;
System.out.printf("pi = %.2f\n", pi); // pi = 3.14 (with a new line)
```

<h2 id="4-qa">Q & A <a href="#top">&#128205;</a></h2>

Q1: `String quote_split1 = quote.substring(26);` what does the 26 represent? Confused with no `endIndex` there.

A1: `26` means where it starts, and endindex is **optional**, so if that is quote.substring(26), suppose quote is a infinite length string, it starts from 26, and end at `infinite length -1`. You may wonder why it has to be minus 1, e.g `"hello".substring(2)`, `hello` has a length of 5 and the index of last letter `o` is `4`. Thus, that would be the `length - 1`.

Q2: Is whitespace considered as a character?

A2: Of course. Check [ASCII](https://www.ascii-code.com/) and look for 32-47 (DEC number), those are space and symbols. `0-31`: Non Printable Characters | `32-127`: Printable Characters.
