package Operators.Arithmetic_Operators;

public class ArithmaticOperators_Intro {

/*
 Operator	Result
	+	Addition
	-	Subtraction (also unary minus)
	*	Multiplication
	/	Division
	%	Modulus
	++	Increment
	+=	Addition assignment
	-=	Subtraction assignment
	*=	Multiplication assignment
	/=	Division assignment
	%=	Modulus assignment
	--	Decrement
 */
  
  public static void main(String[] args) {
	
	// arithmetic using integers
	System.out.println("Integer Arithmetic");
	int a = 2 + 5;
	int b = a * 3;
	int c = b / 4;
	int d = c - a;
	int e = -d;
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("c = " + c);
	System.out.println("d = " + d);
	System.out.println("e = " + e);
	
	// arithmetic using doubles
	System.out.println("\nFloating Point Arithmetic");
	double da = 1 + 1;
	double db = da * 3;
	double dc = db / 4;
	double dd = dc - da;
	double de = -dd;
	System.out.println("da = " + da);
	System.out.println("db = " + db);
	System.out.println("dc = " + dc);
	System.out.println("dd = " + dd);
	System.out.println("de = " + de);
	
  }
}
