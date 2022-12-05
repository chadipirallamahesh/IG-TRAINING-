package com.DesignPatterns.SingleTon;


public class DatabaseObject {
	private static DatabaseObject dbObject = new DatabaseObject();
	
	private DatabaseObject() {
		
	}
	
	public static DatabaseObject getInstance() {
		if(dbObject == null)
			dbObject = new DatabaseObject();
		return dbObject;
	}
	
	public void getConnection() {
		System.out.println("You are now connected to Database");
	}

}
