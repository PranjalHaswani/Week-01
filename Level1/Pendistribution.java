public class Pendistribution{
        public static void main(String[] args){
		       int totalpens = 14; //Total number of pens
			   int totalstudents = 3; //Total number of students
			   int pensperstudent = totalpens / totalstudents;
			   int remainingpens = totalpens % totalstudents;
	    System.out.println("The Pen Per Student is " + pensperstudent + "and the remaining pen not distributed is " + remainingpens); //Display the result
		}
}
			   