Delegates in Kotlin provide a powerful and flexible mechanism to delegate the implementation of properties to another object. Kotlin's standard library provides several built-in delegates, and you can also create your custom delegates.

### Standard Library Delegates

#### 1. Lazy Initialization

The `lazy` delegate initializes a property only when it's accessed for the first time.

```kotlin
val lazyValue: String by lazy {
    println("Computed!")
    "Hello, World!"
}

fun main() {
    println(lazyValue)  // Output: Computed! Hello, World!
    println(lazyValue)  // Output: Hello, World!
}
```

#### 2. Observable Properties

The `Delegates.observable` function allows you to listen for changes to a property.

```kotlin
import kotlin.properties.Delegates

var observableProperty: String by Delegates.observable("Initial Value") { property, oldValue, newValue ->
    println("Property '${property.name}' changed from '$oldValue' to '$newValue'")
}

fun main() {
    observableProperty = "New Value"  // Output: Property 'observableProperty' changed from 'Initial Value' to 'New Value'
}
```

#### 3. Vetoable Properties

The `Delegates.vetoable` function allows you to veto (reject) changes to a property based on a condition.

```kotlin
import kotlin.properties.Delegates

var vetoableProperty: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
    newValue >= 0  // Only allow non-negative values
}

fun main() {
    vetoableProperty = 5
    println(vetoableProperty)  // Output: 5

    vetoableProperty = -1
    println(vetoableProperty)  // Output: 5 (change was vetoed)
}
```

### Custom Delegates

You can create your custom delegates by implementing the `ReadOnlyProperty` or `ReadWriteProperty` interfaces.

#### Read-Only Property Delegate

```kotlin
import kotlin.reflect.KProperty

class ReadOnlyDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "Read-Only Value"
    }
}

class Example {
    val readOnly: String by ReadOnlyDelegate()
}

fun main() {
    val example = Example()
    println(example.readOnly)  // Output: Read-Only Value
}
```

#### Read-Write Property Delegate

```kotlin
import kotlin.reflect.KProperty

class ReadWriteDelegate {
    private var value: String = "Initial Value"

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: String) {
        value = newValue
    }
}

class Example {
    var readWrite: String by ReadWriteDelegate()
}

fun main() {
    val example = Example()
    println(example.readWrite)  // Output: Initial Value

    example.readWrite = "New Value"
    println(example.readWrite)  // Output: New Value
}
```

### Summary

- **Lazy Initialization**: Use `by lazy` for properties that should be initialized lazily.
- **Observable Properties**: Use `Delegates.observable` to listen for property changes.
- **Vetoable Properties**: Use `Delegates.vetoable` to control property changes based on a condition.
- **Custom Delegates**: Implement `ReadOnlyProperty` or `ReadWriteProperty` to create custom delegates for specific behavior.

Delegates in Kotlin provide a way to abstract common property behaviors and reuse them across different classes, making your code more modular and easier to maintain.