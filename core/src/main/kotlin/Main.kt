import java.util.Date

class  Portal(val url: String, val publishAt: String) {
    fun showUrl() : String {
        return this.url
    }

    fun saySomething() : String {
        return "Oops main method called"
    }
}

data class  User(val id: Int, val name: String, val age: Int)

fun main(args: Array<String>) {
    // constant val immutable
    // variable var mutable
    var attendance: Int = 24
    attendance = 34
   // println("The number of pupil in the class is: $attendance")
    //println("Hello World!")

    val d: Long = 100_000_000_000_000

    // list
    // Immutable List
    val list: List<String> = listOf("Hello", "Tunji")

    // Mutable List
    val mutableList: MutableList<String> = mutableListOf("Home", "Abroad", "UK")
    mutableList.add("Halloween")
   // println(mutableList)

    // println(list)

    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    val findFruit = "apple" in fruit
   // println(findFruit)
  //  println(fruit)


    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
   // println(readOnlyJuiceMenu)
    // {apple=100, kiwi=190, orange=100}

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    juiceMenu.put("Coconut", 350)

    juiceMenu.remove("orange")
    println(juiceMenu.containsKey("apple"))
   // println(juiceMenu.keys)
   // println(juiceMenu.values)

   // println("orange" in readOnlyJuiceMenu.keys)
// true
  //  println(200 in readOnlyJuiceMenu.values)
// false

    // Control flow in kotlin

    val name = "1"

   val result = when(name) {
        "Tunji" -> {
            println(name)
        }
        "1" -> println(1)
        else -> {
            println("unknown object")
        }
    }

    val temp = 18

    val description = when {
        // If temp < 0 is true, sets description to "very cold"
        temp < 0 -> "very cold"
        // If temp < 10 is true, sets description to "a bit cold"
        temp < 10 -> "a bit cold"
        // If temp < 20 is true, sets description to "warm"
        temp < 20 -> "warm"
        // Sets description to "hot" if no previous condition is satisfied
        else -> "hot"
    }
  //  println(description)
   // println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")

    for (i in 5 downTo 1 step 2){
     //   println(i)
    }

    for (j in 'a'..'d') {
      //  println(j)
    }

    var cakesEaten = 0
    while (cakesEaten < 3) {
        // println("Eat a cake")
        cakesEaten++
    }

    // functions
    fun greet() {
        println("Good morning Tunji")
    }

   // greet()
    fun sum(x: Int, y: Int) : Int {
        println("[$x] is: ...")
       return  (x + y)
    }

    // println(sum(23,45))

    fun printMessageWithPrefix(message: String, prefix: String = "Info") {
        println("[$prefix] $message")
    }

   // printMessageWithPrefix(prefix = "Log", message = "Logged in to account" )
   // single expression function
    fun singleExp(x: Int, y: Int) = x + y
    // println(singleExp(y = 23, x = 28))

    // assign lamba expression
    val changeToUpper = {param: String -> param.uppercase()}
   // println(changeToUpper("Hello Lamba"))
    // passing lambda expression
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positiveNum = numbers.filter { x -> x > 0 }
   // println(positiveNum)
   // println(list.map { x -> x.uppercase() })

    // Returning a lambda
    fun timeConversion(time: String) : (Int) -> Int = when(time) {
        "minute" -> {value -> value * 60 * 60}
        "seconds" -> {value -> value * 60 * 60 }
        "milliseconds" -> {value -> value * 60 * 60 * 1000}
        else -> {value -> value}
    }

    val func = timeConversion("minute")
    // println(func(2))

    // Extension
    fun Portal.swap() {
        println("[log]: ${this.url}")
    }

    fun Portal.saySomething() : String {
        return "Oops extension method is called"
    }


    val portal: Portal = Portal("www.tunji.com", "2334")
    // println(portal.url)
    //println(portal.showUrl())
    // portal.swap()
    // println(portal.saySomething())

    // data class
    val userOne = User(1, "Ade", age = 20)

    val  classConcept = ClassConcept(name = "Tunji Hammed", age = 23, address = "1123 drive park way")
    val x = NewClassB(name = "Ade")
    // println(x.draw())
    val pro = ProtocolState.WAITING
    println(pro.signal())



    // println(userOne.toString())
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}