import java.util.ArrayList;
import java.util.HashMap;

public class Database  {

	public static void main(String[] args) {
		
		
		
		
		
	
		
		
		HashMap<Character, ArrayList<Records>> database = createHashMap();
		
		database.get('m').add(new Records( "MR" , " Bob ", 	" Mercier-Peetz ",	" employeeID " , " mailID ", " projectID ", " clientName ", " projectName " ," location"));
		

		
		ArrayList<Records> test1 = new ArrayList<Records>();
		test1 = database.get('m');
		test1.get(0).display();
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	public static HashMap<Character, ArrayList<Records>> createHashMap() {
		
		HashMap<Character, ArrayList<Records>> database = new HashMap();
		
		ArrayList<Records> a = new ArrayList<Records>();
		database.put('a', a);
		
		
		ArrayList<Records> b = new ArrayList<Records>();
		database.put('b', b);
		
		ArrayList<Records> c = new ArrayList<Records>();
		database.put('c', c);
		
		ArrayList<Records> d = new ArrayList<Records>();
		database.put('d', d);
		
		
		ArrayList<Records> e = new ArrayList<Records>();
		database.put('e', e);
		
		ArrayList<Records> f = new ArrayList<Records>();
		database.put('f', f);

		ArrayList<Records> g = new ArrayList<Records>();
		database.put('g', g);
		ArrayList<Records> h = new ArrayList<Records>();
		database.put('h', h);
		ArrayList<Records> i = new ArrayList<Records>();
		database.put('i', i);
		ArrayList<Records> j = new ArrayList<Records>();
		database.put('j', j);
		ArrayList<Records> k = new ArrayList<Records>();
		database.put('k', k);
		ArrayList<Records> l = new ArrayList<Records>();
		database.put('l', l);
		ArrayList<Records> m = new ArrayList<Records>();
		database.put('m', m);
		ArrayList<Records> n = new ArrayList<Records>();
		database.put('n', n);
		ArrayList<Records> o = new ArrayList<Records>();
		database.put('o', o);
		ArrayList<Records> p = new ArrayList<Records>();
		database.put('p', p);
		ArrayList<Records> q = new ArrayList<Records>();
		database.put('q', q);
		ArrayList<Records> r = new ArrayList<Records>();
		database.put('r', r);
		ArrayList<Records> s = new ArrayList<Records>();
		database.put('s', s);
		ArrayList<Records> t = new ArrayList<Records>();
		database.put('t', t);
		ArrayList<Records> u = new ArrayList<Records>();
		database.put('u', u);
		ArrayList<Records> v = new ArrayList<Records>();
		database.put('v', v);
		ArrayList<Records> w = new ArrayList<Records>();
		database.put('w', w);
		ArrayList<Records> x = new ArrayList<Records>();
		database.put('x', x);
		ArrayList<Records> y = new ArrayList<Records>();
		database.put('y', y);
		ArrayList<Records> z = new ArrayList<Records>();
		return database;
		
		
		
		
		
		
	}
	
	
	
	

}
