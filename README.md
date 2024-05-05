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
  <h3>BOM 관리 - 세부목록 조회</h3>
  <ul>
    <li>제품번호 클릭 시, 해당하는 자재리스트를 조회할 수 있다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/e5d0454b-2828-4f13-8cf2-923272e72988" alt="BOM 세부목록 조회">
  </ul>
  <br>
  <h3>BOM 관리 - 세부목록 수정</h3>
  <ul>
    <li>원하는 행의 [수정] 버튼을 누른 후 값을 입력하고 [수정] 버튼을 누르면 DB에 저장된다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/d97aab8b-b26f-41bb-a83a-096e10483150" alt="BOM 수정">
  </ul>
  <br>
  <h3>BOM 관리 - BOM 등록</h3>
  <ul>
    <li>'제품번호', '자재번호'를 선택하고 '단위', '수량'을 입력한 후, [추가] 버튼을 누르면 DB에 저장된다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/2fd179a2-0b65-4c76-a657-331d633e9faa" alt="BOM 등록">
  </ul>
</details>

<details>
  <summary><b>6. 작업자 스케쥴 조회: 월별 스케줄러 [이현주]</b> (👈 Click)</summary>
  <br>
  <h3>작업자 스케쥴 조회</h3>
  <ul>
    <li>구글 캘린더 API를 적용하여 작업자의 스케쥴을 조회할 수 있도록 했다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/f89201c2-f113-4e08-91e1-25d5cc13d0ed" alt="작업자 스케쥴 조회">
  </ul>
</details>

<details>
  <summary><b>7. 제조지시/제조수행지시/공정정보관리 [조다혜]</b> (👈 Click)</summary>
  <br>
  <h3>제조지시/제조수행지시/공정정보관리 - 검색</h3>
  <ul>
    <li>datalist를 사용하여 검색 키워드를 입력하거나, 선택할 수 있다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/57b4268a-f21e-403b-adcf-7a5f3942cd58" alt="제조지시 등 검색list">
  </ul>
  <br>
  <h3>제조지시 - 등록</h3>
  <ul>
    <li>[등록] 버튼을 누르면 모달창이 뜬다.</li>
    <li>계약 목록에서 원하는 계약을 선택한 후 [+] 버튼을 누르면, 계약 정보가 자동으로 등록된다.</li>
    <li>세부 정보를 입력하고 [추가] 버튼을 누르면 제조지시 목록에 나타난다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/2c8ec92d-d1c9-4c32-aebf-e2bcf1f43407" alt="제조지시 등록1">
    <li>원하는 만큼 정보를 추가한 후, [등록] 버튼을 누르면 DB에 저장된다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/1b795249-6b2e-45dd-a4fe-a4b974a03de8" alt="제조지시 등록2">
  </ul>
  <br>
  <h3>제조지시 - PDF 저장</h3>
  <ul>
    <li>'제조지시 목록'에서 저장을 원하는 행의 체크박스를 선택 후, [계약 내역서]를 누르면 '제품 공급 계약 내역서'를 조회할 수 있다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/b56036b9-b660-41fe-ad2f-9cc3e7b32329" alt="pdf 저장1">
    <li>jsPDF 라이브러리를 연결하여, [PDF로 보기] 버튼을 누르면 PDF 파일로 저장할 수 있다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/87d47a84-7aa2-44ab-aad7-e09e99d5a252" alt="pdf 저장2">
  </ul>
  <br>
  <h3>제조수행지시 - 등록</h3>
  <ul>
    <li>[등록] 버튼을 누르면 제조수행지시등록 모달창이 뜬다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/1eb05ea4-44f2-474d-8759-b57e4a705279" alt="제조수행지시 등록1">
    <li>내용을 입력한 후, [추가] 버튼을 누르면 하단에 목록이 생긴다.</li>
    <li>추가한 목록은 [삭제] 버튼을 통해 삭제할 수 있다.</li>
    <li>원하는 만큼 추가한 후, [등록] 버튼을 누르면 DB에 저장된다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/0da4d35e-d7ed-4026-a3fd-acf18b0eee34" alt="제조수행지시 등록2">
  </ul>
  <br>
  <h3>공정정보관리 - 등록</h3>
  <ul>
    <li>[등록] 버튼을 누르면 공정정보등록 모달창이 뜬다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/42f99311-f22a-4090-9f8e-45226459ef09" alt="공정정보 등록1">
    <li>'설비목록'에서 검색을 통해 조회가 가능하고, 원하는 설비를 선택한 후, [+] 버튼을 누르면 '추가된 설비목록'으로 이동한다.</li>
    <li>'추가된 설비목록'에서 원하는 설비를 선택하고 [+] 버튼을 누르면 상단의 input에 값이 채워진다.</li>
    <li>나머지 세부정보를 입력하고 [공정등록] 버튼을 누르면 DB에 저장된다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/4eb97f31-353a-46ba-b9a2-bf8cef55ad7d" alt="공정정보 등록2">
  </ul>
</details>

<details>
  <summary><b>8. 공정관리 [배지현]</b> (👈 Click)</summary>
  <br>
  <h3>공정관리 - 작업관리 - 검색 및 조회</h3>
  <ul>
    <li>대부분의 검색항목을 datalist를 이용하여 해당하는 항목의 정보를 확인하고 가져올 수 있도록 했다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/37933cfc-ed88-4cc4-a2f0-769c4952e9db" alt="작업관리 검색">
  </ul>
  <br>
  <h3>공정관리 - 작업관리 - 조회 및 작업등록</h3>
  <ul>
    <li>work의 작업목록 위에 있는 [작업등록] 버튼을 누르면 '작업등록 모달창'이 뜬다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/846c1325-e839-474e-971f-2229d2c02a2f" alt="작업등록1">
    <li>'제조LOT번호'를 입력하면,<br>'제품번호', '제품명', '생산단위'의 내용이 자동으로 채워진다.</li>
    <li>'공정번호'를 입력하면,<br>'설비번호', '설비명', '작업위치', '남은생산수량'의 내용이 자동으로 채워진다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/a8dd3322-7fa9-42e8-99d7-3b2baf81c18a" alt="작업등록2">
    <li>나머지 세부 정보를 입력한 후, [추가] 버튼을 누르면 입력한 데이터가 배열에 저장되고 '작업등록목록'을 조회할 수 있다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/59a5476d-1ecc-4470-ae50-680bd890efdc" alt="작업등록3">
    <li>원하는 만큼 추가한 후, [등록] 버튼을 누르면 DB에 저장된다.</li>
    <li>이 때, 소요시간 계산 수식은 다음과 같다.</li>
    <ul>
      <li>소요시간 = 작업종료시간 - 작업시작시간</li>
      <li>조건1. 작업시간 차이가 810분(13시간 30분) 이상인 경우 -90분</li>
      <li>조건2. 작업시간 차이가 4시간 이상 8시간 미만인 경우 -30분</li>
      <li>조건3. 작업시간 차이가 4시간 미만인 경우 -0분</li>
      <li>그 외. -60분</li>
    </ul>
  </ul>
  <br>
  <h3>공정관리 - 작업관리 - 작업 상세 및 수정/삭제</h3>
  <ul>
    <li>work의 '작업목록' 중, [작업상세] 버튼을 누르면, 작업상세 조회와 수정/삭제를 할 수 있는 모달창이 나타난다.</li>
    <li>앞서 작업등록에 이용된 것처럼, '작업종료시간 - 작업시작시간'으로 소요시간을 계산한다.</li>
    <li>작업시작시간이 현재시간보다 과거라면, 이미 작업이 시작된 것으로 readonly 속성을 가진다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/e7d83890-26a1-492e-a4de-31b682f5e586" alt="작업상세 수정1">
    <ul>
      <li><b>수정할 경우, 한 번에 수정되어야 할 사항은 다음과 같다.</b></li>
      1. 생산수량이 1 이상일 경우, process 테이블의 누적생산수량에 합해진다.<br>
      2. 진행상황이 '작업중'일 경우, 설비 작동 테이블의 MW_STATUS = '가동'<br>
      3. 진행상황이 '작업정지' 혹은 '작업종료'일 경우, 설비 작동 테이블의 MW_STATUS = '비가동'<br>
      4. 진행상황이 '작업중단'일 경우, 설비 작동 테이블의 MW_STATUS = '수리중', MW_CONDITION = '수리요청'
    </ul>
    <li>한 번에 수정하기 위하여, MyBatis를 이용해 작성한 쿼리를 트랜잭션 처리하도록 했다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/9928b7a8-e445-4023-b076-c020e801b047" alt="작업상세 수정2">
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
