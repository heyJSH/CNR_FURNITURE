<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<link rel="stylesheet" href="/resources/css/bom.css">
<%@ include file="../includes/header.jsp" %>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-md-6">
            <h1 class="m-0"><i class="far fa-clipboard"></i> BOM 등록</h1>
          </div><!-- /.col -->
          <div class="col-md-6">         
            <div class="resetBtn2">
               <a href="./bomInsert"><img class="resetPng" alt="reset" src="/resources/img/reset.png" ></a>
            </div>
          </div>
      </div><!-- /.container-fluid -->
    </div>
    <!-- /.content-header -->

    <!-- Main content -->
    <div class="content">
      <div class="container-fluid">
        <div class="row">
          <div class="col-md-6">
            <!-- BOM 등록 테이블 -->
            <div class="ITableName"></div>
             <!-- BOM 등록 -->
             <div class="bomInsertBox">
               <form id="bomInsert-form">		        	
			        	<div class="row modal-content1">
									<div class="col-md-6">
					          제품 번호
					          <input type="text" name="" id="" class="form-control" autocomplete="off">
			          	</div>
			          	<div class="col-md-6">
					          제품명
					          <input type="text" name="" id="" class="form-control" autocomplete="off">
				          </div>		
			          </div>	
							
								<div class="row modal-content2">
									<div class="col-md-6">
					          자재 번호
					          <input type="text" name="" id="" class="form-control" autocomplete="off">
			          	</div>
			          	<div class="col-md-6">
					          자재명
				          	<input type="text" name="" id="" class="form-control" autocomplete="off">
			          	</div>		
			          </div>
		          	<div class="row modal-content3">
									<div class="col-md-6">
					         자재 단위
					          <input type="text" name="" id="" class="form-control" autocomplete="off">
		          		</div>
			          	<div class="col-md-6">
					          자재 수량
					          <input type="text" name="" id="" class="form-control" autocomplete="off">
				          </div>		
		          	</div>		          				          
	        		</form>
		        		<div class="col-sm-1 ml-auto addLine">
	              	<button type="button" class="btn btn-Primary bomBtn" id="" name="">추가</button>
	           	  </div>
           	</div>

            <div class="table">
            <table cellpadding="0" cellspacing="0" border="0" class="bomInsertTable">
              <thead class="tbl-header">
                <tr>
                  <th>NO</th>
                  <th>제품 번호</th>
                  <th>자재 번호</th>
                  <th>단위</th>
                  <th>수량</th>
                </tr>
              </thead>
              <tbody class="tbl-content" style="height: 400px;">
                <tr>
                  <td>1</td>
                  <td>10000001</td>
                  <td>20000001</td>
                  <td>m</td>
                  <td>1</td>
                </tr>
                 <tr>
                  <td>1</td>
                  <td>10000001</td>
                  <td>20000001</td>
                  <td>m</td>
                  <td>1</td>
                </tr>
                 <tr>
                  <td>1</td>
                  <td>10000001</td>
                  <td>20000001</td>
                  <td>m</td>
                  <td>1</td>
                </tr>           
              </tbody>
            </table>
            <!-- /.table -->
         </div>
	         <div class="insertBom-btn">
		          <button type="button" class="btn btn-primary bomBtn" id="" name="">등록</button>
		          <div style="width: 10px;"></div>    
		          <button type="button" class="btn btn-danger bomBtn" id="" name="">취소</button>
			    </div>
        </div>

          <div class="col-md-6">
            <!-- 제품 목록 테이블 -->
            <div class="ITableName">
              <div class="icon"><i class="fa fa-list"></i></div>
              <div>제품 목록</div>
              <form id='searchItemBominsert' action='./bomInsert' method='get' class="bomSearchBtn"> 
	             	<div class="col-sm-1">
		            	<select name='type'>
		            		<option value="">--선택--</option>
						    		<option value="INum"<c:out value="${bomSearch.type == 'INum' ? 'selected' : ''}" />>제품번호</option>
				    				<option value="IName"<c:out value="${bomSearch.type == 'IName' ? 'selected' : ''}" />>제품명</option>
		            	</select>
	            	</div>
                <div class="col-sm-1">
	        	      <input type="text" name="keyword" />
	          	  </div> 
		            <div class="col-sm-1">
		              <button type="button" class="btn btn-primary searchItem" id="" name="" >검색</button>
		            </div>
	            </form>
            </div>
            <div class="table" style="height: 300px;">
              <table cellpadding="0" cellspacing="0" border="0" class="bomInsertTable">
                <thead class="tbl-header">
                  <tr>
                    <th>NO</th>
                    <th>제품번호</th>
                    <th>제품명</th>
                  </tr>
                </thead>
                <tbody class="tbl-content">
                	<c:forEach var="Item" items="${itemList}">
	                  <tr>
	                    <td><c:out value="${Item.rn}" /></td>
	                    <td><c:out value="${Item.i_id}" /></td>
	                    <td><c:out value="${Item.i_name}" /></td>
	                  </tr>
                  </c:forEach>  
                </tbody>
              </table>
              <!-- /.table -->
            </div>

            <!-- 자재 목록 테이블 -->
            <div class="ITableName">
              <div class="icon"><i class="fa fa-list"></i></div>
              <div>자재 목록</div>
              <form id='searchMTBominsert' action='./bomInsert' method='get' class="bomSearchBtn"> 
	              <div class="col-sm-1">
		            	<select name='type'>
		            		<option value="">--선택--</option>
						    		<option value="MNum"<c:out value="${bomSearch.type == 'MNum' ? 'selected' : ''}" />>자재번호</option>
						    		<option value="MName"<c:out value="${bomSearch.type == 'MName' ? 'selected' : ''}" />>자재명</option>
		            	</select>
		            </div>
                <div class="col-sm-1">
	        	      <input type="text" id="" name="keyword" />
	          	  </div>
		            <div class="col-sm-1">
		              <button type="button" class="btn btn-primary searchItem" id="" name="" >검색</button>
		            </div>
	            </form>
            </div>
            <div class="table" style="height: 300px;">
              <table cellpadding="0" cellspacing="0" border="0" class="bomInsertTable">
                <thead class="tbl-header">
                  <tr>
                    <th>NO</th>
                    <th>자재번호</th>
                    <th>자재명</th>
                  </tr>
                </thead>
                <tbody class="tbl-content">
                	<c:forEach var="Bom" items="${bomList}">
	                  <tr>
	                    <td><c:out value="${Bom.rn}" /></td>
	                    <td><c:out value="${Bom.b_material_id}" /></td>
	                    <td><c:out value="${Bom.m_name}" /></td>
	                  </tr>
                  </c:forEach>
                </tbody>
              </table>
              <!-- /.table -->
            </div>
          </div>
         </div>
        <!-- /.row -->
      </div>
      <!-- /.container-fluid -->
    </div>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
 </div>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->

	
<%@ include file="../includes/footer.jsp" %>

<script>

	/* 제품 목록 조회 */
	let searchItemBominsert = $("#searchItemBominsert");
	$("#searchItemBominsert button").on("click",
	function(e) {
	    if (!searchItemBominsert.find("option:selected").val()) {
	        alert("검색종류를 선택하세요");
	        return false;
	    }
	
	    if (!searchItemBominsert.find("input[name='keyword']").val()) {
	        alert("키워드를 입력하세요");
	        return false;
	    }
	
	    e.preventDefault();
	
	    searchItemBominsert.submit();
	});
	
	
	
	/* 자재 목록 조회 */
	let searchMTBominsert = $("#searchMTBominsert");
	$("#searchMTBominsert button").on("click",
	function(e) {
	    if (!searchMTBominsert.find("option:selected").val()) {
	        alert("검색종류를 선택하세요");
	        return false;
	    }
	
	    if (!searchMTBominsert.find("input[name='keyword']").val()) {
	        alert("키워드를 입력하세요");
	        return false;
	    }
	
	    e.preventDefault();
	
	    searchMTBominsert.submit();
	});


</script>
