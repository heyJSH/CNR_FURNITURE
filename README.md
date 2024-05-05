<h1 align="center">
  <br>
  <img src="https://github.com/jihyeon00/CNR_FURNITURE/assets/120089047/be0d3185-ce03-4e08-a777-5a3264c0c370" alt="Cozy&Rest Furniture" width="400">
  <br>
  가구 MES 웹 프로그램
  <br>
</h1>

## 📌 목차
1. [🖥️ 프로젝트 개요](#-프로젝트-개요)
2. [📕 주요기능](#-주요기능)
3. [🔧 아키텍처](#-아키텍처)
4. [🏗️ ERD](#-ERD)
5. [⚠️ 트러블 슈팅](#-트러블-슈팅)
6. [📖 파일명 설명 및 개발일정](#-파일명-설명-및-개발일정)
7. [📽️ 작동 영상](#-작동-영상)
8. [🗃️ 발표자료](#-발표자료)

      <br><br>

## 🖥️ 프로젝트 개요
### :calendar: 개발기간
  - 2024년 3월 19일 ~ 4월 21일 개발 진행
  ![image](https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/78905272-b349-4a12-a23d-5435d5c8c4fd)

### 🔖프로젝트 주제
  - 대상: 가구를 생산하고 제조하는 회사
  - 용도: 회사의 MES 프로그램
  - 선정 이유:
    <br>
      ① 가구 제조업이 다른 산업에 비해 복잡한 공정과 다양한 작업 단계를 포함함
    <br>
      ② 생산과 품질의 요구사항을 충족하고 자동화와 생산 효율이 필요하다고 생각함
### 📁프로젝트 구현 내용
  - aaaaa
### ⚙️ 개발환경 및 도구
  - `JAVA 17`
  - `JDK 17.0.2`
  - **IDE**: IntelliJ
  - **Framework**: Springboot(3.1.10)
  - **DataBase**: Oracle DB(ojdbc8)
  - **ORM**: Mybatis
  - **DevOps**: Maven, Git, GitHub
  - **Tools**: Discord, GoogleDrive, StarUML
### 🧑‍🤝‍🧑 멤버 구성
|팀원명|프로필|담당업무|
|---|---|---|
|[배지현<br>(팀장)](https://github.com/jihyeon00)|<p align="center"><img src="https://avatars.githubusercontent.com/u/120089047?v=4" width="100"></p>|회의 진행 및 일정·팀원 관리, 전체 설계 담당<br>RDBMS관리(OracleDB), 테이블 설계, 샘플데이터작성, ERD작성, 유즈케이스 작성<br>생산관리, 작업관리, 작업자관리|
|[김다은<br>(팀원)](https://github.com/dan3319)|<p align="center"><img src="https://avatars.githubusercontent.com/u/156730588?v=4" width="100"></p>|테이블 설계, 샘플데이터작성<br>설비관리, 설비점검|
|[이시연<br>(팀원)](https://github.com/sieoh)|<p align="center"><img src="https://avatars.githubusercontent.com/u/151722461?v=4" width="100"></p>|로고제작, 테이블 설계, 샘플데이터작성<br>로그인, 권한관리|
|[이현주<br>(팀원)](https://github.com/icanbewhatever)|<p align="center"><img src="https://avatars.githubusercontent.com/u/139785614?v=4" width="100"></p>|테이블 설계, 샘플데이터작성<br>제품/자재 정보관리, BOM 관리, 작업자 스케줄 조회|
|[정수하<br>(팀원)](https://github.com/heyJSH)|<p align="center"><img src="https://avatars.githubusercontent.com/u/150403977?v=4" width="100"></p>|테이블 설계, ERD작성<br>자재/제품 재고 조회, 품질관리|
|[조다혜<br>(팀원)](https://github.com/ChoDaHye)|<p align="center"><img src="https://avatars.githubusercontent.com/u/151722511?v=4" width="100"></p>|테이블 설계, 샘플데이터작성<br>제조계획지시, 제조수행지시, 공정정보관리|

<br><br>

## 📕 주요기능
원목 가구를 생산/제조하는 업체에서 사용하는 MES 시스템 프로그램을 제공한다.

<details>
  <summary><b>1. 로그인/비밀번호 재설정 [이시연]</b> (👈 Click)</summary>
  <br>
  <div markdown="1">
    <h3>로그인</h3>
    <ul>
      <li>Security를 활용하여 로그인한다.</li>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/f6fd7296-ad69-4b96-9804-8483eddedfde" alt="로그인1">
      <li>로그인 실패 시, Config의 오류 메시지를 받아서 View로 반환한다.</li>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/3f8d1bc2-bba2-482c-bb1c-787e56066516" alt="로그인2">
    </ul>
    <br>
    <h3>비밀번호 재설정</h3>
    <ul>
      <li>메일을 통해 일회용 인증코드를 전송하여 본인확인 후 비밀번호를 변경(재설정)할 수 있다.</li>
      <li>비밀번호 재설정 화면은 다음과 같다.</li>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/e5b90d48-379d-429a-ad38-3faa2ea6507d" alt="비밀번호 재설정1">
      <li>비밀번호 재설정 인증 이메일</li>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/746fb881-1959-4698-b0f7-04f35f20fe85" alt="비밀번호 재설정2">
      <li>비밀번호 재설정 인증번호를 입력 후, 비밀번호를 변경(재설정)할 수 있다.</li>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/60d917a5-9d5b-457d-a9ff-caff9fd6c735" alt="비밀번호 재설정3">
    </ul>
  </div>
</details>

<details>
  <summary><b>2. 사원정보조회/거래처관리/계약관리 [이시연]</b> (👈 Click)</summary>
  <br>
  <div markdown="1">
    <h3>사원정보조회</h3>
    <ul>
      <li>사원정보조회 화면</li>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/68f39768-82ee-45fd-8c1e-5c6559faa5fd" alt="사원정보조회">
    </ul>
    <br>
    <h3>거래처관리</h3>
    <ul>
      <li>거래처관리 화면</li>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/3749cb6b-2a36-4c6f-9234-953622588273" alt="거래처관리">
    </ul>
    <br>
    <h3>계약관리</h3>
    <ul>
      <li>계약관리 화면</li>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/12e38992-5e2c-40ba-8153-563c15e94ee1" alt="계약관리">
    </ul>
  </div>
</details>

<details>
  <summary><b>3. 권한관리 [이시연]</b> (👈 Click)</summary>
  <br>
  <h3>권한관리 - 권한 변경</h3>
  <ul>
    <li>직원 목록의 체크박스 선택 후, [권한변경] 버튼을 누르면 바로 위의 권한으로 변경할 수 있다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/3be67aeb-a96a-4ba7-859b-b18775f6ff91" alt="권한관리1">
  </ul>
  <br>
  <h3>권한관리 - 사원등록</h3>
  <ul>
    <li>[사원등록] 버튼을 누르면 사원등록 모달창이 뜬다.</li>
    <li>사원 정보 입력 후, [등록] 버튼을 누르면 DB에 저장이 된다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/ff698974-afb7-4b90-8491-7dee9e4e8412" alt="사원등록">
  </ul>
</details>

<details>
  <summary><b>4. 자재/제품정보관리 [이현주]</b> (👈 Click)</summary>
  <br>
  <h3>자재/제품정보관리 - 검색 인터페이스 & 조회</h3>
  <ul>
    <li>select box의 option에서 검색 주제를 선택한 후, 키워드를 입력하여 검색하면 해당하는 내용의 목록을 볼 수 있다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/508dfc17-c9b7-49bb-924e-9fd8603a7ba4" alt="자재/제품정보 검색">
  </ul>
  <br>
  <h3>자재/제품정보관리 - 등록</h3>
  <ul>
    <li>[제품등록] 버튼을 누르면 제품정보 등록 모달창이 뜬다.</li>
    <li>제품 정보 입력 후, [등록] 버튼을 누르면 DB에 저장된다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/4fad14e3-8670-4da3-b953-a88bde335404" alt="자재/제품정보 등록">
  </ul>
  <br>
  <h3>자재/제품정보관리 - 수정</h3>
  <ul>
    <li>[제품 목록]에서 원하는 행의 [수정] 버튼을 누르면 수정 모달창이 뜬다.</li>
    <li>수정할 내용을 입력 후, [수정] 버튼을 누르면 DB에 저장된다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/70ace592-ce92-4af7-89df-1b8d055bb2b8" alt="자재/제품정보 등록">
  </ul>
  <br>
  <h3>자재/제품정보관리 - 등록 및 sweetAlert2</h3>
  <ul>
    <li>외부 라이브러리를 사용하여 등록 시, 등록 확인용 alert창이 뜬다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/af1b1db0-e303-469e-9a5f-7841adb92c9d" alt="등록 및 sweetAlert2">
  </ul>
</details>

<details>
  <summary><b>5. BOM 관리 [이현주]</b> (👈 Click)</summary>
  <br>
  <h3>BOM 관리</h3>
  <ul>
    <li></li>
  </ul>
</details>

<br><br>

## 🔧 아키텍처
####  * 서버 배포를 진행하지 않았음
![C_R-FURNITURE-아키텍처](https://github.com/jihyeon00/CNR_FURNITURE/assets/120089047/2e26b54e-86aa-4711-ad6d-11b6d36f420e)
<br><br>

## 🏗️ ERD
DB와 ERD <br>
![ERD](https://github.com/jihyeon00/CNR_FURNITURE/assets/120089047/6e185a73-564b-4d12-ae31-2379761be4ab)
<br><br>

## ⚠️ 트러블 슈팅
<br><br>

## 📖 파일명 설명 및 개발일정
[[📑 파일명 설명 및 개발일정]](https://docs.google.com/spreadsheets/d/1f2Vgb-qmd-GQKiG3kfBYp12KGKcHwL41/edit?usp=sharing&ouid=106247567413866015973&rtpof=true&sd=true)

<br><br>

## 📽️ 작동 영상
[📹 작동 영상]()

<br><br>

## 🗃️ 발표자료
[[📂 발표자료]](https://www.canva.com/design/DAGB09QYuLw/aAn0IDhyphJN4kNFbcFN7g/edit?utm_content=DAGB09QYuLw&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)
