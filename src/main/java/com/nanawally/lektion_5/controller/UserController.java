package com.nanawally.lektion_5.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
public class UserController {


    /* ResponseEntity
    * Extension of class HttpEntity that adds HttpStatusCode
    * HttpHeaders: allows us to edit the Response Header
    * If the need arises, the syntax goes as follows:
    *   new ResponseEntity(body, header, statusCode)
    * */
    @GetMapping("/ok")
    public ResponseEntity<String> getOk(){

        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/br")
    public ResponseEntity<String> getBadRequest(){

        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/ise")
    public ResponseEntity<String> getInternalServerError(){

        return ResponseEntity.internalServerError().build();
    }

    @GetMapping("/nf")
    public ResponseEntity<String> getNotFound(){

        return ResponseEntity.notFound().build();
    }

}
