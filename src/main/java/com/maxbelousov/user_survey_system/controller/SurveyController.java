package com.maxbelousov.user_survey_system.controller;

import com.maxbelousov.user_survey_system.entity.Survey;
import com.maxbelousov.user_survey_system.service.SurveyService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/surveys", produces = MediaType.APPLICATION_JSON_VALUE)
public class SurveyController {

  private final SurveyService surveyService;

  /**
   * Returns all events.
   */
  @GetMapping("/all")
  private List<Survey> getAllSurveys() {
    return surveyService.getAllSurveys();
  }

}
