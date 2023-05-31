package com.itheima.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class QueryPageBean implements Serializable {
    private Integer currentPage;//页码
    private Integer pageSize;//每页记录数
    private String queryString;//查询条件

}
