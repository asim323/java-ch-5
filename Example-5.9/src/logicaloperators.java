
public class logicaloperators 
{
	public static void main(String[]args)
	{
		System.out.printf("%s\n %s : %b\n %s : %b\n %s : %b\n %s : %b\n\n",
							"Conditional And &&",
							"false && false",(false && false),
							"false && true",(false && true),
							"true && False",(true && false),
							"true && true",(true && true ) );
		
		System.out.printf("%s\n %s : %b\n %s : %b\n %s : %b\n %s : %b\n\n",
				"Conditional OR ||",
				"false || false",(false || false),
				"false || true",(false || true),
				"true || False",(true || false),
				"true || true",(true || true ) );
		
		System.out.printf("%s\n %s : %b\n %s : %b\n %s : %b\n %s : %b\n\n",
				"Conditional And &&",
				"false && false",(false && false),
				"false && true",(false && true),
				"true && False",(true && false),
				"true && true",(true && true ) );
		
		System.out.printf("%s\n %s : %b\n %s : %b\n %s : %b\n %s : %b\n\n",
				"Boolean Logic And &",
				"false & false",(false & false),
				"false & true",(false & true),
				"true & False",(true & false),
				"true & true",(true & true ) );
		
		System.out.printf("%s\n %s : %b\n %s : %b\n %s : %b\n %s : %b\n\n",
				"Boolean Logic OR |",
				"false | false",(false | false),
				"false | true",(false | true),
				"true | False",(true | false),
				"true | true",(true | true ) );
		
		System.out.printf("%s\n %s : %b\n %s : %b\n %s : %b\n %s : %b\n\n",
				"Boolean Logical Exclusive OR ^",
				"false ^ false",(false ^ false),
				"false ^ true",(false ^ true),
				"true ^ False",(true ^ false),
				"true ^ true",(true ^ true ) );
		
		System.out.printf("%s\n %s : %b\n %s : %b", 
				"Logical Not(!)",
				"! false",(!false),
				"! true",(!true));
	}
}
