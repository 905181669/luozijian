package com.example.demo.rest;

import com.example.demo.entity.StudyRecord;
import com.example.demo.service.StudyRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/record")
@Slf4j
public class StudyRecordRest {

    @Autowired
    private StudyRecordService studyRecordService;

    @GetMapping("/getStudyRecordById")
    public String getStudyRecordById(int id){
        StudyRecord record = studyRecordService.getStudyRecordById(1);
        return "hello";
    }
}
