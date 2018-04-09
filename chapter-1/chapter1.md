# Scala: The Scalable Language

<p align="center">
<img src="https://www.scala-lang.org/resources/img/frontpage/scala-spiral.png">
</p>

**Scala** is a blend of ***Object-Oriented*** and ***Functional Programming*** concepts in a statically typed language.

---

#### 1.1 A LANGUAGE THAT GROWS ON YOU
Using Scala language gives a feel of using an modern scripting based language.
```scala
var capital = Map("US" -> "Washington", "France" -> "Paris")
capital += ("Japan" -> "Tokyo")
println(capital("France"))
```
Scala gives you this fine-grained control if you need it, because maps in Scala are not language syntax. They are library abstractions that you can extend and adapt.
```scala
(Convinient, Flexible, Concise Style Programming) == Scala
```
##### Growing new types:
Scala is designed by extending and adapting different programming patterns into it.
Example:
```scala
def factorial(x: BigInt): BigInt = if (x == 0) 1 else x * factorial(x - 1)
//factorial(30) => 265252859812191058636308480000000
```
Here in this case Scala wraps the Java BigInt Class with ton of utility functions useful for a programmer.

The above example could also be written in Scala using **java.math.BigInt**
```scala
import java.math.BigInteger
def factorial(x: BigInteger): BigInteger = if (x == BigInteger.ZERO) BigInteger.ONE else x.multiply(factorial(x.subtract(BigInteger.ONE)))
```
##### Growing new control constructs
>*Future is* ***Concurrency*** *And **Parallelism***.

**Akka Library In Scala** uses actor-based model basically from **Erlang (Actor-Model)**.
Actor model prevent deadlock, helps in efficiency improvement for concurrent parallel programming. Akka Actors mainly work on message passing mechanisms.

---

#### 1.2 WHAT MAKES SCALA SCALABLE?

Scala is a mixture of functional and object oriented programming paradigm. It becomes powerful due to collection of different paradigm in it.
*   **Scala is Object Oriented.**
*   **Scala is Functional.**

---
#### 1.3 WHY SCALA?
Since Scala is a JVM based language, it is platform independent.
*   **Scala is compatible**
```scala
Scala == wellDressed(Java)
// Scala add's utility functions on top of Java
// methods and "dresses them up" to make them nicer.
```
*   **Scala is concise**
```scala
// In Java
class MyClass {
    private int index;
    private String name;
    public MyClass(int index, String name) {
        this.index = index;
        this.name = name;
    }
}
//In Scala
class MyClass(index: Int, name: String)
```
*   **Scala is high-level**
 Scala's functional programming style also offers high-level reasoning principles for programming. The key idea is that functions are referentially transparent—a function application is characterized only by its result.

```scala
// In Java
boolean nameHasUpperCase = false;
for (int i = 0; i &lt; name.length(); ++i) {
    if (Character.isUpperCase(name.charAt(i))) {
        nameHasUpperCase = true;
        break;
    }
}
//In Scala
val nameHasUpperCase = name.exists(_.isUpper)
 ```
*   **Scala is statically typed**

---

 #### 1.4 SCALA'S ROOTS
*   **Syntax  => Java, C#, C, C++.**
*   **Uniform Object Model => Ruby, SmallTalk.**
*   **Universal Nesting => Algol, Simula, Beta.**
*   **Uniform Access Principle => Eiffel.**
*   **Functional Programming Principles => ML, Haskell, Erlang.**
*   **Operator Overloading And Templating => C++.**
