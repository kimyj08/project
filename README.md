# project
personal project
게시판(문의게시판)을 구현한 개인 프로젝트 입니다.

![image](https://github.com/kimyj08/web-project/assets/108450096/171ca811-b301-4bc7-a98d-ba72255e8435)

---

### 프로젝트 정보
- 개발기간 : 2023.09 ~ 2023.11
- 내용

#### 프로젝트 소개
팀 프로젝트 내에서 맡았던 파트를 발전시킨 개인 프로젝트 입니다.
주 서비스는 문의게시판을 구현한 게시판 및 커뮤티니 입니다.
##### 개발 투두리스트
[ DB ]
- [x] 사용자 테이블 생성
- [x] 문의게시판 테이블 생성
  - [x] 문의 테이블
  - [x] 문의 댓글 테이블
- [x] 커뮤니티 테이블 생성
  - [x] 커뮤니티 테이블
  - [x] 커뮤니티 댓글 테이블

[ 기능 ]
- [x] 문의게시판 CRUD 구현
- [ ] 커뮤니티 CRUD 구현

---

#### 시작 가이드
(1) 요구 사항(프로젝트 설정 내용)
- JAVA version : 11
- Spring version : 5.2.22
- RDMBS : Oracle Database 사용 - Oracle version : 11(xe)
- Web Module : 4.0

--- Maven ---
- Servlet-api : 4.0.1
- ojdbc6 : 11.2.0.4
- AspectJ Weaver : 1.9.7
- Spring JDBC : 5.2.22 RELEASE
- Commons DBCD : 1.4
- MyBatis : 3.5.6
- MyBatis Spring : 2.0.6

#### 기술 스택
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white"> <img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white"> <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"> <img src="https://img.shields.io/badge/jquery-0769AD?style=for-the-badge&logo=jquery&logoColor=white">

<img src="https://img.shields.io/badge/oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white"> <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> <img src="https://img.shields.io/badge/apache tomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white"> <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"> <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">

#### 화면 구성(일부)

![image](https://github.com/kimyj08/web-project/assets/108450096/5e9974a0-128f-404d-809c-4d87b11b09bc)

![image](https://github.com/kimyj08/web-project/assets/108450096/a89c5d96-6264-433f-97fa-b987a64d4695)

![image](https://github.com/kimyj08/web-project/assets/108450096/3432d9c3-9a6d-46ca-8a57-5ade549db086)


#### 주요 기능
프로젝트의 주요 기능 소개

- 로그인 된 권한에 따라 문의 글 작성 : 일반 회원, 브랜드 회원
- 작성 된 문의 글에 댓글 남기기 : 일반 - 브랜드 간 문의 글, 일반 - 관리자 간 문의 글, 브랜드 - 관리자 간 문의 글에서 댓글 달기
- 관리자 권한으로 로그인 시 전체 문의 글 조회
- 모든 문의 글은 댓글이 달리기 전까지 글 내용 및 제목 수정 가능 /  댓글이 달린 후는 글 내용 및 제목 수정 불가
- 모든 문의 글의 댓글은 해당 문의 글 작성자가 확인 전 까지 댓글 내용 수정 가능 / 해당 문의 글 작성자가 조회 후 댓글 수정 불가
- 문의 글 작성, 조회, 검색, 수정, 삭제 기능 구현.

#### 아키텍쳐

![image](https://github.com/kimyj08/web-project/assets/108450096/876197af-2eeb-4ba6-aba3-2ffb13a42693)

![image](https://github.com/kimyj08/web-project/assets/108450096/8a063663-06b7-440f-8046-6803e7e6c3e4)

![image](https://github.com/kimyj08/web-project/assets/108450096/1d54a2c2-6372-499d-a000-4f05e8026d11)

---

## commit message convention
### commit type
- feat : 새로운 기능 추가
- fix : 버그 수정
- docs : 문서 수정
- style : 코드 포맷팅, 세미콜론 누락, 코드 변경이 없는 경우
- refactor : 코드 리펙토링
- test : 테스트 코드, 리펙토링 테스트 코드 추가
- chore : 빌드 업무 수정, 패키지 매니저 수정

---

#### 기타 추가 사항들
- 부족한 점 : CRUD 기능 외에 사용자 권한 별 세부 기능들 구현 시 javascript를 주로 사용하여 코드 작업을 했는데 필요에 따라서는 Ajax도 이용했으면 좋게다는 생각이 들었다. 또한 코드 작성을 더 효율적이고 간결하게 할 수 있을 것 같은데 이 부분을 개선하지 못한 것이 부족한 부분이라고 생각이 든다.
- 개선하고 싶은 점 : 처음 데이터 테이블 구조를 세울 때 사용자 별 권한을 부여하도록 테이블 및 칼럼을 따로 설정하여서 코드 작업을 했으면 세부 기능 구현 작업 시 권한에 따른 코드를 작성할 때 효율적으로 코드를 작성할 수 있을 것 같다는 아쉬움이 있어서 이 부분을 개선하고 싶다.
- 느낀 점 : 기능 구현을 하다보니 생각보다 작은 부분에서도 코드 작업을 거쳐야 기능 구현이 가능하다는 것을 알게 되었을 때 놀라웠고 책임감을 조금 느꼈다. 그리고 여러 기능들을 구현하다 보니 점점 욕심이 생겨서 다른 기능들이나 구현한 기능을 보수하고 싶거나 하는 생각이 드는 부분들도 조금씩 내가 발전하는 것 같다는 생각이 들어서 재미있었다. 부족한 부분들도 많고 개선해야 할 부분도 많은 프로젝트이기에 조금씩 발전시켜 나가야겠다.
