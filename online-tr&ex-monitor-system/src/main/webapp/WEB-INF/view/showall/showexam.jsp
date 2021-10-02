<jsp:include page="/WEB-INF/view/common/header.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

 <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
           
          </div>
          <!-- <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Advanced Form</li>
            </ol>
          </div> -->
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
                  <h2 style="text-align: center;">Exam Name Show</h2>
                </div>
                <!-- /.card-header -->
                <!-- form start -->
                <form action="/exam/show" method="POST">
					
					 <div class="card-body p-0">
                <table class="table table-striped">
                  <thead>
                    <tr>                    
                      <th>Ex_Name</th>
                      <th >Ex_Code</th>
                       <th>Course_name</th>
                        <th>Course_code</th>
                        <th>Start_date</th>
                        <th>End_date</th>
                        <th>Total_mark</th>
                    </tr>
                  </thead>
                  
                  <c:forEach items="${examnames}" var="e">
                  <tbody>
                    
                    <tr>
                      <td>${e.ex_name}</td>
                      <td>${e.ex_code}</td>
                      <td>${e.course_name}</td>
                      <td>${e.course_code}</td>
                       <td>${e.start_date}</td>
                      <td>${e.end_date}</td>
                      <td>${e.total_mark}</td>                  
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