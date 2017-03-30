package site.binghai.Controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import site.binghai.Entity.Message;

import java.util.Vector;

/**
 * Rest请求响应器 json数据交互
 */
@RestController
public class RestControllers{

    /**
     * 聊天数据内存存放区
     * */
    public static Vector<Message> msgs = new Vector<>();

    /**
     * 接收用户发送的消息，存入保存区
     * */
    @RequestMapping("sendTalk")
    public String sendTalk(String avatar,String nickname,String content,Long time,String stime){
        Message m = new Message(time,stime,"["+nickname+"] "+content,avatar);
        msgs.add(m);
        System.out.println(JSONObject.toJSONString(m));
        return "ok";
    }


    /**
     * 响应 拉取一条最新记录的请求
     * */
    @RequestMapping(value = "nextOne",produces = {"application/text;charset=UTF-8"})
    public String nextOne(Long nextTime){
        int size = msgs.size();
        for (int i = 0; i < size; i++) {
            if(msgs.get(i).getTime()>nextTime)
                return JSONObject.toJSONString(msgs.get(i));
        }
        return "false";
    }

    /**
     * 响应拉取最新10条记录的请求
     * */
    @RequestMapping(value = "lastTen",produces = {"application/text;charset=UTF-8"})
    public String lastTen(){
        JSONArray arr = new JSONArray();
        int size = msgs.size();
        int sum = 0;
        while(--size>=0 && sum++<10){
            arr.add(msgs.get(size));
        }
        return arr.toJSONString();
    }
}
