package interfacedemo

class Square<T : Number>(private val side: T) : Shape {
    override fun area(): Double {
        return Math.pow(side.toDouble(), 2.0)
    }
}