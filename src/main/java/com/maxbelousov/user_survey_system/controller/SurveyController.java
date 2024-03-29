package com.maxbelousov.user_survey_system.controller;

import com.maxbelousov.user_survey_system.entity.Survey;
import com.maxbelousov.user_survey_system.service.SurveyService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/surveys", produces = MediaType.APPLICATION_JSON_VALUE)
public class SurveyController {

  private final SurveyService surveyService;

  /**
   * Returns all surveys.
   */
  @GetMapping("/all")
  public List<Survey> getAllSurveys() {
    return surveyService.getAllSurveys();
  }

  /**
   * Returns survey by id.
   */
  @GetMapping("/{surveyId}")
  public Survey getSurveyById(@PathVariable("surveyId") Long surveyId) {
    return surveyService.getSurveyById(surveyId);
  }

  /**
   * Create a new Survey.
   */
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Survey createSurvey(@RequestBody Survey survey) {
    return surveyService.saveSurvey(survey);
  }

  /**
   * Updates survey.
   */
  @PutMapping("/{surveyId}")
  public Survey updateSurvey(
      @PathVariable("surveyId") Long surveyId,
      @RequestBody Survey survey
  ) {
    return surveyService.updateSurveyById(survey, surveyId);
  }

  /**
   * Deletes survey.
   */
  @DeleteMapping("/{surveyId}")
  public void deleteSurvey(@PathVariable("surveyId") Long surveyId) {
    surveyService.deleteSurveyById(surveyId);
  }

}
