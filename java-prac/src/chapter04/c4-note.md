# Chapter 4 - Basic IV

* I. [For Loop](#1-for)
* II. [While Loop](#2-while)
* III. [Enumerations](#3-enum)
* IV. [Scope](#4-scope)
* V. [Q & A](#4-qa)


<h2 id="1-for">I. For Loop</h2>

> Syntax (In Good Practice)

:bookmark_tabs: Check out the following code snippet

```
for (int i = 0; i < size; i++) {
    doSomething();
}
```

* `int i = 0`: Declare a variable i for iterations.
* `i < size`: Condition, to limit the value of i cannot exceed the value of size.
* `++i`: Increase the value of i for iterations.

> `i++` and `++i`

They're increment operators used to increase the value of a variable by 1.

* `i++` is **Post-increment**

```
int i = 5;
int result = i++;  // The value of 'i' (5) is used in the expression, then 'i' is incremented to 6.
// 'result' is 5, and 'i' is 6 after this line.
```

* `++i` is **Pre-increment**

```
int i = 5;
int result = ++i;  // 'i' is incremented to 6 first, then the value of 'i' (6) is used in the expression.
// 'result' is 6, and 'i' is 6 after this line.
```

* Additional ways to increase a value by 1, 2, 3, or any other digital numbers

```
int i = 5;
i = i + 1;
```

```
int i = 5;
i += 1;
```

> `break`

:bookmark_tabs: Check out the following code snippet

```
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // Terminate the loop when i becomes 5
    }
    System.out.print(i + " ");
}
```

The output will be `1 2 3 4 `. Because when `i = 5`, the iteration ends and the loop is terminated.

> `continue`

:bookmark_tabs: Check out the following code snippet

```
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // Skip the current iteration when i is 3
    }
    System.out.print(i + " ");
}
```

The output will be `1 2 4 5 `. Because when `i = 3`, the `System.out.print(i + " ")` will not be executed and the iteration continues.

> String Iteration

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

> Nested Loop

:bookmark_tabs: Check out the following code snippet

```
for (int i = 0; i < 10; i++) {
    System.out.println("DIAMOND LEVEL: " + i);

    for (int j = 0; j < 10; j++) {
        System.out.print("XRAY ");
    }
 
    System.out.println("");
}
```

The following link might be useful to show the process of the code snippet above.

:link: [**Better Visualization**](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+ClassNameHere+%7B%0A+++public+static+void+main(String%5B%5D+args)+%7B%0A++++++for+(int+i+%3D+0%3B+i+%3C+10%3B+i%2B%2B)+%7B%0A++++++++++++System.out.println(%22DIAMOND+LEVEL%3A+%22+%2B+i)%3B%0A++++++++%0A++++++++++++for+(int+j+%3D+0%3B+j+%3C+10%3B+j%2B%2B)+%7B%0A++++++++++++++++System.out.print(%22XRAY+%22)%3B%0A++++++++++++%7D%0A++++++++%0A++++++++++++System.out.println(%22%22)%3B%0A+++++++%7D%0A+++%7D%0A%7D&mode=display&curInstr=0)

:bulb: Meanwhile, keep in mind to count how many times the program has been running.  In total, it runs 100 times, right? For `i < 10`, the outer `for` loop has 10 iterations, so does `j` of the inner `for` loop. Thus, it follows a formula of `i` * `y` for the nested loop.

> Enhanced for loop

:bookmark_tabs: Check out the following code snippet

```
String quote = "Lime and Pink is the BEST combo, ALWAYS!";

for (char letter : quote.toCharArray()) {
  System.out.println(letter);
}
```

`toCharArray()`: Converts it into a character array.

:bulb: **The enhanced for loop iterates over each character in the array and prints it to the console.**

<h2 id="2-while">II. While Loop</h2>

> Syntax (In Good Practice)

:bookmark_tabs: Check out the following code snippet

```
while (condition) {
    doSomething();
}
```

`break` and `continue` still work in `while` loop.

> Common multiple inputs question

Write a program that takes multiple integer numbers and stops the input by any negative digital number.

Return a sum of the numbers from user input.

* Input: `1 11 23 13 6 12 7 9 -1`
* Output: `82`

:bookmark_tabs: Check out the following code snippet

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

<h2 id="3-enum">III. Enumerations</h2>

> Cant find any key knowledge points here, if you do have quests, tell me :star2: :smile: :pray: 

<h2 id="4-scope">IV. Scope</h2>

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

<h2 id="4-qa">IV. Q & A</h2>

Q1: TBA

A1: TBA
