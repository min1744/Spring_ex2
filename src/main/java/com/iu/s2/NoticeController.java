package com.iu.s2;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.notice.NoticeVO;

@Controller
@RequestMapping(value = "/notice/**")
public class NoticeController {
	@RequestMapping(value = "noticeList", method = RequestMethod.GET)
	public ModelAndView noticeList(ArrayList<NoticeVO> ar, ModelAndView mv) {
		mv.addObject(ar);
		mv.setViewName("board/boardList");
		
		return mv;
	}
	
	@RequestMapping(value = "noticeSelect", method = RequestMethod.GET)
	public void noticeSelect(NoticeVO noticeVO, ModelAndView mv) {
		mv.addObject(noticeVO);
		mv.setViewName("board/boardSelect");
	}
	
	@RequestMapping(value = "noticeWrite", method = RequestMethod.GET)
	public void noticeWrite(int num, ModelAndView mv) {
		
	}
	
	@RequestMapping(value = "noticeWrite", method = RequestMethod.POST)
	public ModelAndView noticeWrite2(ModelAndView mv) {
		return mv;
	}
	
	@RequestMapping(value = "noticeUpdate", method = RequestMethod.GET)
	public ModelAndView noticeUpdate(ModelAndView mv) {
		return mv;
	}
	
	@RequestMapping(value = "noticeUpdate", method = RequestMethod.POST)
	public ModelAndView noticeUpdate2(ModelAndView mv) {
		return mv;
	}
	
	@RequestMapping(value = "noticeDelete", method = RequestMethod.GET)
	public ModelAndView noticeDelete(ModelAndView mv) {
		return mv;
	}
}