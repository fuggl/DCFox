package net.dcfox

sealed class AccessKey {
    fun isAssociatedWith(otherKey: AccessKey) : Boolean {
        if (this !== otherKey) {
            //TODO: throw access exception
            return false
        }
        return true
    }
    companion object NoKey : AccessKey()
}

open class Store(protected val accessKey: AccessKey = AccessKey.NoKey) {
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
        property.set(value, accessKey)
    }
    protected fun set(property: ReadOnlyString, value: String) {
        property.set(value)
    }
}