package com.ivoronline.springboot_swagger_post.controllers;

import com.ivoronline.springboot_swagger_post.DTO.PersonDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
public class MyController {

  //=========================================================================
  // ADD PERSON
  //=========================================================================
  @PostMapping("AddPerson")
  String addPerson(@RequestBody PersonDTO personDTO) {

    //GET DATA FROM PersonDTO
    String  name = personDTO.name;
    Integer age  = personDTO.age;

    //RETURN SOMETHING
    return name + " is " + age + " years old";

  }

}
