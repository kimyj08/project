package com.springproj.biz.service;

import java.util.List;

import com.springproj.biz.domain.ReplyVO;

public interface ReplyService {

	public void insertService(ReplyVO vo);
	public List<ReplyVO> getServiceList(ReplyVO vo);
	public void deleteService(int r_no);
	
}
