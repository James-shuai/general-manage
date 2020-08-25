package com.generalmanage.utils;

/**
 * @author ys
 * @date 2019/9/18 15:29
 */
public class ResultUtils {


    public static Object success(Object data,String message){
        ResultData resultData = new ResultData();
        resultData.setCode(200);
        resultData.setState(true);
        resultData.setMessage(message);
        resultData.setData(data);
        return resultData;
    }

    public static Object success(Object data){
        ResultData resultData = new ResultData();
        resultData.setCode(200);
        resultData.setState(true);
        resultData.setData(data);
        return resultData;
    }

    public static Object success(String message){
        ResultData resultData = new ResultData();
        resultData.setCode(200);
        resultData.setState(true);
        resultData.setMessage(message);
        return resultData;
    }

    public static Object error(Integer code,String message){
        ResultData resultData = new ResultData();
        resultData.setCode(code);
        resultData.setState(false);
        resultData.setMessage(message);
        return resultData;
    }

    public static Object error(String message){
        ResultData resultData = new ResultData();
        resultData.setCode(200);
        resultData.setState(false);
        resultData.setMessage(message);
        return resultData;
    }


    public static class ResultData{
        private Integer code;
        private boolean state;
        private String message;
        private Object data;

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public boolean isState() {
            return state;
        }

        public void setState(boolean state) {
            this.state = state;
        }
    }

}
