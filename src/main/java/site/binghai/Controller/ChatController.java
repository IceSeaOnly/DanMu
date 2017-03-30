package site.binghai.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * 用户登录入口
 */
@Controller
public class ChatController {
    /**
     * 循环分发的头像地址
     * */
    public static String[] avatars = {
            "http://image.binghai.site/data/f_11308116.jpg",
            "http://image.binghai.site/data/f_78581053.jpg",
            "http://image.binghai.site/data/f_51109547.jpg",
            "http://image.binghai.site/data/f_60161348.jpg",
            "http://image.binghai.site/data/f_13989611.jpg",
            "http://image.binghai.site/data/f_91458013.jpg",
            "http://image.binghai.site/data/f_13146143.jpg",
            "http://image.binghai.site/data/f_92836280.jpg",
            "http://image.binghai.site/data/f_98684277.jpg"
    };
    /**
     * 计数器
     * */
    public static int index = 0;

    /**
     * 接收昵称，设置头像，并进入聊天界面
     * */
    @RequestMapping(value = "enterChat",method = RequestMethod.POST)
    public String enterChat(@RequestParam String nickname, Model model){
        model.addAttribute("nickname",nickname);
        model.addAttribute("avatar",avatars[index++%9]);
        return "main";
    }
}
