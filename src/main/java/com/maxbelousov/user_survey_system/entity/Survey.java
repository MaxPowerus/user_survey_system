package com.maxbelousov.user_survey_system.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "survey")
@NoArgsConstructor
@AllArgsConstructor
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "survey_id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "start_date_time", updatable = false)
    private LocalDateTime startDateTime;

    @Column(name = "finish_date_time")
    private LocalDateTime finishDateTime;

}
