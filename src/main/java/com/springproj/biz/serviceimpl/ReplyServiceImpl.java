package com.springproj.biz.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproj.biz.dao.ReplyDAOMybatis;
import com.springproj.biz.domain.ReplyVO;
import com.springproj.biz.service.ReplyService;

@Service("replyService")
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	private ReplyDAOMybatis dao;
	
	@Override
	public void insertService(ReplyVO vo) {
		dao.insertReply(vo);
	}

	@Override
	public List<ReplyVO> getServiceList(ReplyVO vo) {
		return dao.getReplyList(vo);
	}

	@Override
	public void deleteService(int r_no) {
		dao.deleteReply(r_no);
	}

}
