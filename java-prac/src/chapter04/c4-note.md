# Chapter 4
:ramen:

* [For Loop](#1-for)
  * [Syntax](#1-a)
  * [Increments](#1-b)
    * [i++](#1-ba)
    * [++i](#1-bb)
    * [Additional Increment](#1-bc)
  * [Break](#1-c)
  * [Continue](#1-d)
  * [String Iteration](#1-e)
  * [Nested Loop](#1-f)
  * [Enhanced For Loop](#1-g)
* [While Loop](#2-while)
  * [Syntax](#2-a)
  * [Common Multiple-inputs Question](#2-b)
* [Enumerations](#3-enum)
  * [Initialisation](#3-a)
  * [Usage](#3-b)
* [Scope](#4-scope)
* [Q & A](#4-qa)

<h2 id="1-for">For Loop <a href="#top">&#128205;</a></h2>

<h3 id="1-a">Syntax (In Good Practice) <a href="#top">&#128205;</a></h3>

:bookmark_tabs: Check out the following code snippet

```
for (int i = 0; i < size; i++) {
    doSomething();
}
```

* `int i = 0`: Declare a variable i for iterations.
* `i < size`: Condition, to limit the value of i cannot exceed the value of size.
* `++i`: Increase the value of i by $1$ for iterations.

<h3 id="1-b"><code>i++</code> and <code>++i</code> <a href="#top">&#128205;</a></h3>

<h4 id="1-ba"><code>i++</code> is <b>Post-increment</b> <a href="#top">&#128205;</a></h4>

```
int i = 5;
int result = i++;  // The value of 'i' (5) is used in the expression, then 'i' is incremented to 6.
// 'result' is 5, and 'i' is 6 after this line.
```

<h4 id="1-bb"><code>++i</code> is <b>Pre-increment</b> <a href="#top">&#128205;</a></h4>

```
int i = 5;
int result = ++i;  // 'i' is incremented to 6 first, then the value of 'i' (6) is used in the expression.
// 'result' is 6, and 'i' is 6 after this line.
```

<h4 id="1-bc">Additional Increment <a href="#top">&#128205;</a></h4>

```
int i = 5;
i = i + 1;
```

```
int i = 5;
i += 1;
```

<h3 id="1-c"><code>break</code> <a href="#top">&#128205;</a></h3>

```
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // Terminate the loop when i becomes 5
    }
    System.out.print(i + " ");
}
```

The output will be `1 2 3 4 `. Because when `i = 5`, the iteration ends and the loop is terminated.

<h3 id="1-d"><code>continue</code> <a href="#top">&#128205;</a></h3>

```
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // Skip the current iteration when i is 3
    }
    System.out.print(i + " ");
}
```

The output will be `1 2 4 5 `. Because when `i = 3`, the `System.out.print(i + " ")` will not be executed and the iteration continues.

<h3 id="1-e">String Iteration <a href="#top">&#128205;</a></h3>

:bulb: Print characters of a String one by one:

```
String dessert = "Neapolitan Ice Cream";

for (int i = 0; i < dessert.length(); i++) {
    char letter = dessert.charAt(i);
    System.out.println(letter);
}
```

:bulb: Print a String in the reverse direction:

```
String dessert = "Neapolitan Ice Cream";
String rDessert = "";

for (int i = dessert.length() - 1; i >= 0; i--) {
    rDessert += dessert.charAt(i); // Store every characters of dessert from reverse direction into varaible rDessert
}

System.out.println(rDessert);
```

<h3 id="1-f">Nested Loop <a href="#top">&#128205;</a></h3>

```
for (int i = 0; i < 5; i++) {
    System.out.println("DIAMOND LEVEL: " + i);

    for (int j = 0; j < 5; j++) {
        System.out.print("XRAY ");
    }
 
    System.out.println("");
}
```

The link will show the whole process of the code above. [![Better Visualization](https://img.shields.io/badge/Better%20Visualization-Click%20Here-blue)](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+ClassNameHere+%7B%0A+++public+static+void+main(String%5B%5D+args)+%7B%0A++++++for+(int+i+%3D+0%3B+i+%3C+5%3B+i%2B%2B)+%7B%0A+++++++++System.out.println(%22DIAMOND+LEVEL%3A+%22+%2B+i)%3B%0A%0A+++++++++for+(int+j+%3D+0%3B+j+%3C+5%3B+j%2B%2B)+%7B%0A++++++++++++System.out.print(%22XRAY+%22)%3B%0A+++++++++%7D%0A+++++++++System.out.println(%22%22)%3B%0A++++++%7D%0A+++%7D%0A%7D&mode=display&curInstr=0)

:bulb: Meanwhile, keep in mind of counting how many times the program has been running.  In total, it runs $25$ times, right? For `i < 5`, the outer `for` loop has 5 iterations, so does `j` of the inner `for` loop. Thus, it follows a formula of `i` * `y` for the nested loop.

<h3 id="1-g">Enhanced for loop <a href="#top">&#128205;</a></h3>

```
String quote = "Lime and Pink is the BEST combo, ALWAYS!";

for (char letter : quote.toCharArray()) {
  System.out.println(letter);
}
```

`toCharArray()`: Converts it into a character array.

:bulb: **The enhanced for loop iterates over each character in the array and prints it to the console.**

<h2 id="2-while">While Loop <a href="#top">&#128205;</a></h2>

<h3 id="2-a">Syntax (In Good Practice) <a href="#top">&#128205;</a></h3>

```
while (condition) {
    doSomething();
}
```

`break` and `continue` can also be used in `while` loop.

<h3 id="2-b">Common multiple inputs question <a href="#top">&#128205;</a></h3>

Write a program that takes multiple integer numbers and stops the input by any negative digital number.

Return a sum of the numbers from user input.

* Input: `1 11 23 13 6 12 7 9 -1`
* Output: `82`

```
Scanner scnr = new Scanner(System.in);

int sum = 0;                    // create a sum variable for now
int userNum = scnr.nextInt();   // get the first input

// while loop will check if userNum >= 0
while (userNum >= 0) {
                                // if userNum >= 0, it will be added to the sum
    sum += userNum;             // remember to add sum itself
    userNum = scnr.nextInt();   // get the next input
}

System.out.println(sum);

scnr.close();
```

<h2 id="3-enum">Enumerations <a href="#top">&#128205;</a></h2>

`enum` type is a special data type that enables for a variable to be a set of predefined **constants**.

<h3 id="3-a">Initialisation <a href="#top">&#128205;</a></h3>

```
public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
```

<h3 id="3-b">Usage <a href="#top">&#128205;</a></h3>

```
String day = "";
Day today;

System.out.println("Enter a day of the week: ");
day = scnr.next();

if (day.equals("mon")) {
    today = Day.MONDAY;
} else if (day.equals("tues")) {
    today = Day.TUESDAY;
} else if (day.equals("wed")) {
    today = Day.WEDNESDAY;
} else if (day.equals("thur")) {
    today = Day.THURSDAY;
} else if (day.equals("fri")) {
    today = Day.FRIDAY;
} else if (day.equals("sat")) {
    today = Day.SATURDAY;
} else if (day.equals("sun")) {
    today = Day.SUNDAY;
} else {
    today = null;
}
```

<h2 id="4-scope">Scope <a href="#top">&#128205;</a></h2>

In Java, **scope** refers to the region of the program where a variable is _visible_ and _accessible_. The **scope** of a variable determines where in the program the variable can be used, and it is defined by the _code block_ in which the variable is declared.

```
int a = 0;
{
    int b = 10;
    System.out.println(b);
}
System.out.println(a);
System.out.println(b); // causes error because variable b is declared in an inner local scope
```

Let's look back to the for loop here:

```
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}

System.out.println(i); // causes error because variable i is declared in an inner local scope
```

:bulb: You could write the following code if you want to use the variable `i` after the for loop.

```
int i = 0;
for (i = 0; i < 10; i++) {
    System.out.println(i);
}

System.out.println(i); // 10
```

<h2 id="4-qa">Q & A <a href="#top">&#128205;</a></h2>

Q1: ?

A1: !
