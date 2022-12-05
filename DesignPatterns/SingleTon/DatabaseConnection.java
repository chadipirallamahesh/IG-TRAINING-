package com.DesignPatterns.SingleTon;

public class DatabaseConnection {

	public static void main(String[] args) {
		DatabaseObject dbObject1 = DatabaseObject.getInstance();
		DatabaseObject dbObject2 = DatabaseObject.getInstance();
		dbObject1.getConnection();
		dbObject2.getConnection();
	}

}