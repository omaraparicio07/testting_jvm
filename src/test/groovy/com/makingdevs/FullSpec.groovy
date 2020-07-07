package com.makingdevs

import spock.lang.*

class FullSpec extends Specification {

  def "Mostrar el ciclo de ejecución de spock" () {
    setup: "Inicializa los recursos para la especificación"
      println "Inicializando ..."
      String s = "Hola Mundo"
    and: "Más elementos de inicio"
      println "Inicializando algo mas"
    //given: "Dado un elemento al inicio (es igual al seup pero solo se puede usar uno a la vez)"
    //and: "y algo mas al inicio"
    when: "Ejecutas una acción"
      s = s.toUpperCase()
    and: "Ejecutas otra otra opcion"
      int size = s.size()
    then: " Esperas un resultado"
      size == 10
      s == "HOLA MUNDO"
    cleanup: "Limpias y reinicias los recuersos"
      println "limpiando"
    where: "Tienes un conjunto de datos donde aplica para los casos que describas"
  }
}