package net.dcfox

open class Store {
    protected fun set(property: ReadOnlyBoolean, value: Boolean) {
        property.set(value)
    }
    protected fun set(property: ReadOnlyDouble, value: Double) {
        property.set(value)
    }
    protected fun set(property: ReadOnlyFloat, value: Float) {
        property.set(value)
    }
    protected fun set(property: ReadOnlyInteger, value: Int) {
        property.set(value)
    }
    protected fun set(property: ReadOnlyLong, value: Long) {
        property.set(value)
    }
    protected fun <T>set(property: ReadOnlyObject<T>, value: T) {
        property.set(value)
    }
    protected fun set(property: ReadOnlyString, value: String) {
        property.set(value)
    }
}