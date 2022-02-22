package org.kassza.spring;

import org.kassza.datamodel.Account;
import org.kassza.datamodel.CashRegister;
import org.kassza.service.CashRegisterService;
import org.kassza.store.CashRegisterRepository;

public class CashRegisterApplication {
  private static CashRegisterService service = new CashRegisterService();
  private static CashRegisterRepository repo = new CashRegisterRepository();

  public static void main(String[] args) throws Exception {

    repo.add(CashRegister.builder()
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
      .build());

    System.out.println(service.getAllMoney());
  }
}
