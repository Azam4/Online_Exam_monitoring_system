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
             <div class="col-md-4"></div>
            <div class="col-md-6">
              <!-- general form elements -->
              <div class="card card-primary">
                <div class="card-header">
                  <h3 class="card-title">user information and course select</h3>
                </div>
                <!-- /.card-header -->
                <!-- form start -->
                <form action="/question/startq" method="POST">

                    <div class="card-body">
                    <div class="md-4">
                    
                     <div class="form-group">
                        <label>Welcome ${name}</label>
               		 <input type="hidden" class="form-control" id="" name="username" value ="${name}"/>              		 
                      </div>                    
                      
                       <label>Course Name</label>
       					 <select class="form-control select2" name="course_code" id="course_code" style="width: 100%;">
						 <c:forEach items="${courses}" var="ds">
							<option value="${ds.course_code}">${ds.course_name}</option>
						</c:forEach> 												
						</select>												                                  
                        </div>                     
                      </div>
                       
                      <div class="card-footer">
                        <input type="submit" class="btn btn-primary" value="Start Quize">
                      </div>
                    
                </form>
                
              </div>
              </div>
              </div>
              </div>
              </section>
              </div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<!-- <script>
 $("#course_name}").val($("#course_code :selected").text()); 
$("#course_code").on("change", function(){
	$("#course_name").val($("#course_code :selected").text());
})
</script> -->

