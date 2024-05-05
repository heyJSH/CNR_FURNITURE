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
    </ul>
  </div>
</details>

<details>
  <summary><b>2. 마이페이지</b> (👈 Click)</summary>
  <div markdown="1">
    <ul>
      <li>'직원이름'과 '직원아이디'는 수정할 수 없다.</li>
      <li>'비밀번호', '전화번호'는 수정할 수 있다.
        <ol>
          <li>
            비밀번호, 전화번호 수정 시 포맷을 맞추도록 했다. <br>
            <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/7449c4dd-4328-4408-9483-82ddf8c29686" alt="직원정보수정">
          </li>
        </ol>
      </li>
    </ul>
  </div>
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
