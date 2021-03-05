package warpeep.training.week8.Week8;

//This is where we keep everything Philosophy

public class Philosophy {
	public static void philoLesson() {
		System.out.println("Philosophy lessons. ");
	}
}

	//Chapter 1 / First lesson
class PhiloChap1 extends Philosophy { 
	public static void philoLesson() {
		System.out.println("\n\t\tFirst Philo lessons. "
				+ "\nToday discussion topic is 'What is the meaning of a good life?' \n");
	}
}

	//Chapter 2 / Second lesson
class PhiloChap2 extends Philosophy { 
	public static void philoLesson() {
		System.out.println("\t\tSecond Philo lessons. "
				+ "\nNow let's listen to a recorded discussion from previous classes. \n");
	}	
}

	//Chapter 3 / Third lesson
class PhiloChap3 extends Philosophy { 
	public static void philoLesson() {
		System.out.println("\t\tThird Philo lessons. "
				+ "\nOur new discussion topic today is 'Do parallel universes exist?' \n");
	}
}