package org.kassza.service;

import org.kassza.datamodel.Account;
import org.kassza.datamodel.CashRegister;
import org.kassza.datamodel.Currency;
import org.kassza.datamodel.StorageType;
import org.kassza.store.CashRegisterRepository;

public class CashRegisterService {
  private final CashRegisterRepository repo = new CashRegisterRepository();

  public int getAllMoney() {
    CashRegister reg = this.repo.get();
    int all = 0;
    all += reg.getBank().getDollar();
    all += reg.getBank().getEuro();
    all += reg.getBank().getForint();

    all += reg.getCash().getDollar();
    all += reg.getCash().getEuro();
    all += reg.getCash().getForint();

    return all;
  }

  public void add(int amount, Currency currency, StorageType storageType) {
    Account account = storageType == StorageType.Bank ? this.repo.get().getBank() : this.repo.get().getCash();

    switch (currency) {
      case Dollar:
        account.setDollar(account.getDollar() + amount);
        break;
      case Euro:
        account.setEuro(account.getEuro() + amount);
        break;
      case Forint:
        account.setForint(account.getForint() + amount);
        break;
    }
  }
}
