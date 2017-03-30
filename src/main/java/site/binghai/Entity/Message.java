package site.binghai.Entity;

/**
 * 消息实体
 */
public class Message {
    private Long time;
    private String strTime;
    private String info;
    private String avatar;

    public Message(Long time, String stime,String info, String avatar) {
        this.time = time;
        this.info = info;
        this.avatar = avatar;
        this.strTime = stime;
    }

    public Message() {
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getStrTime() {
        return strTime;
    }

    public void setStrTime(String strTime) {
        this.strTime = strTime;
    }
}
