package com.icodeair.exception;

/**
 * XML全局异常
 *
 * @author admin
 */
public class XmlException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * 错误提示
     */
    private String message;

    /**
     * 错误明细，内部调试错误
     */
    private String detailMessage;

    /**
     * 空构造方法，避免反序列化问题
     */
    public XmlException() {
    }

    public XmlException(String message) {
        this.message = message;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public XmlException setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public XmlException setMessage(String message) {
        this.message = message;
        return this;
    }
}
