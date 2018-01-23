package net.dcfox

import javafx.beans.property.*

private fun keyIsValid() {

}

class ReadOnlyBoolean(
        private val bean_:      Any?        = null,
        private val name_:      String      = "",
        initialValue:           Boolean     = false,
        private val accessKey:  AccessKey   = AccessKey.NoKey
) : ReadOnlyBooleanPropertyBase() {

    private var value: Boolean = initialValue
    internal fun set(value: Boolean) {
        this.value = value
        fireValueChangedEvent()
    }
    override fun get():     Boolean = value
    override fun getName(): String  = name_
    override fun getBean(): Any?    = bean_
}

class ReadOnlyDouble(
        private val bean_:      Any?        = null,
        private val name_:      String      = "",
        initialValue:           Double      = 0.0,
        private val accessKey:  AccessKey   = AccessKey.NoKey
) : ReadOnlyDoublePropertyBase() {

    private var value: Double = initialValue
    internal fun set(value: Double) {
        this.value = value
        fireValueChangedEvent()
    }
    override fun get():     Double  = value
    override fun getName(): String  = name_
    override fun getBean(): Any?    = bean_
}

class ReadOnlyFloat(
        private val bean_:      Any?        = null,
        private val name_:      String      = "",
        initialValue:           Float       = 0.0F,
        private val accessKey:  AccessKey   = AccessKey.NoKey
) : ReadOnlyFloatPropertyBase() {

    private var value: Float = initialValue
    internal fun set(value: Float) {
        this.value = value
        fireValueChangedEvent()
    }
    override fun get():     Float   = value
    override fun getName(): String  = name_
    override fun getBean(): Any?    = bean_
}

class ReadOnlyInteger(
        private val bean_:      Any?        = null,
        private val name_:      String      = "",
        initialValue:           Int         = 0,
        private val accessKey:  AccessKey   = AccessKey.NoKey
) : ReadOnlyIntegerPropertyBase() {

    private var value: Int = initialValue
    internal fun set(value: Int) {
        this.value = value
        fireValueChangedEvent()
    }
    override fun get():     Int     = value
    override fun getName(): String  = name_
    override fun getBean(): Any?    = bean_

}

class ReadOnlyLong(
        private val bean_:      Any?        = null,
        private val name_:      String      = "",
        initialValue:           Long        = 0,
        private val accessKey:  AccessKey   = AccessKey.NoKey
) : ReadOnlyLongPropertyBase() {

    private var value: Long = initialValue
    internal fun set(value: Long) {
        this.value = value
        fireValueChangedEvent()
    }
    override fun get():     Long    = value
    override fun getName(): String  = name_
    override fun getBean(): Any?    = bean_

}

class ReadOnlyObject<T>(
        private val bean_:      Any?        = null,
        private val name_:      String      = "",
        initialValue:           T?          = null,
        private val accessKey:  AccessKey   = AccessKey.NoKey
) : ReadOnlyObjectPropertyBase<T>() {

    private var obj: T? = initialValue
    internal fun set(value: T, key: AccessKey) {
        if (accessKey.isAssociatedWith(key)) {
            this.obj = value
            fireValueChangedEvent()
        }
    }

    override fun get(): T? = obj
    override fun getName(): String = name_
    override fun getBean(): Any? = bean_
}

class ReadOnlyString(
        private val bean_:      Any?        = null,
        private val name_:      String      = "",
        initialValue:           String      = "",
        private val accessKey:  AccessKey   = AccessKey.NoKey
) : ReadOnlyStringPropertyBase() {

    private var value_: String = initialValue
    internal fun set(value: String) {
        this.value_ = value
        fireValueChangedEvent()
    }
    override fun get():     String  = value_
    override fun getName(): String  = name_
    override fun getBean(): Any?    = bean_

}