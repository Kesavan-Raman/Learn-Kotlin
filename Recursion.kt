class Recursion {
    //todo
}

fun main(args: Array<String>)
{
    var num = 5;
    println(factorial(num));
}

fun factorial(num: Int) : Int
{
    if(num == 0)
    {
        return 1;
    }
    else
    {
        return num * factorial(num-1);
    }
}

//but unfortunately we can't use this for bigger number like 1000
//so we can use a class called BIGINTEGER, let's see that implementation in "bigimplementation program"

