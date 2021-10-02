<jsp:include page="/WEB-INF/view/common/header.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

 <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
           
          </div>
         
        </div>
      </div><!-- /.container-fluid -->
    </section>

  <section class="content">
        <div class="container-fluid">
          <div class="row">
            <!-- left column -->
             <div class="col-md-1"></div>
            <div class="col-md-11">
              <!-- general form elements -->
              <div class="card card-primary">
                <div class="card-header">
                  <h2 style="text-align: center;">All Question Show</h2>
                </div>
                <!-- /.card-header -->
                <!-- form start -->
                <form action="/question/show" method="POST">
					
					 <div class="card-body p-0">
                <table class="table table-striped">
                  <thead>
                    <tr>                    
                      <th>question</th>
                      <th >question_code</th>
                       <th>A</th>
                        <th>B</th>
                        <th>C</th>
                        <th>D</th>
                        <th>CorrAns</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>
                  </thead>
                  
                  <c:forEach items="${questions}" var="q">
                  <tbody>
                    
                    <tr>
                      <td>${q.questionText}</td>
                      <td>${q.question_code}</td>
                      <td>${q.a}</td>
                      <td>${q.b}</td>
                       <td>${q.c}</td>
                      <td>${q.d}</td>
                      <td>${q.correct}</td> 
                      <td>
                      <a href="/question/edit/${q.id}">Edit</a>
                      </td> 
                      <td>
                      <a href="/question/delete/${q.id}">Delete</a>
                      </td>                 
                    </tr>                
                  </tbody>
                  </c:forEach>
                </table>
              </div>
					
					
                </form>
              </div>
              </div>
              </div>
              </div>
              </section>
              </div>
              <jsp:include page="/WEB-INF/view/common/footer.jsp" />