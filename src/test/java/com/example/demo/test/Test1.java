package com.example.demo.test;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Maps;
import org.junit.Test;

import java.util.Map;

@Slf4j
public class Test1 {

    @Test
    public void test1(){
        Map<String, String> map = Maps.newHashMap("k1","v1");
        log.info(map.toString());
    }


}
