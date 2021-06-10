class FunctionExpressions {
}

//we can call the methods as functions, it is our wish we can call it as functions or methods

fun main(args: Array<String>)
{
    var trail1= add(4,5);
    println(trail1);

    var trail2= sub(114,53);
    println(trail2);

    var trail3 = maxNum(2, 9);
    println(trail3);
}

fun add(a : Int, b : Int) : Int   //this is how we pass the parameters, for returning we nee to mentions INT with semicolon
{
    var c : Int = a+b;
    return c;
}

//we can also return like this

fun sub(a: Int, b: Int) : Int = a-b // this is very simple method

//we cal also implement if -else also return

fun maxNum(a : Int, b : Int) : Int = if(a>b) a else b;
