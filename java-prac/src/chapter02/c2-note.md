# Chapter 2 - Basic II

:gem:

* I. [char](#1-Char)
* II. [String](#2-String)
* III. [charAt()](#3-string-char)
* IV. [double](#4-double)
* V. [Q & A](#5-qa)

<h2 id="1-Char">I. Char</h2>

> Input (In details)

:grey_exclamation: I noticed on `Zybook Help`. I think should be better to explain the `charAt()` more in details.

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

:bulb: **You might notice the `""` shows in front of the 3 characters, that's because Java will consider it as arithmetic, which means the program will show the sum of [ASCII](https://www.ascii-code.com/) number(DEC) of those 3 characters. Adding `""` at front can be considered as a String.**

:radio_button: ***Case 1 - best case***

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

:o: ***Case 2 - worst case***

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

:bulb: Yes, you might wonder why it shows `String` while using `char` as inputs. As mentioned previously, a String is made up of multiple characters. This concepts can involve the knowledge of Array. Look at the following code snippet and you will know.

```
char[] charArray = {'H', 'e', 'l', 'l', 'o'};

String word = "Hello";

// Similar right
```

<h2 id="2-String">II. String (In details)</h2>

> :rotating_light: IMP NOTE

Review the animation on 2.12.7 `Mixing next() and nextLine()`.

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

> Methods - `indexOf()`

:bulb: Explain

`indexOf(ch, index)` - `ch` is the target to be searched. `index` is an **optional** parameter, and indicates where in the string to start looking.

:bookmark_tabs: Check out the following code snippet

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

> Methods - `substring()`

:bulb: Explain

`substring(beginIndex, endIndex)` - `endIndex` is not included, and it is an **optional** parameter.

:bookmark_tabs: Check out the following code snippet

```
String quote = "Sweetness to the soul and health to the bones";

String quote_split1 = quote.substring(26); // health to the bones
String quote_split2 = quote.substring(0, 8); // Sweetness, the index 8 element is not included
```

Check [ASCII](https://www.ascii-code.com/) and look for 32-47 (DEC number), those are space and symbols.

0-31: Non Printable Characters
32-127: Printable Characters

<h2 id="3-string-char">III. charAt()</h2>

> Well, `charAt()` again~~~

:bookmark_tabs: Check out the following code snippet

```
String city = "Melbourne";
char firstLetter = city.charAt(0); // Store first element of city
char fifthLetter = city.charAt(4); // Store fifth element of city
```

<h2 id="4-double">IV. double</h2>

:mega: Previously I was thinking of adding `float` at this stage, but it looks like Zybook really forces beginner to start with using `double` as floating-point value. Thus, `float` will be on additional chapter (TBA after chapter 10).

> crucial concepts from double NOT FOUND hehe, so give me quests :question: :star2: :smile: :pray: 

<h2 id="5-qa">V. Q & A</h2>

Q1: `String quote_split1 = quote.substring(26);` what does the 26 represent? Confused with no `endIndex` there.

A1: `26` means where it starts, and endindex is **optional**, so if that is quote.substring(26), suppose quote is a infinite length string, it starts from 26, and end at `infinite length -1`. You may wonder why it has to be minus 1, e.g `"hello".substring(2)`, `hello` has a length of 5 and the index of last letter `o` is `4`. Thus, that would be the `length - 1`.

Q2: ?

A2: !
Add more if you may have
