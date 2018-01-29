package net.dcfox.flux

sealed class AccessKey {
    fun isAssociatedWith(otherKey: AccessKey): Boolean {
        if (this !== otherKey) throw WriteAccessException()
        return true
    }
    companion object NoKey : AccessKey()
}

class WriteAccessException(): Exception()