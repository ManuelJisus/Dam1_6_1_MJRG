fun main() {

}
//Teoria 1ª herencia:
/*Esta clase de herencia seria Especialización, Siendo Perro la clase padre y las dos siguientes las hijas especializando
que caracteristicas tiene el perro dependiendo de su raza, se podia implementar con clases separadas pero perderia el beneficio
 de tener en comun ciertas propiedades o funciones(añadibles aunque aqui no esten) que le aporta el padre. */
open class Perro(
    var altura: Int,
    var peso: Int,
    var edad: Int
) {

}

class Doverman(altura: Int, peso: Int, edad: Int, var RaboyOrejas: String, var color: String = "marron") :
    Perro(altura, peso, edad) {

}

class Pitbull(altura: Int, peso: Int, edad: Int, var agresivo: String = "si", var cantidadDientes: Int) :
    Perro(altura, peso, edad) {

}
//Teoria del segundo ejemplo de herencias:
/* Este tipo de Herencia va a ser Extension, en la cual los tipos de examenes hijos le añaden
funcionalidades a la clase padre Examen, para implementarlo de otra manera se pueden diferenciar los distintos examenes y luego conectarlos
a traves de ptra clase conectora. aun asi considero que en este caso la herencia te da la ventaja de añadir funcionalidades a distintas clases
compartiendo unas en comun.*/

open class Examen(var preguntasTeoria: Int, var preguntasPracticas: Int, var puntuacionSobre: Int) {

}

class ExamenMasRecu(
    preguntasTeoria: Int,
    preguntasPracticas: Int,
    puntuacionSobre: Int,
    var temaEvau: Int,
    var temaRecu: Int
) : Examen(preguntasTeoria, preguntasPracticas, puntuacionSobre) {
    fun calcularNota(): Int {
        return ((preguntasPracticas + preguntasTeoria) / puntuacionSobre) * (temaEvau + temaRecu)
    }
}

class ExamenAmplia(
    preguntasTeoria: Int,
    preguntasPracticas: Int,
    puntuacionSobre: Int,
    var temaEvau: Int,
    var temaAmpli: Int,
    var porcentajeDeSubida: Int
) : Examen(preguntasTeoria, preguntasPracticas, puntuacionSobre){
    fun notaAmpliada(): Int{
        return (preguntasPracticas + preguntasTeoria) * porcentajeDeSubida
    }
}
