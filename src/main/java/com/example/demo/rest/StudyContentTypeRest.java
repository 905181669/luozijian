package com.example.demo.rest;

import com.example.demo.common.rest.RespResult;
import com.example.demo.entity.StudyContentType;
import com.example.demo.rest.request.SaveStudyContentTypeReq;
import com.example.demo.rest.request.UpdateStudyContentTypeReq;
import com.example.demo.service.StudyContentTypeService;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@ApiModel(value = "学习内容类型字典", description = "学习内容类型字典")
@RequestMapping("/studyContentType")
public class StudyContentTypeRest {

    @Autowired
    private StudyContentTypeService studyContentTypeService;


    @GetMapping("/getStudyContentTypeList")
    public RespResult<List<StudyContentType>> getStudyContentTypeList(){
        List<StudyContentType> studyContentTypeList = studyContentTypeService.getStudyContentTypeList();
        return RespResult.success(studyContentTypeList);
    }

    @PostMapping("/saveStudyContentType")
    public RespResult saveStudyContentType(SaveStudyContentTypeReq req){
        StudyContentType type = StudyContentType.builder().build();
        BeanUtils.copyProperties(req, type);
        type.setUpdateTime(new Date());
        studyContentTypeService.saveStydyContentType(type);
        return RespResult.success();
    }

    @PostMapping("/updateStudyContentType")
    public RespResult updateStudyContentType(UpdateStudyContentTypeReq req){
        StudyContentType type = StudyContentType.builder().build();
        BeanUtils.copyProperties(req, type);
        type.setUpdateTime(new Date());
        studyContentTypeService.updateStydyContentType(type);
        return RespResult.success();
    }


}
