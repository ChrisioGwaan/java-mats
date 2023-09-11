1. `prac1.java`

Write a program that takes 10 integer values as input, then store those integers into an array. After that, write an algorithm to retreive a min and max value of the array, print them out in the end.

Constrains: 
* The size of the array is limited to 10 elements.
* `10` should not be a magic number.
  
- [ ] Finish?

2. `prac2.java`

Write a program that takes an integer, check whether the integer number is a **prime** number or not, and returns a message of `true` or `false`.

Reference: [κόσκινον Ἐρατοσθένους, kóskinon Eratosthénous](https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes)

- [ ] Finish?

3. `prac3.java`

**Step 1:**

Prompt the user for a title for data. Output the title.

Ex:

```
Enter a title for the data:
Number of Novels Authored
You entered: Number of Novels Authored
```

- [ ] Step **1** finish?

**Step 2:**

Prompt the user for the headers of two columns of a table. Output the column headers.

Ex:

```
Enter the column 1 header:
Author name
You entered: Author name

Enter the column 2 header:
Number of novels
You entered: Number of novels
```

- [ ] Step **2** finish?

**Step 3:**

Prompt the user for data points. Data points must be in this format: *string*, *int*. Store the information before the comma into a string variable and the information after the comma into an integer.

The user will enter `-1` when they have finished entering data points. Output the data points. Store the string components of the data points in an ArrayList of strings. Store the integer components of the data points in a second ArrayList of integers.

Ex:

Enter a data point (-1 to stop input):
Jane Austen, 6
Data string: Jane Austen
Data integer: 6

- [ ] Step **3** finish?

**Step 4:**

Perform error checking for the data point entries. If any of the following errors occurs, output the appropriate error message and prompt again for a valid data point.

* If entry has no comma

```
Error: No comma in string.
```

* If entry has more than one comma

```
Error: Too many commas in input.
```

* If entry after the comma is not an integer

```
Error: Comma not followed by an integer.
```

Ex:

```
Enter a data point (-1 to stop input):
Ernest Hemingway 9
Error: No comma in string.

Enter a data point (-1 to stop input):
Ernest, Hemingway, 9
Error: Too many commas in input.

Enter a data point (-1 to stop input):
Ernest Hemingway, nine
Error: Comma not followed by an integer.

Enter a data point (-1 to stop input):
Ernest Hemingway, 9
Data string: Ernest Hemingway
Data integer: 9
```

- [ ] Step **4** finish?

**Step 5:**

Output the information in a formatted table. The title is right justified with a minimum of 33 characters. Column 1 is left justified with a minimum of 20 characters. Column 2 is right justified with a minimum of 23 characters.

Ex:

```
        Number of Novels Authored
Author name         |       Number of novels
--------------------------------------------
Jane Austen         |                      6
Charles Dickens     |                     20
Ernest Hemingway    |                      9
Jack Kerouac        |                     22
F. Scott Fitzgerald |                      8
Mary Shelley        |                      7
Charlotte Bronte    |                      5
Mark Twain          |                     11
Agatha Christie     |                     73
Ian Flemming        |                     14
Stephen King        |                     54
Oscar Wilde         |                      1
```

- [ ] Step **5** finish?

**Step 6:**

Output the information as a formatted histogram. Each name is right justified with a minimum of 20 characters.

Ex:

```
         Jane Austen ******
     Charles Dickens ********************
    Ernest Hemingway *********
        Jack Kerouac **********************
 F. Scott Fitzgerald ********
        Mary Shelley *******
    Charlotte Bronte *****
          Mark Twain ***********
     Agatha Christie *************************************************************************
        Ian Flemming **************
        Stephen King ******************************************************
         Oscar Wilde *
```

- [ ] Step **6** finish?