public class KotlinFuncInJava {
    public static void main(String[] args) {

        // calling a kotlin function in java class
        //for calling the kotlin function we need to use the kotlin file name with following its method

        //trick : suppose ur kotlin file is like "googly.kt" means then call the program as "googlyKt.method()"

        int i = FunctionExpressionsKt.maxNum(5, 10);  //tiered of "FunctionExpressionsKt" writtning this use this annotatoin in kotlin starting @file:JvmName("ProgramName")
        System.out.println(i);
    }
}
