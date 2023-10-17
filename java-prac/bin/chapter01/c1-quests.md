**Read this file on GitHub**

## `c1_p1.java`

Follow all `TODOs` to complete the program.

- [ ] Finish?

## `c1_p2.java`

Make a program that takes three double values as $a$, $b$, $c$, and calculate the $x$ value using following formula:

$$x = \frac{ -b \pm \sqrt{ b^{2} - 4ac } }{2a} $$

* You have to make sure $b^{2} - 4ac \geq 0$ and $a \neq 0$

- [ ] Finish?

## `c1_p3.java` (Challenge)

Make a program that takes multiple pairs of values of $x$ and $y$ depending on the amount of $n$ and calculate the value of $β$ *(βήτα)*.

$$ \hat{\beta} = \frac{ \sum\nolimits_{i=1}^n (x_{i} - \bar{x} )(y_{i} - \bar{y} ) }{ \sum\nolimits_{i=1}^n (x_{i} - \bar{x} )^{2} }$$

* $\bar{x}$ and $\bar{y}$ are the average of the $x_{i}$ and $y_{i}$, respectively.
* $n$ is the total pair of data and it will be $(x_{i}, y_{i}), i=1, 2, 3, ..., n.$

- [ ] Finish?

## `c1_p4.java`

An airline describes airfare as follows. An economy ticket's base cost is $ \$190 $, business ticket costs $ \$300 $, and first class ticket costs $ \$800 $. Persons aged $60$ or over have a $25\\%$ off discount for all types of ticket. Children $2$ or under are ticket-free. A carry-on bag costs $ \$30 $. A first checked bag is free, second is $ \$25 $, and each additional is $ \$50 $. Given inputs of age, carry-on ($0$ or $1$), and checked bags ($0$ or greater), compute the total airfare.

- [ ] Finish?

## `c1_p5.java` (Challenge)

In linear regression, we have a set of data points $(x_{i}, y_{i})$ and we want to find a line that best fits the data. The line is defined by the equation $y = \hat{\beta} x + \hat{\alpha}$, where $\hat{\alpha}$ and $\hat{\beta}$ are the parameters we want to find.

For $\hat{\alpha}$ and $\hat{\beta}$, we can use the following formulas:

$$ \hat{\beta} = \frac{ \sum\nolimits_{i=1}^n (x_{i} - \bar{x} )(y_{i} - \bar{y} ) }{ \sum\nolimits_{i=1}^n (x_{i} - \bar{x} )^{2} }$$

$$ \hat{\alpha} = \bar{y} - \hat{\beta} \bar{x} $$

* You need to read the data from a file called `data1.txt`
* Line 1 to Line 100 are the $x_{i}$ values
* Line 101 to Line 200 are the $y_{i}$ values

- [ ] Finish?