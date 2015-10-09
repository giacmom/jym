package com.jym.util;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 
{
	   
    // 全局数组
    private final static String[] strDigits = { "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

    public MD5() 
    {
    }

    // 返回形式为数字跟字符串
    private static String byteToArrayString(byte bByte) 
    {
        int iRet = bByte;
        // System.out.println("iRet="+iRet);
        if (iRet < 0) {
            iRet += 256;
        }
        int iD1 = iRet / 16;
        int iD2 = iRet % 16;
        return strDigits[iD1] + strDigits[iD2];
    }

//    // 返回形式只为数字
//	private static String byteToNum(byte bByte) 
//    {
//        int iRet = bByte;
//        System.out.println("iRet1=" + iRet);
//        if (iRet < 0) {
//            iRet += 256;
//        }
//        return String.valueOf(iRet);
//    }

    // 转换字节数组为16进制字串
    public static String byteToString(byte[] bByte) 
    {
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < bByte.length; i++) 
        {
            sBuffer.append(byteToArrayString(bByte[i]));
        }
        return sBuffer.toString();
    }

    public static String GetMD5Code(String strObj) 
    {
        String resultString = null;
        
        try {
            resultString = new String(strObj);
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            // md.digest() 该函数返回值为存放哈希值结果的byte数组
            resultString = byteToString(md.digest(strObj.getBytes()));
            
        } catch (NoSuchAlgorithmException ex) {
        	
            ex.printStackTrace();
        }
        return resultString;
    }
    
    
    /** 
     * 获取MD5 结果字符串 
     *  
     * @param source 
     * @return 
     */      
    public static String encode(byte[] source) 
    {          
    	String s = null;  
        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };  
        
        try {  
            
        	java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");  
            md.update(source);  
            byte tmp[] = md.digest();   
            char str[] = new char[16 * 2];   
            int k = 0;   
            for (int i = 0; i < 16; i++) {   
                byte byte0 = tmp[i];   
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];   
                str[k++] = hexDigits[byte0 & 0xf];   
            }  
            
            s = new String(str);   
        
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        
        return s;  
    }  
      
    public static String getMD5(String source) {          
    	return (source == null || "".equals(source)) ? "" : getMD5(source);  
    }  

}
