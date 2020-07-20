package MySpringMVC12.MySpringMVC12.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("Signin");
		}
		@RequestMapping(value="/home")
		public ModelAndView test2(HttpServletResponse response) throws IOException{
			return new ModelAndView("home");
	}
		@RequestMapping(value="/employee")
		public ModelAndView test3(HttpServletResponse response) throws IOException{
			return new ModelAndView("employee");
	}
		@RequestMapping(value="/Admin")
		public ModelAndView test4(HttpServletResponse response) throws IOException{
			return new ModelAndView("admin");
	}
}
