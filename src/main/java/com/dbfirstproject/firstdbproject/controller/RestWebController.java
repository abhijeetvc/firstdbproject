package com.dbfirstproject.firstdbproject.controller;

/**
 * Created by abhi on 23/07/18.
 */

import com.dbfirstproject.firstdbproject.message.Response;
import com.dbfirstproject.firstdbproject.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class RestWebController {

    List<Customer> cust = new ArrayList<Customer>();

    @GetMapping(value = "/all")
    public Response getResource() {
        Response response = new Response("Done", cust);
        return response;
    }

    @PostMapping(value = "/save")
    public Response postCustomer(
            @RequestBody Customer customer) {
        cust.add(customer);

        // Create Response Object
        Response response = new Response("Done",
                customer);
        return response;
    }
}