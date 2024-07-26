package dataclassdemo

fun main(args: Array<String>) {
    val task: Task = Task("a1", "Search Task")
    val task2: Task = Task("a1", "Search Task")
    println(task.name)
    println(task == task2)//true

    val task3 = task.copy("a3")
    println(task.name == task3.name)
}