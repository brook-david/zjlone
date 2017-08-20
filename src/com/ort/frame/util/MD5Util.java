package com.ort.frame.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;  

public class MD5Util {  
    
    public static String md5Encode(String inStr) throws Exception{
        MessageDigest md5 = null;
        md5 = MessageDigest.getInstance("MD5");

        byte[] byteArray = inStr.getBytes("UTF-8");
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }
    
    public static void main(String[] args) throws Exception {  
        MD5Util md5Util=new MD5Util();  
        String a = md5Encode("sfewfewfwefefweffffffffffffffffffffff");
        System.out.println(a);  
    }  
  
}  