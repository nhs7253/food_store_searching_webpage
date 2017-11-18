/*
 CREATE USER storesite IDENTIFIED BY 0000;
 GRANT ALL PRIVILEGES TO storesite;
 */

-----------------------------------------------------
-- 슈퍼 관리자
CREATE TABLE SUPER_ADMIN (
   SUPER_ADMIN_ID VARCHAR2(50)  PRIMARY KEY, -- 슈퍼관리자 아이디
   SUPER_ADMIN_PW VARCHAR2(100) ,     -- 슈퍼관리자 패스워드
   AUTHORITY_ID   NUMBER(1)     NOT NULL  -- 권한ID
);

COMMENT ON TABLE SUPER_ADMIN IS '슈퍼 관리자';

COMMENT ON COLUMN SUPER_ADMIN.SUPER_ADMIN_ID IS '슈퍼관리자 아이디';
COMMENT ON COLUMN SUPER_ADMIN.SUPER_ADMIN_PW IS '슈퍼관리자 패스워드';
COMMENT ON COLUMN SUPER_ADMIN.AUTHORITY_ID IS '권한ID';

SELECT * FROM ALL_COL_COMMENTS WHERE TABLE_NAME = 'SUPER_ADMIN';


-----------------------------------------------------
-- 권한
CREATE TABLE AUTHORITY (
   AUTHORITY_ID    NUMBER(1)    , -- 권한ID
   AUTHORITY_SCOPE VARCHAR2(50) ,  -- 권한범위
   PRIMARY KEY(AUTHORITY_ID, AUTHORITY_SCOPE)
);

COMMENT ON TABLE AUTHORITY IS '권한';

COMMENT ON COLUMN AUTHORITY.AUTHORITY_ID IS '권한ID';
COMMENT ON COLUMN AUTHORITY.AUTHORITY_SCOPE IS '권한범위';

SELECT * FROM ALL_COL_COMMENTS WHERE TABLE_NAME = 'AUTHORITY';

SELECT * FROM USER_TAB_COMMENTS;
-----------------------------------------------------
-- 노멀유저
CREATE TABLE NOMAL_USER(
	USER_ID      VARCHAR2(50), -- 유저 아이디
	USER_NICNAME 	VARCHAR2(50), -- 유저 닉네임
	USER_EMAIL   VARCHAR2(50), -- 유저 이메일
	AUTHORITY_ID NUMBER(1), -- 권한ID
	PRIMARY KEY(USER_ID, USER_NICNAME, USER_EMAIL)

);

COMMENT ON TABLE NOMAL_USER IS '노멀유저';

COMMENT ON COLUMN NOMAL_USER.USER_ID IS '유저아이디';
COMMENT ON COLUMN NOMAL_USER.USER_NICNAME IS '유저 닉네임';
COMMENT ON COLUMN NOMAL_USER.USER_EMAIL IS '유저 이메일';
COMMENT ON COLUMN NOMAL_USER.AUTHORITY_ID IS '권한ID';

SELECT * FROM ALL_COL_COMMENTS WHERE TABLE_NAME = 'NOMAL_USER';

SELECT * FROM USER_TAB_COMMENTS;

-----------------------------------------------------
-- 공지사항 게시판

CREATE TABLE NOTICE_BOARD(
	NOTICE_NUM  NUMBER PRIMARY KEY,  -- 글번호
	NOTICE_TITLE VARCHAR2(100), -- 글제목
	NOTICE_TEXT  CLOB,    -- 글내용
	NOTICE_DATE  DATE,    -- 작성일
	NOTICE_HIT  NUMBER   -- 조회수
);

COMMENT ON TABLE NOTICE_BOARD IS '공지사항 게시판';

COMMENT ON COLUMN NOTICE_BOARD.NOTICE_NUM IS '글번호';
COMMENT ON COLUMN NOTICE_BOARD.NOTICE_TITLE IS '글제목';
COMMENT ON COLUMN NOTICE_BOARD.NOTICE_TEXT IS '글내용';
COMMENT ON COLUMN NOTICE_BOARD.NOTICE_DATE IS '작성일';
COMMENT ON COLUMN NOTICE_BOARD.NOTICE_HIT IS '조회수';

SELECT * FROM ALL_COL_COMMENTS WHERE TABLE_NAME = 'NOTICE_BOARD';

SELECT * FROM USER_TAB_COMMENTS;

-----------------------------------------------------
-- 가게 정보
CREATE TABLE  STORE_INFO(
ADMIN_STORE_NUM    NUMBER PRIMARY KEY,  -- 가게 번호
ADMIN_STORE_INFO   VARCHAR2(100), -- 가게 정보
ADMIN_STORE_ADRESS CLOB, -- 가게 주소
ADMIN_STORE_IMG    DATE, -- 가게 이미지
STORE_DEFINISION  NUMBER -- 작성자 구분
);

COMMENT ON TABLE STORE_INFO IS '가게정보';

COMMENT ON COLUMN STORE_INFO.ADMIN_STORE_NUM IS '가게번호';
COMMENT ON COLUMN STORE_INFO.ADMIN_STORE_INFO IS '가게정보';
COMMENT ON COLUMN STORE_INFO.ADMIN_STORE_ADRESS IS '가게주소';
COMMENT ON COLUMN STORE_INFO.ADMIN_STORE_IMG IS '가게이미지';
COMMENT ON COLUMN STORE_INFO.STORE_DEFINISION IS '작성자 구분';

SELECT * FROM ALL_COL_COMMENTS WHERE TABLE_NAME = 'STORE_INFO';

SELECT * FROM USER_TAB_COMMENTS;


-----------------------------------------------------
--사이트 소개
CREATE TABLE SIGHT_INTRO(
INTRO VARCHAR2(500) PRIMARY KEY -- 사이트 소개
);
COMMENT ON TABLE SIGHT_INTRO IS '사이트 소개';

COMMENT ON COLUMN SIGHT_INTRO.INTRO IS '사이트 소개';

SELECT * FROM ALL_COL_COMMENTS WHERE TABLE_NAME = 'SIGHT_INTRO';

SELECT * FROM USER_TAB_COMMENTS;

-----------------------------------------------------

-- 슈퍼 관리자
SELECT * FROM SUPER_ADMIN;
-- 권한
SELECT * FROM AUTHORITY;
-- 노멀유저
SELECT * FROM NOMAL_USER;
-- 공지사항 게시판
SELECT * FROM NOTICE_BOARD;
-- 가게정보
SELECT * FROM STORE_INFO;
-- 사이트 소개
SELECT * FROM SIGHT_INTRO;
-----------------------------------------------------
-- 슈퍼 관리자
DROP TABLE SUPER_ADMIN;
-- 권한
DROP TABLE AUTHORITY;
-- 노멀유저
DROP TABLE NOMAL_USER;
-- 공지사항 게시판
DROP TABLE NOTICE_BOARD;
-- 가게정보
DROP TABLE STORE_INFO;
-- 사이트 소개
DROP TABLE SIGHT_INTRO;