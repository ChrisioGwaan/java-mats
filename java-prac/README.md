# Tips

* [Dev Environment Setup for Java](#a1)
* [Useful Tools in VS Code](#b1)
  * [Markdown File Preview](#b1b)
* [Java Coding Style](#c1)
  * [Space Indentation](#c1c)

<h2 id="a1">Dev Environment Setup for Java</h2>

* [JAVA RUNTIME](https://www.java.com/en/)
* [JAVA JDK 1.8](https://www.oracle.com/au/java/technologies/javase/javase8-archive-downloads.html)
* [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
* [Language Support for Java](https://marketplace.visualstudio.com/items?itemName=redhat.java)
* [Java Language Support](https://marketplace.visualstudio.com/items?itemName=georgewfraser.vscode-javac)

<h2 id="b1">Useful Tools in VS Code</h2>

<h3 id="b1b">Markdown File Preview</h3>

VS Code provides markdown preview features. However, some features, such as Emojis, Maths LaTex etc, may not be shown in vs code preview. It's suggested that reading markdown on GitHub Website is way better.

![](lib/img/Screenshot%202023-08-03%20083420.png)

<h2 id="c1">Java Coding Style</h2>

<h3 id="c1c">Space Indentation</h3>

* **Indentation**, a blank space between a margin and the beginning of a line of text.

* **Scope**, refers to the field of a program where a particular variable or identifier is accessible or valid.

For the below example, you can assume `|` as a margin.

```
1  |package folder1;
2  |
3  |import java.util.Scanner;
4  |
5  |class program {
                  ^
                  |
                Wherever you see this blanket, its inside scope needs 4 another spaces indentation.

    4 spaces indentation
    ||||
    VVVV
6  |    public static void main(String[] args) {
        
        4 spaces indentation
        ||||
        VVVV
7  |        Scanner scnr = new Scanner(System.in);
8  |        int a = 0;
9  |
10 |        if (...) {

            4 spaces indentation
            ||||
            VVVV
11 |            if (...) {

                4 spaces indentation
                ||||
                VVVV
12 |                doSomething();
13 |            }
14 |            doSomething(); // sharing same space indentation with line 11, right
                ^
                |
                which means line 14 code is inside of line 10 "if" statement, after line 11 and line 13 have been executed, the line 10 "if" statement has not yet finished because of line 12.

15 |        } else {
16 |            doSomething();
17 |        }
18 |    }
19 |}
```

#2 example:

```
if (condition) {
    // Code block
    for (int i = 0; i < 10; i++) {
        // Nested code block
    }
} else {
    // Alternative code block
}
```

#3 example:

```
public class MyClass {
    public void myMethod() {
        // Method code
    }
}
```

#4 example:

```
for (int i = 0; i < 10; i++) {
    // Outer loop
    for (int j = 0; j < 5; j++) {
        // Inner loop
    }
}
```

#5 example:

```
public void myMethod() {
    if (condition) {
        // Code block
    } else {
        // Code block
    }
}
```