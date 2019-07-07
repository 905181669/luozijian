package com.example.demo.mapper;

import com.example.demo.common.mapper.BaseMapper;
import com.example.demo.entity.StudyRecord;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudyRecordMapper extends BaseMapper<StudyRecord> {

    @Select("select * from study_record_tbl order by add_time desc")
    List<StudyRecord> getStudyRecordNewestList();

}
