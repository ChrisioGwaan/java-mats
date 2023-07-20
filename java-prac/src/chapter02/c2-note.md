# Chapter 2 - Basic II

* [Char](#1-Char)
* [String](#2-String)
* [:gem: String & Char](#3-string-char)
* [Reminder](#4-Reminder)

<h2 id="1-Char">Char</h2>

> Input (In details)

I noticed on `Zybook Help`. I think should be better to explain the `charAt()` more in details.

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

**You might notice the `""` shows in front of the 3 characters, that's because Java will consider it as arithmetic, which means the program will show the sum of [ASCII](https://www.ascii-code.com/) number(DEC) of those 3 characters. Adding `""` at front can be considered as a String.**

***Case 1 - best case***

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

***Case 2 - worst case***

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

Yes, you might wonder why it shows `String` while using `char` as inputs. As mentioned previously, a String is made up of multiple characters. This concepts can involve the knowledge of Array. Look at the following code snippet and you will know.

```
char[] charArray = {'H', 'e', 'l', 'l', 'o'};

String word = "Hello";

// Similar right
```

<h2 id="2-String">String (In details)</h2>

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
                nextLine() read only \n
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

<h2 id="3-string-char">String & Character</h2>

> Well, `charAt()` again~~~

```

```

<h2 id="4-Reminder">Reminder</h2>

**Remember, ask questions if you may have, or give me feedback on this, OR feel free to commit your changes at any time (Collaborator privilege)!**