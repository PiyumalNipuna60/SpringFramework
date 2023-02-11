package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/seven")
public class GController {

    @GetMapping
    public String testOne1() {
        return "GetMapping invoke..!";
    }


    //http://localhost:8080/mapping/seven?id=C001&name=IJSE
    //Narrow down request with query String Parameters

/*    //http://localhost:8080/12_Mapping_Spec/seven?id=C001&name=kamal
    @GetMapping(params = {"id","name"})
    public String testOne2(){
        return "GetMapping one invoke..!";
    }*/

/*    //http://localhost:8080/12_Mapping_Spec/seven?address=galle&salary=25000
    @GetMapping(params = {"address","salary"})
    public String testOne3(HttpServletRequest request){
        String address = request.getParameter("address");
        return "GetMapping Two invoke..! "+address;
    }*/

 /*   //How to get the values of query params in Java EE way
    @GetMapping(params = {"address","salary"})
    public String testTwo(HttpServletRequest request){
        String address = request.getParameter("address");
        return "Method Two Invoked "+address;
    }*/

/*    @GetMapping(params = {"id","name"})
    public String testOne4(@RequestParam String id,@RequestParam String name){
        return "GetMapping one invoke..!"+id+" "+name;
    }*/

    //    @RequestParam = not an required annotation

    @GetMapping(params = {"address","salary"})
    public String testonr5(String address,String salary){
        return "GetMapping one invoke..!"+address+" "+salary;
    }


}
