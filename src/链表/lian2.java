package Á´±í;

public class lian2<Type1> {
	private static  class Listnode<Type1>{
		private Listnode<Type1>  link;
		private Type1 date;
		public Listnode(Listnode<Type1> link, Type1 date) {
			super();
			this.link = link;
			this.date = date;
		}
		public Listnode(){
			this.link=null;
			this.date=null;
		}
		public Listnode(Type1 m){
			this.date=m;
			this.link=null;
			
		}	
	}
	     private  Listnode<Type1> first;
	     private  Listnode<Type1>  last;
	     private  Listnode<Type1>  current;
	
	     public lian2(){
	    	 first=new Listnode();
	    	 first.link=first;
	    	 begain();
	     }
	     public  void begain(){
	    	 current=first.link;
	    	 
	     }
	     
	     
	     public void insert(Type1 t){
	    	 if(current!=null)
	    	 { Listnode<Type1> mon=new Listnode(null,t);
	    	 mon=current.link;
	    	 current.link=mon;
	    	 current=mon;}
	    	 else{
	    		 throw new java.util.NoSuchElementException();
	    	 }
	    	 if(current.link==first){
	    		 
	    	 }
	     }
	     
	     public void remove(){
	    	 Listnode<Type1> p;
	    	 p=current.link.link;
	    	 current.link=p;
	    	 
	     }
	     public Listnode<Type1> find(Type1  t1){
	    	 Listnode<Type1> mon=first;
	    	 if(t1==null){
	    	 while(mon.link!=first&&mon.link.date!=null){
	    		 mon=mon.link;  
	    	 }
	    	 }
	    	 else{
	    		while(mon.link!=null&&!mon.link.date.equals(t1)){
	    			mon=mon.link;	
	    		}	 
	    	 }
	    	 
	    	 if(mon==first)
	    		 return null;
	    	 else
	    		 return mon;
	     }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
}
