package org.kassza.datamodel;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CashRegister {
  private Account cash;
  private Account bank;

  @Builder
  public CashRegister(Account cash, Account bank) {
    this.cash = cash;
    this.bank = bank;
  }

  public CashRegister() {
    this.cash = new Account();
    this.bank = new Account();
  }
}
