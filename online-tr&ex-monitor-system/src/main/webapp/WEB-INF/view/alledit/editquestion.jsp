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
                  <h3 style="text-align: center">Question Update</h3>
                </div>
                <!-- /.card-header -->
                <!-- form start -->
                <form action="/question/update" method="POST">

                    <div class="card-body">
                    <div class="md-4">
                    
                     <div class="form-group">
                        <label>Question</label>
                        <input class="form-control" id="questiontext" value="${q.questionText}"/>
                      </div>
                      
                      <div class="form-group">
                          <label for="questioncode">Question Code</label>
                          <input type="text" class="form-control" id="questionCode" value="${q.question_code}">
                        </div>
                         
                        
                        
                        <div class="form-group">
                          <label for="a">A</label>
                          <input type="text" class="form-control" id="a" value="${q.a }">
                        </div>
                         <div class="form-group">
                          <label for="b">B</label>
                          <input type="text" class="form-control" id="b" value="${q.b }">
                        </div>
                        <div class="form-group">
                          <label for="c">c</label>
                          <input type="text" class="form-control" id="c" value="${q.c}">
                        </div>
                        <div class="form-group">
                          <label for="d">D</label>
                          <input type="text" class="form-control" id="d" value="${q.d}">
                        </div>
                        <div class="form-group">
                          <label for="correct">Correct Ans</label>
                          <input type="text" class="form-control" id="correctans" value="${q.correct} ">
                        </div>
                        <input type="hidden" id="id" value="${q.id}">
                                    
                        </div>
                     
                      </div>
                         
                      <div class="card-footer">
                        <button type="submit" class="btn btn-primary">Update</button>
                      </div>
                </form>
                
              </div>
              </div>
              </div>
              </div>
              </section>
              </div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />



