package com.makingdevs

import spock.lang.*

class FullSpec extends Specification {

  def "Mostrar el ciclo de ejecución de spock" () {
    setup: "Inicializa los recursos para la especificación"
    and: "Más elementos de inicio"
    given: "Dado un elemento al inicio"
    and: "y algo mas al inicio"
    when: "Ejecutas una accioón"
    and: "Ejecutas otra otra opcion"
    expect: " Esperas un resultado"
    cleanup: "Limpias y reinicias los recuersos"
    where: "Tienes un conjunto de datos donde aplica para los casos que describas"
  }
}