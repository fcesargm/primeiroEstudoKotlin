

fun main(args:Array<String>){

    val cores = arrayListOf<String>()

    cores.add("Vermelha")
    cores.add("Branca")
    cores.add("Azul")
    cores.add("Preta")
    cores.add("Vermelha")

    cores.removeAt(4)



    cores.forEach {
        println(it)
    }


    println(cores.size)

}