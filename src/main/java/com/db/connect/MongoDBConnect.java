package com.db.connect;

import java.util.*;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class MongoDBConnect {
	MongoClient mc = new MongoClient("localhost",27017);
	DB db = mc.getDB("NewDB");
	public MongoClient getcon() {
		// Get All Database names
		List<String> dbs = mc.getDatabaseNames();
		System.out.println("---Database---");
		for(String o : dbs) {
			System.out.println(o);
		}
		System.out.println("---Collections---");
		// Get All Collection names in Database
		Set<String> collection = db.getCollectionNames();
		for(String p : collection) {
			System.out.println(p);
		}
		return mc;
	}
	
	public MongoClient insertdoc() {
		DBCollection dbc = db.getCollection("Din");
		BasicDBObject document = new BasicDBObject();
		document.append("name", "MongoDB");
		document.put("dept", "DataBase");
		document.append("location", "Software");
		document.put("age", "2.3.4");
		dbc.insert(document);
		System.out.println("Successfully Inserted..");
		return mc;
	}
	
	public MongoClient updatedoc() {
		DBCollection dbc = db.getCollection("Din");
		
		BasicDBObject find = new BasicDBObject();
		find.put("age", "2.3.4");
		
		BasicDBObject update = new BasicDBObject();
		update.append("age", "1000");
		
		BasicDBObject updateObj = new BasicDBObject();
		updateObj.put("$set", update);
		
		dbc.update(find, updateObj);
		System.out.println("Successfully Updated..");
		return mc;
	}
	
	public MongoClient finddoc() {
		DBCollection dbs = db.getCollection("NewDB");
		BasicDBObject obj = new BasicDBObject();
		obj.append("age", "1000");
		
		DBCursor cur = dbs.find(obj);
		
		while(cur.hasNext()) {
			System.out.println(cur.next());
		}
		System.out.println("Successfully Find..");
		return mc;
	}
	
	public MongoClient finddel() {
		DBCollection dbs = db.getCollection("NewDB");
		BasicDBObject obj = new BasicDBObject();
		obj.append("age", "1000");
		dbs.remove(obj);
		return mc;
	}
	
public static void main(String[] args) {
	MongoDBConnect m1 = new MongoDBConnect();
	//m1.getcon();
	//m1.insertdoc();
	//m1.updatedoc();
	//m1.finddoc();
	m1.finddel();
}
}
