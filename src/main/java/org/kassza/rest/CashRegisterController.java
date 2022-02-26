package org.kassza.rest;

import org.kassza.service.CashRegisterService;
import org.kassza.store.CashRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController()
@RequestMapping(path = "/cashreg")
public class CashRegisterController {

  @Autowired
  private CashRegisterRepository repo;
  @Autowired
  private CashRegisterService service;

  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "Sikeres lekérdezés", content = {
      @Content(mediaType = "application/json") }),
  })
  @Operation(summary = "Szabad asztalok lekérdezése")
  @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
  public int getAllMoney() {
    return this.service.getAllMoney();
  }
}
