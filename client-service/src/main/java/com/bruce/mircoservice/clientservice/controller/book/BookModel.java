package com.bruce.mircoservice.clientservice.controller.book;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import tw.com.bruce.spring.cloud.test.controller.common.CommonModel;

@Data
@ApiModel(description = "書本資料")
public class BookModel extends CommonModel {

    @ApiModelProperty(value = "序號", required = true)
    private Integer bookId;

    @ApiModelProperty(value = "書名", required = true)
    private String name;

    @ApiModelProperty(value = "作者", required = true)
    private String author;

}
