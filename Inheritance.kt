class Inheritance {
   //todo some work here
}

//inheritance in kotlin by default are not allowed coz they are by default final Classes so we need to
//use the "open" keyword to achieve inheritance.

open class Human
{
    open fun think()
    {
        println("I am Normal Human and I am Thinking");
    }
}

//not like java we don't use the keyword "extends"
// we use the method in c++ like

class Alien : Human()
{
   // suppose we need to override means we explicitly say that
   // i am overriding by using the keyword "override"

    override fun think()
    {
        println("Now i am an Alien and now i am thinking like alien");
    }
}

fun main(args: Array<String>)
{
    var naman = Alien();
    naman.think();

    // in java we use like this
    // (java)   -->  Human h1 = new Alien();
    // (kotlin) -->  var naman : Human = Alien();

}