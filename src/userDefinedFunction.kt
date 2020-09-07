class UserDefinedFun() {

    var funType = ""


    fun userDefine(type: String) {
        funType = "user define function with no return value"
        println(funType)
    }

    fun userDefine1(): String {
        funType = "user define function with no return value"
        return funType
    }

    fun anonymousFun() {

        var s: () -> String = {

            "anonymous function"
        }
        funType = s.toString()
        println("this is an  explicit type  $funType ")
    }

    fun anonymousInfFun() {

        var s = {

            "anonymous function"
        }
        funType = s.toString()
        println("this is an inference type  $funType ")
    }
}