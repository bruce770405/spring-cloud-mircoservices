package com.bruce.mircoservice.clientservice.custom.error;

public class CustomException extends Exception{

    private Exception e;

    private String desc;

    public CustomException(){

    }

   /**
    * @Description: 建構子.
    * @Param: [desc, e]
    * @return:
    */
    public CustomException(String desc,Exception e){
        this.e = e;
        this.desc = desc;
    }
}
