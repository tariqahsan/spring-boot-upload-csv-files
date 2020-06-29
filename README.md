# Spring Boot Upload/Download CSV Files with MySQL database example

For more detail, please visit:
> [Spring Boot: Upload CSV file to MySQL Database | Multipart File](https://bezkoder.com/spring-boot-upload-csv-file/)

## Run Spring Boot application
```
mvn spring-boot:run

curl -F "file=@input.csv" http://localhost:9090/api/csv/upload
{"message":"Uploaded the file successfully: input.csv"}
```
