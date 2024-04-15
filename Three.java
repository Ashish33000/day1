import java.util.*; 

public class Three{
	public static void main(String[] args){
		StringBuffer buffer=new StringBuffer();
		Thread t1=new Thread(new Demo(buffer,'A','F'));
		Thread t2=new Thread(new Demo(buffer,'G','L'));
		Thread t3=new Thread(new Demo(buffer,'M','R'));
		Thread t4=new Thread(new Demo(buffer,'S','X'));
		Thread t5=new Thread(new Demo(buffer,'T','Z'));
		    t1.start();
			t2.start();
			t3.start();
		     t4.wait(10000);
			t4.start();
			t5.start();
			try{
				t1.join();
				t2.join();
				t3.join();
				t4.join();
				t5.join();

			}catch(Exception e){
				e.printStackTrace();
			}
		
         System.out.println( buffer.toString());
	}
}
 class Demo implements Runnable{
	private final StringBuffer buffer;
	private final char start;
	private final char end;

	public Demo(StringBuffer buffer,char start,char end){
		this.buffer=buffer;
		this.start=start;
		this.end=end;
	}
	@Override
	public void run(){
      for(char c=start;c<=end;c++){
      	synchronized(buffer){
      		buffer.append(c);
      	}
      }
	}
}