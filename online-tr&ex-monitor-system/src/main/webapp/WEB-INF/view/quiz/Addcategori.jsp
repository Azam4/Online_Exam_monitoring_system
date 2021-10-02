<jsp:include page="/WEB-INF/view/common/header.jsp" />

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
             <div class="col-md-4"></div>
            <div class="col-md-6">
              <!-- general form elements -->
              <div class="card card-primary">
                <div class="card-header">
                  <h2 class="card-title">Add Category</h2>
                </div>
                <!-- /.card-header -->
                <!-- form start -->
                <form action="/categori/save" method="POST">

                    <div class="card-body">
                    <div class="md-4">
                        <div class="form-group">
                          <label for="exampleInputCategory">Category Name</label>
                          <input type="text" class="form-control" id="exampleInputCategory" name="Categori_name" placeholder="Enter name">
                        </div>
                        </div>
                        <div class="form-group">
                          <label for="exampleInputcode">Category Code</label>
                          <input type="text" class="form-control" id="exampleInputcode" name="Categori_code" placeholder="Code">
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