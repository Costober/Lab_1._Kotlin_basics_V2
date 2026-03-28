// TODO: Оголосіть клас Worker(val name: String, val hourlyRate: Int)
// Додайте init { ... }
// Додайте var hoursWorked та val salary

class Worker(name: String, val hourlyRate: Int) {
    init {
        if (hourlyRate <= 0){
            throw IllegalArgumentException("")
        }
    }
    var hoursWorked = 0
    set(hoursWorked){
        if (hoursWorked > 0){
            field = hoursWorked
        }
    }

    val salary: Int
        get() = hourlyRate * hoursWorked
}