package Á´±í;

public class DoubleList<Type> {
	private static class Listnode<Type>{
		private Listnode<Type>  rlink;
		private Listnode<Type>   llink;
		Type date;
		public Listnode(Listnode<Type> rlink, Listnode<Type> llink, Type date) {
			super();
			this.rlink = rlink;
			this.llink = llink;
			this.date = date;
		}
		public Listnode() {
			
			this.rlink =null ;
			this.llink = null;
			this.date = null;
		}
		
	}
	private Listnode<Type> first;
	private Listnode<Type> last;
	private Listnode<Type> current;
	
	public DoubleList(){
		first=new Listnode();
		first.rlink=first.llink=first;
		current=null;
		begain();
	}
	
	public void begain(){
	current=first;
	}
	public boolean isEmpty(){
		return first.llink==first;
	}
	public void insert(Type t){
		if(current!=null){
		Listnode<Type> mon= new Listnode(null,null,t);
		mon.rlink=current.llink;
		mon.llink=current;
		current.llink=mon;
		current.llink.rlink=mon;
		current=mon;
		}
		else{
			current=first.rlink=new Listnode(first.rlink,first,t);
			current.rlink.llink=current;
		}
		if(current.llink==first)
			last=current;
	
	}
	public boolean find(Type t){
		Listnode<Type> p=first.llink;
		if(t==null){
			while(p!=first&&p.date!=null) p=p.llink;
		}
	else{
		while(p!=first &&p.date.equals(t)) p=p.llink;
			
	}
		if(p!=null)
		{
			current =p;
			return true;
		}
		else
			return false;
	}
public void remove(){
	if(current!=null){
 		Listnode<Type>  mon=current;
 		current=current.rlink;
 		current.llink=mon.rlink;
 		mon.llink.rlink=current;
	}
	if(current==first){
		if(isEmpty()) current=null;
		else 
			current=current.llink;
	}
	}
public void remove( Type t){
	find(t);
	if(current!=null){
 		Listnode<Type>  mon=current;
 		current=current.rlink;
 		current.llink=mon.rlink;
 		mon.llink.rlink=current;
	}
	if(current==first){
		if(isEmpty()) current=null;
		else 
			current=current.llink;
	}
	
}
	
	
}













