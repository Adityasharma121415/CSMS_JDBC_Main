package com.cars24.dao;

import com.cars24.data.req.AddCustomerReq;
import com.cars24.data.req.CustomerProfileReq;
import com.cars24.data.req.DeleteCustomerReq;
import com.cars24.data.res.CustomerProfileRes;

public interface CustomersDao {
    public String create_customer(String name, String phone, String email, String address);
    public String create_customerv2(String name, String phone, String email, String address);
    public String CreateCustomer(AddCustomerReq addCustomerReq);
    public CustomerProfileRes get_customer(CustomerProfileReq customerProfileReq);
    //public void update_customer();
    public String delete_customer(DeleteCustomerReq deleteCustomerReq);

}
