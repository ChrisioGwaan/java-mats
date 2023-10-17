<h1 id="#top">第一章</h1>

* [输出](#1-Output)
  * [hello world!](#1-a)
  * [快捷键](#1-b)
  * [转换符](#1-c)
    * [十进制数据类型](#1-ca)
    * [浮点类型](#1-cb)
    * [字符串类型](#1-cc)
* [声明与内存管理](#2-DMA)
  * [常用数据类型的字节大小](#2-a)
  * [Java 原始数据类型值的范围限制](#2-b)
    * [short](#2-ba)
    * [int](#2-bb)
    * [long](#2-bc)
    * [float](#2-bd)
    * [double](#2-be)
    * [char](#2-bf)
    * [byte](#2-bg)
    * [void](#2-bh)
  * [科学记数法](#2-c)
  * [初始化说明](#2-d)
* [输入](#3-Input)
  * [库](#3-a)
  * [创建一个 Scanner 类](#3-b)
  * [方法](#3-c)
* [数学类](#4-Maths)
  * [库](#4-a)
  * [常用的方法](#4-b)

<h2 id="1-Output">输出 <a href="#top">&#128205;</a></h2>

<h3 id="1-a">hello world! <a href="#top">&#128205;</a></h3>

1. 输出一个指定的字符串，并且在末端保留一个换行符。

```
int a = 0;
System.out.println("The value of a is " + a);
```

2. 输出一个指定的字符串，但没有在末端保留一个換行符`\n`。

```
System.out.print();
```

3. 输出一个带有变量的指定字符串时，通常使用 **格式化输出式**，但没有在末端保留一个換行符`\n`。

```
String item_name = "Golden Apple";
int amount = 12;

System.out.printf("We got %d %s in the barrel!", amount, item_name);
```

4. 字符流输出式，但没有在末端保留一个換行符`\n`。

```
int a = 65;;

System.out.write(a); // A
```

5. **日志(Logger)**类，适用于日志信息輸出至 **终端(terminal)** 或 **文件(file)**，例如在Spring Boot使用。

```
import java.util.logging.Logger;

Logger logger = Logger.getLogger("MyLogger");
logger.info("[INFO] Welcome to my program!");
```

6. **错误输出流**，用于错误报告及调试程序，并且在末端保留一个换行符。

```
System.err.println("404 NOT FOUND"); // 例子
```

<h3 id="1-b"><code>System.out.println()</code>在 VS Code 的快捷键 <a href="#top">&#128205;</a></h3>

* 键盘输入 `sysout` 接着点 ***tab*** 键

<h3 id="1-c">转换符 <a href="#top">&#128205;</a></h3>

| 转换符   | 数据类型说明     |
|-------------|---------------|
| `%d`        | int，十进制整数           |
| `%s`        | String，字符串      |
| `%c`        | char，字符          |
| `%f`        | float 或 double 的浮点类型         |
| `%e`        | Scientific notation，科学记数法 |
| `%o`        | Octal，八进制整数  |
| `%x`        | Hexadecimal，十六进制整数 |
| `%%`        | Percentage，百分比类型 |
| `%n`        | New line，换行符 |

<h4 id="1-ca">拓展使用 - <b>十进制整数类型</b> <a href="#top">&#128205;</a></h4>

```
int population = 8500000;
```

| 转换符  |     输出     | 说明                      |
|------------|----------------|------------------------------|
| `%,12d`    | `   8,500,000` | 字符串的长度为12，由逗号分隔开，整数前如存在多余的空位，由空格替代 |
| `%+,12d`   | `  +8,500,000` | 同上，并且在整数前增加一个加号符 |
| `%-+,12d`  | `+8,500,000  ` | 同上，但是，在整数后，如有多余的空位，有空格替代 |
| `%012d`    | `000008500000` | 整数前如存在多余的空位，由数字`0`替代 |
| `%o`       | `40331440`     | 变为八进制形式 |
| `%x`       | `81b320`       | 变为十六进制形式 |

<h4 id="1-cb">拓展使用 - <b>浮点类型</b> <a href="#top">&#128205;</a></h4>

```
double pearls_sell = 15.2;
```

| 转换符 |     输出     | 说明                      |
|-----------|----------------|------------------------------|
| `%.4f`    | `15.2000`      | 保留 4 位小数点             |

<h4 id="1-cc">拓展使用 - <b>字符串类型</b> <a href="#top">&#128205;</a></h4>

```
String name = "dango"
```

| 转换符 |     输出     | 说明                      |
|-----------|----------------|------------------------------|
| `%7s`     | ` dango` | 字符串的长度为7，如果字符串变量 **前** 存在多余的空位，由空格替代 |
| `%-7s`    | `dango ` | 字符串的长度为7，如果字符串变量 **后** 存在多余的空位，由空格替代  |
| `%-7S`    | `DANGO ` | 同上，并 `S` 将字符串所有字符变为大写字母 |

> ***良好的代码习惯***

**在程序结束之前最好保留一个换行符**

<h2 id="2-DMA">声明与內存管理 <a href="#top">&#128205;</a></h2>

<h3 id="2-a">常用的数据类型字节大小 <a href="#top">&#128205;</a></h3>

| 数据类型 | 字节(Bytes) |
|-----------|---------------|
| char      | 1             |
| short     | 2             |
| int       | 4             |
| long      | 8             |
| float     | 4             |
| double    | 8             |
| bool      | 1             |

* **字符串是由一个或多个字符组成的。**

<h3 id="2-b">Java 原始数据类型值的范围限制 <a href="#top">&#128205;</a></h3>

<h4 id="2-ba">short <a href="#top">&#128205;</a></h4>

* Signed $16$ bits
* $-32768$ to $32767$

<h4 id="2-bb">int <a href="#top">&#128205;</a></h4>

* Signed $32$ bits
* $-2147483648$ ~ $2147483647$

<h4 id="2-bc">long <a href="#top">&#128205;</a></h4>

* Signed $64$ bits
* $-9223372036854775808$ ~ $9223372036854775807$

<h4 id="2-bd">float <a href="#top">&#128205;</a></h4>

* $32$ bits
* $1.40239846\mathrm{e}{-45}f$ ~ $3.40282347\mathrm{e}{+38}f$

<h4 id="2-be">double <a href="#top">&#128205;</a></h4>

* $64$ bits
* $4.94065645841246544\mathrm{e}{-324}$ ~ $1.79769313486231570\mathrm{e}{+308}$

<h4 id="2-bf">char <a href="#top">&#128205;</a></h4>

* Unsigned $16$ bits
* $0('\backslash u 0000')$ ~ $65535 ('\backslash uffff')$

<h4 id="2-bg">byte <a href="#top">&#128205;</a></h4>

* Signed $8$ bits
* $-128$ ~ $127$

<h4 id="2-bh">void <a href="#top">&#128205;</a></h4>

* n/a
* n/a

<h3 id="2-c">科学记数法 <a href="#top">&#128205;</a></h3>

例如，`1.5e+3` 准确值为 `1500`，即

$$1.5 * 10^{3}$$

而 `1.5e-3` 准确值为 `0.0015`，即

$$1.5 * 10^{-3}$$

<h3 id="2-d">初始化说明 <a href="#top">&#128205;</a></h3>

```
int min; // 整数值已声明，但是并沒有初始化
int max = 0; // 整数值初始化为数值0
```

`min` 整数值已声明但并沒有初始化，即该变量值为 **未定义**。也就是说，`min`的实际值可以是恰好储存在该內存位置中的任意值

在大多数操作系统，一个整数值通常占据`4`个字节。

> ***良好的代码习惯***

**通常不建议去创建一个沒有初始化的变量**

<h2 id="3-Input">输入 <a href="#top">&#128205;</a></h2>

<h3 id="3-a">Java 库 <a href="#top">&#128205;</a></h3>

```
import java.util.Scanner;
```

<h3 id="3-b">创建一个 Scanner 类 <a href="#top">&#128205;</a></h3>

```
Scanner scnr = new Scanner(System.in);
```

`scnr` 是一个 `Scanner` 类的 **实体**。

<h3 id="3-c">方法 <a href="#top">&#128205;</a></h3>

* `scnr.nextInt()`，整数值输入
* `scnr.nextDouble()`，浮点值输入
* `scnr.next()`，同一行的字符串输入
* `scnr.nextLine()`，整行字符串输入
* `scnr.next().charAt(0)`，单个字符输入

> ***良好的代码习惯***

```
scnr.close();
```

**实体使用完之後，建议立即释放实体，即系统资源释放，以确保有效的资源利用並防止任何潜在的问题。**

<h2 id="4-Maths">数学类 <a href="#top">&#128205;</a></h2>

<h3 id="4-a">库 <a href="#top">&#128205;</a></h3>

```
import java.lang.Math;
```

<h3 id="4-b">常用的方法 <a href="#top">&#128205;</a></h3>

* `Math.log()`，对数函数
* `Math.exp()`，指数函数
* `Math.sqrt()`，平方根
* `Math.sin()`
* `Math.cos()`
* `Math.tan()`
* `Math.pow()`，冪
* `Math.abs()`，绝对值
* `Math.PI`，π 的值
* `Math.E`，e 的值
* `Math.floor()`，取最底数
* `Math.ceil()`, 取最顶数