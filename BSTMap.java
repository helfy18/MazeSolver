import java.util.*;

public class BSTMap<K extends Comparable<K>, V > implements  Map<K, V>  {
	BinarySearchTree<K,V> map;

	public BSTMap () {
		map = new BinarySearchTree<K,V>();
	}

	public boolean containsKey(K key) {
		try{
			V val = map.find(key);
			return true;
		}
		catch(KeyNotFoundException e){
			return false;
		}
	}

	public V get (K key) throws KeyNotFoundException {
		return map.find(key);
	}

	public List<Entry<K,V> >	entryList() {
		return map.entryList();
	}

	public void put (K key, V value) {
		map.insert(key,value);
	}

	public int size() {
		return map.size();
	}

	public void clear() {
		map.clear();
	}

	public int getGetLoopCount() {
		return map.getFindLoopCount();
	}

	public int getPutLoopCount() {
		return map.getInsertLoopCount();
	}

	public void resetGetLoops() {
		map.resetFindLoops();
	}
	public void resetPutLoops() {
		map.resetInsertLoops();
	}
}
