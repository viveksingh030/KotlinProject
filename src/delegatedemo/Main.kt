package delegatedemo

import kotlin.properties.Delegates


var vetoableProperty: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
    newValue >= 0  // Only allow non-negative values
}

fun main(args: Array<String>) {
    val viewModel = ViewModel()
    viewModel.search("Kotlin")
    viewModel.search("Scala")

    vetoableProperty = 5
    println(vetoableProperty)  // Output: 5

    vetoableProperty = -1
    println(vetoableProperty)

    var example:Example=Example()
   println( example.readWrite)
    example.readWrite="VIvek"
    println(example.readWrite)
}

class Example {
    var readWrite: String by ReadWriteDelegate()
}

