package com.makingdevs

import spock.lang.*

class FullSpec extends Specification {

  @Unroll("Cuando #a se convierte a mayusculas es #b con longitud #result")
  def "Mostrar el ciclo de ejecución de spock" () {
    setup: "Inicializa los recursos para la especificación"
      println "Inicializando ..."
      String s = a
    and: "Más elementos de inicio"
      println "Inicializando algo mas"
    //given: "Dado un elemento al inicio (es igual al seup pero solo se puede usar uno a la vez)"
    //and: "y algo mas al inicio"
    when: "Ejecutas una acción"
      s = s.toUpperCase()
    and: "Ejecutas otra otra opcion"
      int size = s.size()
    then: " Esperas un resultado"
      size == result
      s == b
    cleanup: "Limpias y reinicias los recuersos"
      println "limpiando"
    where: "Tienes un conjunto de datos donde aplica para los casos que describas"
    a      | b        | result
    'hola' | 'HOLA'   | 4
    'mundo'| 'MUNDO'  | 5
  }
}