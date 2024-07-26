package interfacedemo

import dataclassdemo.Task

fun main(args: Array<String>) {
    val shape: Shape = Rectangle(7, 5)
    println(shape.area())
}