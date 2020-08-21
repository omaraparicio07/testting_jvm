package com.makingdevs.services
package

import spock.lang.*


class TransactionServiceSpec extend Specification {

  TransactionService service = new TransactionService()

  def "Cuenta los registros para una tabla no esperada" (){
    given:
      String tableName = null
    when:
      service.countRecordsFor(tableName)
    then:
      throw RuntimeException
  }

}