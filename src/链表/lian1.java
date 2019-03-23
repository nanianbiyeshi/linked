package Á´±í;

public class lian1<Type>{
	private static class listnode<Type>{
		public Type date;
		public listnode<Type> link;
		public listnode(Type date,listnode<Type> link) {
			super();
			this.date = date;
			this.link = link;
		}
		public listnode() {
			super();
			link=null;
		}
		public listnode( Type item){
			date=item;
			link=null;
		}
		public listnode<Type> nextnode(){
			return link;
		}
		public void insertafter(listnode<Type> p){
			if(link==null) throw new java.util.NoSuchElementException();
			p.link=link;
			link=p;
		}
		public listnode<Type> removeafter(){
			listnode<Type> q;
			if(link==null)return null;
			q=link;
			link=q.link;
			return link;
		}
	}

	private listnode<Type> first;
	private listnode<Type> last;
	private int puan=0;
	public void insert(final Type m,final int i ){
	   this.find(i);
	  listnode<Type> newnode=new listnode(m,null);
	 	if(i==0){
		 newnode.link=first;
		 first=newnode; 
	 	}
	 	else{
		 newnode.link=find(i).link;
		 find(i).link=newnode;
		 
	 	}
	 	if(newnode.link==null)last=newnode;
		
		}
	public Type remove(int i){
		listnode<Type> q = null,m;
		m=find(i);
		if(m==null||m.link==null){
			throw new java.util.NoSuchElementException();
		}
		if(i==0){
			q=first;
			m=first=first.link;
		}
		else{
			q=m.link;
			m.link=q.link;
		}
		if(q==last)
		{
			last=m;
		}
		return q.date;
		
	}
	public listnode<Type> find(int m){
		listnode<Type> p=first;
		 int k=0;
		 while(p!=null&& k<m-1){
			 p=p.link;
			 k++;
		 	}
		 if(m<0||p==null&&m!=0){
			 throw  new java.util.NoSuchElementException();
		 }
		 return p;
	}
	
	
	public void add(Type  m){
	  listnode<Type> type= new listnode(m);
	  last.link=type;
	  last=type;
	}
	public void remove(Type m){
		listnode<Type> p=Find(m),q;
		if(p==first){
			first=null;
		}
		else{
			if(p==null){
				throw new java.util.NoSuchElementException();
			}
			else{
				q=p.link;
				p=q.link;	
			}	
		}
		
	}
	
	public listnode<Type> Find(Type p ){
		  puan=0;
		if(p==null){
		return null;
		}
		else{
			for(listnode<Type> op=first; op.link!=null;op=op.link ){
				if(op==first){
					return  first;
				}
				if(op.link.equals(p))  return op;
			}
		}
		puan=1;
		return null;
	}
	public listnode<Type> get(int i){
		return find(i).link;
	}
	public Type set(int i,Type value){
		listnode<Type> open=find(i);
		if(open==null)return null;
		Type no=open.date;
		open.date=value;
		return no;
	}
	
	
}
