// it is called as primary constructor

class MakeConstructer constructor(var n : String)
{
    var name : String = n;
    init {
        println("This init method is used for block of code that has to be run always")
    }

    //creating a secondary constructor, with the help of using "constructor" keyword
    constructor(age : Int, name : String) : this(name)
    {
        println("the thing im passing is name = $name")
    }


    fun think()
    {
        println("I am Thinking......said by $name")
    }

}

fun main(args: Array<String>)
{
    var call = MakeConstructer("Kessa");
    call.think();
}