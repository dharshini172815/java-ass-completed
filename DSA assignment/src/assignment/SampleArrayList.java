package assignment;

public class SampleArrayList <T>{
   private Object[] data;
   private int size=0;
   private static final int INITIAL_CAPACITY =10;
   
   SampleArrayList(){
	   data = new Object [INITIAL_CAPACITY];  
   }
   
   
   public void add(T element) {
	   ensureCapacity();
	   data[size++]=element;
   }
   
   
   public T get(int index) {
	   checkIndex(index);
 	   return (T) data[index];
   }
   
   public int size() {
	   return size;
   }
   
   
   public void remove(int index) {
	   checkIndex(index);
	   for(int i=index;i<size-1;i++) {
		   data[i]=data[i+1];
	   }
	   data[--size]=null;
   }
   
   
   @SuppressWarnings("unchecked")
public boolean contains(T element) {
	   for(int i=0;i<size;i++) {
		   if(element.equals((T)data[i])) {
			   return true;
		   }
	   }
	   return false;
   }
   
   private void ensureCapacity() {
	   if(size == data.length) {
		    Object[] newData = new  Object[data.length*2];
		    for(int i=0;i<size;i++) {
		    	newData[i] = data[i];
		    }
		    data=newData;
	   }
   }
   
   
   public void checkIndex(int index) {
	   if(index < 0 || index >= size ) {
		   throw new IndexOutOfBoundsException("Index "+index+" out of Bounds");
	   }
   }
   
   
   
   public void printList() {
	   System.out.print("List: ");
	   for(int i=0;i<size;i++) {
		   System.out.print(data[i]+" ");
	   }
	   System.out.println();
   }
   
   
}


