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

# Data
The data class is declared with the data keyword, they can be used to store data, and just like in Java, they come with other methods and functions.
## Properties declared in the class body
The compiler only uses the properties defined inside the primary constructor for the automatically generated functions. To exclude a property from the generated implementations, declare it inside the class body:
## Data classes and destructuring declarations
Component functions generated for data classes make it possible to use them in destructuring declarations:
```java
val jane = User("Jane", 35)
val (name, age) = jane
println("$name, $age years of age")
// Jane, 35 years of age
```

# Nullable Types
Kotlin supports nullable this allowed the declared type to have null as a possible value, to make a type nullable we add ? in front of the type i.e. String?
### Use safe calls﻿
In order to avoid null exception errors use a safe call operator ?. 
### Use Elvis operator
Use the Elvis operator to provide an optional value if a variable happens to be null.
# Extension
This allows us to extend the function of certain classes we can use this to implement the decorator class
If a class has a member function, and an extension function is defined that has the same receiver type, the same name, and is applicable to given arguments, the member always wins.
### Nullable receiver﻿
Note that extensions can be defined with a nullable receiver type. These extensions can be called on an object variable even if its value is null.
### Extension properties﻿?

### Scope of extensions
In most cases, you define extensions on the top level, directly under packages:

```java
package org.example.declarations
fun List<String>.getLongestString() { /*...*/}
```
To use an extension outside its declaring package, import it at the call site:

```java
package org.example.usage
import org.example.declarations.getLongestString
fun main() {
    val list = listOf("red", "green", "blue")
    list.getLongestString()
}
```
### Declaring extensions as members﻿
You can declare extensions for one class inside another class. Inside such an extension, there are multiple implicit receivers - objects whose members can be accessed without a qualifier. An instance of a class in which the extension is declared is called a dispatch receiver, and an instance of the receiver type of the extension method is called an extension receiver.

# Functional (SAM) interfaces ??


# Vissibility identify
The visibility identifier allows us to control where class, method, and properties can be used, these are the visibility identifiers in Kotlin private, public, protected, and internal, When we override a method or property without indicating the visibility identifier it inherits the initial identifier.

- private means that the member is visible inside this class only (including all its members).

- protected means that the member has the same visibility as one marked as private, but that it is also visible in subclasses.

- internal means that any client inside this module who sees the declaring class sees its internal members.

- public means that any client who sees the declaring class sees its public members.
