
### **1. SQL Database Introduction**
- **SQL (Structured Query Language):** SQL is a language used for managing and manipulating databases. It allows for operations like creating, reading, updating, and deleting data.
- **Database:** A structured set of data held in a computer that can be accessed and managed using SQL.
- **RDBMS (Relational Database Management System):** A software that uses a structured format (tables, rows, columns) to manage databases. MySQL, PostgreSQL, and SQL Server are examples of RDBMS.

### **2. SQL Introduction**
- **Basic Commands:**
    - `SELECT`: Retrieve data from a database.
    - `INSERT`: Add data into a table.
    - `UPDATE`: Modify existing data in a table.
    - `DELETE`: Remove data from a table.
- **SQL Syntax:** It is case-insensitive, but by convention, commands are written in uppercase (e.g., `SELECT`, `INSERT`).

### **3. MySQL Introduction**
- **MySQL:** An open-source RDBMS that uses SQL. It is highly popular for web applications and supports various operating systems.
- **MySQL Architecture:**
    - MySQL Server: Manages the database.
    - MySQL Client: Interacts with the server to perform operations.

### **4. MySQL Installation**
- To install MySQL on your system:
    - Download the installer from the [MySQL official website](https://dev.mysql.com/downloads/).
    - Follow the instructions to install the MySQL server and MySQL client.
- During installation, you will set up a root password, which is used to access the database.

### **5. MySQL Workbench Installation**
- **MySQL Workbench:** A graphical interface that allows users to manage MySQL databases visually.
- To install:
    - Download from the [MySQL Workbench download page](https://dev.mysql.com/downloads/workbench/).
    - Follow the instructions to complete the installation.
- After installation, use MySQL Workbench to connect to your MySQL server using the root credentials.

### **6. Features of MySQL**
- **Open-source:** Free to use.
- **Cross-platform:** Works on Windows, Linux, macOS.
- **Scalable:** Suitable for small to large databases.
- **Security:** Provides authentication and encryption features.

### **7. Data Types in MySQL**
- **Numeric Types:** `INT`, `FLOAT`, `DOUBLE`, `DECIMAL`.
- **String Types:** `CHAR`, `VARCHAR`, `TEXT`.
- **Date and Time Types:** `DATE`, `TIME`, `DATETIME`, `TIMESTAMP`.
- **Boolean Type:** `BOOLEAN` (stores `TRUE` or `FALSE`).

### **8. DDL, DML, and TCL**
- **DDL (Data Definition Language):** Defines database structures.
    - Commands: `CREATE`, `ALTER`, `DROP`.
- **DML (Data Manipulation Language):** Manipulates data in the database.
    - Commands: `SELECT`, `INSERT`, `UPDATE`, `DELETE`.
- **TCL (Transaction Control Language):** Manages transactions.
    - Commands: `COMMIT`, `ROLLBACK`, `SAVEPOINT`.

### **9. Creating a Table**
   ```sql
   CREATE TABLE users (
       id INT PRIMARY KEY AUTO_INCREMENT,
       name VARCHAR(100),
       email VARCHAR(100),
       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
   );
   ```

### **10. SELECT Statement**
- Retrieve data from a table.
   ```sql
   SELECT * FROM users;
   SELECT name, email FROM users WHERE id = 1;
   ```

### **11. INSERT INTO Query**
- Add new records to a table.
   ```sql
   INSERT INTO users (name, email) VALUES ('John Doe', 'john@example.com');
   ```

### **12. DELETE Query**
- Remove records from a table.
   ```sql
   DELETE FROM users WHERE id = 1;
   ```

### **13. UPDATE Query**
- Modify existing records in a table.
   ```sql
   UPDATE users SET email = 'newemail@example.com' WHERE id = 2;
   ```

### **14. DISTINCT Clause**
- Retrieve unique values.
   ```sql
   SELECT DISTINCT email FROM users;
   ```

### **15. WHERE Clause**
- Filter records based on conditions.
   ```sql
   SELECT * FROM users WHERE name = 'John Doe';
   ```

### **16. ORDER BY Clause**
- Sort records in ascending or descending order.
   ```sql
   SELECT * FROM users ORDER BY name ASC;
   SELECT * FROM users ORDER BY created_at DESC;
   ```

### **17. GROUP BY Clause**
- Group records that have the same values in specified columns.
   ```sql
   SELECT COUNT(id), email FROM users GROUP BY email;
   ```

### **18. SQL JOINS**
- Used to combine rows from two or more tables based on a related column.

### **19. SQL Inner Join**
- Retrieves records that have matching values in both tables.
   ```sql
   SELECT users.name, orders.order_date
   FROM users
   INNER JOIN orders ON users.id = orders.user_id;
   ```

### **20. SQL Outer Join**
- Combines records from two tables and includes rows even if there is no match.
- **LEFT JOIN:** Returns all records from the left table, and matched records from the right table.
  ```sql
  SELECT users.name, orders.order_date
  FROM users
  LEFT JOIN orders ON users.id = orders.user_id;
  ```
- **RIGHT JOIN:** Returns all records from the right table, and matched records from the left table.
  ```sql
  SELECT users.name, orders.order_date
  FROM users
  RIGHT JOIN orders ON users.id = orders.user_id;
  ```
- **FULL JOIN:** Combines the result of both LEFT JOIN and RIGHT JOIN. (Note: MySQL does not support `FULL JOIN` directly, but you can use a `UNION` to achieve the same result).

### **21. SQL Left Join**
- Retrieves all records from the left table and matched records from the right table.
   ```sql
   SELECT users.name, orders.order_date
   FROM users
   LEFT JOIN orders ON users.id = orders.user_id;
   ```

### **22. SQL Right Join**
- Retrieves all records from the right table and matched records from the left table.
   ```sql
   SELECT users.name, orders.order_date
   FROM users
   RIGHT JOIN orders ON users.id = orders.user_id;
   ```

### **23. SQL Full Join (using UNION)**
- Retrieve all records when there is a match in either left or right table.
   ```sql
   SELECT users.name, orders.order_date
   FROM users
   LEFT JOIN orders ON users.id = orders.user_id
   UNION
   SELECT users.name, orders.order_date
   FROM users
   RIGHT JOIN orders ON users.id = orders.user_id;
   ```

### **24. Stored Procedures**
- Stored procedures are SQL statements that can be saved and reused.
   ```sql
   DELIMITER //
   CREATE PROCEDURE GetUserByEmail(IN userEmail VARCHAR(100))
   BEGIN
       SELECT * FROM users WHERE email = userEmail;
   END //
   DELIMITER ;
   ```
- To call the procedure:
   ```sql
   CALL GetUserByEmail('john@example.com');
   ```

