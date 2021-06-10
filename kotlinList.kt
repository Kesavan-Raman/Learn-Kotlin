class kotlinList {
}

fun main(args: Array<String>){
    //for creating a list we can use "listOf" Keyword, similar to range

    var kotList = listOf(1,2,3,4,5,6,7,8,9,10);

    println("the total of kotList is ${kotList.count()}");

    //if u want to print with indx u can use this method, "withIndex"
    for(i in kotList.withIndex())
    {
        println(i);
    }

    // u can also do like this (i, e) for printing with index, i for index and e for element
    for((i, e) in kotList.withIndex())
    {
        println("$i th Index is $e");
    }
}