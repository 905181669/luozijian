package com.example.demo.service;

import com.example.demo.entity.StudyRecord;
import com.example.demo.mapper.StudyRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudyRecordService {

    @Autowired
    private StudyRecordMapper studyRecordMapper;

    public StudyRecord getStudyRecordById(int id){
        return studyRecordMapper.getStudyRecordById(id);
    }
}
