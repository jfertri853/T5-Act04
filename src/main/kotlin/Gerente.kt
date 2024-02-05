package org.example

class Gerente(nombre: String, edad: Int, salarioBase: Double, porcentajeImpuestos: Double, val bonus: Double, exentoImpuestos: Boolean): Empleado(nombre, edad, salarioBase, porcentajeImpuestos) {

    override val porcentajeImpuestos = 33.99

    var exentoImpuestos = false

    override fun calcularSalario(): Double {
        return if (exentoImpuestos) {
            salarioBase + bonus
        } else {
            super.calcularSalario() + bonus
        }
    }

    fun administrar(): String {
        return "$nombre está administrando"
    }

    override fun toString(): String {
        return super.toString() + ", bonus: $bonus"
    }

}