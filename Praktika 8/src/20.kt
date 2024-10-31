fun findMax(array: IntArray): Int {
    if (array.isEmpty()) {
        throw IllegalArgumentException("Массив не может быть пустым")
    }
    var max = array[0]
    for (number in array) {
        if (number > max) {
            max = number
        }
    }
    return max
}