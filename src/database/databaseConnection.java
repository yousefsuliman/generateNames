package database;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//
//public class databaseConnection {
//
//	public void insertData(String firstName, String lastName, String countryName, String gender) {
//		try {
//			String dbURL = "jdbc:mysql://localhost:3306/generateNames?autoReconnect=true&useSSL=false";
//			String userName = "admin";
//			String password = "123";
//			Connection myConnection = DriverManager.getConnection(dbURL, userName, password);
//			String query = " INSERT INTO `users`(`First Name`, `Last Name`, `Gender`, `Country`) VALUES (?, ?, ?, ?)";
//			PreparedStatement preparedStmt = myConnection.prepareStatement(query);
//			preparedStmt.setString(1, firstName);
//			preparedStmt.setString(2, lastName);
//			preparedStmt.setString(3, countryName);
//			preparedStmt.setString(4, gender);
//			preparedStmt.execute();
//			myConnection.close();
//
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//
//	}
//}