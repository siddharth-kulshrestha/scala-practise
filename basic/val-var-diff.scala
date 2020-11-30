object ValVarDifference {
    def main(args:Array[String]) {
        println("Var Vs Val")
        val myFirstVariable: Int = 5
        println(myFirstVariable)

        // Variables defined with keyword val are immutable once they get a value they cannot be redefined.

        var mySecondVariable: Int = 6
        println(mySecondVariable)

        // Variables defined with keyword var are mutable and they can be reassigned.
        mySecondVariable = 4
        println(mySecondVariable)

        //myFirstVariable = 2
        println(myFirstVariable)
    }
}
