package com.maxbelousov.user_survey_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@Table(name = "answer")
@NoArgsConstructor
@AllArgsConstructor
public class Answer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "answer_id")
  private Long id;

  @Column(name = "answer")
  private String answer;
}
