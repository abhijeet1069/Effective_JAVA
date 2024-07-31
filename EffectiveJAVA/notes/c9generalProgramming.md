# General Programming

## Minimize the scope of local variables

- The most powerful technique for minimizing the scope of local variable is to declare it where it is first used.
- Nearly every local variable declaration should contain an initializer, if initializer throws an exception then it
  should be properly initialized within a try-catch block.
- Prefer for loops to while loops. As for loops have their iteration variable localized.
- Keep methods small and focused.

## Prefer for-each loops over traditional for loops

```java
    //read as, for each element e in elements
   for(Element e : elements){
    
        }
```

## Know and use libraries

By using the standard library, you take advantage of the knowledge of the experts who wrote it and the experience of
those who used it before you.

## Avoid float and double if exact answers are required

Don't use float or double for any calculations that require an exact answer. Use BigDecimal if you want the system to
keep track of decimal point.

## Prefer primitives to boxed primitives

Applying the == operator to boxed primitives is almost always wrong.

```java
// Hideously slow program! Can you spot the object creation?
public static void main(String[] args) {
    Long sum = 0L;
    for (long i = 0; i < Integer.MAX_VALUE; i++) {
        sum += i;
    }
    System.out.println(sum);
}
```

## Avoid strings where other types are more appropriate

## Beware of the performance of string concatenation

Using the string operation to concatenate n strings requires time quadratic in n, as strings are immutable.
To achieve acceptable performance, use a StringBuilder in place of a String.

## Refer to objects by their interfaces

Using interfaces as types will make programs much more flexible.

```java
Set<Son> sonSet = new LinkedHashSet<>(); //good as we can replace LinkedHashSet to HashSet and program will work

LinkedHashSet<Son> sonSet = new LinkedHashSet<>(); //bad
```
## Optimize judiciously

Don't sacrifice sound architectural principles for performance.

## Adhere to generally accepted naming conventions

## Java Benchmarking - Optimize your code

Using JMH helps to understand the micro-performance aspects of your Java applications, allowing 
you to make informed decisions about optimizations.