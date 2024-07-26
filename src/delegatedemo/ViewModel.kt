package delegatedemo

import kotlin.properties.Delegates

class ViewModel {

    private var queryString: String by Delegates.observable("") { property, oldValue, newValue ->
        println("${oldValue}-> ${newValue}")
    }
    private val logger: Logger by lazy {
        println("initializing ViewModel")
        ApplicationLogger(SimpleLogger())
    }

    fun search(message: String) {
        logger.log("query", message)
        queryString = message
    }
}