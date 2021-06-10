class ConstructorInheritance {
    //todo something here...
}

open class Human()
{
    init {
        println("Hello this is human init");
    }
    open fun think()
    {
        println("I am Human and I am Thinking...");
    }
}

class Alien() : Human()
{
    init{
        println("hello this is in alien");
    }
    override fun think()
    {
        println("I am Programmer and I am Theoritically Thinking");
    }
}

fun main(args: Array<String>)
{
    var a1 : Human = Alien();
    a1.think();
}