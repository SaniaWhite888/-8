fun countVowels(str: String): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var count = 0
    for (char in str) {
        if (char in vowels) {
            count++
        }
    }
    return count
}