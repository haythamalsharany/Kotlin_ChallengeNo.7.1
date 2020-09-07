class MemberFun {
    private var funType = ""


    fun applyLambda() {

        var funType1 = { println("this is a lambda function") }
        funType = funType1().toString()
        println(funType)


    }

    inline fun applyInLinefun(str: String, myFun: (String) -> Unit) {
        myFun(str)
    }

    fun applyLocalFun() {
        funType = "this is a local function"
        fun printtype() {
            println(funType)

        }
        printtype()
    }
}


