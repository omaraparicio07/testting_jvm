package com.makingdevs

import spock.lang.*

class FirstSpec extends Specification {
  def "Foo first specification" () {
    expect:
      1 == 1
  }
}