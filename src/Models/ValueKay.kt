package Models

data class ValueKay(
        private val id: Int,
        private val name: String
) {
    override fun toString(): String {
        return "ValueKay(id=$id, name='$name')"
    }
}
