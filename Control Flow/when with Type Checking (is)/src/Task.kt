fun processInput(input: Any): Int {
    // TODO: Використайте when із перевірками 'is String' та 'is Int'
    when (input) {
        is Int -> return input * 2
        is String -> return input.length
        else -> return 0
    }
}