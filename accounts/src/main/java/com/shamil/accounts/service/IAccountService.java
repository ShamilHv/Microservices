package com.shamil.accounts.service;

import com.shamil.accounts.dto.CustomerDto;

public interface IAccountService {
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccountDetails(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);

}
