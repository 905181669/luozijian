package com.example.demo.rest;

import com.example.demo.common.rest.RespResult;
import com.example.demo.entity.StudyRecord;
import com.example.demo.rest.response.StudyRecordRsp;
import com.example.demo.service.StudyRecordService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/record")
@Slf4j
@ApiModel(value = "学习打卡记录", description = "学习打卡记录")
public class StudyRecordRest {

    @Autowired
    private StudyRecordService studyRecordService;


    @GetMapping("/getStudyRecordList")
    @ApiOperation("获取学习记录列表，按新增时间倒序")
    public RespResult<List<StudyRecordRsp>> getStudyRecordList(){
        List<StudyRecord> studyRecordList =  studyRecordService.getStudyRecordNewestList();
        List<StudyRecordRsp> studyRecordRspList = studyRecordList
                .stream()
                .map(e->toStudyRecordRsp(e)).collect(Collectors.toList());
        return RespResult.success(studyRecordRspList);
    }

    /**
     * StudyRecord——》StudyRecordRsp
     * @param record
     * @return
     */
    public StudyRecordRsp toStudyRecordRsp(StudyRecord record){
        StudyRecordRsp recordRsp = StudyRecordRsp.builder().build();
        BeanUtils.copyProperties(record, recordRsp);
        String durationFormat = "";
        if(record.getDuration() != null){
            int duration = record.getDuration()/60; //秒转分钟
            if (duration < 60){
                durationFormat = duration + "分钟";
            }else{
                int hour = Math.round(duration / 60);
                int minute = Math.round(duration - (hour * 60));
                durationFormat = hour + "小时" + (minute == 0 ? "" : minute + "分钟");
            }
        }
        recordRsp.setDuration(durationFormat);
        return recordRsp;
    }


    @PostMapping("/beginStudy")
    public RespResult beginStudy(String studyContentType){
        StudyRecord record = StudyRecord.builder().build();

        record.setStudyContentType(studyContentType);
        Date nowDate = new Date();
        record.setAddTime(nowDate);
        record.setStartTime(nowDate);

        studyRecordService.saveStudyRecord(record);
        return RespResult.success(record);
    }


    @PostMapping("/stopStudy")
    public RespResult stopStudy(int id){
        StudyRecord record = studyRecordService.getStudyRecordById(id);
        Date nowDate = new Date();
        record.setEndTime(nowDate);
        record.setDuration((int)((nowDate.getTime() - record.getStartTime().getTime())/1000));

        studyRecordService.updateStudyRecord(record);
        return RespResult.success();
    }



}
