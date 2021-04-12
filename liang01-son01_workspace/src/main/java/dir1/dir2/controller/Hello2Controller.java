package dir1.dir2.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangchao
 * @create 2021-04-12 13:41
 *
 * @RestController :相当于@ResponseBody ＋ @Controller合在一起的作用。 方法无法返回jsp页面，或者html，配置的视图解析器 InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容。
 */
@RestController
public class Hello2Controller {

    @RequestMapping(value = "rest/s21", method = RequestMethod.GET)
    public String s21(){
        return "method01";
    }
    @RequestMapping(value = "rest/s22", method = RequestMethod.GET)
    public JSONObject s22(){
        JSONObject a = new JSONObject();
        a.put("1",1);
        return a;
    }

}
