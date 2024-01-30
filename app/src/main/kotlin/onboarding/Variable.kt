fun main(){
    val name = "Moosong"
    val birth = 1994
    // birth = 1993 //var은 안바꾸는게 원칙이라 경고 오류가 나타남. 값은 변경될 수 있음.
    println("My Name is " + name)
    println("Year of Birth is " + birth)

    // 지원하는 기본 변수 type 들
    val myNum       = 5             // Int
    val myDoubleNum = 5.99          // Double
    val myLetter    = 'D'           // Char
    val myBoolean   = true          // Boolean
    val myText      = "Hello"       // String
    


    // 타입 정의는 변수명:<Type>으로 정의 할 수 있음
    // 기본 타입은 대문자로 시작하는 것으로 추정

    // 정수형
    val myIntNum: Int            = 5
    val myIntNum2: Int           = 4
    val myShortNum: Short        = 5
    val myLongNum: Long          = 5L
     
    // 실수형
    val myDoubleNum2: Double     = 5.99
    val myFloatNum: Float        = 5.5F


    val myLetter2: Char          = 'D'

    val myBoolean2: Boolean      = true
    val myText2: String          = "World!"

    // 타입 자동 변환
    // myLongNum = myIntNum // 타입이 맞지 않으면 변환할 수 없음
    
    val myIntNum3:Int = myLongNum.toInt() // 이렇게 명시적으로 변환해야 함

    // Val의 특성
    // myIntNum = myIntNum2 // Val은 재할당이 불가능함

    // val myName
    // myName = "Moosong" // val을 사용하면 꼭 초기화해야 함

    // val 과 var
    // myNum = 5 : val은 변경할 수 없음
    var variableName:String
    variableName = "lee"
    println(variableName) // var은 변경 가능하고 초기화 할 수 있음

    // 문자열 자료형
    println(myText2[0])           // idx로 조회 가능
    println(myText2.length)       // 길이 조회 가능
    println(myText2.lowercase())
    println(myText2.uppercase())
    println(myText2.indexOf("r")) // "World"에서 r의 위치 반환 (시작 인덱스 값 : 0)
    println(myText.plus(myText2)) // Concat 가능
    var age:Int = 30
    println("My Age is : $age")   // formating 가능

    // array
    val array = arrayOf("item1","item2", "item3", "item4",5)
    if ("item1" in array) {
        println("item1 in array is true")
    }
    println("Array size is ${array.size}")
}