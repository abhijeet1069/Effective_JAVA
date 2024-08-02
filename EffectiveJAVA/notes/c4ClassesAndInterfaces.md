# Classes and Interfaces

## Minimize the accessibility of classes and members

A well-designed component hides all its implementation details, cleanly separating its API from its implementation. 
This concept, known as information hiding or encapsulation.
Use the lowest possible access level consistent with the proper functioning of the software you are writing.

Liskov Substitution Principle : A parent class should be replaceable with object of its child classes without
affecting the correctness of the program. (Factor out the commonalities to remove repetition)

## In public classes, use accessor methods like getters and setters and not public fields

## Favor composition over inheritance

## Prefer interfaces to abstract classes

## Use interfaces only to define types

Interfaces should be used only to define types. They should not be used merely to export constants.

On a side note, I cannot maintain a common constant class or Interface because maintaining changes
would become difficult as changes would not be localised. Maybe after introduction of Jenkins,
things will be sorted. Currently, I am localising the constants in their origin class itself.

## Never put multiple top-level classes or interfaces in a single source file.

