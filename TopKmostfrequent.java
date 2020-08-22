/**
 * Find the k most frequent words from a file
Last Updated: 18-08-2020
Given a book of words. Assume you have enough main memory to accommodate all words. design a data structure to 
find top K maximum occurring words. The data structure should be dynamic so that new words can be added.
 */

//good use of hashing and heap datastructure
//https://www.programcreek.com/2014/05/leetcode-top-k-frequent-elements-java/




import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKmostfrequent {
	
	public static List<String> topKFrequent(String[] nums,int k) {
	    //count the frequency for each element
	    HashMap<String, Integer> map = new HashMap<>();
	    for (String num : nums) {
	        map.put(num, map.getOrDefault(num, 0) + 1);
	    }
	    System.out.println(map);
	    // create a min heap
	    PriorityQueue<Map.Entry<String, Integer>> queue 
	                  = new PriorityQueue<>(Comparator.comparing(l -> l.getValue()));
	    
	 
	    //maintain a heap of size k.
	    for (Map.Entry<String, Integer> entry : map.entrySet()) {
	       // queue.offer(entry);
	     // queue.offer(entry);
	    	//PriorityQueue doesnot have capacity restrictions
	    	//so both add and offer have the same semantics
	    	//so does remove and poll
	    	queue.add(entry);
	        if (queue.size() > k) {
	            //queue.poll();
	        	queue.remove();
	        }
	    }
	 
	    //get all elements from the heap
	    List<String> result = new ArrayList<>();
	    while (queue.size() > 0) {
	        result.add(queue.remove().getKey());
	    }
	 
	    //reverse the order
	    Collections.reverse(result);
	 
	    return result;
	}
	
	
	public static void main(String[] args) {
		String[] val= {"good","are","fine","good","good","fine","good","i","fine","are"};
		System.out.println(topKFrequent(val,3));
		String l1 = "sa";
		String l2 = "saa";
		String l3 = "as";
		System.out.println(l1.hashCode());
		System.out.println(l2.hashCode());
		System.out.println(l3.hashCode());
		
		
	}

}
