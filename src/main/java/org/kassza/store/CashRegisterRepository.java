package org.kassza.store;

import javax.annotation.PostConstruct;

import org.kassza.datamodel.Account;
import org.kassza.datamodel.CashRegister;
import org.springframework.stereotype.Service;

@Service
public class CashRegisterRepository {
  private static CashRegister cashReg = new CashRegister();

  public CashRegister get() {
    return cashReg;
  }

  public void add(CashRegister reg) {
    cashReg = reg;
  }

  @PostConstruct
  public void init() {
    cashReg = CashRegister.builder()
      .bank(Account.builder()
        .euro(1)
        .dollar(2)
        .forint(3)
        .build())
      .cash(Account.builder()
        .euro(3)
        .dollar(2)
        .forint(2)
        .build())
      .build();
  }
}
