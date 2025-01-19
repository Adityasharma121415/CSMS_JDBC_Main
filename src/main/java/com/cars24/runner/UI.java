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
            req.setName(scanner.nextLine());
            System.out.println("Enter customer Email");
            req.setEmail(scanner.nextLine());
            System.out.println("Enter customer Address");
            req.setAddress(scanner.nextLine());
            System.out.println("Enter customer Phone Number");
            req.setPhone(scanner.nextLine());
            CustomerServiceImpl customerService = new CustomerServiceImpl();
            String result= customerService.register_customer(req);
            System.out.println(result);
        }

        public static void getCustomer()
        {
            System.out.println("Search customer details");
            CustomerProfileReq req = new CustomerProfileReq();
            System.out.println("Choose option:");
            System.out.println("1. Email");
            System.out.println("2. Phone");
            System.out.println("3. Both");
            int option = scanner.nextInt();
            scanner.nextLine();
            if(option == 1){
                System.out.println("Enter Email  : ");
                req.setEmail(scanner.nextLine());
            }else if(option == 2){
                System.out.println("Enter Phone  : ");
                req.setPhone(scanner.nextLine());
            }else if(option == 3){
                System.out.println("Enter Email  : ");
                req.setEmail(scanner.nextLine());
                System.out.println("Enter Phone  : ");
                req.setPhone(scanner.nextLine());
            }else{
                System.out.println("Invalid option");
            }
            CustomerServiceImpl customerService = new CustomerServiceImpl();
            CustomerProfileRes response = customerService.get_CustomerProfile(req);
            System.out.println(response.toString());

        }
        public static void deleteCustomer(){
            System.out.println("Enter customer details");
            System.out.println("Choose option:");
            System.out.println("1. Delete using Email");
            System.out.println("2. Delete using Phone");
            System.out.println("3. Delete using Both");
            int option = scanner.nextInt();
            scanner.nextLine();
            DeleteCustomerReq req = new DeleteCustomerReq();
            if(option == 1){
                System.out.println("Enter Email  : ");
                req.setEmail(scanner.nextLine());
            }else if(option == 2){
                System.out.println("Enter Phone  : ");
                req.setPhone(scanner.nextLine());
            }else if(option == 3){
                System.out.println("Enter Email  : ");
                req.setEmail(scanner.nextLine());
                System.out.println("Enter Phone  : ");
                req.setPhone(scanner.nextLine());
            }else{
                System.out.println("Invalid option");
            }
            CustomerServiceImpl customerService = new CustomerServiceImpl();
            String result= customerService.delete_CustomerProfile(req);
            System.out.println(result);
        }

    }

