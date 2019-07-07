package com.example.demo.common.mapper;


import tk.mybatis.mapper.common.*;

/**
 * 公共mapper接口
 * @param <T>
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T>{

}