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
                  <h2 class="card-title">Add Course</h2>
                </div>
                <!-- /.card-header -->
                <!-- form start -->
                <form action="/course/save" method="POST">

                    <div class="card-body">
                    <div class="md-4">
                        <div class="form-group">
                          <label for="exampleInputCourse">Course Name</label>
                          <input type="text" class="form-control" id="exampleInputCourse" name="course_name" placeholder="Enter name">
                        </div>
                        </div>
                        <div class="form-group">
                          <label for="exampleInputcode">Course Code</label>
                          <input type="text" class="form-control" id="exampleInputcode" name="course_code" placeholder="Code">
                        </div>                      
                      </div>
                      <!-- /.card-body -->
      
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