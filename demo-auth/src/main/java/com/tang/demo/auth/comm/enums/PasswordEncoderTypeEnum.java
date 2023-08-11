package com.tang.demo.auth.comm.enums;

public enum PasswordEncoderTypeEnum {
      BCRYPT("{bcrypt}","BCRYPT加密"),
      NOOP("{noop}","无加密文")
     ;
      private String prefix;

      PasswordEncoderTypeEnum(String prefix,String desc){
          this.prefix=prefix;
      }

    public String getPrefix() {
        return prefix;
    }
}
