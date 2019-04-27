package com.example.demo.test;

/**
 * @author lzj
 */
public class TestAlibabaPlugin {
    public void test1(){
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);
        if(i1.equals(i2)){
            System.out.println("相等");
        }
        String str = null;
        if(str.contains("a")){
            System.out.println("包含a");
        }

        String str1 = null;
        if(str1.equals("a")){
            System.out.println("等于a");
        }
    }
}
