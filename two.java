class Main{
	 public static void main(String[] args){
	 	 String smallString="a";
	 
	 	 //using string
	 	 long startTime=System.nanoTime();
	 	 String res="";
	 	 for(int i=0;i<1000;i++){
	 	 	res+=smallString;
	 	 }
	 	 long endTime=System.nanoTime();
	 	 long stringTime=endTime-startTime;

	 	 //stringBuilder
	 	  long startTime1=System.nanoTime();
	 	 StringBuilder sb = new StringBuilder();
	 	 for(int i=0;i<1000;i++){
	 	 	sb.append(smallString);
	 	 }
	 	 long endTime1=System.nanoTime();
	 	 long stringBuilderTime=endTime1-startTime1;

	 	 //StringBuffer
	 	   long startTime2=System.nanoTime();
	 	 StringBuffer sb1 = new StringBuffer();
	 	 for(int i=0;i<1000;i++){
	 	 	sb1.append(smallString);
	 	 }
	 	 long endTime2=System.nanoTime();
	 	 long stringBufferTime=endTime2-startTime2;

       System.out.println("String: "+stringTime+" nanosec");
       System.out.println("StringBuilder: "+stringBuilderTime+" nanosec");
         System.out.println("StringBuffer: "+stringBufferTime+" nanosec");
	 }
}