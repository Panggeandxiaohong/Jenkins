package online.pangge.jenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebController {

    private void await(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/abc/ooo")
    public String b(){
        await();
        return "all";
    }
}
