package com.cars24.validation;

import com.cars24.data.req.DeleteCustomerReq;
import com.cars24.data.res.CustomerProfileRes;

public class DeleteCustomerValidation {
    public void deleteCustomerValidator(DeleteCustomerReq deleteCustomerReq) {
        if(!(validateEmail(deleteCustomerReq.getEmail()) || validatePhone(deleteCustomerReq.getPhone()))){
            throw new IllegalArgumentException("Invalid email or phone number");
        }
    }
    private boolean validateEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email is null or empty");
        }
        if (!(email.contains("@") || email.contains("."))) {
            throw new IllegalArgumentException("Email contains invalid characters");
        }
        return true;
    }
    private boolean validatePhone(String phone) {
        if (phone == null || phone.isEmpty()) {
            throw new IllegalArgumentException("Phone is null or empty");
        }
        if (phone.length() != 10) {
            throw new IllegalArgumentException("Phone length must be 10");
        }
        return true;
    }
}
