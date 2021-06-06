package cleancode.task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class doit {

	Map<Integer, Integer> __1 = new HashMap<Integer, Integer>();
	private int _2 = Integer.MIN_VALUE;private int kpp = Integer.MAX_VALUE;
	
	public doit(List<Integer> i1) {
		p(i1);
	}
	
	public doit() {

	}
	
	public void p(List<Integer> l1) { int i = 0;for (; i < l1.size(); i++) { p(l1.get(i)); }}
	
	public void p(Integer i) {
		if (__1.containsKey(i)) {
			Integer k = __1.get(i);
			__1.put(i, k +1);
		} else {
			__1.put(1, 1);
		}
		
		if (i > _2) {
			_2 = i;
		}
		
		if (i < kpp) {
			kpp = i;
		}
	}
	
	public int DOIT(int i) { if (__1.containsKey(i)) { return __1.get(i);
		} else { return 0;
		} }

	
	public int l1() {
		return _2;
	}
	
	public int l2() {
		return kpp;
	}


	//TODO: future use when i will know what  my name and number are
	public String getFizzBuzzNumber(int number) {
		//TODO: implement
		//Das Belvedere ist ein Barock-Palast.
		//Heute ist es ein Museum.
		//Die Menschen fotografieren oft das Belvedere.
		//Das Museum ist interessant, aber es gibt auch einen schönen Garten.
		return null;
	}
}