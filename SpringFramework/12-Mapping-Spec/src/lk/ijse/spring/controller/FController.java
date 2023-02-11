package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/six")
public class FController {

    @GetMapping
    public String testOne1() {
        return "GetMapping invoke..!";
    }

    //Duel Wild Card Mapping
    //0  or more inside a segment or more segments


    //http://localhost:8080/12_Mapping_Spec/six/sss/ss/path/A/B  //wrong
    //http://localhost:8080/12_Mapping_Spec/six/path//ssA/A/B  //ok
    //http://localhost:8080/12_Mapping_Spec/six/path//ssA/aaa/A/B  //ok

    @GetMapping("/path/**/A/B")
    public String testone1(){
        return "GetMapping Method 1 invoke..!";
    }

    //http://localhost:8080/12_Mapping_Spec/six/sss/ss/path/A/B  //ok
    //http://localhost:8080/12_Mapping_Spec/six/sss/path/A/B  //ok

    @GetMapping("/**/path/A/B")
    public String testone2(){
        return "GetMapping Method 2 invoke..!";
    }

}
