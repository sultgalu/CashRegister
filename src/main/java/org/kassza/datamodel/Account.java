package org.kassza.datamodel;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Account {

  private int dollar;
  private int euro;
  private int forint;

  @Builder
  public Account(int dollar, int euro, int forint) {
    this.dollar = dollar;
    this.euro = euro;
    this.forint = forint;
  }

  public Account() {
    this.dollar = 0;
    this.euro = 0;
    this.forint = 0;
  }

}
