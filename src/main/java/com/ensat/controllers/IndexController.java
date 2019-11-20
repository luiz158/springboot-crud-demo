package com.ensat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Homepage controller.
 */
@Controller
public class IndexController {

  @RequestMapping("/")
  String index() {
    return "index";
  }

}
