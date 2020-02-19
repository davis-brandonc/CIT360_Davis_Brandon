//What are collections
//https://www.vogella.com/tutorials/JavaCollections/article.html
//The Java language supports arrays to store several objects. An array is initialized with an
//predefined size during instantiation. To support more flexible data structures the core Java
//library provides the collection framework. A collection is a data structure which contains and
//processes a set of data. The data stored in the collection is encapsulated and the access to the
//data is only possible via predefined methods. For example the developer can add elements to an
//collection via a method. Collections use internally arrays for there storage but hide the 
//complexity of managing the dynamic size from the developer.

//For example if your application saves data in an object of type People, 
//you can store several People objects in a collection.

//------------------------------------
// When to use List, Set and Map in Java
// https://www.java67.com/2013/01/difference-between-set-list-and-map-in-java.html
// 1) If you need to access elements frequently by using the index then List is a way to go.
// Its implementation e.g. ArrayList provides faster access if you know index.
// 2) If you want to store elements and want them to maintain an order on which they are inserted
// into a collection then go for List again, as List is an ordered collection and maintain insertion order.
// 3) If you want to create a collection of unique elements and don't want any duplicate than choosing
// any Set implementation e.g. HashSet, LinkedHashSet or TreeSet. 
// All Set implementation follow there general contract e.g. uniqueness but also add addition feature e.g.
// TreeSet is a SortedSet and elements stored on TreeSet can be sorted by using Comparator or Comparable in Java.
// LinkedHashSet also maintains insertion order.
// 4) If you store data in form of key and value than Map is the way to go. You can choose from Hashtable,
// HashMap, TreeMap based upon your subsequent need. In order to choose between first two see the difference
// between HashSet and HashMap in Java.

import java.util.*;

public class javacollections {

	public static void main(String[] args)  {

//List Example with Treeset
			List<String> hrLeaders = new ArrayList<>();
			hrLeaders.add("762 - Barry Bonds");
			hrLeaders.add("755 - Hank Aaron");
			hrLeaders.add("714 - Babe Ruth");
			hrLeaders.add("687 - Alex Rodriquez");
			hrLeaders.add("686 - Brandon Davis");
			hrLeaders.add("686 - Brandon Davis");
			hrLeaders.add("660 - Willie Mays");
			
			System.out.println("*****LIST EXAMPLE*****");
			System.out.println("Here are the top " + hrLeaders.size() + " homerun leaders of all time!");
			System.out.print(hrLeaders);
			
			System.out.print( "\n\n" );
			hrLeaders.set(0, "763 - Mike Trout");
			System.out.println("Updated Home Run List  \n" + hrLeaders);
			
			System.out.print( "\n\n" );			
			System.out.print("Sorted Set after passing into TreeSet: \n"); 
	        Set<String> tree_Set1 = new TreeSet<String>(hrLeaders); 
	        System.out.println(tree_Set1);
	        
	        System.out.print( "\n\n" );	
			
			System.out.print( "_______________________________________________________________________" );
			System.out.print( "\n\n" );
			

//Map EXAMPLE//		
			System.out.println("*****Map EXAMPLE*****");
			Map<Integer, String> AhrLeaders = new HashMap<>();
			AhrLeaders.put(762, "Barry Bonds");
			AhrLeaders.put(755, "Hank Aaron");
			AhrLeaders.put(714, "Babe Ruth");
			AhrLeaders.put(687, "Alex Rodriquez");
			AhrLeaders.put(686, "Brandon Davis");
			AhrLeaders.put(686, "Brandon Davis");
			AhrLeaders.put(660, "Willie Mays");
			
			
			System.out.println("Here are the top " + AhrLeaders.size() + " homerun leaders of all time!");
			System.out.print(AhrLeaders);
			
			System.out.print( "\n\n" );
			
			ArrayList<Integer> keyList = new ArrayList<Integer>(AhrLeaders.keySet());
		    ArrayList<String> valueList = new ArrayList<String>(AhrLeaders.values());

		    System.out.println("Top Homerun Leaders by number of Homeruns ::"+keyList);
		    System.out.println("Top Homerun Leaders by Name ::"+valueList);
			
		    System.out.print( "_______________________________________________________________________" );
			System.out.print( "\n\n" );
			
//Set EXAMPLE and Treeset//		
			System.out.println("*****Set EXAMPLE*****");
			Set<String> BhrLeaders = new HashSet<String>();
			BhrLeaders.add("762 - Barry Bonds");
			BhrLeaders.add("755 - Hank Aaron");
			BhrLeaders.add("714 - Babe Ruth");
			BhrLeaders.add("687 - Alex Rodriquez");
			BhrLeaders.add("686 - Brandon Davis");
			BhrLeaders.add("686 - Brandon Davis");
			BhrLeaders.add("660 - Willie Mays");
			
			
			System.out.println("Here are the top " + BhrLeaders.size() + " homerun leaders of all time!");
			System.out.print(BhrLeaders);
			
			System.out.print( "\n\n" );
	
			BhrLeaders.add("661 - Mike Trout"); 
			System.out.println("Updated Home Run List: \n" + BhrLeaders);
			
			System.out.print( "\n\n" );
			
			System.out.print("Sorted Set after passing into TreeSet: \n"); 
	        Set<String> tree_Set = new TreeSet<String>(BhrLeaders); 
	        System.out.println(tree_Set);
			
	        System.out.print( "_______________________________________________________________________" );
			System.out.print( "\n\n" );

//Queue EXAMPLE//		
			System.out.println("*****QUEUE EXAMPLE*****");
			
			List<String> listhrLeaders = Arrays.asList("Barry Bond - 762", "Hank Aaron - 755", "Babe Ruth - 714", "Alex Rodriequez - 687", "Brandon Davis - 686", "Brandon Davis - 686", "Willie Mays - 660");
			Queue<String> queueNames = new LinkedList<>(listhrLeaders);
			System.out.println(queueNames);
			
			queueNames.add("661 - Mike Trout");
			queueNames.add("660 - Bryce Harper");
			System.out.println(queueNames);
			
			queueNames.remove("Barry Bond - 762");
			System.out.println(queueNames);		
	
	}

}