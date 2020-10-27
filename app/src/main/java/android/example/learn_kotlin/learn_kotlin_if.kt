package android.example.learn_kotlin

fun largernumberif(num1:Int, num2:Int):Int{
    val value =if (num1>num2){
        num1
    }else{
        num2
    }
    return value
}

fun largernumberif1(num1:Int, num2:Int):Int{
    return  if (num1>num2){
        num1
    }else{
        num2
    }

}
fun largernumberif2(num1:Int, num2:Int) = if (num1>num2)
{
        num1
    }else
{
        num2
}

fun largernumberif3(num1:Int, num2:Int) = if (num1>num2) num1 else num2
