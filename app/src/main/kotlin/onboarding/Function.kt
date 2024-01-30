// https://developer.android.com/codelabs/basic-android-kotlin-compose-function-types-and-lambda

fun main() { 
    trickOrTreat(false, {"$it is five"})
    val treatFunction = trickOrTreat(false) {"$it"} // it is (Int) paramater
    treatFunction()
}
// functionName(parameter): [return value]
// return value -> labmda expression : () -> [return value]
// Unit은 void와 같음
fun trickOrTreat(isTrick: Boolean): () -> Unit {
    if (isTrick) {
        return trick
    }
    return treat
}

fun trickOrTreat(isTrick: Boolean, extraTrick:(Int) -> String): () -> Unit {
    if(isTrick) {
        return trick
    } else {
        println(extraTrick(5))
        return treat
    }
}

fun trickOrTreatNullable(isTrick: Boolean, extraTrick:((Int) -> String)?): () -> Unit {
    if(isTrick) {
        return trick
    } else {
        if(extraTrick != null){
            println(extraTrick(5))
        }
        return treat
    }
}


val coins:(Int) -> String = {
    quentity -> "has coin is ${quentity}"
}

val displayAge:(Int) -> String = {
    age -> "My age is ${age}"
}

val trick = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}
