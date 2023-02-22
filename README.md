## Spring Boot JWT Authentication and Authorization using Spring Security Spring Data JPA  

### Run the following SQL statements 
```
insert into Roles (id, name) values (1,'ROLE_USER');
insert into Roles (id, name) values (2,'ROLE_MODERATOR');
insert into Roles (id, name) values (3,'ROLE_ADMIN');
```

### Access protected resource " api / test / user "

![](screenshots/Screenshot_20230222_104903.png)

### Register User " api / auth / signup "

- user <b>admin</b> with ROLE_ADMIN
- user <b> moderator </b> with ROLE_MODERATOR
- user <b> soheib </b> with ROLE_USER 

![](screenshots/signup.png)

### Signin with admin user " api / auth / signin"

![](screenshots/Screenshot_20230222_095620.png)

### Access " / api / test / admin "

![](screenshots/Screenshot_20230222_100618.png)

### Signin with moderator user " api / auth / signin"

![](screenshots/Screenshot_20230222_101042.png)


### Access " api / test / mod"
![](screenshots/Screenshot_20230222_101124.png)