package dir1.dir2.controller;

import com.alibaba.fastjson.JSONObject;
import dir1.dir2.baseClass.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liangchao
 * @create 2021-04-12 12:37
 */
@Controller
public class Hello1Controller {

//    @Autowired
//    private Person person;


    //不加@ResponseBody,那么@Controller会将返回的字符串结果与页面位置进行挂钩
    @RequestMapping("/s11")
    public String s1(){
        return "index";
    }

    @RequestMapping(value = "/s12", method = RequestMethod.GET)
    @ResponseBody
    public String s2(){
        return "method01";
    }

    @ResponseBody
    @RequestMapping(value = "/s13", method = RequestMethod.POST)
    public JSONObject s3(@RequestBody Person person){
        JSONObject a = new JSONObject();
        a.put("1",1);
        a.put("name",person.getName());
        a.put("age",person.getAge());
        return a;
    }





}
