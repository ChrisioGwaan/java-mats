<h1 id="#top">Chapter 5</h1>

:ice_cream:

* [Array](#1-array)
  * [Creation](#1-a)
    * [Without Initialisation](#1-aa)
    * [0 Size of an Array](#1-ab)
    * [Initialisation](#1-ac)
  * [Access](#1-b)
    * [Index](#1-ba)
    * [Assignment](#1-bb)
    * [Selection](#1-bc)
    * [Elements Update](#1-bd)
    * [Length](#1-be)
    * [Iteration](#1-bf)
    * [Display](#1-bg)
    * [Copy](#1-bh)
    * [Enhanced Iteration](#1-bi)
* [Random Numbers](#2-random)
  * [(Non) Determinism](#2-a)
    * [Determinism](#2-aa)
    * [Nondeterminism](#2-ab)
  * [Library](#2-b)
  * [Method](#2-c)
* [Q & A](#3-qa)

<h2 id="1-array">Array <a href="#top">&#128205;</a></h2>

* **Array** is a sequence of values.
* In Java, all the values in an array **must** have the same type.
* The length of an array is established when the array is created. After creation, the length is **fixed**.
* All the values in an array are called **elements**.

<h3 id="1-a">Arrays Creation <a href="#top">&#128205;</a></h3>

<h4 id="1-aa">Without Initialisation <a href="#top">&#128205;</a></h4>

The following code declares 4 arrays only, but not create them yet.

```
int[] a;
doulbe[] b;
char[] c;
boolean[] d;
// etc...
```

In order to create an array, we need to use the `new` operator. The `new` operator allocates memory for the array, and automatically initializes all its elements to zero.

```
a = new int[10];
b = new double[100];
c = new char[1000];
d = new boolean[10000];
// etc..
```

Fo sho, you can also declare and create an array in one line.

```
int[] a = new int[10];
double[] b = new double[100];
char[] c = new char[1000];
boolean[] d = new boolean[10000];
// etc...
```

For the size of an array, you can use an **integer** variable or an **integer** expression, and make sure the value is **non-negative**. Otherwise, you will get a `NegativeArraySizeException`. In general, `array.length` $\geq 0$.

<h4 id="1-ab">0 Size of an Array <a href="#top">&#128205;</a></h4>

```
int[] emptyArray = new int[0];
```

Java allocates memory for the array because of the `new` operator, but it doesn't allocate memory for the elements. So it's not a good idea to access the elements of an empty array. If you do, you will get a `ArrayIndexOutOfBoundsException` because the index range for this array will be from $0$ to $-1$.

<h4 id="1-ac">Initialisation <a href="#top">&#128205;</a></h4>

You can also initialise an array with a comma-separated sequence of elements enclosed in braces.

```
int[] a = {1, 99};
double[] b = {1.0, 99.4, 32.3};
char[] c = {'h', 'e', 'l', 'l', 'o'};
boolean[] d = {true, false, true, false};
// etc...
```

<h3 id="1-b">Array Access <a href="#top">&#128205;</a></h3>

Suppose we have an array as follows.

```
int[] a = mew int[5];
```

<h4 id="1-ba">Index <a href="#top">&#128205;</a></h4>

The elements in an array are numbered from $0$ to $n-1$, where $n$ is the length of the array. The first element is at index $0$ (aka **zeroth**), and the last element is at index $n-1$.

<h4 id="1-bb">Assignment <a href="#top">&#128205;</a></h4>

```
a[0] = 1;
a[1] = 2;
a[2] = 3;
a[3] = 4;
a[4] = 5;
```

<h4 id="1-bc">Selection <a href="#top">&#128205;</a></h4>

```
System.out.println(a[0]); // 1
```

<h4 id="1-bd">Elements Update <a href="#top">&#128205;</a></h4>

```
a[0] = 99; // 1 -> 99
a[1] = a[0] + 1; // 2 -> 100
a[2]++; // 3 -> 4
a[3] += 2; // 4 -> 6
a[4] -= 3; // 5 -> 2
```

<h4 id="1-be">Array Length <a href="#top">&#128205;</a></h4>

```
System.out.println(a.length); // 5
```

<h4 id="1-bf">Array Iteration <a href="#top">&#128205;</a></h4>

```
for (int i = 0; i < a.length; i++) {
    System.out.println(a[i]);
}
```

<h4 id="1-bg">Array Display <a href="#top">&#128205;</a></h4>

Sometimes, we may want to display an array, but you would get something unexpected. Directly print an array will get the following result, which is the memory **address** of the array. 

`[` means array, `I` means integer, `@` means at, and `15db9742` is the memory address of the array.

```
System.out.println(a); // [I@15db9742
```

Of course you can print the elements using loops as [Array Iteration](#1-bf) above.

Additionally, you can use the `Arrays` class to display an array. In Java library, `java.util.Arrays` provides a method called `toString` to display an array.

```
System.out.println(Arrays.toString(a)); // [99, 100, 4, 6, 2]
```

<h4 id="1-bh">Array Copy <a href="#top">&#128205;</a></h4>

Array variables contain **references** to arrays. When you assign an array variable to another, you are copying the reference. So the two variables refer to the same array. If you modify one, the other changes as well.

Suppose we have another array `b` that copies array `a` as follows.

```
int[] b = a; // Use the same memory address as `a`
// Which means if you make changes on `b`, `a` will change as well.
```

If you want to copy an array not just the **reference**, you can do as follows.

```
int[] b = new int[a.length];
for (int i = 0; i < a.length; i++) {
    b[i] = a[i];
}
```

You can also use `java.util.Arrays` to copy an array. It provides a method called `copyOf`.

```
int[] b = Arrays.copyOf(a, a.length);
```

<h4 id="1-bi">Array Enhanced Iteration <a href="#top">&#128205;</a></h4>

```
// Create a variable `val` to store the value of each element in the array.
// Data type should be also the same as the array.
for (int val : a) {
    System.out.println(a);
}
```

<h2 id="2-random">Random Numbers <a href="#top">&#128205;</a></h2>

<h3 id="2-a">(Non) Determinism <a href="#top">&#128205;</a></h3>

<h4 id="2-aa">Determinism <a href="#top">&#128205;</a></h4>

:bulb: **Determinism**: An algorithm or automation follows a single, well-defined sequence of steps for a given input. For those algorithms, they are predictable and produce the same input following the same path of execution.

<h4 id="2-ab">Nondeterminism <a href="#top">&#128205;</a></h4>

:bulb: **Nondeterminism**: An algorithm or automation has multiple possible paths it can follow for a given input and starting state. 

Making a program **nondeterministic** turns out to be hard, that's because it's impossible for a computer to generate truly random numbers (Similar to human's brain, we can come up with a random number out of nowhere. But for computer, a random number can only be generated by a specific algorithm). But there are algorithms that generate unpredictable sequences called pseudorandom numbers. For most applications, they are as good as random.

Click [**HERE**](https://www.youtube.com/watch?v=Aut32pR5PQA) for a video example of Deep Learning Cars

<h3 id="2-b">Library <a href="#top">&#128205;</a></h3>

```
import java.util.Random;
```

<h3 id="2-c">Method <a href="#top">&#128205;</a></h3>

```
Random random = new Random();

int a = 0;
double b = 1;

a = random.nextInt(100);
// Common: nextDouble(), nextFloat(), nextLong()
```

`nextInt` takes an integer argument, `100`, and returns a random integer between `0` and `100-1` (**inclusive**). For the other types, they follow the same rule.

<h2 id="3-qa">Q & A <a href="#top">&#128205;</a></h2>

Q1: Waiting~

A1: Waiting for the Q1's Waiting~