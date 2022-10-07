package com.maxbelousov.user_survey_system.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class SurveyNotFoundException extends RuntimeException{
  public SurveyNotFoundException(String errorMessage){
    super(errorMessage);
  }
}
