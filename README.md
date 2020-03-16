# TaskManagementSystem
### A task manager system using springboot+mybatis+thymeleaf+sqlite to support CRUD operation<br>
#### Four questions<br>
1 What optimizations were made for improving tasks retrieval?<br>
  Retrival by ID. I set the ID of each task as the primary key. So each task is retrivaled by ID. This could improve the speed of           retrievaling, especially for large scale data.
  Using multithreading method. Creat a config class and import `org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor` and `java.util.concurrent.ThreadPoolExecutor` then create a `ThreadPoolTaskExecutor` method.
  
2 How would you support bulk operations?<br>
  Using methods that `JdbcTemplate` provide. The main methods are 
* `excute()` can implement SQL command.
* `batchUpdate()` can be used for bulk updating, saving and deteting.
* `queryForxxx()` for bulk querying.

3 How to optimize for task retrieval and design?<br>
  The way to optimize for task retrivieal and design is increasing the throughout of springboot service.<br>
  There two methods to achieve this:
  * Asynchronous execution
    
4 How to implement user specific tasks. How would the current design change if this is required?<br>

<br><br><br><br>
localhost:8080/all
![main page](https://github.com/wkwkgood5/TaskManagementSystem/blob/master/pic/mainpage.png)<br><br>
<br><br>![add page](https://github.com/wkwkgood5/TaskManagementSystem/blob/master/pic/add.png)
