package enumdemo

enum class Direction {
    EAST, WEST, NORTH, SOUTH
}
fun main(args: Array<String>) {
    val direction: Direction = Direction.EAST
    println(direction.name)
    println(direction.ordinal)
    println(Direction.valueOf("NORTH"))
}
