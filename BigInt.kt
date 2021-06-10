import java.math.*;

class BigInt {
//todo
}

fun main(args: Array<String>)
{
    var num = BigInteger("150") ;
    println(factorial(num));
}

fun factorial(num: BigInteger) : BigInteger
{
    if(num == BigInteger.ZERO)
    {
        return BigInteger.ONE;
    }
    else
    {
        return num * factorial(num-BigInteger.ONE);
    }
}