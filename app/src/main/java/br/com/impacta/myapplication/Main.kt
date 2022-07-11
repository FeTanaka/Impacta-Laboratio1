package br.com.impacta.myapplication

fun main() {
    var valorProduto = 100.0
    var valorDesconto = 25.0

    var valorFinal = valorProduto * (1 - valorDesconto / 100.0)
    println("O valor final do produto é ${valorFinal}")
}