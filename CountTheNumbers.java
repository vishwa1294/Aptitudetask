class CountTheNumbers{
	 
	 public static void main(String[] args){
		 String str="collections is class";
		 int count=6;
		 
		 for(int i=0; i<str.length()-4;i++){
			 if(str.charAt(i)==' ' && str.charAt(i+4)!=' ')
				 count++;
		 }
		 
		 System.out.println("Number of Words :  " + (count+4));
	 }


}