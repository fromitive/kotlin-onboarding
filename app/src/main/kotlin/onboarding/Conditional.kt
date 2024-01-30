fun main() {
    if (1 < 2) {
        println("1 less then 2")
    }
    
    if (1 > 2) {
        println("1 greater then 2")
    } else {
        println("else 1 less then 2")
    }

    // when operation
    val day = 4
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println("Day is :" + result)

    // while loop
    var idx = 5
    while(idx > 0) {
        println("while loop current $idx")
        idx--
    }
    
    // for loop
    for (item in arrayOf("item1","item2")){
        println("item is ${item}")
    }
    for (num in 5..15) {
        println("number is : ${num}")  // 5 <= num <= 15 
    } 

    for (itemIndex in arrayOf("item1","item2").indices){
        println("item indices is ${itemIndex}") // 0 ~ 1
    }

    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)
    println()

    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print(i)
    println()
}
