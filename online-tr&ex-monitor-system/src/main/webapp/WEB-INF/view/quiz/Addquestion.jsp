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
             <div class="col-md-2"></div>
            <div class="col-md-10">
              <!-- general form elements -->
              <div class="card card-primary">
                <div class="card-header">
                  <h3 style="text-align: center">Question Add</h3>
                </div>
                <!-- /.card-header -->
                <!-- form start -->
                <form action="/question/save" method="POST">

                    <div class="card-body">
                    <div class="md-4">
                    
                     <div class="form-group">
                        <label>Question</label>
                        <textarea class="form-control" id="questin" name="questionText" rows="3" placeholder=""></textarea>
                      </div>
                      
                      <div class="form-group">
                          <label for="questioncode">Question Code</label>
                          <input type="text" class="form-control" id="questionCode" name="question_code" placeholder="Enter a no ans">
                        </div>
                      
                       <div class="form-group">
                       <label>Course Name</label>
       					 <select class="form-control select2" name="course_code" id="course_code" style="width: 100%;">
						<c:forEach items="${map.courses}" var="ds">
							<option value="${ds.course_code}">${ds.course_name}</option>
						</c:forEach>												
						</select>					
                          <input type="hidden" class="form-control" id="course_name" name="course_name">
                        </div>
                        
                        <div class="form-group">
                          <label for="a">A</label>
                          <input type="text" class="form-control" id="a" name="a" placeholder="Enter a no ans">
                        </div>
                         <div class="form-group">
                          <label for="b">B</label>
                          <input type="text" class="form-control" id="b" name="b" placeholder="Enter b no ans">
                        </div>
                        <div class="form-group">
                          <label for="c">c</label>
                          <input type="text" class="form-control" id="c" name="c" placeholder="Enter b no ans">
                        </div>
                        <div class="form-group">
                          <label for="d">D</label>
                          <input type="text" class="form-control" id="d" name="d" placeholder="Enter b no ans">
                        </div>
                        <div class="form-group">
                          <label for="correct">Correct Ans</label>
                          <input type="text" class="form-control" id="correctans" name="correct" placeholder="Enter correct ans">
                        </div>
                        
                                    
                        </div>
                     
                      </div>
                         
                      <div class="card-footer">
                        <button type="submit" class="btn btn-primary">Save</button>
                      </div>
                </form>
                
              </div>
              </div>
              </div>
              </div>
              </section>
              </div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>


  //$("#course_code}").val($("#course_code :selected").text()); 
	$("#course_code").on("change", function(){
		$("#course_name").val($("#course_code :selected").text());
});
</script>

