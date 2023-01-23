/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/22/2023
 * Time        : 4:36 PM
 * Year        : 2023
 */

package lk.ijse.spring.util;

public class ResponseUtil {
    private String code;
    private String message;
    private Object data;

    public ResponseUtil() {
    }

    public ResponseUtil(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseUtil{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
