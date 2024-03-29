package kr.co.wr.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;

import kr.co.wr.util.SMTPAuthenticatior;

@Controller
public class CommonController {
	
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(CommonController.class);
	
	//PageControll
	/**
	 * 페이지 이동 요청 처리.
	 * - "/페이지위치" 경로를 가진 화면으로 이동한다. 
	 * - 파라미터 처리를 위해 return 을 ModelAndView 로 변경한다.
	 * 
	 * <화면요청 예시>
	 * /home
	 * 
	 * @param page         페이지명
	 * @throws IOException 
	 */
	@ResponseBody
	@RequestMapping(value = "/{page}", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView pageController(@PathVariable String page, HttpSession session) throws IOException {
		ModelAndView mav = new ModelAndView();
		String url = page;
		mav.setViewName(url);
		return mav;
	}
	
}