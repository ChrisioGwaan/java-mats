1. `prac1.java`

Rewrite the code by using a single if statement.

2. `prac2.java`

Fermat’s Last Theorem says that there are no integers `a`, `b`, `c`, and `n` such that

$$a^{n} + b^{n} = c^{n}$$

, except when `n ≤ 2`.

Write a program that inputs four integers (a, b, c, and n) and checks to see if Fermat’s theorem holds. If n is greater than 2 and 

$$a^{n} + b^{n} = c^{n}$$

, the program should display `Holy smokes, Fermat was wrong!`. Otherwise, the program should display `No, that doesn’t work.`

3. `prac3.java`

Write a program that finds the roots of  

$$ax^{2} + bx + c = 0$$

using the quadratic formula:

$$x=\frac{-b \pm \sqrt{b^2-4ac}}{2a}$$

Prompt the user to input integers for `a`, `b`, and `c`. Compute the two solutions for `x`, and display the results.

Your program should be able to handle inputs for which there is only one or no solution. Specifically, it should not divide by zero or take the square root of a negative number.

Be sure to validate all inputs. The user should never see an input mismatch exception. Display specific error messages that include the invalid input.
