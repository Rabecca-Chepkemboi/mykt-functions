fun main(){
    isEven(23)

    var x = calculateArea(2.3, 7.0)
    println(x)

    var y = reverseString("hello class")
    println(y)

    var z = length("hello AkiraChix")
    println(z)

    numbers(2.3f, 1.2f)
}

//Write a function named isEven that takes an Int parameter and
//prints out true if the number is even, and false otherwise.

fun isEven(nums: Int){
    if(nums % 2 == 0){    //use conditions(if, else to check even and odd)
        println("even")   //if the number is divided by two and returns zero it's(even)
    }
    else{
        println("false")
    }
}


//Write a function named calculateArea that takes two Double parameters
//base and height and returns the area of a triangle using the formula
//(base * height) / 2.

fun calculateArea(base: Double, height: Double): Double{
    return (base * height)/2
}


//Write a function named reverseString that takes a String parameter
//and returns the reverse of the string.

fun reverseString(name: String): String{
        return(name.reversed())   // use .reversed an inbuilt function to reverse the string
}


//Write a function that takes in a String and returns its length
fun length(len:String):Int{
    var leng= len.length      //use .length an inbuilt function to find the length of a character
    return leng
}


//Kotlin Program to Multiply two Floating Point Numbers
fun numbers(x: Float, y: Float) {
    val product = x * y                     //pass in the parametres and siign it's datatype names then print and call the function
    println("the product is: $product")
}


                 //TAKEAWAY KEYS
// 1. when calling a function you need to pass in the arguments that matches the functions parametres type and order
// 2. a function can take more than two input parametres and cannot return a value
// 3. when calling a function gives it a variable name for it to be stored in memory

