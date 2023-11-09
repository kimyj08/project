package com.springproj.biz.service;

import java.util.List;

import com.springproj.biz.domain.CommunityVO;

public interface CommuService {

	// CRUD 기능 수행을 위한 메서드 호출 가능.
	// 글 등록
	public void insertService(CommunityVO vo);
	// 글 목록 조회
	public CommunityVO getService(int cm_bdno);
	public List<CommunityVO> getServiceList(CommunityVO vo);
	// 글 수정
	public void updateService(CommunityVO vo);
	// 조회수 증가
	public void updateCntService(int cm_bdno);
	// 글 삭제
	public void deleteService(int cm_bdno);
	
}
