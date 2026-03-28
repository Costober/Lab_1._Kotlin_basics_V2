fun trafficLightAction(color: String): String {
    // TODO: Поверніть результат виразу when (color) { ... }
    when (color) {
        "Red" -> return "Stop"
        "Yellow" -> return "Wait"
        "Green" -> return "Go"
        else -> return "Error"
    }
}