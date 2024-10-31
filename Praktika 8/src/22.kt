fun isPalindrome(text: String): Boolean {
    val cleanText = text.toLowerCase().replace(" ", "")
    return cleanText == cleanText.reversed()
}