package extensionproperties

fun <T : Number> T.max(a: T): T {
    return if (this.toDouble() > a.toDouble()) this else a
}