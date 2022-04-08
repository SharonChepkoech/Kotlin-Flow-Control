
fun main(){
    var name = returnLongNames(arrayOf("Sharon","nebuchardnezer","gsft"))
    serveDrinks(23)
    println(name)
    oddNumbers()
    multipleFiveThree()

}

//1.Create a function that prints out all the odd numbers between 1 and 100 (2pts

fun oddNumbers(){
    for (number in 1..100){
        if (number%2!=0)
            println(number)

    }
}

//2.Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts
//fun value(mixedType:Array<Any>):I{
//    var sum = 0
//    mixedType.forEach { no->
//        if (no is Int) {
//            sum += no
//        }
//        else (no is Float) {
//        sum += no
//    }
//

fun returnLongNames(names:Array<String>) :Int{
    var number = 0
    names.forEach {name->
    if (name.length > 5)
        number++
    }
        return number
}

//3.You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these decisions,
//printing out the name of the drink each person gets according to their age.

fun serveDrinks(age:Int){
    if (age <6){
        println("Serve milk")
    }
    else if (age <15){
        println("Serve fanta")
}
    else if (age >=15){
        println("Serve coca-cola")
    }
}
//4.Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
fun multipleFiveThree() {
    for (num in 1..100) {
        if (num % 3 == 0 && num % 5 == 0)
            println("FizzBuzz")
        else if (num % 3 == 0)
            println("Fizz")
        else if (num % 5 == 0)
            println("Buzz")
        else println(num)


    }
}