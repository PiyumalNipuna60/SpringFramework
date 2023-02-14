package lk.ijse.sring.advisor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@CrossOrigin
public class AppWideException {

    @ExceptionHandler(RuntimeException.class)
    public void exceptionHandler(RuntimeException e){
        System.out.println(e.getMessage());
    }
}
