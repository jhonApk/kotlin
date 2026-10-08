package Fudamentos.NullSafety

fun main() {

    exemploLet()
}

fun exemploLet(){
    val convidado: String? = null

    convidado?.let {
        println("Bem vindo, $it")
    }
}