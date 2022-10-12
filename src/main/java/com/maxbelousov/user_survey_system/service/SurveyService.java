package com.maxbelousov.user_survey_system.service;

import com.maxbelousov.user_survey_system.entity.Survey;
import com.maxbelousov.user_survey_system.exception.SurveyNotFoundException;
import com.maxbelousov.user_survey_system.repository.SurveyRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
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

  /**
   * Retrieves Survey object by its id.
   */
  public Survey getSurveyById(Long id) {
    return surveyRepository.findById(id).orElseThrow(() -> new SurveyNotFoundException("This survey is not exist"));
  }

  /**
   * Saves Survey object.
   */
  public Survey saveSurvey(Survey survey) {
    Survey savedSurvey = surveyRepository.save(survey);
    log.info("Survey with title '{}' was added to the table survey.", savedSurvey.getTitle());
    return savedSurvey;
  }
}
