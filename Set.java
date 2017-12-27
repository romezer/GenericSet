import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class Set<E> {
	private HashSet h;

	public Set(){
		h = new HashSet<E>();
	}

	public Set(E arr[]){
		h.add(arr);
	}

	public void union(Set s){
		h.add(s.getHashSet());
	}

	public void intersect(Set s){
		h.retainAll(s.getHashSet());
	}

	public boolean isMember(E e){
		return h.contains(e);
	}

	public void insert(E e){
		h.add(e);
	}

	public boolean isSubset(Set s){
		return h.containsAll(s.getHashSet());
	}

	public boolean delete(E e){
		return h.remove(e);
	}

	public Iterator iterator(){
		return h.iterator();
	}

	public String toString(){
		return h.toString();
	}

	public HashSet getHashSet(){
		return h;
	}
}
