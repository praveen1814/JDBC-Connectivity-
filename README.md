# JDBC-Connectivity-

JDBC:

> It is a technology not a programming language

API:
> API is an intermediate that enables two software components to communicate with each other
>it is a API(Application programming interface)
> API contains classes, libraries, and interfaces

JDBC (Java Database Connectivity):
JDBC is an API used to interact with a database from a Java application to perform database operations. By using the Java programming language, we can:

* Insert a row in a database
* Delete a row in a database
* Perform all operations in the database

Driver:

A "Driver" is a bridge or mediator existing between a Java application and a database. It can map Java API calls to DB API calls and from DB API calls to Java API calls.

The driver class is the interface (mediator) between Java and the database, which converts Java API calls to database calls and vice versa.

A driver is software that enables a Java application to interact with the database.

There are 4 types of drivers:

> Type-1 Driver
> Type-2 Driver
> Type-3 Driver
> Type-4 Driver


Type-1 Driver:

> Also called JDBC-ODBC driver
> It is a slower driver because to connect with the database, we need two times conversion:
	* Java representations to ODBC representations (Open Database Connectivity)
	* ODBC representations to database representations.
> Less portable (compatible with Microsoft products only)
> Not suitable for complex JDBC applications
> Only suitable for standalone applications
 
Type-2 Driver:

> Faster compared to Type-1 driver (as there is no two-time conversion)
> Increased application performance
> More portable as it is not dependent on Microsoft products
> Expensive driver
> Used for standalone applications only

Type-3 Driver:

> Also called a network driver
> Used only for web applications and distributed applications
> More portable driver
> Faster driver
> Needs application server environment
> Able to provide a very good environment to connect with multiple clients (Java applications) at a time


Type-4 Driver:

> Also called a pure Java driver (implemented using only Java)
> Used for standalone, web, and distributed applications
> More portable than Type-3
> Faster driver
> Lightweight and economical driver
> High performance


Steps to Connect Java Applications to DB:
1. Load and register the driver
2. Establish a connection between the Java application and the database
3. Create either a Statement, PreparedStatement, or CallableStatement
4. Write and execute SQL queries
5. Close the resources like connection and statement

>Steps 1, 2, 3, and 5 are repeatable steps for all applications, so these 4 steps are called boilerplate code.


* In JDBC applications, the executeQuery() method can execute SELECT SQL queries to fetch data from a database table.

* In JDBC applications, the executeUpdate() method can be used to execute non-SELECT SQL queries to perform database operations like creating tables, inserting, updating, deleting, altering, and dropping tables.

* In JDBC applications, the execute() method can be used to execute both types of SQL queries (SELECT and non-SELECT) to perform all database operations.


ResultSet:

> When we execute a SELECT SQL query with executeQuery(), JVM will send the provided SELECT SQL query to the database engine through the JDBC driver and connections. At the database, the database engine will execute the provided SELECT SQL query, fetch data from the database, and send the fetched data to the JDBC application in the form of a ResultSet object.
> ResultSet is an object in JDBC that can manage or store the fetched data from the database table when we execute a SELECT SQL query.
