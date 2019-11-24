package online.pangge.jenkins;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreeMakerController {


    @RequestMapping("/free.do")
    public String test(Model model, String id){
        model.addAttribute("a", id);
        return "index";
    }
}
