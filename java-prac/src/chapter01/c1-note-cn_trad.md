<h1 id="#top">第一章</h1>

* [輸出](#1-Output)
  * [當然啦, hello world!](#1-a)
  * [快捷鍵](#1-b)
  * [轉換符](#1-c)
    * [十進制整數類型](#1-ca)
    * [浮點類型](#1-cb)
    * [字符串類型](#1-cc)
* [聲明與內存管理](#2-DMA)
  * [常用數據類型的字節大小](#2-a)
  * [Java 原始數據類型值的範圍限制](#2-b)
    * [short](#2-ba)
    * [int](#2-bb)
    * [long](#2-bc)
    * [float](#2-bd)
    * [double](#2-be)
    * [char](#2-bf)
    * [byte](#2-bg)
    * [void](#2-bh)
  * [科學記數法](#2-c)
  * [初始化說明](#2-d)
* [輸入](#3-Input)
  * [庫](#3-a)
  * [創建一個 Scanner 類](#3-b)
  * [方法](#3-c)
* [數學類](#4-Maths)
  * [庫](#4-a)
  * [常用的方法](#4-b)

<h2 id="1-Output">輸出 <a href="#top">&#128205;</a></h2>

<h3 id="1-a">當然啦, hello world! <a href="#top">&#128205;</a></h3>

1. 輸出一個指定的字符串並自帶末尾換行符。

```
int a = 0;
System.out.println("The value of a is " + a);
```

2. 輸出一個指定的字符串 (不自帶換行符`\n`在末尾)。

```
System.out.print();
```

3. 輸出一個帶有變量的指定字符串時，通常使用**格式化輸出** (不自帶換行符`\n`在末尾)。

```
String item_name = "Golden Apple";
int amount = 12;

System.out.printf("We got %d %s in the barrel!", amount, item_name);
```

4. 字符流輸出式 (不自帶換行符`\n`在末尾) | **Optional**

```
int a = 65;;

System.out.write(a); // A
```

5. **日誌(Logger)** 框架用於將日誌消息輸出至 **終端(terminal)** 或 **文件(file)** 。

```
import java.util.logging.Logger;

Logger logger = Logger.getLogger("MyLogger");
logger.info("[INFO] Welcome to my program!");
```

6. **錯誤輸出流**，用於報告錯誤及調試程式，並自帶末尾換行符 | **Optional**

```
System.err.println("404 NOT FOUND"); // 例子
```

<h3 id="1-b"><code>System.out.println()</code>在 VS Code 的快捷鍵 <a href="#top">&#128205;</a></h3>

* 鍵盤輸入 `sysout` 接著點 ***tab*** 鍵

<h3 id="1-c">轉換符 <a href="#top">&#128205;</a></h3>

| 轉換符   | 數據類型說明     |
|-------------|---------------|
| `%d`        | int，十進制整數           |
| `%s`        | String，字符串      |
| `%c`        | char，字符          |
| `%f`        | float 或 double 的浮點類型         |
| `%e`        | Scientific notation，科學記號 |
| `%o`        | Octal，八進制整數  |
| `%x`        | Hexadecimal，十六進制整數 |
| `%%`        | Percentage，百分比類型 |
| `%n`        | New line，換行符 |

<h4 id="1-ca">拓展使用 - <b>十進制整數類型</b> <a href="#top">&#128205;</a></h4>

```
int population = 8500000;
```

| 轉換符  |     輸出     | 說明                      |
|------------|----------------|------------------------------|
| `%,12d`    | `   8,500,000` | 字符串長度限制為12，由逗號分開，整數前如存在多餘的空位，由空格代替 |
| `%+,12d`   | `  +8,500,000` | 同上，並在整數前增加一個加號 |
| `%-+,12d`  | `+8,500,000  ` | 同上，但在整數后，如有多餘空位，有空格代替 |
| `%012d`    | `000008500000` | 整數前如存在多餘的空位，由數字`0`代替 |
| `%o`       | `40331440`     | 變為八進制形式 |
| `%x`       | `81b320`       | 變為十六進制形式 |

<h4 id="1-cb">拓展使用 - <b>浮點類型</b> <a href="#top">&#128205;</a></h4>

```
double pearls_sell = 15.2;
```

| 轉換符 |     輸出     | 說明                      |
|-----------|----------------|------------------------------|
| `%.4f`    | `15.2000`      | 保留 4 位小數點             |

<h4 id="1-cc">拓展使用 - <b>字符串類型</b> <a href="#top">&#128205;</a></h4>

```
String name = "dango"
```

| 轉換符 |     輸出     | 說明                      |
|-----------|----------------|------------------------------|
| `%7s`     | ` dango` | 字符串長度限制為7，如字符串變量 **前** 存在多餘的空位，由空格代替 |
| `%-7s`    | `dango ` | 字符串長度限制為7，如字符串變量 **後** 存在多餘的空位，由空格代替  |
| `%-7S`    | `DANGO ` | 同上，並 `S` 將字符串所有字符變為大階 |

> ***良好代碼習慣***

**在程式結束之前最好保留一個換行符**

<h2 id="2-DMA">聲明與內存管理 <a href="#top">&#128205;</a></h2>

<h3 id="2-a">常用數據類型的字節大小 <a href="#top">&#128205;</a></h3>

| 數據類型 | 字節(Bytes) |
|-----------|---------------|
| char      | 1             |
| short     | 2             |
| int       | 4             |
| long      | 8             |
| float     | 4             |
| double    | 8             |
| bool      | 1             |

* **字符串是由一個或多個字符組成的。**

<h3 id="2-b">Java 原始數據類型值的範圍限制 <a href="#top">&#128205;</a></h3>

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

<h3 id="2-c">科學記數法 <a href="#top">&#128205;</a></h3>

例如，`1.5e+3` 准確值為 `1500`，即

$$1.5 * 10^{3}$$

而 `1.5e-3` 准確值為 `0.0015`，即

$$1.5 * 10^{-3}$$

<h3 id="2-d">初始化說明 <a href="#top">&#128205;</a></h3>

```
int min; // 整數值已聲明，但並沒有初始化
int max = 0; // 整數值初始化為數值0
```

`min` 整數值已聲明但並沒有初始化，即該變量值為 **未定義**。也就是說，`min`的實際值可以是恰好存儲在該內存位置中的任意值

在大多數操作系統，一個整數值通常佔據`4`個字節。

> ***良好代碼習慣***

**通常不建議去創建一個沒有初始化的變量**

<h2 id="3-Input">輸入 <a href="#top">&#128205;</a></h2>

<h3 id="3-a">Java 庫 <a href="#top">&#128205;</a></h3>

```
import java.util.Scanner;
```

<h3 id="3-b">創建一個 Scanner 類 <a href="#top">&#128205;</a></h3>

```
Scanner scnr = new Scanner(System.in);
```

`scnr` 是一個 `Scanner` 類的 **實體**。

<h3 id="3-c">方法 <a href="#top">&#128205;</a></h3>

* `scnr.nextInt()`，整數值輸入
* `scnr.nextDouble()`，浮點值輸入
* `scnr.next()`，同一行的字符串輸入
* `scnr.nextLine()`，整行字符串輸入
* `scnr.next().charAt(0)`，單個字符輸入

> ***良好代碼習慣***

```
scnr.close();
```

**實體使用完之後，建議立即釋放實體，即系統資源釋放，以確保有效的資源利用並防止任何潛在的問題。**

<h2 id="4-Maths">數學類 <a href="#top">&#128205;</a></h2>

<h3 id="4-a">庫 <a href="#top">&#128205;</a></h3>

```
import java.lang.Math;
```

<h3 id="4-b">常用的方法 <a href="#top">&#128205;</a></h3>

* `Math.log()`，對數函數
* `Math.exp()`，指數函數
* `Math.sqrt()`，平方根
* `Math.sin()`
* `Math.cos()`
* `Math.tan()`
* `Math.pow()`，冪
* `Math.abs()`，絕對值
* `Math.PI`，π 的值
* `Math.E`，e 的值
* `Math.floor()`，取最底數
* `Math.ceil()`, 取最頂數