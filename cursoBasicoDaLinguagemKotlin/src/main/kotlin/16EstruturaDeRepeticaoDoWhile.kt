
fun main(args: Array<String>){

    val numeros = arrayListOf<Int>()

    var i = 0
    do{
       numeros.add(++i)
    }while (numeros.size != 10)

    numeros.forEach(){
        println(it)
    }
}