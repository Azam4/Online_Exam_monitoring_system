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
                  <h2 style="text-align: center">All user result show</h2>
                </div>
                <!-- /.card-header -->
                <!-- form start -->
                <form action="question/usereshow" method="POST">
					
					 <div class="card-body p-0">
                <table class="table table-striped">
                  <thead>
                    <tr>                    
                      <th>User Name</th>
                      <th>Total Question</th>
                      <th >Right Question</th>
                       <th>wrong Question</th>
                        <th>Total Marks</th>
                        
                    </tr>
                  </thead>
                  
                 <c:forEach items="${resultsallu}" var="r"> 
                  <tbody>
                    
                    <tr>
                    
                      <td>${r.userName }</td>
                      <td>${r.right_ans+r.wrong_ans}</td>
                      <td>${r.right_ans }</td>
                      <td>${r.wrong_ans }</td>
                      <td>${r.right_ans*2 }</td>
                     
                                
                    </tr>                
                  </tbody>
                 </c:forEach> 
                </table>
              </div>
					
					
                </form>
                <%-- <p>${r. allcorrectAns}</p> --%>
              </div>
              </div>
              </div>
              </div>
              </section>
              </div>
              <jsp:include page="/WEB-INF/view/common/footer.jsp" />