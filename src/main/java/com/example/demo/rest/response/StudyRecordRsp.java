package com.example.demo.rest.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudyRecordRsp {

    private Integer id;

    /**
     * spring boot默认使用jackson进行序列化，所以这里使用@JsonProperty，使用@JSONField没用
     *
     */
//    @JsonProperty(value = "start_time")
//    @JSONField(name = "start_time")
    private Date startTime;

    private Date endTime;

    private String duration;

    private String studyContentType;

    private Date addTime;

}
