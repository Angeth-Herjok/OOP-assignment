fun main() {
    var woman=Human("Angeth",22,52)
    woman.eat(foodweight = 5)

    woman.weight

    woman.speak(speech = "I am learnig Kotlin")

    woman.birthday(age = 22)

var theUser=User("Becky","Herjok","beckyherjok@gmail.com","0789654321","Angeth2022")

     println(theUser.email)
    println(theUser.lastName)
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodweight:Int){
        println("I am eating $foodweight kgs of food")
        var weight=52
        weight+=5
        println("$weight kgs")
    }
    fun speak(speech:String){
       println("I am learning Kotlin")
    }
    fun birthday(age: Int){
        var age=22
        age+=1
        println("$age")

    }
}


data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber: String,var passsword:String)