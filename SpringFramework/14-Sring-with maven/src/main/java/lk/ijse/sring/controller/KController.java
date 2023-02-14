package lk.ijse.sring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
@CrossOrigin // allow CrossOrigin access for this controller
//No need to set Access-Control-Headers anymore
public class KController {

    //query String
    //x-www-form-url-encoded
//   @PostMapping
//   public void saveCustomer(String id,String name,String address,double salary){
//      System.out.println(id+" "+name+" "+address+" "+salary);
//      System.out.println("Wade goda");
//   }

    //What if we use encapsulation to catch above details
    //which came here with x-www-form-url-encoded format
    //Query String also can be fetched by dto
    @PostMapping
    public void saveCustomer(@ModelAttribute CustomerDTO dto){

        System.out.println(dto.toString());
    }

    // @RequestParam (queryString/x-www) (not required)
    // @ModelAttribute (queryString/x-www) (not required)

}
