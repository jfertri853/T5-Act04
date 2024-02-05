package org.example

open class Persona(val nombre: String, var edad: Int) {

    fun celebrarCumple() {
        this.edad ++
    }

    override fun toString(): String {
        return "Nombre: ${nombre}, Edad: $edad"
    }


}