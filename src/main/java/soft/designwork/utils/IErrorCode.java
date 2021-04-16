package soft.designwork.utils;

/**
 * @author 29237
 */

public interface IErrorCode {
    /**
     * 错误码
     * @return
     */
    long getCode();

    /**
     * 错误消息
     * @return
     */
    String getMessage();
}
