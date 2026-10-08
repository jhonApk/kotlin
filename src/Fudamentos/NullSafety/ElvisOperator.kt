package Fudamentos.NullSafety

fun main() {
    elvisOperator2()
}

fun elvisOperator(){
    val usuario: String? = null

    val nomeExibido: String = usuario ?: "Usuario desconecido"

    println(nomeExibido)

}

fun elvisOperator2(){
    val usuario: String? = "Marcos"

    val tamnhoNome = usuario?.length ?: "Tamanho nullo"

    println(tamnhoNome)

}