package com.gokhan.daikitchi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {
  @RequestMapping("/")
  public String index(){
    return "Hello Gokhan";
  }

}
