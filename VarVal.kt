class VarVal {
}

fun main(args: Array<String>)
{
    var Num1 : Int = 10; // var is a variable but Val is similar to "Final" Keyword, var or val must be lower case
    val Num2 : Int = 20;

    //we can also use if else as "Expresssions"
    if (Num1 > Num2){
        println("While comparing these $Num1 and $Num2 , the greater number is $Num1");
    }
    else{
        println("While comparing these $Num2 and $Num1 , the greater number is $Num2");
    }

    //Using if else as a "Expresssion"

    var trail : Int =  if (Num1 > Num2){
        Num1
    }
    else{
        Num2
    }
    println("This is Trail "+trail);

    // Or without declaring without INT directly we can write as "trail = if(){}"

}