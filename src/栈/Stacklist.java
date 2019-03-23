package ջ;

import java.util.NoSuchElementException;

public class Stacklist <Type>{
	private static class Stacknode<Type>{
		private Type date;
		Stacknode<Type> link;
		public Stacknode(){
			
		}
		public Stacknode( Type d,Stacknode<Type> lin){
			date=d;
			link=lin;
			
		}
	}
  private  Stacknode<Type> top;
  
	public Stacklist(){
		top=null;
	}
	public void Clear(){
		top=null;
	}
	public boolean isempty(){
		return top==null;
	}
	public void push(Type item){
		top=new Stacknode(item,top);
	}
	public Type pop(){
		if(isempty())
			throw new NoSuchElementException();
		Stacknode<Type> p=top;
		top=top.link;
		return p.date;	
	}
	public Type gettop(){
		if(isempty())
			throw new NoSuchElementException();
		return top.date;
	}
	

}
