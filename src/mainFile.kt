fun main() {
    val stadard = StandardFun()
    val infix = InlixFun()
    val member = MemberFun()
    val userDefinedFun = UserDefinedFun()

    println("------------------------stadard function----------------")
    stadard.implemenApplyFun()
    stadard.implemenLetFun()
    stadard.implemenRunFun()
    stadard.implemenwithFun()
    stadard.implementTakeIfFun()
    stadard.implemenAlsoFun()

    println("------------------------infix function----------------")
    infix.applyStandardInfix()
    infix.userInfixFun()
    println("------------------------member function----------------")
    member.applyInLinefun("haitham ameen", ::print)
    member.applyLambda()
    member.applyLocalFun()
    println("------------------------user defined function----------------")

    userDefinedFun.anonymousFun()
    userDefinedFun.anonymousInfFun()
    userDefinedFun.userDefine("user define function")
    println(userDefinedFun.userDefine1())


}