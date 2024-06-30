
public class Project6 {
    public static void main(String args []) {
			Student zhang = new Student ();
			zhang.age = 17;
			//Accessing Inherited Member Variables
			zhang.number= 100101;
			zhang. showPeopleMess (); //Calling inherited methods zhang. tellNumber ();
			int x=9, y=29;
			System.out.print ("Can do addition:");
			int result=zhang. add(x,y) ;
			System.out.printf ("%d+%d=%d\n", x,y, result) ;
		    UniverStudent geng = new UniverStudent();
		    geng.age = 21;
		    // Accessing Inherited Member Variables
		    geng.number = 6609;
		    geng.showPeopleMess(); // Calling inherited methods
		    geng.tellNumber();
		    
		    System.out.print("Can do addition:");
		    result = geng.add(x, y);
		    System.out.printf("%d+%d=%d\t", x, y, result);
		    
		    System.out.print("Can do multiplication:");
		    result = geng.multi(x, y);
		    System.out.printf("%d¡Á%d=%d\n", x, y, result);
		
    }
    }
