CREATE TABLE reply (
	r_no		VARCHAR2(50)	primary key, /* 일렬번호 */
	cm_bdno		VARCHAR2(50), /* 게시물번호 */
	um_no		VARCHAR2(50), /* 회원번호 */
	r_content	VARCHAR2(500), /* 댓글본문 */
	r_del		VARCHAR2(10), /* 삭제여부 */
	r_date		DATE	default		sysdate/* 등록일시 */
);

select * from REPLY order by r_no desc;

/* 이 아래줄 부분으로 작업 부탁드립니다. */

/* 댓글 */
CREATE TABLE reply (
	r_no NUMBER(3) NOT NULL, /* 댓글번호 */
	cm_bdno NUMBER(3), /* 게시물번호 */
	r_content VARCHAR2(500), /* 댓글본문 */
	r_del VARCHAR2(10) DEFAULT '0', /* 삭제여부 */
	r_date DATE DEFAULT sysdate, /* 등록일시 */
	r_writer VARCHAR2(20) /* 작성자 */
);

COMMENT ON TABLE reply IS '댓글';

COMMENT ON COLUMN reply.r_no IS '댓글번호';

COMMENT ON COLUMN reply.cm_bdno IS '게시물번호';

COMMENT ON COLUMN reply.r_content IS '댓글본문';

COMMENT ON COLUMN reply.r_del IS '삭제여부';

COMMENT ON COLUMN reply.r_date IS '등록일시';

COMMENT ON COLUMN reply.r_writer IS '작성자';

CREATE UNIQUE INDEX PK_reply
	ON reply (
		r_no ASC
	);

ALTER TABLE reply
	ADD
		CONSTRAINT PK_reply
		PRIMARY KEY (
			r_no
		)
;