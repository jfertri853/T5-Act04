package org.example

fun main() {
    val empleado = Empleado("Pepe", 34, 1800.0, 100.0)
    val gerente = Gerente("Ana", 35, 2100.0, 0.0, 120.0, true)

    println(empleado.toString())
    println(gerente.toString())
}