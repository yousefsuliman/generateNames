package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * @author yousefsuliman
 * Class DatabaseConnection have one method : 
 * insertData that create a connection to phpmyadmin 
 * and insert the result in table named ‘users’ the table consist of four columns
 *  FIrst name Last Name gender and country 
 *  and it called from the generateName class in generateNames PACKAGE
 */
public class databaseConnection {

	/**
	 * @author yousef suliman 
	 * @param firstName
	 * 
	 * @param lastName
	 * @param countryName
	 * @param gender
	 * this method insertData create a connection with phpmyadmin database and save the parameters in the table 'users'
	 * using sql insert statement query 
	 */
	public void insertData(String firstName, String lastName, String countryName, String gender) {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/generateNames?autoReconnect=true&useSSL=false&characterEncoding=utf8";//database url for the server 
			String userName = "admin";//user name of the database server
			String password = "123"; //password of the database server 
			Connection myConnection = DriverManager.getConnection(dbURL, userName, password);//create a connection with the server
			String query = " INSERT INTO `users`(`First Name`, `Last Name`, `Gender`, `Country`) VALUES (?,?,?,?)";//create a insert query 
			PreparedStatement preparedStmt = myConnection.prepareStatement(query);//create a PreparedStatement for the database to insert the variables 
			preparedStmt.setString(1, firstName);
			preparedStmt.setString(2, lastName);
			preparedStmt.setString(3, gender);
			preparedStmt.setString(4, countryName);
			preparedStmt.execute();//execute the query 
			myConnection.close();//close the connection 
			System.out.println("Insert to Database Successufully");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}