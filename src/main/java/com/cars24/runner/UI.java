package com.cars24.runner;

import com.cars24.data.req.AddCustomerReq;
import com.cars24.data.req.CustomerProfileReq;
import com.cars24.data.req.DeleteCustomerReq;
import com.cars24.data.res.CustomerProfileRes;
import com.cars24.services.Impl.CustomerServiceImpl;

import java.util.Scanner;

public class UI {
        private static  final Scanner scanner  = new Scanner(System.in);
        public static void addCustomer()
        {
            System.out.println("Enter customer details");
            AddCustomerReq req = new AddCustomerReq();
            System.out.println("Enter customer Name");
            req.setName(scanner.next());
            System.out.println("Enter customer Email");
            req.setEmail(scanner.next());
            System.out.println("Enter customer Address");
            req.setAddress(scanner.next());
            System.out.println("Enter customer Phone Number");
            req.setPhone(scanner.next());
            CustomerServiceImpl customerService = new CustomerServiceImpl();
            String result= customerService.register_customer(req);
            System.out.println(result);
        }

        public static void getCustomer()
        {
            System.out.println("Search customer details");
            CustomerProfileReq req = new CustomerProfileReq();

            System.out.println("Enter Email  : ");
            req.setEmail(scanner.next());

            System.out.println("Enter Phone  : ");
            req.setPhone(scanner.next());

            CustomerServiceImpl customerService = new CustomerServiceImpl();
            CustomerProfileRes response = customerService.get_CustomerProfile(req);
            System.out.println(response.toString());

        }
        public static void deleteCustomer(){
            System.out.println("Enter customer details");
            DeleteCustomerReq req = new DeleteCustomerReq();
            System.out.println("Enter customer Email");
            req.setEmail(scanner.next());
            System.out.println("Enter customer Phone Number");
            req.setPhone(scanner.next());
            CustomerServiceImpl customerService = new CustomerServiceImpl();
            String result= customerService.delete_CustomerProfile(req);
            System.out.println(result);
        }

    }

