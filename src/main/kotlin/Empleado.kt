package org.example

open class Empleado(nombre: String, edad: Int, var salarioBase: Double, porcentajeImpuestos: Double): Persona(nombre, edad) {

    open val porcentajeImpuestos = 10.0

    open fun calcularSalario(): Double {
        return salarioBase * ((100.0 - porcentajeImpuestos) / 100.0)
    }

    fun trabajar(): String {
        return "$nombre está trabajando"
    }

    override fun toString(): String {
        return super.toString() + ", Salario: $salarioBase, impuestos: $porcentajeImpuestos"
    }

}