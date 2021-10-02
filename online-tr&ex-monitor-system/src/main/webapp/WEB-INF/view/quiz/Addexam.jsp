
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
             <div class="col-md-4"></div>
            <div class="col-md-6">
              <!-- general form elements -->
              <div class="card card-primary">
                <div class="card-header">
                  <h3 class="card-title">ExamName Add</h3>
                </div>
                <!-- /.card-header -->
                <!-- form start -->
                <form action="/exam/save" method="POST">

                    <div class="card-body">
                    <div class="md-4">
                        <div class="form-group">
                          <label for="exName">Ex_Name</label>
                          <input type="text" class="form-control" id="exName" name="ex_name" placeholder="Enter name">
                        </div>
                         <div class="form-group">
                          <label for="exCode">Ex_Code</label>
                          <input type="text" class="form-control" id="exCode" name="ex_code" placeholder="Enter code">
                        </div>
                        
                         <div class="form-group">
                  <label>Course Name</label>
                 <select class="form-control" name="course_code" id="course_code">
                          <c:forEach items="${courses }" var="c">
						    <option value="${c.course_code }"> ${ c.course_name}</option>
						   </c:forEach>
						    </select>
						   <input  class="form-control" type="hidden" name=course_name id="course_name"/>
                 
                </div>
                
                <div class="form-group">
                          <label for="startdate">Start Date</label>
                          <input type="date" class="form-control" id="startdata" name="start_date" placeholder="Enter date">
                        </div>
                        
                        <div class="form-group">
                          <label for="enddate">End Date</label>
                          <input type="date" class="form-control" id="enddata" name="end_date" placeholder="Enter date">
                        </div>
     
                         <div class="form-group">
                          <label for="totalMarks">Total Marks</label>
                          <input type="text" class="form-control" id="totalMarks" name="total_mark" placeholder="Enter marks">
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
 $("#course_name}").val($("#course_code :selected").text()); 
$("#course_code").on("change", function(){
	$("#course_name").val($("#course_code :selected").text())
});
</script>
