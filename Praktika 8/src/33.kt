fun findElementByIndex(array: IntArray, index: Int): Int? {
    if (index in 0 until array.size) {
        return array[index]
    }
    return null
}