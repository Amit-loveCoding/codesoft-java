package codeSoft;

import java.util.Scanner;

public class studentGradeCalculator {

	public static void main(String[] args) {
		float marks[] = new float[8];
		float sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of subject :" + " ");
		int n=sc.nextInt();
		
		System.out.print("Enter marks obtained by student in following given subjects : "+" ");
		
		for(int i=0; i<n; i++)
		{
			marks[i] = sc.nextFloat();
			sum+=marks[i];
		}
//		System.out.println(sum);
		
		float avg=sum/n;

		String grade = " ";
		
		if(avg>=94)
		{
			grade="A";
		}
		else if(avg>=90 && avg<94)
		{
			grade="A-";
		}
		else if(avg>=87 && avg<90)
		{
			grade="B+";
		}
		else if(avg>=83 && avg<87)
		{
			grade="B";
		}
		else if(avg>=80 && avg<83)
		{
			grade="B-";
		}
		else if(avg>=77 && avg<80)
		{
			grade="C+";
		}
		else if(avg>=73 && avg<77)
		{
			grade="C";
		}
		else if(avg>=70 && avg<73)
		{
			grade="C-";
		}
		else if(avg>=67 && avg<70)
		{
			grade="D+";
		}
		else if(avg>=63 && avg<67)
		{
			grade="D";
		}
		else if(avg>=60 && avg<63)
		{
			grade="D-";
		}
		else
		{
			grade ="F";
		}
		System.out.println("\nTotal Marks : "+sum+"\nAverage percentage :"+avg+"\nGrade = " + grade);
		
		
		

	}

}
