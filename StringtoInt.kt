class StringtoInt {
}

fun main(args : Array<String>)
{
    //toInt() Usage of this keyword
    // we can also use try catch as expression

    var num : Int = 0;
    var str : String = "2a";

   // var alphaNum : Int = str.toInt();
    //println(alphaNum);

    //Exception Handling
    try {
        var alphaNum : Int = str.toInt();
        println("Input is Valid!");
    }
    catch(e : Exception){
        println("Your Input is Invalid, Please Enter a Valid String");
    }

}