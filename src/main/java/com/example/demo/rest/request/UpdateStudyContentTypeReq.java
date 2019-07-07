package com.example.demo.rest.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateStudyContentTypeReq {

    @ApiModelProperty(value = "id", required = true)
    private int id;

    @ApiModelProperty(value = "代码", required = true)
    private String code;

    @ApiModelProperty(value = "字典名称", required = true)
    private String name;

    @ApiModelProperty(value = "排序", required = true)
    private Integer rank;

    @ApiModelProperty(value = "父id，默认0")
    @Builder.Default
    private Integer parentId = 0;
}