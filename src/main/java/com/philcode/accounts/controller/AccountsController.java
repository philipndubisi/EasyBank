package com.philcode.accounts.controller;

import com.philcode.accounts.dto.CustomerDTO;
import com.philcode.accounts.dto.ResponseDTO;
import com.philcode.accounts.constants.AccountsConstants;
import com.philcode.accounts.service.IAccountsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping(
        path = "/api"
        ,produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountsController {
    private final IAccountsService iAccountsService;
    @PostMapping("/accounts")
    public ResponseEntity<ResponseDTO> createAccount(@RequestBody CustomerDTO customerDTO){
    iAccountsService.createAccount(customerDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDTO(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
    }
    public AccountsController(IAccountsService iAccountsService) {
        this.iAccountsService = iAccountsService;
    }
}
