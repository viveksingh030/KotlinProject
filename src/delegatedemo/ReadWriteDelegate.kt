package delegatedemo

import kotlin.reflect.KProperty


class ReadWriteDelegate {
    private var value: String = "Initial Value"

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: String) {
        value = newValue
    }
}
