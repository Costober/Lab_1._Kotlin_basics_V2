// TODO: 1. Оголосіть single-expression функцію formatUser з параметрами за замовчуванням
fun formatUser(login: String, domain: String = "example.com", isActive: Boolean = true): String = "[$login@$domain] - Active: $isActive"

fun testUser(): String {
    // TODO: 2. Поверніть результат виклику formatUser("admin", isActive = false)
    return formatUser("admin", isActive = false)
}