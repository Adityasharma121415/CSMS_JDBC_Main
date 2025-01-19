package com.cars24.services.Impl;

import com.cars24.dao.impl.CustomerDaoImpl;
import com.cars24.data.req.AddCustomerReq;
import com.cars24.data.req.CustomerProfileReq;
import com.cars24.data.req.DeleteCustomerReq;
import com.cars24.data.res.CustomerProfileRes;
import com.cars24.services.CustomerService;
import com.cars24.validation.AddCustomerValidation;
import com.cars24.validation.DeleteCustomerValidation;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDaoImpl customerDao= new CustomerDaoImpl();
    private AddCustomerValidation custValidator= new AddCustomerValidation();
    private DeleteCustomerValidation custDelValidator= new DeleteCustomerValidation();

    @Override
    public String register_customer(AddCustomerReq addCustomerReq) {
        try{
        custValidator.validate_AddCustomerReq(addCustomerReq); //first validate then create
            return customerDao.CreateCustomer(addCustomerReq);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }

    @Override
    public CustomerProfileRes get_CustomerProfile(CustomerProfileReq customerProfileReq){

        return customerDao.get_customer(customerProfileReq);

    }

    @Override
    public String delete_CustomerProfile(DeleteCustomerReq deleteCustomerReq) {
        //validation code to be written
        try{
            DeleteCustomerValidation custDelValidator= new DeleteCustomerValidation();
            if(deleteCustomerReq.getEmail()==null){
                custDelValidator.validateOnlyPhone(deleteCustomerReq);
            }else if(deleteCustomerReq.getPhone()==null){
                custDelValidator.validateOnlyEmail(deleteCustomerReq);
            }else{
                custDelValidator.deleteCustomerValidator(deleteCustomerReq);
            }
            return customerDao.delete_customer(deleteCustomerReq);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }


}
