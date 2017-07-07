package demo.flv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UrlController {
	
	@RequestMapping(value = "/")
	public String index(){
		return "index";
	}
	
	@RequestMapping(value = "/mp4")
	public String mp4(){
		return "mp4";
	}

}
