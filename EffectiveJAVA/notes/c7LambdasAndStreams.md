# Lambdas and streams

## Lambda Expression

Lambda expressions introduced in Java 8, helps to implement single-method interfaces(functional interfaces).

## Prefer lambdas to anonymous classes

Also, lambda lack names and documentation. If a computation isn't self explanatory, or exceeds  a few lines, don't put
it in a lambda.

## Always annotate your functional interfaces with the @FunctionalInterface annotation.

## Stream

Streams offer a functional approach to manipulating collections and sequences of data. It was introduced in Java 8.
We can do filter, map, reduce on a stream.

## .parallel()

Do not parallelize a stream pipeline unless you have a good reason to believe that it will preserve the correctness of
the computation and increase its speed.


