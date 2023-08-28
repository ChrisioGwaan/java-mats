# Chapter 11 - Intermediate IV

:satisfied:

* I. [I/O Stream](#1-sAl)
* II. [Q & A](#2-qa)

<h2 id="1-sAl">I. I/O Stream</h2>

:bulb: Java is a path-sensitive language.

> Path - input & output

```
String filePath = System.getProperty("user.dir") + File.separator + "java-prac\\src\\chapter10_\\t1.txt";
```

`System.getProperty("user.dir")` refers to current root path, which looks something like `C:\Users\chris\repo_1\java-mats`.

![](../../lib/img/chap10_1.png)

`File.separator` ensures platform-independent file path construction.

`java-prac\\src\\chapter10_\\t1.txt` locates the input or output file.

In java String, using `\\` can preserve `\` symbol in a string. Otherwise, it will be considered as **Escape Sequences**.

> Input Stream - `FileReader`

* Reads the contents of the file as characters using the **default platform encoding**.
* Is designed for reading **text** files.
* **Less efficient** when reading **large** files.
  
> Input Stream - `FileInputStream`

* Reads the contents of the file as **raw bytes**.
* Is more **generic** and is used for reading **any kind of file**, whether it's text-based or binary.
* **Better performance** when reading binary files or handling **custom** character encoding scenarios.

```
FileInputStream in = new FileInputStream("input.txt");
```

> Output Stream - `FileOutputStream`

```
FileOutputStream out = new FileOutputStream("output.txt");
```

> Throwing `IOException`

`IOException` is one of the error handlings. Since we're using I/O operations in a program, some unexpected errors may occur during file operations (such as file does not exist).

```
import java.io.IOException;

class test1 {
    public static void main(String[] args) throws IOException {...}
}
```

> try & catch (TBD)

<h2 id="2-qa">II. Q & A</h2>

Q1: Waiting~

A1: Waiting for the Q1's Waiting~
