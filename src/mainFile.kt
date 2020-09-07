fun main() {
    val stadard = StandardFun()
    val infix = InlixFun()
    val member = MemberFun()
    val userDefinedFun = UserDefinedFun()
    stadard.implemenApplyFun()
    stadard.implemenLetFun()
    stadard.implemenRunFun()
    stadard.implemenwithFun()
    stadard.implementTakeIfFun()
    stadard.implemenAlsoFun()


    infix.applyStandardInfix()
    infix.userInfixFun()

    member.applyInLinefun("haitham ameen", ::print)
    member.applyLambda()
    member.applyLocalFun()


    userDefinedFun.anonymousFun()
    userDefinedFun.anonymousInfFun()
    userDefinedFun.userDefine("user define function")
    println(userDefinedFun.userDefine1())


}