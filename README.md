# 🚀 SWYNEX Java Database Application

## 📌 Project Overview

This project is a Java-based console application connected to a MySQL database using JDBC. It demonstrates CRUD operations and proper exception handling.

## 🛠️ Tech Stack

* Java
* JDBC
* MySQL

## ✨ Features

* Add Student
* View Students
* Update Student
* Delete Student

## 🗄️ Database Setup

```sql
CREATE DATABASE swynex_db;

USE swynex_db;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    marks DOUBLE
);
```

## ▶️ How to Run

1. Install MySQL
2. Create database using above SQL
3. Update DB credentials in `DBConnection.java`
4. Add MySQL JDBC driver
5. Run `MainApp.java`

## 📚 Learning Outcomes

* JDBC Connectivity
* CRUD Operations
* Exception Handling
* Database Integration in Java

## 🔗 Author

Honey Goyal
# SWYNEX-Java-Database-Application
