import java.util.Scanner

fun main(args: Array<String>) {
  /*  val input = Scanner(System.`in`)
    //val temp = input.nextDouble()
    var num1 = readLine()!!.toInt()
    println("$num1")

    var array = Array(10) {i -> i*2}
   // var x = array.get(5)
   // println("$x and ${array.get(4)}")


    var temp = arrayOf<String>("Mary","Paul","Jane","Phil","John","Jane","Paul","Anthony","Mary")

    var dist = temp.distinct()
    var x = dist.count()
    println("There is $x distinct names")
    temp.sort()
    println("The first in the alphabetical order is ${temp.get(0)}")
    println("The last in the alphabetical order is ${temp.get(temp.size-1)}")
*/

    println("Type a word:")
    var input = readLine()!!
    input = readLine()!!

    println("$input")
    val reverse = input.reversed()
    if(input == reverse)
    {
        println("The word $input is palindrome")
    }
    else
    {
        println("Is not")
    }


    println("Type the first number:")
    var x = readLine()!!.toInt()
    val temp = emptyArray<Int>()
    temp.set(0,x)
    println("Type the second number:")
    x = readLine()!!.toInt()
    temp.set(1,x)
    println("Type the third number:")
    x = readLine()!!.toInt()
    temp.set(2,x)
    println("The largest number = ${temp}")


}