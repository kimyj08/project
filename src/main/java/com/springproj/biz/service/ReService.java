package com.springproj.biz.service;

import java.util.List;

import com.springproj.biz.domain.ReplyVO;

public interface ReService {

	public void insertService(ReplyVO vo);
	public List<ReplyVO> getServiceList(int cm_bdno);
	public void deleteService(int r_no);
	
}
