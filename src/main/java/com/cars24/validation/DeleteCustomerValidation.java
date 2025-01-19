package com.cars24.validation;

import com.cars24.data.req.DeleteCustomerReq;
import com.cars24.data.res.CustomerProfileRes;

public class DeleteCustomerValidation {
    public void validateOnlyEmail(DeleteCustomerReq req) {
        validateEmail(req.getEmail());
    }
    public void validateOnlyPhone(DeleteCustomerReq req) {
        validatePhone(req.getPhone());
    }
    public void deleteCustomerValidator(DeleteCustomerReq deleteCustomerReq) {
        validatePhone(deleteCustomerReq.getPhone());
        validateEmail(deleteCustomerReq.getEmail());
    }
    private void validateEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email is null or empty");
        }
        if (!(email.contains("@") || email.contains("."))) {
            throw new IllegalArgumentException("Email contains invalid characters");
        }

    }
    private void validatePhone(String phone) {
        if (phone == null || phone.isEmpty()) {
            throw new IllegalArgumentException("Phone is null or empty");
        }
        if (phone.length() != 10) {
            throw new IllegalArgumentException("Phone length must be 10");
        }

    }
}
