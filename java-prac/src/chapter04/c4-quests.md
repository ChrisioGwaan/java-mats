## `c4_p1.java`

Let’s say you are given a number, $a$, and you want to find its square root. One way to do that is to start with a rough guess about the answer, $x_{0}$ , and then improve the guess by using this formula:

$$x_{1} = \frac{(x_{0} + \frac{ a }{ x_{0} })}{2}$$

For example, if we want to find the square root of $9$, and we start with $x_{0} = 6$, then $x_{1} = \frac{(6 + \frac{9}{6})}{2} = 3.75$, which is closer. We can repeat the procedure, using $x_{1}$ to calculate $x_{2}$, and so on. In this case, $x_{2} = 3.075$ and $x_{3} = 3.00091$. So the repetition converges quickly on the correct answer.

Write a program that takes a `double` and prints an approximation of the square root of the parameter, using this technique. You should not use `Math.sqrt`.

As your initial guess, you should use $\frac{a}{2}$. Your method should iterate until it gets two consecutive estimates that differ by less than $0.0001$. You can use `Math.abs` to calculate the absolute value of the difference.

- [ ] Finish?

## `c4_p2.java`

One way to evaluate $exp(−x^{2})$ is to use the infinite series expansion:

$$exp(−x^{2}) = 1 - x^{2} + \frac{ x^{4} }{2} - \frac{ x^{6} }{6} + ...$$

The $i$th term in this series is $\frac{ (-1)^{i}x^{2i} }{i!}$. Write a program that takes $x$ and $n$ as inputs and prints the sum of the first $n$ terms of the series. You should not use `factorial` or `pow`.

- [ ] Finish?

## `c4_p3.java`

A word is said to be “abecedarian” if the letters in the word appear in alphabetical order. For example, the following are all six-letter English abecedarian words:

```
abdest, acknow, acorsy, adempt, adipsy, agnosy, befist, behint, beknow, bijoux, biopsy, cestuy, chintz, deflux, dehors, dehort, deinos, diluvy, dimpsy
```

Write a program that takes a String and prints a boolean indicating whether the word is abecedarian.

- [ ] Finish?