package Fudamentos.EstruturaDecisao

fun main() {
    resultadoNota(6.0)
}


fun parOuImpar(numero: Int): String{
    if (numero % 2 == 0){
        println("$numero é Par")
    }else{
        println("$numero é Impar")
    }

    return numero.toString()
}

fun resultadoNota(nota: Double) {
    if (nota >= 7){
         println("Aprovado com nota final de: $nota")
    }else if (nota >= 6 && nota < 7){
        print("Recuperação, Nota: $nota")
    }else {
        println("Reprovado, Nota: $nota")
    }

}

fun somaPar() {
    var soma = 0

    for (numero in  1..10){
        if (numero % 2 == 0){
            soma = soma + numero

        }
    }
    println(soma)
}