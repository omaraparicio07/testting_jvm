package com.makingdevs.services;

import java.util.List;

public class TransactionService {

  public int countRecordsFor(String table) {
    if( table.equals("") || table == null)
      throw new RuntimeException("no hay tabla!!");
    return 0;
  }

  public List findAll() {
    throw new RuntimeException("Cannot find");
  }

}