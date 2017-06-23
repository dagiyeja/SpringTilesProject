package com.sist.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Maincontroller {
	@RequestMapping("main.do")
	public String main_page(){
		return "main";
	}
	
	@RequestMapping("board.do")
	public String main_board(){
		return "board/board"; //board/board.jsp
	}
	
	@RequestMapping("notice.do")
	public String main_notice(){
		return "notice/notice";
	}
}
