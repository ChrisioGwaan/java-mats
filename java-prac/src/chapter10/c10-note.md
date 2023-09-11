# Chapter 10

:satisfied:

* [I/O Stream](#1-sAl)
  * [Path - input & output](#1-a)
  * [FileReader](#1-b)
  * [FileInputStream](#1-c)
  * [FileOutputStream](#1-d)
  * [IOException](#1-e)
* [try & catch (TBD)](#2-main)
* [Q & A](#3-qa)

<h2 id="1-sAl">I/O Stream <a href="#top">&#128205;</a></h2>

:bulb: Java is a path-sensitive language.

<h3 id="1-a">Path - input & output <a href="#top">&#128205;</a></h3>

```
String filePath = System.getProperty("user.dir") + File.separator + "java-prac\\src\\chapter10_\\t1.txt";
```

`System.getProperty("user.dir")` refers to current root path, which looks something like `C:\Users\chris\repo_1\java-mats`.

![](../../lib/img/chap10_1.png)

`File.separator` ensures platform-independent file path construction.

`java-prac\\src\\chapter10_\\t1.txt` locates the input or output file.

In java String, using `\\` can preserve `\` symbol in a string. Otherwise, it will be considered as **Escape Sequences**.

<h3 id="1-b">Input Stream - <b>FileReader</b> <a href="#top">&#128205;</a></h3>

* Reads the contents of the file as characters using the **default platform encoding**.
* Is designed for reading **text** files.
* **Less efficient** when reading **large** files.

<h3 id="1-c">Input Stream - <b>FileInputStream</b> <a href="#top">&#128205;</a></h3>

* Reads the contents of the file as **raw bytes**.
* Is more **generic** and is used for reading **any kind of file**, whether it's text-based or binary.
* **Better performance** when reading binary files or handling **custom** character encoding scenarios.

```
FileInputStream in = new FileInputStream("input.txt");
```

<h3 id="1-d">Output Stream - <b>FileOutputStream</b> <a href="#top">&#128205;</a></h3>

```
FileOutputStream out = new FileOutputStream("output.txt");
```

<h3 id="1-e">Throwing <b>IOException</b> <a href="#top">&#128205;</a></h3>

`IOException` is one of the error handlings. Since we're using I/O operations in a program, some unexpected errors may occur during file operations (such as file does not exist).

```
import java.io.IOException;

class test1 {
    public static void main(String[] args) throws IOException {...}
}
```

<h2 id="2-main">try & catch (TBD) <a href="#top">&#128205;</a></h2>

<h2 id="3-qa">Q & A <a href="#top">&#128205;</a></h2>

Q1: Waiting~

A1: Waiting for the Q1's Waiting~
