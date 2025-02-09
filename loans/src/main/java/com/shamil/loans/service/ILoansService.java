package com.shamil.loans.service;

import com.shamil.loans.dto.LoansDto;
import org.springframework.stereotype.Service;

public interface ILoansService {

    void createLoan(String mobileNumber);

    LoansDto fetchLoan(String mobileNumber);

    boolean updateLoan(LoansDto loansDto);


    boolean deleteLoan(String mobileNumber);
}
