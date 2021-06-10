class DefaultParameter {
}

//suppose we have a double value wth int we can use this method "toInt()"

fun main(args : Array<String>)
{
    var finalAmt : Int = calcAmt(100,0.09)
    println(finalAmt);
}

//if u want to use this in java maens use can use this annotation "@Overloads"
//@Overloads
fun calcAmt(amt : Int, interest : Double = 0.04) : Int // Int is a return type
{
    return(amt+(amt*interest)).toInt();
}

// default parameter is like when u give a defalut value is like 0.04 is a default value suppose we are passing 0.09 means 0.09 will be act as parameter otherwile the 0.04 will be act as default parameter