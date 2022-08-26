
fun main(args: Array<String>){

    val numeros = arrayListOf<Int>()

    var i = 0
    while (numeros.size != 10){
        numeros.add(++i)
        
    }

    numeros.forEach(){
        println(it)
    }
}