class CreateObjFromClass {
    public var intClsObj : Int = 10;
    public var strClsObj : String = "";

}

fun main(args: Array<String>)
{
    var mainObj1 = CreateObjFromClass();
    mainObj1.intClsObj = 20;

    println("Integer "+(mainObj1.intClsObj));

    var mainObj2 = CreateObjFromClass();
    mainObj2.strClsObj = "Anandi";

    println("String "+(mainObj2.strClsObj));
}