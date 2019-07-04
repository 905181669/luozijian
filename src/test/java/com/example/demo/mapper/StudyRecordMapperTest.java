package com.example.demo.mapper;


import com.example.demo.entity.StudyRecord;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class StudyRecordMapperTest {

    @Autowired
    private StudyRecordMapper mapper;


    @Test
    public void test(){
        StudyRecord record = mapper.getStudyRecordById(1);
        System.out.println(record);
    }
}
