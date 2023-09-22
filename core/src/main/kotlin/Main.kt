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
    println(juiceMenu.keys)
    println(juiceMenu.values)

    println("orange" in readOnlyJuiceMenu.keys)
// true
    println(200 in readOnlyJuiceMenu.values)
// false

   // println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}