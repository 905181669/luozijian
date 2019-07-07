package com.example.demo.service;

import com.example.demo.entity.StudyRecord;
import com.example.demo.mapper.StudyRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyRecordService {

    @Autowired
    private StudyRecordMapper studyRecordMapper;

    public List<StudyRecord> getStudyRecordNewestList(){
        return studyRecordMapper.getStudyRecordNewestList();
    }

    public StudyRecord getStudyRecordById(int id){
        return studyRecordMapper.selectByPrimaryKey(id);
    }

    /**
     * 保存学习打卡记录
     * @param record
     */
    public void saveStudyRecord(StudyRecord record){
        studyRecordMapper.insertSelective(record);
    }


    /**
     * 更新学习打卡记录
     * @param record
     */
    public void updateStudyRecord(StudyRecord record){
        studyRecordMapper.updateByPrimaryKeySelective(record);
    }



}
