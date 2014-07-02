package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan
@RestController
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
    	
    	SpringApplication.run(Application.class, args);
        System.out.println("여긴 언제 호출 되나?2");
    }
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    @RequestMapping("/test2")
    String test2() {
        StringBuffer stb = new StringBuffer();
        
        stb.append("<h1>");
        stb.append("텍스트를 입력하자");
        stb.append("</h1>");
        stb.append("<br>");
        
        stb.append("<input type='button' value='버튼도 하나 있으면 좋겠지'>");
        
    	return stb.toString();
    }
    
}
