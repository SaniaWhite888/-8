import kotlin.math.pow

fun equation(equation: String): Int {
    val parts = equation.split("+", "-", "", "/")
    var result = parts[0].toInt()
    for (i in 1 until parts.size) {
        val operator = equation.substringBefore(parts[i])
        val operand = parts[i].toInt()
        when (operator) {
            "+" -> result += operand
            "-" -> result -= operand
            "" -> result = operand
            "/" -> result /= operand
            else -> throw IllegalArgumentException("Invalid operator: $operator")
        }
    }
    return result
}

fun main() {
    println(equation("1+1")) // 2
    println(equation("74-2")) // 26
    println(equation("1+1+1+1+1")) // 5
}