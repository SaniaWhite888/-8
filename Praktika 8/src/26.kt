fun getLastElement(array: IntArray): Int {
    if (array.isEmpty()) {
        throw IllegalArgumentException("Массив не может быть пустым")
    }
    return array[array.size - 1]
}