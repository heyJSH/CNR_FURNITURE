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
7. [💌 Figma 화면 설계](#-Figma-화면-설계)
8. [📽️ 작동 영상](#-작동-영상)
9. [🗃️ 발표자료](#-발표자료)

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

### ⚙️ 개발환경 및 도구
  - `JAVA 17`
  - `JDK 17.0.2`
  - **IDE**: IntelliJ
  - **Framework**: Springboot(3.1.10)
  - **DataBase**: Oracle DB(ojdbc8)
  - **ORM**: Mybatis
  - **DevOps**: Maven, Git, GitHub
  - **Tools**: Discord, GoogleDrive, StarUML
### 🧑‍🤝‍🧑 멤버 구성 [저는 정수하 입니다!]
|팀원명|프로필|담당업무|
|---|---|---|
|[배지현<br>(팀장)](https://github.com/jihyeon00)|<p align="center"><img src="https://avatars.githubusercontent.com/u/120089047?v=4" width="100"></p>|회의 진행 및 일정·팀원 관리, 전체 설계 담당<br>RDBMS관리(OracleDB), 테이블 설계, 샘플데이터작성, ERD작성, 유즈케이스 작성<br>생산관리, 작업관리, 작업자관리|
|[김다은<br>(팀원)](https://github.com/dan3319)|<p align="center"><img src="https://avatars.githubusercontent.com/u/156730588?v=4" width="100"></p>|테이블 설계, 샘플데이터작성<br>설비관리, 설비점검|
|[이시연<br>(팀원)](https://github.com/sieoh)|<p align="center"><img src="https://avatars.githubusercontent.com/u/151722461?v=4" width="100"></p>|로고제작, 테이블 설계, 샘플데이터작성<br>로그인, 권한관리|
|[이현주<br>(팀원)](https://github.com/icanbewhatever)|<p align="center"><img src="https://avatars.githubusercontent.com/u/139785614?v=4" width="100"></p>|테이블 설계, 샘플데이터작성<br>제품/자재 정보관리, BOM 관리, 작업자 스케줄 조회|
|[정수하<br>(팀원)](https://github.com/heyJSH)|<p align="center"><img src="https://avatars.githubusercontent.com/u/150403977?v=4" width="100"></p>|테이블 설계, ERD작성<br>제품 재고 조회, 품질관리|
|[조다혜<br>(팀원)](https://github.com/ChoDaHye)|<p align="center"><img src="https://avatars.githubusercontent.com/u/151722511?v=4" width="100"></p>|테이블 설계, 샘플데이터작성<br>제조계획지시, 제조수행지시, 공정정보관리|

<br><br>

## 📕 주요기능
원목 가구를 생산/제조하는 업체에서 사용하는 MES 시스템 프로그램을 제공한다.


<details>
  <summary><b>품질관리</b> (👈 Click)</summary>
  <br>
  <h3>품질관리 - 수입검사관리 화면</h3>
  <ul>
    <li>수입검사관리 화면에서 할 수 있는 것은 다음과 같다.</li>
    <ul>
      <li>검색 및 조회</li>
      <li>등록</li>
      <li>수정</li>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/bf6cd88e-f150-4a48-9ed9-192ab83205e2" alt="수입검사관리 화면">
    </ul>
  </ul>
  <br>
  <h3>품질관리 - 수입검사관리 - 검색 및 조회</h3>
  <ul>
    <li>화면 상단의 '검색창'에서 datalist를 통해 검색용 데이터를 조회하면서 입력할 수 있다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/6a794c60-b7ee-48e1-be13-d32141435531" alt="수입검사관리 - 검색 및 조회1">
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/672d8629-9ff6-424c-85e5-822fb287a1c8" alt="수입검사관리 - 검색 및 조회1-2">
    <li>'검색창'의 '불량유형1'을 선택하면, '불량유형1'에 따른 '불량유형2'의 option을 조회하고 선택할 수 있다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/f68f15b0-13e5-4985-a1cb-08233b9a7d46" alt="수입검사관리 - 검색 및 조회2">
    <li>검색 키워드 입력 후, [검색] 버튼을 누르면, 해당하는 내용을 조회할 수 있다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/d8e7dba3-f61f-461e-8926-a636bc38eccb" alt="수입검사관리 - 검색 및 조회3">
  </ul>
  <br>
  <h3>품질관리 - 수입검사관리 - 등록</h3>
  <ul>
    <li>[자재불량등록] 버튼을 누르면, '수입검사 - 자재불량 및 입고등록' 모달창이 나타난다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/deb4497c-6d38-4f2f-8def-ce763b655f43" alt="수입검사관리 - 등록1">
    <li>'수입검사관리 등록 모달창' 내의 로직은 다음과 같다.</li>
    <ul>
      <b>1. '계약번호' 입력 시, 관련 내용이 자동으로 채워진다. → Ajax 사용</b>
      <ul>
        <li>거래처명</li>
        <li>단위</li>
        <li>자재번호</li>
        <li>자재명</li>
        <li>자재용도</li>
        <li>계약입고수량</li>
        <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/b188046a-9298-45a0-9ff1-a05ef3539e86" alt="수입검사관리 - 등록2">
      </ul>
      <b>2. 나머지 정보를 입력하고 [추가] 버튼을 누르면, '자재불량목록'에서 추가된 내용을 확인할 수 있다.</b>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/edba8d6c-8ee3-45a3-a915-4646cb04afbe" alt="수입검사관리 - 등록3">
      <ul>
        <li>이 때, 동일한 검사 대상이더라도, 다양한 불량유형이 있을 수 있다.</li>
        <li>위의 조건이라면, 자동으로 '양품수량'을 계산하여 표기하도록 했다.</li>
        <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/4c712f58-14f0-4644-a837-53fe06c12e9b" alt="수입검사관리 - 등록4">
        <li>'불량유형2', '비고'는 null 가능하지만, 다른 항목은 null이 불가능하다.</li>
        <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/bc123911-2939-4558-8a8f-b52c3d41a1d9" alt="수입검사관리 - 등록5">
      </ul>
      <b>3. 원하는 만큼 추가한 후, [등록] 버튼을 누르면, 테이블에서 데이터를 수집한 후, ajax 통신으로 DB에 저장된다.</b>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/c92149a0-5709-4303-b3b5-bb1cbe29b62b" alt="수입검사관리 - 등록6">
    </ul>
    <li><b>[최종 등록] 시, DB에 저장되는 로직과 코드는 다음과 같다.</b></li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/857b4701-5b61-4312-8c4c-9d917cafea1c" alt="수입검사관리 - 등록7">
  </ul>
  <br>
  <h3>품질관리 - 수입검사관리 - 수정</h3>
  <ul>
    <li>'수입검사현황' 목록에서 원하는 행의 [수정] 버튼을 누르면, 수정 모달창이 나타난다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/e8bd7576-f73d-4ffd-8950-53c719abffbb" alt="수입검사관리 - 수정1">
    <li>모달창의 input에는 선택한 행의 정보가 담겨져 있다.</li>
    <li>'불량유형1', '불량유형2', '비고'의 내용을 수정한 후, [등록] 버튼을 누르면, 수정사항이 DB에 저장된다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/f5d32359-9203-48c3-a4c3-7d3c09ed0e08" alt="수입검사관리 - 수정2">
  </ul>
  <br>
  <h3>품질관리 - 공정검사관리 화면</h3>
  <ul>
    <li>공정검사관리 전체 화면은 사진과 같다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/0c5f80bb-5250-406b-9cdd-e6509cfbaaa1" alt="공정검사관리 - 전체화면1">
  </ul>
  <br>
  <h3>품질관리 - 공정검사관리 - 등록</h3>
  <ul>
    <li>[공정불량등록] 버튼을 누른다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/b9c24b33-295b-49e3-b1fa-cb24c3c6c0e0" alt="공정검사관리 - 등록1">
    <li>'공정검사 - 공정불량등록' 모달창이 나타난다.</li>
    <li>'작업번호' 입력 시, '공정번호', '공정명', '제조LOT번호', '설비번호', '단위', '일일총작업수량'의 내용이 자동으로 채워진다.</li>
    <li>세부내용을 입력한 후 [추가] 버튼을 누르면, 모달창 하단에 '공정불량목록'이 나타난다.</li>
    <li>원하는 만큼 내용을 추가한 후, [등록] 버튼을 누르면, DB에 저장된다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/3914d86e-ef99-4ac4-b26a-899364fbb592" alt="공정검사관리 - 등록2">
    <li><b>[최종 등록] 시, DB에 저장되는 로직과 코드는 다음과 같다.</b></li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/496b42a0-62c8-4e5e-b779-599b032e054c" alt="공정검사관리 - 등록3">
  </ul>
  <br>
  <h3>품질관리 - 공정검사관리 - 수정</h3>
  <ul>
    <li>'공정검사현황' 목록에서 원하는 행의 [수정] 버튼을 누르면, 수정 모달창이 나타난다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/9876c36e-e619-470d-8c2c-85dc843cd974" alt="공정검사관리 - 수정1">
    <li>모달창의 input에는 선택한 행의 데이터가 담겨져 있다.</li>
    <li>'불량유형1', '불량유형2', '비고'의 내용을 수정한 후, [등록] 버튼을 누르면, 수정사항이 DB에 저장된다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/05aa1f77-9bca-4546-a060-115d5edbca95" alt="공정검사관리 - 수정2">
  </ul>
  <br>
  <h3>품질관리 - 출하검사관리 화면</h3>
  <ul>
    <li>검사관리 전체 화면은 사진과 같다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/3f094408-8443-4aff-9fed-7cc85347f2a1" alt="출하검사관리 - 전체화면1">
  </ul>
  <br>
  <h3>품질관리 - 출하검사관리 - 등록</h3>
  <ul>
    <li>[제품불량등록] 버튼을 누르면, 등록 모달창이 나타난다.</li>
    <li>'작업번호' 입력 시, '제조LOT번호', '공정번호', '제품번호', '제품명', '제품색상', '제품규격', '단위', '일일총작업수량'의 내용이 자동으로 채워진다.</li>
    <li>세부내용을 입력한 후 [추가] 버튼을 누르면, 모달창 하단에 '제품불량목록'이 나타난다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/446d64d0-55ee-4c4b-80d9-568296f04933" alt="출하검사관리 - 등록1">
    <li><b>[최종 등록] 시, DB에 저장되는 로직과 코드는 다음과 같다.</b></li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/ccc566a3-42ba-4b2d-82d9-162e1afcdcc8" alt="출하검사관리 - 등록2">
  </ul>
  <br>
  <h3>품질관리 - 출하검사관리 - 수정</h3>
  <ul>
    <li>'출하검사현황' 목록에서 원하는 행의 [수정] 버튼을 누르면, 수정 모달창이 나타난다.</li>
    <li>모달창의 input에는 선택한 행의 데이터가 담겨져 있다.</li>
    <li>'불량유형1', '불량유형2', '비고'의 내용을 수정한 후, [등록] 버튼을 누르면, 수정사항이 DB에 저장된다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/4fedb017-b44f-42fd-aa49-c38532cc8e74" alt="출하검사관리 - 수정1">
  </ul>
  <br>
  <h3>품질관리 - 공정불량실적</h3>
  <ul>
    <li>각 공정번호 별, 불량유형에 따라 불량 실적을 검색 및 조회할 수 있다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/a855aab8-b4a0-4000-8a88-c0712e241524" alt="공정불량실적1">
  </ul>
  <br>
  <h3>재고관리 - 제품재고조회</h3>
  <ul>
    <li>제품 재고를 검색 및 조회할 수 있다.</li>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/bad036c2-681d-4342-8ce7-14a8c098b338" alt="제품재고조회">
  </ul>
</details>

<br><br>

## 🔧 아키텍처
####  * 서버 배포를 진행하지 않았음
![image](https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/bd1df5df-bd1a-4481-bd5b-6d7ab40cacbe)

<br><br>

## 🏗️ ERD
DB와 ERD <br>
![ERD](https://github.com/jihyeon00/CNR_FURNITURE/assets/120089047/6e185a73-564b-4d12-ae31-2379761be4ab)
<br><br>

## ⚠️ 트러블 슈팅 [정수하]
<details>
  <summary>트러블슈팅1: <b>불량 등록 시, 사용자 편의성 고려</b> (👈 Click)</summary>
  <br>
  <div markdown="1">
    <h2>문제점</h2>
    <b>1. DB에 저장하기 위해 필요한 정보지만, 사용자가 굳이 일일이 적을 필요는 없다.</b>
    <ul>
      <li>수입검사 자재 불량 등록 시, '계약번호'만 입력하면 '거래처명', '단위', '자재번호', '자재명', '자재용도', '계약입고수량'은 사용자가 굳이 적지 않아도 된다.</li>
      <li>공정검사 공정 불량 등록 시, 제품이 되지 않고, 중간 단계인 '작업번호'만 입력하면 '공정번호', '공정명', '제조LOT번호', '설비번호', '단위', '일일총작업수량'은 사용자가 굳이 적지 않아도 된다.</li>
      <li>출하검사 제품 불량 등록 시, 제일 마지막 공정의 제일 마지막 설비(제품이 완성되는 마지막 공정)의 '작업번호'만 입력하면 '제조LOT번호', '공정번호', '제품번호', '제품명', '제품색상', '제품규격', '단위', '일일총작업수량'은 사용자가 굳이 적지 않아도 된다.</li>
    </ul>
    <h2>해결방안</h2>
    <b>1. 사용자가 최소한의 정보를 입력하면, 관련된 내용이 자동으로 채워지도록 했다.</b>
    <ul>
      <li>수입검사관리 - 불량등록</li>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/3e8519cc-85f7-4099-9e56-b8bc8154670c" alt="수입검사 불량등록 자동채우기">
      <li>공정검사관리 - 불량등록</li>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/db5da4cf-8d89-4202-9c61-6614ded6d578" alt="공정검사 불량등록 자동채우기">
      <li>출하검사관리 - 불량등록</li>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/9767e513-fc97-4bb1-9c20-0f46c1d622e7" alt="출하검사 불량등록 자동채우기">
    </ul>
</details>

<details>
  <summary>트러블슈팅2: <b>불량 등록 시, DB에 추가하는 방법 결정</b> (👈 Click)</summary>
  <br>
  <div markdown="1">
    <h2>문제점</h2>
    <b>1. DB 저장하는 방법 두 가지 중에서 결정해야 한다.</b>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/855d6b07-d3a9-46a6-b4f0-b76882b8e316" alt="등록 모달창">
    <ol>
      <li>AJAX를 사용하여 [추가] 버튼을 누를 때마다 DB에 직접 INSERT하는 방법</li>
      <ul>
        <b>장점:</b>
        <li><b>데이터 무결성 보장: </b>데이터가 바로 DB에 저장되므로, 사용자의 세션이 종료되거나 브라우저가 갑자기 닫혀도 데이터는 안전하게 저장된다.</li>
        <li><b>즉각적인 피드백: </b>저장 성공 여부를 사용자에게 즉시 알릴 수 있어, 사용자 경험이 향상된다.</li>
        <b>단점: </b>
        <li><b>서버 부하 증가: </b>매 추가마다 서버와의 통신이 발생하여 서버 부하가 증가할 수 있다.</li>
        <li><b>트래픽 증가: </b>네트워크 사용량이 많아질 수 있으며, 이는 특히 대규모 사용자가 있는 환경에서 문제가 될 수 있다.</li>
        <li><b>복잡한 트랜잭션 관리: </b>사용자가 여러 데이터를 빠르게 추가할 경우, 동시성 관리와 트랜잭션 롤백 처리가 복잡해질 수 있다.</li>
      </ul>
      <li>[추가] 버튼을 누를 때마다 데이터를 클라이언트 측에서 관리하고, [등록] 버튼을 눌러 한 번에 DB에 INSERT하는 방법</li>
      <ul>
        <b>장점:</b>
        <li><b>효율적인 리소스 사용: </b>서버 요청의 수를 줄여 네트워크 트래픽과 서버 부하를 크게 줄일 수 있다.</li>
        <li><b>사용자 경험 향상: </b>데이터를 로컬에서 관리하면서 빠르게 목록을 업데이트 할 수 있으므로, 더욱 부드러운 사용자 인터페이스 제공이 가능하다.</li>
        <b>단점:</b>
        <li><b>데이터 무결성 위험: </b>세션 종료 또는 브라우저 문제 발생 시 입력 데이터가 손실될 수 있다.</li>
        <li><b>최종 검증 지연: </b>사용자가 실수로 잘못된 정보를 입력할 경우, 그 오류를 발견하는 시점이 지연될 수 있다.</li>
      </ul>
    </ol>
    <br>
    <h2>해결방안</h2>
    <b>1. 효율적인 리소스 사용을 위해 두 번째 방법을 택했다.</b>
    <ul>
      고려 사항은 다음과 같다.
      <li>모달창 내에 있는 정보들은 최종적으로 등록되기 전에 <b>미리보기</b> 느낌으로 보여주는 의미가 더 강하다고 생각했다.</li>
      <li>[추가] 버튼을 누를 때마다 DB에 직접 저장이 되는 것은 필요없는 정보도 저장되면서 서버를 힘들게 한다고 생각했다.</li>
      <li>따라서, 의미없는 정보를 입력하지 않도록 JS에서 유효성 검사를 하도록 한 후, [등록] 버튼을 눌렀을 때, DB에 저장되도록 했다.</li>
    </ul>
    <ol>
      <li>[추가] 버튼을 누르면 입력했던 내용이 테이블에 조회되도록 한다.</li>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/fa28729a-d013-4015-b019-4b15e3c1a6ec" alt="추가버튼 JS 코드">
      <li>[등록] 버튼을 누르면 테이블의 내용을 조회한 후, Ajax로 DB에 저장되도록 한다.</li>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/9906483b-49d7-40e5-9653-0caa52d00e67" alt="등록버튼 JS 코드">
      위의 코드는 "수입검사 불량등록" 이지만, "공정검사", "출하검사"의 DB 저장 로직도 동일하다.
    </ol>
  </div>
</details>

<details>
  <summary>트러블슈팅3: <b>수입검사 - DB 저장 순서</b> (👈 Click)</summary>
  <br>
  <div markdown="1">
    <h2>문제점</h2>
    <b>1. [등록] 버튼을 한 번 누를 시, 3개의 테이블에 DB를 저장해야 한다.</b>
    <ul>
      <li>품질검사 테이블[quality_inspection]</li>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/52cb980d-201a-47d2-b6cf-68e46849ac48" alt="품질검사 테이블">
      <li>계약 테이블[contract]</li>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/c6709a32-170f-4248-98d2-ebb76e2f44c7" alt="계약 테이블">
      <li>재고 테이블[inventory]</li>
      <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/04d80235-0d10-4d66-b89d-d7b5f3d6ff9b" alt="재고 테이블">
    </ul>
    <h2>해결방안</h2>
    <b>1. 트랜잭션 사용</b>
    <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/cb289c59-ba19-4005-b2ff-5efc00e81b42 alt="트랜잭션">
    <h3>3개의 테이블과 컬럼은 다음과 같다.</h3>
    <h3>품질검사 테이블[quality_inspection]</h3>
    <b>기존 데이터가 없으므로, 모달창에 입력했던 내용을 INSERT</b>
    컬럼은 다음과 같다.
    <ol>
      <li>계약ID</li>
      <li>자재ID</li>
      <li>품질기준ID</li>
      <li>검사수량</li>
      <li>양품수량</li>
      <ul>
        <li>[양품수량] = [검사수량 - 불량수량] 이지만,</li>
        <li>같은 계약으로 들어온 자재의 '검사수량'은 변할 수 없고,</li>
        <li>동일한 계약의 동일한 자재를 검사하더라도 불량유형의 종류가 다양할 수 있으므로, 아래와 같이 누적되어 계산되도록 해야 한다.</li>
        <li>[양품수량] = [검사수량] - ([불량유형1의 불량수량] + [불량유형2의 불량수량] + [불량유형3의 불량수량] + [불량유형4의 불량수량] + ...)</li>
        <img src="https://github.com/heyJSH/CNR_FURNITURE/assets/150403977/db95fec7-282b-489c-8627-a463799b0fd6" alt="양품수량 계산">
      </ul>
      <li>불량수량</li>
      <li>기록날짜</li>
      <ul>
        <li>sysdate</li>
      </ul>
      <li>비고</li>
    </ol>
    <h3>계약 테이블[contract]</h3>
    <b>기존 데이터가 있는데 특정 컬럼에만 값을 넣으므로, UPDATE</b>
    <ol>
      <li>실제 수량</li>
      <ul>
        <li>검사수량(qi_inspection_quantity)와 같은 값을 넣어야 함</li>
      </ul>
      <li>실제 입고일</li>
      <ul>
        <li>검사기록날짜(qi_date)와 같은 값을 넣어야 함</li>
      </ul>
    </ol>
    <h3>재고 테이블[inventory]</h3>
    <b>기존 데이터가 있는지 먼저 판단해야 함</b>
    <ul>
      <li>input 입력칸에 입력한 '계약번호(ct_id)'에 따른 '자재번호(m_id)'를 재고 테이블(inventory)에서 조회해야 함</li>
      <b>기존 데이터가 없을 경우, INSERT</b>
      <ol>
        <li>자재ID</li>
        <li>재고수량</li>
        <ul>
          <li>양품수량 값과 같은 값을 넣어야 함</li>
        </ul>
        <li>재고단위</li>
        <ul>
          <li>계약 테이블에서 계약ID가 같은 단위(ct_unit)와 같은 값을 넣어야 </li>
        </ul>
      </ol>
      <b>기존 테이터가 있을 경우, UPDATE</b>
      모달창에서 입력된 정보 중, [자재번호]와 같은 'inv_material_id'가 있다면,
      <ol>
        <li>재고수량(inv_quantity)</li>
        <ul>
          <li>[기존의 재고수량] + [양품수량]</li>
        </ul>
      </ol>
    </ul>
  </div>
</details>
<br><br>

## 📖 파일명 설명 및 개발일정
[[📑 파일명 설명 및 개발일정]](https://docs.google.com/spreadsheets/d/1f2Vgb-qmd-GQKiG3kfBYp12KGKcHwL41/edit?usp=sharing&ouid=106247567413866015973&rtpof=true&sd=true)

<br><br>

## 💌 Figma 화면 설계
[[📃 Figma 화면 설계]](https://www.figma.com/file/TJCIsPWBYpiGFq3VZo7aAL/Cozy%26Rest-FURNTIURE?type=design&node-id=12%3A29&mode=design&t=aUd3q1s9bI56t4N3-1)

<br><br>

## 📽️ 작동 영상
[[📹 작동 영상]](https://drive.google.com/file/d/1XMyq7nY6RMWWIbY-3hHvlq5u0yq_x1Qo/view?usp=sharing)

<br><br>

## 🗃️ 발표자료
[[📂 발표자료]](https://www.canva.com/design/DAGB09QYuLw/aAn0IDhyphJN4kNFbcFN7g/edit?utm_content=DAGB09QYuLw&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)
