class LoopsAndRange {
}

fun main(args: Array<String>)
{
    var iVar : Int = 10;

    // while loop is same as in C C++ or java

    while(iVar<11)
    {
        println("$iVar is less than 11")
        iVar++;
    }

    //** Do while loop ** loop are also similar to  java or cpp but one condition has been executed

    //But for ""for loop "" it is like some how similar to python, lets see if

    var fLoop  = 10 downTo 1;  // This is concept of RANGE, so here noo need to initialize as INT or STRING likethis, for decending operation we need to use "downTo" keyword

    for(a in fLoop step 3) //we can also include keyword "STEP"
    {
        println("$a")
    }
}