package Fudamentos.NullSafety

// ? safe call

fun main() {
    nulloSafecall()
}

fun nulloSafecall (){
    var nome: String?  = "Jhonnathan"

    val tamanho: Int? = nome?.length

    println(tamanho)
}



