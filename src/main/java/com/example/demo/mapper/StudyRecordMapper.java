package com.example.demo.mapper;

import com.example.demo.entity.StudyRecord;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.*;

@Repository
public interface StudyRecordMapper {

    @Select("select * from study_record_tbl where id = #{id}")
    StudyRecord getStudyRecordById(int id);

}
