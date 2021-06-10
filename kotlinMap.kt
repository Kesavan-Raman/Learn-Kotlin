import java.util.*

class kotlinMap {
}

fun main(args: Array<String>)
{
    //same as range and listof
    var myMap = TreeMap<String, Int>();
    //we don't need any add or put methods, we can implement like this

    myMap["Kessa"] = 100;
    myMap["Shivani"] = 101;
    myMap["Ramya"] = 102;
    myMap["Selva"] = 103;

    println(myMap);

    //we can also use for loop for printing the values
    for ((name, roll) in myMap)
    {
        println("the Name is $name and the Roll No is $roll")
    }



}