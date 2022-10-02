package com.maxbelousov.user_survey_system.controller;

import com.maxbelousov.user_survey_system.entity.Survey;
import com.maxbelousov.user_survey_system.service.SurveyService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("survey")
public class SurveyController {

  private final SurveyService surveyService;
  @GetMapping
  private List<Survey> getAllSurveys(){
    return null;
  }

}
