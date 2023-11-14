package com.springproj.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springproj.biz.domain.CommunityVO;
import com.springproj.biz.domain.ReplyVO;
import com.springproj.biz.service.CommuService;
import com.springproj.biz.service.ReService;

@Controller
@SessionAttributes("reply")
public class ReplyController {
	
	@Autowired
	ReService replyService;

	//@RequestMapping(value = "/insertBoard.do", method = RequestMethod.GET) // value = : 이거는 하나만 세팅 해줄 때는 안써도 가능.
	@GetMapping("/insertReply.zo") // 4점대 버전 이후부터 사용 가능한 기능.
	public String insertReply() {
		//System.out.println("글 등록 화면 처리");
		
		return "insertReply";
	}
	
	//@RequestMapping(value = "/insertBoard.do", method = RequestMethod.POST)
	@PostMapping("/insertReply.zo")
	public String insertReply(ReplyVO reply, CommunityVO commu) {
		
		replyService.insertService(reply);
		
		return "redirect:getCommu.zo?cm_bdno="+commu.getCm_bdno();
	}
	
	@RequestMapping(value = "/getReply.zo")
	public String getReply(ReplyVO vo, Model model) {
		
		List<ReplyVO> list = replyService.getServiceList(vo.getR_no());
		
		model.addAttribute("replyList", list); // command 객체로 이용 가능하다.
		
		return "redirect:getCommu.zo?cm_bdno="+vo.getCm_bdno();
	}
	
	@RequestMapping(value = "/getCommuList.zo")
	public String getList(CommunityVO vo, Model model) {
		//System.out.println("글 목록 검색 처리");
		
		System.out.println("검색 조건: "+vo.getSearchCondition());
		System.out.println("검색 단어: "+vo.getSearchKeyword());
		
		if(vo.getSearchCondition() == null) {
			vo.setSearchCondition("TITLE");
		}
		
		if(vo.getSearchKeyword() == null) {
			vo.setSearchKeyword("");
		}
		
		List<CommunityVO> list = commuService.getServiceList(vo);
		
		model.addAttribute("commuList", list);
		
		return "getCommuList";
	}

	@RequestMapping(value = "/deleteReply.zo")
	public String deleteReply(ReplyVO reply) {
		//System.out.println("글 삭제 처리.");
				
		replyService.deleteService(reply.getR_no());
		
		return "redirect:getReplyList.zo";
	}
	
}
