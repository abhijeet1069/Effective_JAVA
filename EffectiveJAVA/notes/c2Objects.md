# Creating and Destroying Objects

## Consider static factory methods instead of constructors

It has many advantages like control over object creation.

## Consider a builder when faced with many constructor parameters

1. Telescoping Constructor Pattern - Telescoping constructor pattern does not scale well.
2. Java beans Pattern -  This pattern is not thread safe, since JavaBean may be in an inconsistent state 
   partway through its construction.
3. Builder pattern - Only one disadvantage that it requires more boiler code.

## Prefer dependency injection to hard-wiring resources

Enables loose coupling. Makes easier to test code.

1. Constructor injection
2. Setter Injection - Similar to constructor injection. Instead of constructor initializing the class field
                        Setter does it.
3. Field Injection - Mostly used by dependency injection frameworks like Spring.

## Avoid creating unnecessary objects

Prefer primitives.

```java
String s = new String("Hello,World"); //avoid. Since, this will create un-necessary each time this is executed.

String s = "Hello World"; //better
```
## Eliminate obsolete object references

1. If you don't require the resource or resource is obsolete, set it to null.
It will automatically be eligible for garbage collection.
2. Use local variables
3. Use try-with-resources for closeable resource

## Prefer try-with resources to try-finally

Always use try-with-resources in preference to try finally when working with resources that must be closed. The resulting code is
shorter and clearer, and the exceptions that it generates are more useful.


