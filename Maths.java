package warpeep.training.week8.Week8;

//This is where we keep everything mathematics

public class Maths {
	public static void mathLesson() {
		System.out.println("Mathematics lessons. ");
	}

}

	// Chapter 1 / First lesson
class MathsChap1 extends Maths {
	public static void mathLesson() {
		System.out.println("\n\t\tFirst Math lesson. "
				+ "\nWe will start by watching a video about the Pythagorean Theorem. \n");
	}
}

	// Chapter 2 / Second lesson
class MathsChap2 extends Maths {
	public static void mathLesson() {
		System.out.println("\t\tSecond Math lesson. "
				+ "\nNow that we know the theorem, it's time to put the theory into practice! \n ");
	}
}

	// Chapter 3 / Third lesson
class MathsChap3 extends Maths {
	public static void mathLesson() {
		System.out.println("\t\tThird Math lesson. "
				+ "\nWe shall learn about the Irrationality of the square root of 2. \n ");
	}
}