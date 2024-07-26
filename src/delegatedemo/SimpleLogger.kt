package delegatedemo

class SimpleLogger : Logger {
    override fun log(message: String, any: Any) {
        println("${message} ${any}")
    }
}