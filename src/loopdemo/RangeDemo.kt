package loopdemo

fun main(args: Array<String>) {
    var i = 0
    while (i in 0..5) {
        println(i)
        i++
    }
    i = 0
    for (i in 0..5 step 2) {
        println(i)
    }
    i++
    var evenOdd = if (i % 2 == 0) {
        "Even"
    } else {
        "Odd"
    }
    for(i in 10 downTo 1 step 2) {
        println(i)
    }

    println(evenOdd)

}