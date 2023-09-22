fun main(args: Array<String>) {
    // constant val immutable
    // variable var mutable
    var attendance: Int = 24
    attendance = 34
    println("The number of pupil in the class is: $attendance")
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}