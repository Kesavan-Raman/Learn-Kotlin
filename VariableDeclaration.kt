class VariableDeclaration
{
    var Name : String = "";

}

////Driver class
fun main(args: Array<String>)
{

    println("Hello, World")

    var driName = VariableDeclaration();
    driName.Name = "KessaBuddy";
    println("The Name is : ${driName.Name}");
}