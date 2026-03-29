// TODO: Оголосіть fun List<Int>.sumOdd(): Int
fun List<Int>.sumOdd(): Int{
    var sum = 0
    for(i in this){
        if (i%2 != 0) sum += i
    }
    return sum
}