package inheritence

open class Person(age: Int, val firstName: String, val lastName: String) {
    init {
        if (age <= 0) {
            throw RuntimeException("Age can't be less than 0")
        }
    }

    val age: Int = age

    open fun printName() {
        println("$firstName ${lastName} age is $age")
    }
}