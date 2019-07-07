package com.example.demo.rest.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudyRecordRsp {

    private Integer id;

    private Date startTime;

    private Date endTime;

    private String duration;

    private String studyContentType;

    private Date addTime;

}
