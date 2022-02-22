package org.kassza.store;

import org.kassza.datamodel.CashRegister;

public class CashRegisterRepository {
  private static CashRegister cashReg = new CashRegister();

  public CashRegister get() {
    return cashReg;
  }

  public void add(CashRegister reg) {
    cashReg = reg;
  }
}
