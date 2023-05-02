fun main() {
    credentials("Deborah",20,"Kenya")
    println(calculateSum(2.0,1.2,4.0,3.1))
    val num1 = 4.5
    val num2 = 6.8
    val num3 = 2.1
    val num4 = 9.7
    val num5 = 3.2
    val avg = calculateAverage(num1, num2, num3, num4, num5)
    println("The average of $num1, $num2, $num3, $num4, and $num5 is $avg")

    val fullName = "Mercy Faith"
    val age = 30
    val phoneNumber = "+256 123 456 7890"
    val email = "mercy@gmail.com"
    val weight = 70.5
    val isUgandanCitizen = true

    val personRecord = createPersonRecord(fullName, age, phoneNumber, email, weight, isUgandanCitizen)
    println("Full name: ${personRecord["fullName"]}")
    println("Age: ${personRecord["age"]}")
    println("Phone number: ${personRecord["phoneNumber"]}")
    println("Email: ${personRecord["email"]}")
    println("Weight: ${personRecord["weight"]} kg")
    println("Is Ugandan citizen: ${personRecord["isUgandanCitizen"]}")
}



//1. Create and invoke a function that takes in a users name, age, and nationality and prints out “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and,“Kenya” it will print out “Hello my name is Lucy, I am 23 years old and I am from Kenya”

fun credentials(name:String,age:Int,nationality:String){
    println("Hello my name is $name, I am $age years old, and I am from $nationality")

}
//Create and invoke a function that returns the sum of any given 4 numbers
fun calculateSum(number1:Double,number2:Double,number3:Double,number4:Double):Double{
    var sum =number1+number2+number3+number4
    return sum
}


//Create and invoke a function that given any 5 numbers, it returns their average
fun calculateAverage(num1: Double,num2:Double,num3:Double,num4:Double,num5:Double):Double{
    val  sum = num1 + num2 + num3 + num4+num5
    val average = sum / 5
    return average

}
// You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not.
fun createPersonRecord(fullName: String, age: Int, phoneNumber: String, email: String, weight: Double, isUgandanCitizen: Boolean): Map<String, Any> {
    val personRecord = mutableMapOf<String, Any>()

    personRecord["fullName"] = fullName
    personRecord["age"] = age
    personRecord["phoneNumber"] = phoneNumber
    personRecord["email"] = email
    personRecord["weight"] = weight
    personRecord["isUgandanCitizen"] = isUgandanCitizen

    return personRecord
}





