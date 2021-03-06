package com.ksptooi.easydev.enums;

public enum ErrorStatus {


    AUTH_PWD_INVALID("无效的密码",400)
    ,AUTH_ALREADY_REG("玩家已经注册",401)
    ,AUTH_ALREADY_LOG("玩家已经登录",402)
    ,AUTH_NO_REG("玩家还没有注册!",403)
    ,FATAL_DB("严重错误,数据库连接问题.",500)
    ,FATAL_NOT_FOUND_HANDLER("严重错误,没有为该命令找到一个命令处理器.",501)
    ,NOT_SUB_PARAMETER("适配器错误,没有为子命令输入参数!.",502)
    ,NOT_FOUND_SUB_PROCESSOR("适配器错误,没有那样的子命令.",503)

    ;

    ErrorStatus(String message, Integer errorCode){
        this.message = message;
        this.errorCode = errorCode;
    }


    private String message = "异常";
    private Integer errorCode = -1;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
}
