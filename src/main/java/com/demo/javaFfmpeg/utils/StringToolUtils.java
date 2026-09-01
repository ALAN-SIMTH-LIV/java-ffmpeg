package com.demo.javaFfmpeg.utils;

public class StringToolUtils {

    /**
     * 判断是否为空
     * @param str 字符串
     * @return 默认值false
     */
    public static boolean isEmpty(String str){
        if (null == str || "".equals(str) || "null".equals(str) || "\u0000".equals(str)) {
            return true;
        } else if ("".equals(str.trim())){
            return true;
        }
        return false;
    }

}
