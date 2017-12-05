import java.util.Scanner;
public class gradebook //switch multiple-selection statement
{
	private String coursename;
	private int total;
	private int gradecounter;
	private int acount;
	private int bcount;
	private int ccount;
	private int dcount;
	private int ecount;
	private int fcount;
	
	public gradebook(String name)
	{
		coursename = name;
	}

	public void setcoursename(String name)
	{
		coursename = name;
	}
	
	public String getcoursename()
	{
		return coursename;
	}
	
	public void displaymessage()
	{
		System.out.printf("welcome to grade book for\n%s!\n\n",getcoursename());
	}
	
	public void inputgrades()
	{
		Scanner input = new Scanner (System.in);
		int grade;
		System.out.printf("%s\n%s\n   %s\n     %s\n",
				"Enter the integer grade in the range 0-100:",
				"Type the end-of-file  indicator to terminate input:",
				"On UNIX,LINUX,MAC(OS) X Type <Ctrl> d and then Enter",
				"On Window(OS) Type <Ctrl> z and then Enter");
		
		while(input.hasNext())     //loop until user type end-od-file indicator
		{
			grade = input.nextInt();
			total += grade;
			++gradecounter;
			
			IncrementLetterGradeCounter(grade);
		}
	}
		
	private void IncrementLetterGradeCounter(int grade) 
		{
			switch ( grade/10 )
			{
			case 9:
			case10:
				++acount;
			break;
			
			case 8:
				++bcount;
			break;
			
			case 7:
				++ccount;
			break;
			
			case 6:
				++dcount;
			break;
			
			default:
				++fcount;
			break;
			}
		
		}

	public void displaygradereport()
		{
			System.out.println("\n Grade Report:");
			if(gradecounter != 0)
				{
					double average= (double) total/gradecounter;
					System.out.printf("Total of the %d grades entered is %d\n", gradecounter ,total);
					System.out.printf("Class average is %.2f\n", average);
					System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
							"Number of Students who received each grade",
							"A:",acount,
							"B:",bcount,
							"C:",ccount,
							"D:",dcount,
							"F:",fcount );
				}
			else
				System.out.println("No Grades Were Entered");
		}
		
	public static void main(String[]args)
	{
		gradebook mygradebook= new gradebook("CSI-101 Introduction to Java Programming");
		mygradebook.displaymessage();
		mygradebook.inputgrades();
		mygradebook.displaygradereport();
	}
}
