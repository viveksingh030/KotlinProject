package sealed

import java.util.Random

sealed class StringResult {
    data class Success(val value: String) : StringResult()
    data class Error(val reason: Throwable) : StringResult()
}

fun main(args: Array<String>) {
    processStringResult(getString())
}

fun getString(): StringResult {
    try {
        return StringResult.Success(getRandomString())
    } catch (error: IllegalArgumentException) {
        return StringResult.Error(error)
    }
}

fun getRandomString(): String {
    val random = Random()
    val value = random.nextInt(10)
    return when (value) {
        in 1..5 -> value.toString()
        else -> throw IllegalArgumentException("Invalid Random value")
    }
}

fun processStringResult(stringResult: StringResult) = when (stringResult) {
    is StringResult.Success -> println(stringResult.value)
    is StringResult.Error -> println("reason: ${stringResult.reason.message}")
}

