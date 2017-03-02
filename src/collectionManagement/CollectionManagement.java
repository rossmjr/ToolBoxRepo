package collectionManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class CollectionManagement<T> {

	/**
	 * 
	 * @param list
	 * @return
	 */
	public ArrayList<T> shuffle(ArrayList<T> list) {
		
		return list;
	}

	/**
	 * 
	 * @param list
	 * @return
	 */
	public List<T> shuffle(List<T> list) {
		
		return list;
	}

	/**
	 * 
	 * @param hashy
	 * @return
	 */
	public Set<T> getValue(HashMap<T, T> hashy) {
		
		return null;
	}

	/**
	 * This method takes in an array and turns it into a TreeMap setting the key to sequential numbers starting from 1.
	 * 
	 * @param list - list to be numbered
	 * @return numbered TreeMap 
	 */
	public TreeMap number(T[] list){
		TreeMap<Integer, T> treeMap = new TreeMap<Integer, T>();
		for(int i = 0; i < list.length; i++){
			treeMap.put(i + 1, list[i]);
		}
		return treeMap;
	}
	
	/**
	 * This method takes in an ArrayList and turns it into a TreeMap setting the key to sequential numbers starting from 1.
	 * 
	 * @param list - list to be numbered
	 * @return numbered TreeMap 
	 */
	public TreeMap number(ArrayList<T> list){
		TreeMap<Integer, T> treeMap = new TreeMap<Integer, T>();
		for(int i = 0; i < list.size(); i++){
			treeMap.put(i + 1, list.get(i));
		}
		return treeMap;
	}
}
