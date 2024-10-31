fun findFirstIndex(array: IntArray, element: Int): Int {
    for (i in 0 until array.size) {
        if (array[i] == element) {
            return i
        }
    }
    return -1
}