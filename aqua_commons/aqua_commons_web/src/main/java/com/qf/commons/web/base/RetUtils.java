package com.qf.commons.web.base;

/**
 * 封装R对象的工具类
 *
 * @author pww
 * @date 2021/10/18
 * @apiNote
 */
public class RetUtils {
    /**
     * 构造普通R对象的静态方法
     */
    public static <T> R<T> creat(Integer code, String msg, T data) {
        return new R<T>().setCode(code).setMsg(msg).setData(data);
    }

    /**
     * 通过枚举对象，获得R对象
     */
    public static <T> R<T> creat(Code code, T data) {
        return creat(code.code, code.msg, data);
    }

    /**
     * 构造成功返回的R对象
     */
    public static <T> R creat(T data) {
        return creat(Code.SUCC, data);
    }

    /**
     * 构造失败返回的R对象
     */
    public static <T> R creat(Integer code, String msg) {
        return creat(code, msg, null);
    }
}
