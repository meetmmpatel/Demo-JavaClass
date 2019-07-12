package Collections.MapInterface;

import java.util.*;

public class PersonMap {
  public static void main(String[] args) {
	getPersonMap(3, 11,"John",new Date(),"Address");
	getPersonMap(4, 11,"John",new Date(),"Address");
    getPersonMap(1, 11,"John",new Date(),"Address");
	getPersonMap(2, 11,"John",new Date(),"Address");

  }
  
  //loop hashmap and return the data
  
  public static TreeMap<Integer, Person> getPersonMap
		  (int key, long id, String name, Date dob, String add) {
	
	Map<Integer, Person> map = new TreeMap<>();
	
	Person person = new Person();
	person.setPersonID(id);
	person.setPersonName(name);
	person.setPersonDOB(dob);
	person.setPersonAddress(add);
	
	map.put(key, person);
	
	Iterator<Map.Entry<Integer, Person>> iterator = map.entrySet().iterator();
	while (iterator.hasNext()) {
	  Map.Entry<Integer, Person> entry = iterator.next();
	  System.out.println(entry);
	  
	}
	
	
	
	return (TreeMap<Integer, Person>) map;
  }
  
  
}
