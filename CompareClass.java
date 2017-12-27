import java.util.Iterator;


public class CompareClass<E> {

	public static <E extends Comparable> E min(Set<E> s){
		Iterator itr = s.iterator();
		E min = (E)itr.next();
		E value;
		while(itr.hasNext()){
			value = (E)itr.next();
			if(min.compareTo(value) > 0){
				min = value;
			}
		}
		return min;
	}
}
