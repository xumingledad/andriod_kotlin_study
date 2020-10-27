package android.example.learn_kotlin

import kotlin.math.max

fun main()
{
    val a=37
    val b=29
    val value =largernumber(a,b)
    val value1= maxnumber(a,b)
    println("large number is "+value1+" max number is"+value)
}
fun largernumber(num1 : Int, num2:Int):Int{
    return max(num1,num2)
}

fun maxnumber (num1: Int,num2: Int):Int=max(num1,num2)