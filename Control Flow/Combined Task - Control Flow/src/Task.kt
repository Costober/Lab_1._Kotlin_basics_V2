fun fizzBuzz(n: Int): String {
    var result = ""
    // TODO: Цикл for (i in 1..n). Всередині використайте when { i % 15 == 0 -> ... }
    for (i in 1..n) {
        when {
            (i % 15 == 0) -> result += "FizzBuzz "
            (i % 5 == 0) -> result += "Buzz "
            (i % 3 == 0) -> result += "Fizz "
            else -> result += "$i "
        }
    }
    return result
}