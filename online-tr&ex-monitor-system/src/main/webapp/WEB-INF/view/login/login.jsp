
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
                  <h3 class="card-title">Login Here</h3>
                </div>
                <!-- /.card-header -->
                <!-- form start -->
                <form action="/user/login" method="POST">

                    <div class="card-body">
                    <div class="md-4">
                        <div class="form-group">
                          <label for="shortName">User Name</label>
                          <input type="text" class="form-control" id="username" name="username" placeholder="Enter name">
                        </div>
                        
                        <div class="form-group">
                          <label for="password">password</label>
                          <input type="password" class="form-control" id="password1" name="password" placeholder="Password">
                        </div>
                         
                       <%--  <div class="form-group">
                  			<label>Role Name</label>
                 			<select class="form-control" name="role_code" id="role_code">
                          <c:forEach items="${roles }" var="r">
						    <option value="${r.role_code }"> ${ r.role_name}</option>
						   </c:forEach>
						    </select>
						   <input  class="form-control" type="hidden" name=role_name id="role_name"/>
                          </div>  --%>
               			                              
                        </div>
                     
                      </div>
                         
                      <div class="card-footer">
                        <input type="submit" class="btn btn-primary" value="Login" />
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
 $("#role_name}").val($("#role_code :selected").text()); 
$("#role_code").on("change", function(){
	$("#role_name").val($("#role_code :selected").text())
});
</script>