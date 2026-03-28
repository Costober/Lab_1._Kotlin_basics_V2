sealed class NetworkResult
data class Success(val data: String) : NetworkResult()
data class Error(val errorMsg: String) : NetworkResult()

fun processResult(result: NetworkResult): String {
    // TODO: Використайте return when(result) { is Success -> ..., is Error -> ... }
    when (result) {
        is Success -> return "Дані: ${result.data}"
        is Error -> return "Помилка: ${result.errorMsg}"
    }
}