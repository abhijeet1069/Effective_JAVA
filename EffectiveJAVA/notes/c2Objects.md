# Creating and Destroying Objects

## Consider static factory methods instead of constructors

It has many advantages like control over object creation.

## Consider a builder when faced with many constructor parameters

1. Telescoping Constructor Pattern - Telescoping constructor pattern does not scale well.
2. Java beans Pattern -  This pattern is not thread safe, since JavaBean may be in an inconsistent state partway through its construction.
3. 