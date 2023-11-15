package com.springproj.biz.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproj.biz.dao.ReDAOMybatis;
import com.springproj.biz.domain.ReplyVO;
import com.springproj.biz.service.ReService;

@Service("reService")
public class ReServiceImpl implements ReService {

	@Autowired
	private ReDAOMybatis dao;
	
	@Override
	public void insertService(ReplyVO vo) {
		dao.insertRe(vo);
	}

	@Override
	public List<ReplyVO> getServiceList(int cm_bdno) {
		return dao.getReList(cm_bdno);
	}

	@Override
	public void deleteService(int r_no) {
		dao.deleteRe(r_no);
	}


}
