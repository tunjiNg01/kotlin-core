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

    greet()
    fun sum(x: Int, y: Int) : Int {
        println("[$x] is: ...")
       return  (x + y)
    }

    // println(sum(23,45))

    fun printMessageWithPrefix(message: String, prefix: String = "Info") {
        println("[$prefix] $message")
    }

    printMessageWithPrefix(prefix = "Log", message = "Logged in to account" )
   // single expression function
    fun singleExp(x: Int, y: Int) = x + y
    // println(singleExp(y = 23, x = 28))


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}