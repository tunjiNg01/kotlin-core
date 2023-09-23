# kotlin-core

## Collections
> List is an ordered collection of item
> Set is an unordered collection of unique item
> Maps Sets of key-value pairs where keys are unique and map to only one value


# Range
Ranges﻿
Before talking about loops, it's useful to know how to construct ranges for loops to iterate over.

- The most common way to create a range in Kotlin is to use the .. operator. For example, 1..4 is equivalent to 1, 2, 3, 4.

- To declare a range that doesn't include the end value, use the ..< operator. For example, 1..<4 is equivalent to 1, 2, 3.

- To declare a range in reverse order, use downTo. For example, 4 downTo 1 is equivalent to 4, 3, 2, 1.

- To declare a range that increments in a step that isn't 1, use step and your desired increment value. For example, 1..5 step 2 is equivalent to 1, 3, 5.

You can also do the same with Char ranges:

- 'a'..'d' is equivalent to 'a', 'b', 'c', 'd'

- 'z' downTo 's' step 2 is equivalent to 'z', 'x', 'v', 't'

  # Function
  You can declare your own functions in Kotlin using the fun keyword.

In Kotlin:

function parameters are written within parentheses ().

- each parameter must have a type, and multiple parameters must be separated by commas ,.

- the return type is written after the function's parentheses (), separated by a colon :.

- the body of a function is written within curly braces {}.

- the return keyword is used to exit or return something from a function.

  # Lambda expressions
  Kotlin allows you to write even more concise code for functions by using lambda expressions.

  Lambda expressions can be used in a number of ways. You can:

- assign a lambda to a variable that you can then invoke later

- pass a lambda expression as a parameter to another function

- return a lambda expression from a function

- invoke a lambda expression on its own

Before you can return a lambda expression from a function, you first need to understand function types.
You have already learned about basic types but functions themselves also have a type. Kotlin's type inference can infer a function's type from the parameter type. But there may be times when you need to specify the function type explicitly. The compiler needs the function type so that it knows what is and isn't allowed for that function.

### Returning a lambda expression
A function can return a lambda expression but we need to indicate the return type like this: (Int) -> Int. this implies that the function will return a function that takes in an Integer and returns an integer.
A lambda expression can be invoked using the () after the curly braces.

### Trailing lambda
If the lambda expression is the only parameter we can drop the the braces for curly braces if the lambda expression is the last parameter the lambda can be outside the braces

# Classes
Classes are declared in Kotlin using the keyword class followed by the class name
## properties
The characteristics of a class can be declared within the braces () on we create the instance of this class we have to provide those properties provided by the class, the content within the parenthesis of the class is called the class headers.
Just like the function, class headers can have a default.

## Data
The data class is declared with the data keyword, they can be used to store data, and just like in Java they come with other methods and functions


