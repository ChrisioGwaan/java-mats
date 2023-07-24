# Chapter 4 - Basic IV

:ramen:

* I. [For Loop](#1-for)
* II. [While Loop](#2-while)
* III. [Enumerations](#3-elif)
* IV. [Q & A](#4-qa)


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

However, from experience, you could use any of them in a for loop.

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

Print characters of a String one by one:

```
String dessert = "Neapolitan Ice Cream";

for (int i = 0; i < dessert.length(); i++) {
    char letter = dessert.charAt(i);
    System.out.println(letter);
}
```

Print a String in the reverse direction:

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
ln1: for (int i = 0; i < 10; i++) {
ln2:     System.out.println("DIAMOND LEVEL: " + i);
ln3: 
ln4:     for (int j = 0; j < 10; j++) {
ln5:         System.out.print("XRAY ");
ln6:     }
ln7: 
ln8:     System.out.println("");
ln9: }
```

1. 

`i = 0` :arrow_right: `i < 10`? Yes, go on :arrow_right: ln2 :arrow_right: ln3 :arrow_right: ln4 :arrow_right:
* `j = 0` :arrow_right: `j < 10`? Yes, go on :arrow_right: ln5 :arrow_right: `j++` means `j = 1`
* `j = 1` :arrow_right: `j < 10`? Yes, go on :arrow_right: ln5 :arrow_right: `j++` means `j = 2`
* `j = 2` :arrow_right: `j < 10`? Yes, go on :arrow_right: ln5 :arrow_right: `j++` means `j = 3`
* `j = 3` :arrow_right: `j < 10`? Yes, go on :arrow_right: ln5 :arrow_right: `j++` means `j = 4`
* ......
* `j = 8` :arrow_right: `j < 10`? Yes, go on :arrow_right: ln5 :arrow_right: `j++` means `j = 9`
* `j = 9` :arrow_right: `j < 10`? Yes, go on :arrow_right: ln5 :arrow_right: `j++` means `j = 10`
* `j = 10` :arrow_right: `j < 10`? No :arrow_right: ln6 :arrow_right:

ln7 :arrow_right: ln8 :arrow_right: `i++` means `i = 1` :arrow_right:

2. 

`i = 1` :arrow_right: `i < 10`? Yes, go on :arrow_right: ln2 :arrow_right: ln3 :arrow_right: ln4 :arrow_right:
* `j = 0` :arrow_right: `j < 10`? Yes, go on :arrow_right: ln5 :arrow_right: `j++` means `j = 1`
* `j = 1` :arrow_right: `j < 10`? Yes, go on :arrow_right: ln5 :arrow_right: `j++` means `j = 2`
* `j = 2` :arrow_right: `j < 10`? Yes, go on :arrow_right: ln5 :arrow_right: `j++` means `j = 3`
* `j = 3` :arrow_right: `j < 10`? Yes, go on :arrow_right: ln5 :arrow_right: `j++` means `j = 4`
* ......
* `j = 8` :arrow_right: `j < 10`? Yes, go on :arrow_right: ln5 :arrow_right: `j++` means `j = 9`
* `j = 9` :arrow_right: `j < 10`? Yes, go on :arrow_right: ln5 :arrow_right: `j++` means `j = 10`
* `j = 10` :arrow_right: `j < 10`? No :arrow_right: ln6 :arrow_right:

ln7 :arrow_right: ln8 :arrow_right: `i++` means `i = 2` :arrow_right:

3. 

and so on....

:link: [**Better Visualization**](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+ClassNameHere+%7B%0A+++public+static+void+main(String%5B%5D+args)+%7B%0A++++++for+(int+i+%3D+0%3B+i+%3C+10%3B+i%2B%2B)+%7B%0A++++++++++++System.out.println(%22DIAMOND+LEVEL%3A+%22+%2B+i)%3B%0A++++++++%0A++++++++++++for+(int+j+%3D+0%3B+j+%3C+10%3B+j%2B%2B)+%7B%0A++++++++++++++++System.out.print(%22XRAY+%22)%3B%0A++++++++++++%7D%0A++++++++%0A++++++++++++System.out.println(%22%22)%3B%0A+++++++%7D%0A+++%7D%0A%7D&mode=display&curInstr=0)

> Enhanced for loop


<h2 id="2-while">II. While Loop</h2>

<h2 id="3-fl">III. Enumerations</h2>

<h2 id="4-qa">IV. Enumerations</h2>