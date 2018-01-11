package com.back;

import java.io.UnsupportedEncodingException;

/**
 * Created by XiuYin.Cui on 2018/1/9.
 */
public class Test02 {

    public static void main(String[] args) {
        try {
            recover("?úμ?20?aó??Yèˉè???à2￡?·???ó|′e￡??ì?ù?óμ￥￡????ì′ò?aDùDù3?DD￡??ò??ò??eà′???á°é~");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static void recover(String str) throws UnsupportedEncodingException {
        String[] charsets = new String[]{"GBK","Big5","UTF-8","ISO-8859-1","ASCII","UNICODE","Windows-1252"};
        for(int i=0;i<charsets.length;i++){
            for(int j=0;j<charsets.length;j++){
                if(i!=j){
                    String s = new String(str.getBytes(charsets[i]),charsets[j]);
                    System.out.println("---- 原来编码(A)假设是: "+charsets[j]+", 被错误解读为了(B): "+charsets[i]);
                    System.out.println(s);
                    System.out.println();
                }
            }
        }
    }
}
