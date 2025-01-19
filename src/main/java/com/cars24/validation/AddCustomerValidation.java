package com.cars24.validation;

import com.cars24.data.req.AddCustomerReq;

public class AddCustomerValidation {
    public void validate_AddCustomerReq(AddCustomerReq addCustomerReq){
        validate_CustomerName(addCustomerReq.getName());
        validate_CustomerEmail(addCustomerReq.getEmail());
        validate_Phone(addCustomerReq.getPhone());
        //not null, length 3- max 100, custom exception create
    }

    private void validate_CustomerName(String name){
        if (name== null){
            throw new IllegalArgumentException("Name cannot be EMPTY");
        }
        if (name.length()<3  || name.length()> 100){
            throw new IllegalArgumentException("Name should be 3 chars minimum or 100 chars max");
        }
    }

    private void validate_CustomerEmail(String email){
        if (email == null){
            throw new IllegalArgumentException("Email cannot be EMPTY");
        }
        if (email.length()<3  || email.length() > 100){
            throw new IllegalArgumentException("Email should be 3 chars minimum or 100 chars max");
        }
        if (!email.contains("@")){
            throw new IllegalArgumentException("Email contains invalid characters");
        }
        if (!email.contains(".")){
            throw new IllegalArgumentException("Email contains invalid characters");
        }

    }
    private void validate_Phone(String Phone){
        if (Phone == null || Phone.length()!=10){
            throw new IllegalArgumentException("Phone should be 10 digits");
        }
    }

}
