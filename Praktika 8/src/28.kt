fun createArrayFrom1ToN(n: Int): IntArray {
    if (n < 1) {
        throw IllegalArgumentException("N должно быть больше или равно 1")
    }
    return IntArray(n) { it + 1 }
}