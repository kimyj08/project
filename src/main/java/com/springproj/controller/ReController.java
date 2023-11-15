package com.springproj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springproj.biz.domain.CommunityVO;
import com.springproj.biz.domain.ReplyVO;
import com.springproj.biz.service.ReService;

@Controller
@SessionAttributes("re")
public class ReController {
	
	@Autowired
	ReService reService;

	//@RequestMapping(value = "/insertBoard.do", method = RequestMethod.GET) // value = : 이거는 하나만 세팅 해줄 때는 안써도 가능.
//	@GetMapping("/insertRe.zo") // 4점대 버전 이후부터 사용 가능한 기능.
//	public String insertRe() {
//		return "insertReply";
//	}
	
	//@RequestMapping(value = "/insertBoard.do", method = RequestMethod.POST)
	@PostMapping("/insertRe.zo")
	public String insertRe(ReplyVO re, CommunityVO commu) {
		reService.insertService(re);
		return "redirect:getCommu.zo?cm_bdno="+commu.getCm_bdno();
	}
	
//	@RequestMapping(value = "/getRe.zo")
//	public String getRe(ReplyVO vo, Model model) {
//		
//		List<ReplyVO> list = reService.getServiceList(vo.getR_no());
//		
//		model.addAttribute("reList", list); // command 객체로 이용 가능하다.
//		
//		return "redirect:getCommu.zo?cm_bdno="+vo.getCm_bdno();
//	}
	
	@RequestMapping(value = "/getReList.zo")
	public String getList(ReplyVO vo, Model model) {
		
		List<ReplyVO> list = reService.getServiceList(vo.getCm_bdno());
		
		model.addAttribute("reList", list);
		
		return "redirect:getCommu.zo?cm_bdno="+vo.getCm_bdno();
	}

	@RequestMapping(value = "/deleteRe.zo")
	public String deleteRe(ReplyVO re, CommunityVO commu) {
		reService.deleteService(re.getR_no());
		return "redirect:getCommu.zo?cm_bdno="+commu.getCm_bdno();
	}
	
}
