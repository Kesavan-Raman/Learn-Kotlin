class ExtensionFunction {
    public var JustName : String? = null;

    fun show()
    {
        println(JustName);
    }

}


fun main(args: Array<String>)
{
    var a1 = ExtensionFunction();
    a1.JustName = "Sita";
    a1.show();

    var a2 = ExtensionFunction();
    a2.JustName = "Ram";
    a2.show();

    var a3 = a1.plus(a2); //"plus" can be anything, we can also put any oter name too
    println(a3);
    a3.show();
}

fun ExtensionFunction.plus(a : ExtensionFunction) : ExtensionFunction // use "operator" or "infix" keyword before the fun
{
    var r1 = ExtensionFunction();
    r1.JustName = (this.JustName +" "+ a.JustName);
    return r1;
}