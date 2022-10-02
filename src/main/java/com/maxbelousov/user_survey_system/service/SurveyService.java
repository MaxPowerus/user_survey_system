package com.maxbelousov.user_survey_system.service;

import com.maxbelousov.user_survey_system.entity.Survey;
import com.maxbelousov.user_survey_system.repository.SurveyRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SurveyService {

  private final SurveyRepository surveyRepository;

  /**
   * Returns all instances of Survey class.
   */
  public List<Survey> getAllSurveys() {
    return surveyRepository.findAll();
  }
}
