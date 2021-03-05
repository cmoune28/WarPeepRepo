package warpeep.training.week8.Week8;

// This is where we keep the Instructors introduction


public class Professors {
	public static void teach() {
		System.out.println("A subject");
	}	
}
	// MATH INSTRUCTORS
class MathProf extends Professors {
	public static void teach() {
		System.out.println("Hello good people! My name is Dr. Stein. "
				+ "\nI have PHD in applied mathematics and I will be your Math instructor. \n");
	}	
}
	// PHILOSOPHY INSTRUCTORS
class PhiloProf extends Professors {
	public static void teach() {
		System.out.println("Welcome class! My name is Descartes, "
				+ "\nI have over 20 years of experience as a Philosophy teacher. \n");
	}	
}
	// ENGLISH INSTRUCTORS
class EnglishProf extends Professors {
	public static void teach() {
		System.out.println("Good day class! I am Mr. Locke but you can call me Mr.Lucky. "
				+ "\nI am your English professor. \n");
	}	
}


