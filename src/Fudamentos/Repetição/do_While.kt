package Fudamentos.Repetição

fun main() {
    testeDoWhile()
}

fun testeDoWhile(){
    var count = 0

    do {
        println("Começando a contagem: ")
        println(count)
        count++
    }while (count >= 10)
}