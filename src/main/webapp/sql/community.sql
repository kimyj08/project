CREATE TABLE community (
	cm_bdno		VARCHAR2(50)	primary key, /* 게시물번호 */
	um_no		VARCHAR2(50), /* 회원번호 */
	cm_title	VARCHAR2(50), /* 제목 */
	cm_desc		VARCHAR2(500), /* 본문 */
	cm_cnt		NUMBER(3)	default		0, /* 조회수 */
	cm_del		VARCHAR2(5), /* 삭제여부 */
	cm_regdate	DATE	default		sysdate, /* 등록일시 */
	cm_update	DATE	default		sysdate /* 수정일시 */
);

select * from COMMUNITY order by cm_bdno desc;

/* 이 아래줄 부분으로 작업 부탁드립니다. */

/* 커뮤니티 */
CREATE TABLE community (
	cm_bdno NUMBER(3) NOT NULL, /* 게시물번호 */
	cm_writer VARCHAR2(20), /* 작성자 */
	cm_title VARCHAR2(50), /* 제목 */
	cm_desc VARCHAR2(500), /* 본문 */
	cm_cnt NUMBER(3) DEFAULT 0, /* 조회수 */
	cm_del VARCHAR2(5) DEFAULT '0', /* 삭제여부 */
	cm_regdate DATE DEFAULT sysdate, /* 등록일시 */
	cm_update DATE DEFAULT sysdate /* 수정일시 */
);

COMMENT ON TABLE community IS '커뮤니티';

COMMENT ON COLUMN community.cm_bdno IS '게시물번호';

COMMENT ON COLUMN community.cm_writer IS '작성자';

COMMENT ON COLUMN community.cm_title IS '제목';

COMMENT ON COLUMN community.cm_desc IS '본문';

COMMENT ON COLUMN community.cm_cnt IS '조회수';

COMMENT ON COLUMN community.cm_del IS '삭제여부';

COMMENT ON COLUMN community.cm_regdate IS '등록일시';

COMMENT ON COLUMN community.cm_update IS '수정일시';

CREATE UNIQUE INDEX PK_community
	ON community (
		cm_bdno ASC
	);

ALTER TABLE community
	ADD
		CONSTRAINT PK_community
		PRIMARY KEY (
			cm_bdno
		)
;
