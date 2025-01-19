package com.cars24.services;

import com.cars24.data.req.AddCustomerReq;
import com.cars24.data.req.CustomerProfileReq;
import com.cars24.data.req.DeleteCustomerReq;
import com.cars24.data.res.CustomerProfileRes;

public interface CustomerService {
    String register_customer(AddCustomerReq addCustomerReq);
    //for get (read) customer- we have to know what should be shown what not - cant just give the entire table with id etc
    //create another class for response just like addcustomerreq hence create another package res inside data like req

    CustomerProfileRes get_CustomerProfile(CustomerProfileReq customerProfileReq);
    String delete_CustomerProfile(DeleteCustomerReq deleteCustomerReq);
}
