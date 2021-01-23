package com.edu.udea.examenfinal.api;

import com.edu.udea.examenfinal.dto.Contacto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ContactApi {

    @GetMapping(value = "/contact")
    public Contacto info(){
        return new Contacto(10L, "Robin", "CGarcia", "+57 310 891 71 02", "robin.coronado@gmail");
    }
}
