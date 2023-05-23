package jp.te4a.spring.boot.myapp2;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
/**
* Hello world!
*
*/
@RestController
public class HelloController
{
@RequestMapping("/te/taro")
public String te() {
return "Taro desu!";
}
}

