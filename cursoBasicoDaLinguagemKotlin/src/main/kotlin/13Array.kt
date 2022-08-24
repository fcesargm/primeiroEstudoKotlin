import java.util.Arrays

fun main(args:Array<String>){

    //string[] paises = new String[]
    val paises = arrayOf("Angola", "Brasil", "Chile", "Colombia", "Eua")
    //val Paises = Array(12,{3})

    /*val pais1 = "Angola"
    val pais2 = "Brasil"
    val pais3 = "EUA"
    val pais4 = "Chile"*/

    //println(paises[0])

    //val item = paises[2]
    //println(item)

    //paises.reverse()
    /*for(i in paises.indices){
        println(paises[i])
    }*/
    paises.sortBy { it.length}
    paises.forEach {
        println("$it")
    }

    val posicao = Arrays.binarySearch(paises, "Chile")
    println("Chile está na posição: $posicao")



}