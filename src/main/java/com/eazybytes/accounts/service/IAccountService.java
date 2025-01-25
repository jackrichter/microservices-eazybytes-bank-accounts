package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     * Creates a new account for a customer using the provided customer details.
     *
     * @param customerDto an object containing the customer's details such as name,
     *                    email, and mobile number.
     */
    void createAccount(CustomerDto customerDto);

    /**
     * Fetch account details customer dto.
     *
     * @param mobileNumber the mobile number
     * @return the customer dto
     */
    CustomerDto fetchAccountDetails(String mobileNumber);

    /**
     * Update account boolean.
     *
     * @param customerDto the customer dto
     * @return the boolean
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * Delete account boolean.
     *
     * @param mobileNumber the mobile number
     * @return the boolean
     */
    boolean deleteAccount(String mobileNumber);
}
