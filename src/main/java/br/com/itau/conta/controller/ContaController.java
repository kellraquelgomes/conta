package br.com.itau.conta.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping(value="/api")
public class ContaController {

    @GetMapping("/v1/contas/{idConta}/limite")
    public ResponseEntity< BigDecimal > consultarLimiteConta(@PathVariable(value = "idConta") String idConta){

        BigDecimal limite = new BigDecimal(200.00);
        return new ResponseEntity<BigDecimal>(limite, HttpStatus.OK);
    }

}
