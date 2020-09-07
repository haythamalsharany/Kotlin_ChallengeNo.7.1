class StandardFun {
    data class Person(var name: String, var age: Int, var city: String)

    fun implemenLetFun() {
        Person("haytham", 27, "IBB").let {
            println(it)
            it.city = "sana\'a"
            it.age = 25
            println(it)
        }
    }

    fun implemenApplyFun() {
        Person("waheeb", 20, "taiz").apply {
            println(this)
            this.city = "aden"
            this.age = 22
            println(this)
        }
    }

    fun implemenRunFun() {
        Person("Eiz", 28, "taiz").run {
            println(this)
            this.city = "thamar"
            this.age = 29
            println(this)
        }
    }

    fun implemenwithFun() {


        val p = Person("Eiz", 28, "taiz")
        with(p) {
            println("with function is called ${this.toString()}")
            p.city = "aden"
            p.name = "rasheed"
            println("with function is called ${this.toString()}")
        }
    }

    fun implemenAlsoFun() {


        Person("wafa", 22, "taiz").also {
            println("also function is called befor : ${it.toString()}")
            it.city = "Ibb"
            it.age = 20
            println("also  function is called after: ${it.toString()}")
        }

    }

    fun implementTakeIfFun() {


        Person("wafa", 22, "taiz").takeIf {
            it.age == 22

        }

    }

}





