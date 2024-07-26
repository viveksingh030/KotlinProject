package delegatedemo

import jdk.jshell.execution.LoaderDelegate

class ApplicationLogger
    (private val logger: Logger) : Logger by logger {

}