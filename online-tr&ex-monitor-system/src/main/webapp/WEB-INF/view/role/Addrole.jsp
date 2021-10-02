<jsp:include page="/WEB-INF/view/common/header.jsp" />


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
                  <h3 class="card-title">Role Add</h3>
                </div>
                <!-- /.card-header -->
                <!-- form start -->
                <form action="/role/save" method="POST">

                    <div class="card-body">
                    <div class="md-4">
                        <div class="form-group">
                          <label for=""roleName"">Role Name</label>
                          <input type="text" class="form-control" id="roleName" name="role_name" placeholder="Enter name">
                        </div>
                         <div class="form-group">
                          <label for="roleCode">Role Code</label>
                          <input type="text" class="form-control" id=""roleCode"" name="role_code" placeholder="Enter code">
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