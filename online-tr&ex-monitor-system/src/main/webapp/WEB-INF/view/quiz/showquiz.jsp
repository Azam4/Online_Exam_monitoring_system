<jsp:include page="/WEB-INF/view/common/header.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6"> 
          </div>
           <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="/login">Logout</a></li>             
            </ol>
          </div>
          
        </div>
      </div><!-- /.container-fluid -->
    </section>

  <section class="content">
        <div class="container-fluid">
          <div class="row">
            <!-- left column -->
             <div class="col-md-2"></div>
            <div class="col-md-10">
              <!-- general form elements -->
              <div class="card card-primary">
                <div class="card-header">
                  <h4 style="text-align: center">Please Start quiz </h4>
                </div>
                <!-- /.card-header -->
                <!-- form start -->
                <form action="/question/result" method="POST">

                    <div class="card-body">
                    <div class="md-4">
                    
                     <div class="form-group">
                     
                       <!--  <label>Question Name</label> -->


			<div class="form-group">
				<c:forEach items="${questions1}" var="qq" varStatus="loop">				
				    <label for="question">${loop.index+1 }) ${qq.questionText}: </label>
				    <input type=hidden value="${qq.question_code }" name="question_code" Id="qid" />
				    <br>
				   
				  &nbsp;<label class="radio-inline">
				 &nbsp; &nbsp;<input type="radio" name="${qq.id}" value="a">${qq.a}</label>
				    <br>
					&nbsp;<label class="radio-inline">
					&nbsp;&nbsp;<input type="radio" name="${qq.id}" value="b">${qq.b}</label>
					<br>
					&nbsp;<label class="radio-inline">
					&nbsp;&nbsp;<input type="radio" name="${qq.id}" value="c">${qq.c}</label>
					<br>
					&nbsp;<label class="radio-inline">
					&nbsp;&nbsp;<input type="radio" name="${qq.id}" value="d">${qq.d}</label>
					<br>
				 	<br>
				 </c:forEach>
			  </div>        
               </div>
               </div>
               </div>
               
                      <div class="card-footer">
                        <button type="submit" class="btn btn-primary">Submit</button>
                      </div>
                      <input type="hidden" name="username" value="${username}"/>                    
                      
                </form>
                
              </div>
              </div>
              </div>
              </div>
              </section>
              </div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />


