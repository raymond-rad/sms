package com.util;

public class Code {
        public static void main(String[] args) {
            StringBuffer code = new StringBuffer();
            String S = "1234567890";
            for (int i=0;i<6;i++){
                int index = (int)(Math.random()*10);
                code.append(S.charAt(index));
            }
            System.out.println(code);
        }

}
