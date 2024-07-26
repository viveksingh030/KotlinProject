package interfacedemo

class Rectangle<T : Number>(private val length: T, private val breadth: T) : Shape {
    override fun area(): Double {
        return length.toDouble() * breadth.toDouble()
    }
}