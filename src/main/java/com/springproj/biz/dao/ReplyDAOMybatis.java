package com.springproj.biz.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springproj.biz.domain.ReplyVO;

@Repository
public class ReplyDAOMybatis {
	@Autowired
	SqlSessionTemplate mybatis;
	
	// 글 등록(insert문)
	public void insertReply(ReplyVO vo) {
		mybatis.insert("Reply.insertReply", vo); // 이때의 insert는 MyBatis의 mapping과 연결이 되어있는 것.
   }

	// 목록보기(select문)
	public List<ReplyVO> getReplyList(ReplyVO vo) {
		
//		if(vo.getSearchCondition().equals("TITLE")) {
//			return mybatis.selectList("Ask.getAskList_T", vo);
//		} else if(vo.getSearchCondition().equals("CONTENT")) {
//			return mybatis.selectList("Ask.getAskList_C", vo);
//		} else {
//			return mybatis.selectList("Ask.getAskList_T", vo);
//		}
				
		return mybatis.selectList("Reply.getReplyList", vo);
		
	}

	// 글 삭제(delete문)
	public void deleteReply(int r_no) {
		mybatis.update("Reply.deleteReply", r_no);
	}

}
