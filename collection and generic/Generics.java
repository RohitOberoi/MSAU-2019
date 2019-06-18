package practice;

public class Generics<T> implements Comparable<Generics>{
	private T t;
	public T get(){
		return this.t;
	}
	public void set(T t1){
		this.t=t1;
	}
	public Generics(T t) { 
        this.t = t;
    } 
	public boolean equals(Object o) { 
	    if (o == this) { 
            return true; 
        } 
        Generics<T> t1=(Generics) o;
        return this.t.equals(t1.t);
    } 
	public static void main(String args[]){
		Generics<String> type2 = new Generics<>("rohit");
		Generics<String> type = new Generics<>("oberoi");
		type.set("Rahul"); 
		System.out.println(type.equals(type2));
	}
	public int compareTo(Generics g) {
		// TODO Auto-generated method stub
		if(t==g.t)  
			return 0;  
		else 
			return 1;
	}
		
}
