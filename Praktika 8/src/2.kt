fun differenceMinMax(list: List<Int>): Int {
    if (list.isEmpty()) {
        return 0
    } else {
        return list.maxOrNull()!! - list.minOrNull()!!
    }
}