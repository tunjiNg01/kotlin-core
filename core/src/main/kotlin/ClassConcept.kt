abstract class Contract {
   abstract fun openContract()
   fun closeContract(){}
}

open  class Employee {

}

// By default classes are but you need to make open so we can access the property
class  NewClass : Employee() {}
open class ClassConcept constructor(val name: String): Contract() {
   //  val name: String = name
   open val vertexCount: Int = 0
    open val color: String get() = "RGB(120, 00, 340)"
    var uiScren: Int  = 1
        set(value) { field = value }

    // any runable code goes in here
    init {
        println("Initiating object...")
    }

    constructor(name: String,  age: Int) : this(name){
        println("Constructor initiating...")
    }

    constructor(name: String, age: Int, address: String) : this(name,age) {
        println("initiating constructor three...")
    }

    override fun openContract() {
        TODO("Not yet implemented")
    }

    open fun draw(){
        println("Now drawing the graphics...")
    }

}

class NewClassB : ClassConcept{
    var stringRepresentation: String
        get() = this.toString()
        set(value) {
            // value // parses the string and assigns values to other properties
        }
    constructor(name: String) : super(name)
    constructor(name: String, age: Int) : super(name, age)
    constructor(name: String, age: Int, address: String) : super(name, age, address)

    override fun draw() {
        println("derived drawing... ")
    }
}

open class Rectangle {
    open fun draw() { /* ... */ }
}

interface Polygon {
    fun draw() { /* ... */ } // interface members are 'open' by default
}

class Square() : Rectangle(), Polygon {
    // The compiler requires draw() to be overridden:
    override fun draw() {
        super<Rectangle>.draw() // call to Rectangle.draw()
        super<Polygon>.draw() // call to Polygon.draw()
    }
}

interface  School {
    fun enrol()
    val numOfClassRoom: Int
    val propertyWithImplementation: String
        get() = "foo"
}
interface NestSchool {
    val age: Int
}
interface NewSchool : NestSchool {
    val  schoolName: String

}

class DEFS: NewSchool {
    override val schoolName: String
        get() = "hello"
    override val age: Int
        get() = 23
}
class  ABCSchool : School {
    override val numOfClassRoom: Int
        get() = 25

    override fun enrol() {
        println("Enrolment begins...")
    }

    override val propertyWithImplementation: String
        get() = super.propertyWithImplementation
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Protocol {
    WAITING {
          fun signal() = WAITING
       },

}

enum class ProtocolState {
    WAITING {
        override fun signal(): String {
            return "T"
        }
    },

    TALKING {
        override fun signal(): String {
            return "Telloport"
        }
    };

    abstract fun signal(): String
}