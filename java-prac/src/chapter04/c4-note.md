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
for (int i = 0; i < size; ++i) {
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

> break and continue



<h2 id="2-while">II. While Loop</h2>

<h2 id="3-fl">III. Enumerations</h2>

<h2 id="4-qa">IV. Enumerations</h2>