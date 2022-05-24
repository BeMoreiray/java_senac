package aula002;

public class desafio {

	public static void main(String[] args) {

//----------------segunda tentativa-------------------------------------
		int max = 10;
		String virgula = ",";
		
	for(int i = 0;i <= max; i++) {
		
	if(i == max) {
		virgula = ".";
		
	}
	System.out.println(i + virgula);
	}

	
System.out.println("-------------------------");	
//-----------primeria tentativa----------------------------------------------
	
   for(int i = 0; i<= 10; i++) {
	   System.out.println(i + ",");
	   
	  if(i == 10) {
		  System.out.println(i +".");
	  }
   }
}}
	
