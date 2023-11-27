package in.pravakar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@ResponseBody
//@RestController
@RequestMapping("/welcome")
public class MsgController {
	//http://localhost:9090/wlcome/hello
	
	@GetMapping("/hello")
	public String welcomeMsg(Model model) {
		model.addAttribute("msg", "Hello,Good Evening");
		return "index";
	}
	
	/*@GetMapping("/hello")
	@ResponseBody
	public String sayHello() {
		String msg = "Hello, how are you?";
		return msg;
	}*/

}
