package com.maxbelousov.user_survey_system.service;

import com.maxbelousov.user_survey_system.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;
}
