package com.maxbelousov.user_survey_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("survey")
public class SurveyController {
  @GetMapping
  public String list(){
    return "index";
  }
}
