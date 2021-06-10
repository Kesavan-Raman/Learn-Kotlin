class SwitchCase {

    //Empty Class
}

fun main(args: Array<String>)
{
    // in java c++ we have switch but in kotlin we have "when" eg : " when(caseNum) "
    // we can also use when as "Expression"

    var num : Int = 0;

    when (num)
    {
        //instead of "Case Keyword" we use "->" eg : " 1-> Statement "

        1 -> println("Case 1");
        2 -> println("Case 2");
        3 -> println("Case 3");
        4 -> println("Case 4");
        5 -> println("Case 5");
        else -> println("This is Default : Instead of 'default keyword' we use ELSE ");
    }
}