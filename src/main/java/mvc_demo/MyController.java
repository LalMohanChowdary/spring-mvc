package mvc_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/hello")
	public String hello() {
		System.out.println("Hello Method Triggered");
		return "hello.jsp";
	}

	@RequestMapping("/hai")
	public String hii() {
		System.out.println("Hiii Method Triggered");
		return "hai.jsp";
	}

	@RequestMapping("/index")
	public String index() {

		System.out.println("Index Method Triggered");

		return "index.jsp";
	}

	@RequestMapping("/print")
	public ModelAndView print(@RequestParam String name, @RequestParam String place, @RequestParam String email,
			@RequestParam long phone, @RequestParam String password) {
		System.out.println("Print Method...!");
		System.out.println(name);
		System.out.println(place);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("print.jsp");
		mv.addObject("name", name);
		mv.addObject("place", place);
		mv.addObject("email", email);
		mv.addObject("phone", phone);
		mv.addObject("password", password);

		return mv;
	}
//	@RequestMapping("/calculator")
//	public String calculator() {
//		return "calculator.jsp";
//		
//	}
	
	@RequestMapping("/calculator")
	public ModelAndView calculator() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("calculator.jsp");
		return mv;
		
	}
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam long num1 , @RequestParam long num2) {
		
		long res=num1+num2;
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("res", res);
		
		return mv;
	}
	@RequestMapping("/multi")
	public ModelAndView multi(@RequestParam long num1 , @RequestParam long num2) {
		
		long res=num1*num2;
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("res", res);
		
		return mv;
	}
	
	@RequestMapping("/sub")
	public ModelAndView sub(@RequestParam long num1 , @RequestParam long num2) {
		
		long res=num1-num2;
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("res", res);
		
		return mv;
	}
	@RequestMapping("/div")
	public ModelAndView div(@RequestParam long num1 , @RequestParam long num2) {
		
		long res=num1/num2;
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("res", res);
		
		return mv;
	}
}
