# TaskManagementSystem
### A task manager system using springboot+mybatis+thymeleaf+sqlite to support CRUD operation<br>
#### Four questions with answers<br>
#### 1 What optimizations were made for improving tasks retrieval?<br>
  1.1 Indexing is an effective way, providing rapid random lookups and efficient access. We set the ID of each task as the primary key. So each task is retrievaled by ID. This could improve the speed of retrievaling, especially for large scale data.<br>
  1.2 If a `SELECT` query contains an `ORDER BY`, `GROUP BY` or `DISTINCT` clause, we can use a b-tree structure to sort the output rows.<br>
  1.3 Using multithreading method. Creat a config class and import `org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor`  and `java.util.concurrent.ThreadPoolExecutor` then create a `ThreadPoolTaskExecutor` method.
  
#### 2 How would you support bulk operations?<br>
  Using methods that `JdbcTemplate` provides. The main methods are 
* `excute()` can implement SQL command.
* `batchUpdate()` can be used for bulk updating, saving and deleting.
* `queryForxxx()` for bulk querying.

#### 3 How to optimize for task retrieval and design?<br>
  The way to optimize for task retrivieal and design is increasing the throughout of springboot service.<br>
  There are two methods to achieve this:
  Asynchronous execution. (Callable, webAsyncTask, Deferred)<br>
  Set maximum connections and threads.
    
#### 4 How to implement user specific tasks. How would the current design change if this is required?<br>
4.1 Divide the project into different modules, and then delete extra files and folders, revise pom.xml<br>
4.2 The front-end posts messages to the queue, while the backend processes the pending messages one at the time. The benefits are: <br>
* If the backend is unavailable, the queue acts as a buffer.<br>
* If the front-end is producing more messages than what the backend can handle, those messages are buffered in the queue.<br>
* We can scale the backend independently of the front-end.<br>
<br><br>
localhost:8080/all
![main page](https://github.com/wkwkgood5/TaskManagementSystem/blob/master/pic/mainpage.png)<br><br>
<br><br>![add page](https://github.com/wkwkgood5/TaskManagementSystem/blob/master/pic/add.png)
