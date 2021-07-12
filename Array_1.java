
public class Array_1 {
	
	 public static void main(String[] args) 
	 { 
	 int ctr1=0,ctr2=0; 
	 double sum=0,average=0; 
	 String Name[]=new String[]{"Anand","Maria","Reema","Seema","Rita"};
	 double salary[]= {23500.0,25080.0,28760.0,22340.0,19890.0}; 
	 for(int i=0;i<5;i++) 
	 { 
	 sum=sum+salary[i]; 
	 } 
	 average=sum/5; 
	 for(int i=0;i<5;i++) 
	 { 
	 if(salary[i]>average) 
	 { 
	 ctr1++; 
	 } 
	 if(salary[i]<average) 
	 { 
	 ctr2++; 
	 } 
	 } 
	 
	 System.out.println("The average salary of the employee is "+average); 
	 System.out.println("The number of employees having salary greater than average "+ctr1); 
	 System.out.println("The number of employees having salary lesser than average "+ctr2); 
	 
	 } 
	}


