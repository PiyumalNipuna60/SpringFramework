package lk.ijse.spring.util;

public class RespondUtil {
    private String status;
    private String massage;
    private Object data;

    public RespondUtil() {
    }

    public RespondUtil(String status, String massage, Object data) {
        this.status = status;
        this.massage = massage;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
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
                "status='" + status + '\'' +
                ", massage='" + massage + '\'' +
                ", data=" + data +
                '}';
    }
}

