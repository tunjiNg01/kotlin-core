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
