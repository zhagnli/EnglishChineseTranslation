package translate;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
public class TranslatorController {
    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return  "test success,can use";
    }

    @GetMapping("/trans/{word}")    //给url的连接
    public Map<String,Object> trans(@PathVariable("word") String word){
        Translate transutil = new  Translate();
        Map shuju = new HashMap();
        String even=transutil.MSG(word);
        shuju =Translate.DealXml(even);
        return shuju;
    }
}
