package com.example.fakestoreapp.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){ //ejecutar el código desde la consola
    /*GlobalScope.launch{ //ejecutar el código asíncrono
        println("Hola desde launch")
        delay(2000)
        println("Terminó de trarse los datos")
    }*/
    cAsync()

}

fun cLaunch(){
    runBlocking {
        launch {
//            println("Trayendo información de una API")
//            delay(2000)
//            println("Finalizó la consulta de la API")
            println("Mi super aplicacion")
            val data = consultaBaseDeDatos()
            println(data)
        }
    }
}

fun cAsync(){
    runBlocking {
        val result = async {
            println("Consultando datos")
            delay(3000)
            20
        }
        println(result.await())
    }

}

suspend fun consultaBaseDeDatos() : String{
    println("Consultando base de datos")
    delay(2000)
    return "Datos traidos"
}