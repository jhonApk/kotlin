package Fudamentos.NullSafety23

fun main() {
    var nome = "Marcos"
    //nome = null //erro de compilação, não aceita null

    var nomeNUll: String? = "Marcos" //jeito certo de declara uma variavel que aceita valor null
    nomeNUll = null

    //Se você tentar chamar fruta.length diretamente em uma variável anulável, o compilador mostrará um erro para proteger você


    //podemos usar o null com segurança fazendo uma verificação if (isso se chama Smart cast - Conversão segura)

    if (nomeNUll != null){
        println(nomeNUll.length)
    }


    println("========================== Safe Call =========================")
        // Operador de chamada segura ?.
    var frutas: String? = "Banana"
    //frutas= null

    val tamanho: Int? = frutas?.length //se fruta for null, tamanho recebe null

    println(tamanho)

    //Você pode até encadear chamadas seguras para navegar em estruturas mais complexas:

   //bob?.department?.head?.name // Retorna null se qualquer uma das propriedades for null [20, 21]


    println("======================= Elves Operator =========================")

    var testeElvis: String? = null

    //val enull = testeElvis ?: return println("é nulo")

    //println(enull)

    println("================================ Exercicios ==================================")
    var saborBolo: String? = null
    saborBolo = "Chocolate"
    println(saborBolo)

    val ingredientes: String? = null

    val letras: Int = ingredientes?.length ?: 0
    println(letras)

    println(saudarCliente(null))

}

fun saudarCliente(nome: String?) {
    if (nome != null) {
        // O Kotlin faz Smart Cast aqui! [4]
        println("Bem-vindo, " + nome.uppercase())
    } else {
        println("Cliente Anonimo")
    }
}
