class NamedParameters {
}

//suppose we have a double value wth int we can use this method "toInt()"

//it is used for naming convenctions we can also inter change the parameters of object and function parameter

fun main(args : Array<String>)
{
    var finalAmt : Int = amount(interest = 0.05, amt = 150);
    println(finalAmt);
}

fun amount(amt : Int, interest : Double = 0.04) : Int
{
    return(amt+(amt*interest)).toInt();
}
