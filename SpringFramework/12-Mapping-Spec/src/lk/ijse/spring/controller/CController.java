package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/three")
public class CController {

   // http://localhost:8081/12_Mapping_Spec/three/id/C002/Kamal
    @GetMapping(path = "/id/{C001}/{Dasun}")
    public String testOne(@PathVariable("C001") String id,@PathVariable("Dasun") String name) {
        System.out.println(id+" "+name);
        return "GetMapping 1 invoke..!";
    }

/*
    // http://localhost:8081/12_Mapping_Spec/three/id/C001/Dasun
    @GetMapping(path = "/id/C001/Dasun")
    public String testOne2() {
        return "GetMapping 2 invoke..!";
    }*/

   /*    @GetMapping(path = "/id/{C001}/{Dasun}")
    public String testOne(@PathVariable("C001") String id, String name) {// name null
        System.out.println(id+" "+name);
        return "GetMapping 1 invoke..!";
    }*/


    //furthermore if we want we can validate the path variables as
    // we wanted
    //{id : [a-z]{2}} -> validate with reg ex

    //http://localhost:8080/mapping/three/id/C002/Uvindu //Ok
    //http://localhost:8080/mapping/three/id/CKK2/U38383 // wrong
    @GetMapping(path = "/id/{id:[C]{1}[0-9]{3}}/{name:[A-Z]{4}}") //()
    public  String testOne22(@PathVariable String id,@PathVariable String name){
        return "Get Method 1 Invoked "+id+" "+name;
    }


}
