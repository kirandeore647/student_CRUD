# student_CRUD

/** How to run Application **/

  1.Open the project in eclipse IDE
  
  2.Go in application.properties file path is src/main/resource/application.properties and change Database credentials 
  
  3.Right click  on the and  click on  run->java application 
  
  4.POST API(Save the student All Data)
  
   End point: http://localhost:8088/api/student
   
   Requestbody :
   
    {          
          "name":"kiran",
          "address":"Malegaon",
          "bloodGroup":"B+",
          "mobileNumber":"7218689969",
          "bod":"1995-02-02",
          "isDeleted":false,
          "isActive":true,
          "createdBy":1
    }
    
   5.GET API (Fetech or retrieve Student All Active  Data)
       End point: http://localhost:8088/api/student
    
   6. DELETE API(Delete the student data By using specific ID)
    
     End point: http://localhost:8088/api/student/1
     
   7.PUT API(update student Data)
   
       End point: http://localhost:8088/api/student/1
       
       Requestbody :
       
     {
          "id":1,
          "name":"kiran",
          "address":"Malegaon",
          "bloodGroup":"B+",
          "mobileNumber":"7218689969",
          "bod":"1995-02-02",
          "isDeleted":false,
          "isActive":true,
          "createdBy":1
    }
    
    
