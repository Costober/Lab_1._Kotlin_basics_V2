class BankAccount {
    var balance: Int = 0
    // TODO: Напишіть кастомний set(value) { ... } з використанням field
    set(balance) {
        if (balance > 0) {
            field = balance
        }
    }
}