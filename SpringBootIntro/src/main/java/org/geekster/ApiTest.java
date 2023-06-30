package org.geekster;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiTest {

    String  name = "Poonam";

    Car c;
    @GetMapping("name")
    public String getName(){

//        return name;

        return c.get

    }

    @PutMapping("name")
    public void putName(){
        name = "";
    }
}
