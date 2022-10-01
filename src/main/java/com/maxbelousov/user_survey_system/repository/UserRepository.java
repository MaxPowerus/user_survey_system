package com.maxbelousov.user_survey_system.repository;

import com.maxbelousov.user_survey_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
