package Á´±í;

public class Staticlink<Type> {
	private static class  node<Type>{
		Type date;
		int next;
		public node(Type date, int next) {
			super();
			this.date = date;
			this.next = next;
		}
		public node(){
			date=null;
			next=0;
		}
		
	}
   private node[] nodes;
   private int free;
   private int size;
   private int current;
   public Staticlink(int i){
	   nodes=new node[i];
	   begain();
   }
   public Staticlink(){
	   nodes=new node[20];
	   begain();
   }
   public void begain(){
	   for(int i=1;i<nodes.length-1;i++){
		   nodes[i].next=i+1;
	   }
	   nodes[nodes.length-1].next=0;
	   current=1;
   }
  public int newnode(){
	  int p=current;
	  if(p!=0){
		  current=nodes[current].next;
		 return p; 
	  }
	  return -1;
  }
  public void freenode(int p){
	  nodes[p].next=current;
	  current=p;
  }	
  public int find(int x){
	  if(0<x&&x<nodes.length-1)
		  return nodes[x].next;
	  else
		  return 0;
  }
  public boolean add(Type date ,int i){
	  int p=find(i);
	  if(p==0)return false;
	  int q=newnode();
	  if(q==0)return false;
	  nodes[q].date=date;
      nodes[q].next=nodes[p].next;
	  nodes[p].next=q;
	  return true;  	  
}
  




}
