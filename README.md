# library-management
API that manages library.


## Link petstore
https://petstore.swagger.io/?url=https://raw.githubusercontent.com/tendryAxel/library-management/api-td1-std22075/docs/api.yml

## To run
Add environmental variable:
- PG_PASSWORD : password of postgres user
- PG_USER : the postgres user
- PG_URL : the url of the database

- run:
  - ```javac -cp .;C:\Users\TENDRY\Downloads\postgresql-42.6.0.jar -d E:\HEI\L2\PROG3\new\library-management\out\mien src\LibraryManagementApplication.java src\Model\*.java src\operation\*.java```
  - ```java -cp .;C:\Users\TENDRY\Downloads\postgresql-42.6.0.jar;E:\HEI\L2\PROG3\new\library-management\out\mien LibraryManagementApplication```