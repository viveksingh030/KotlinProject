In Kotlin, there are several ways to perform looping operations. Here are the main loop constructs:

### 1. `for` Loop

The `for` loop in Kotlin is versatile and can be used to iterate over ranges, arrays, lists, and other iterable collections.

#### Iterating over a Range
```kotlin
fun main() {
    for (i in 1..10) {
        println(i)
    }
}
```
This prints numbers from 1 to 10.

#### Iterating with a Step
```kotlin
fun main() {
    for (i in 1..10 step 2) {
        println(i)
    }
}
```
This prints 1, 3, 5, 7, 9.

#### Iterating in Reverse
```kotlin
fun main() {
    for (i in 10 downTo 1) {
        println(i)
    }
}
```
This prints numbers from 10 to 1.

#### Iterating Over an Array or List
```kotlin
fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    for (number in numbers) {
        println(number)
    }
}
```
This prints each number in the array.

### 2. `while` Loop

The `while` loop executes as long as the condition is true.

#### Basic `while` Loop
```kotlin
fun main() {
    var i = 1
    while (i <= 5) {
        println(i)
        i++
    }
}
```
This prints numbers from 1 to 5.

### 3. `do-while` Loop

The `do-while` loop is similar to the `while` loop, but it guarantees that the loop body will be executed at least once.

#### Basic `do-while` Loop
```kotlin
fun main() {
    var i = 1
    do {
        println(i)
        i++
    } while (i <= 5)
}
```
This prints numbers from 1 to 5.

### 4. Iterating with `forEach`

Kotlin provides the `forEach` function for collections, which is a more functional approach to looping.

#### Using `forEach` with a List
```kotlin
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.forEach { number ->
        println(number)
    }
}
```
This prints each number in the list.

### 5. Iterating with Indices

You can also loop through the indices of a collection.

#### Using Indices
```kotlin
fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    for (index in numbers.indices) {
        println("Element at index $index is ${numbers[index]}")
    }
}
```
This prints each element along with its index.

### 6. Iterating with `withIndex`

Kotlin allows you to iterate over a collection with both index and value using `withIndex`.

#### Using `withIndex`
```kotlin
fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    for ((index, value) in numbers.withIndex()) {
        println("Element at index $index is $value")
    }
}
```
This prints each element with its index.

### Summary

- **`for` Loop**: Versatile loop for iterating over ranges, arrays, lists, etc.
- **`while` Loop**: Continues to execute as long as the condition is true.
- **`do-while` Loop**: Executes the body at least once and then continues while the condition is true.
- **`forEach`**: Functional approach to iterate over collections.
- **Indices**: Iterate using the indices of a collection.
- **`withIndex`**: Iterate over collections with both index and value.

These constructs provide a powerful and flexible way to perform looping operations in Kotlin.