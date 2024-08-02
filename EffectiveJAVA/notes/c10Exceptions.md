# Exceptions

## Use exceptions only for exceptional conditions

Exceptions are, as their name implies, to be used only for exceptional conditions; they should never be used for
ordinary control flow. 

## Strive for failure atomicity

A failed method invocation should leave the object in the state that it was in prior to the invocation.

## Don't ignore exceptions

An empty try catch block defeats the purpose of exceptions, if you choose to ignore an exception, the catch block
should contain a comment explaining why it is appropriate to do so.

