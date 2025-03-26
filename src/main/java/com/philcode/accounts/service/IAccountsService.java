package com.philcode.accounts.service;

import com.philcode.accounts.dto.CustomerDTO;

public interface IAccountsService {
    void createAccount(CustomerDTO customerDTO);
}
