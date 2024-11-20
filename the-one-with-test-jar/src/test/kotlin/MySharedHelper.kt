class MySharedHelper {

    fun someKotlinCode(): String {
        val list = listOf("first", "second", "third")
        return list.sortedBy { it.length }.first()
    }
}