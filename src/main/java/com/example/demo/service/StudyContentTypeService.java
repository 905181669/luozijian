package com.example.demo.service;

import com.example.demo.entity.StudyContentType;
import com.example.demo.entity.StudyRecord;
import com.example.demo.mapper.StudyContentTypeMapper;
import com.example.demo.mapper.StudyRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyContentTypeService {

    @Autowired
    private StudyContentTypeMapper studyContentTypeMapper;


    public List<StudyContentType> getStudyContentTypeList(){
        return studyContentTypeMapper.selectAll();
    }

    public int saveStydyContentType(StudyContentType type){
        return studyContentTypeMapper.insert(type);
    }

    public int updateStydyContentType(StudyContentType type){
        return studyContentTypeMapper.updateByPrimaryKeySelective(type);
    }

}
