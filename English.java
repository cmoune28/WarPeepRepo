package warpeep.training.week8.Week8;

//This is where we keep everything English

public class English {
	public static void engLesson() {
		System.out.println("English lessons");
	}
}

class EngChap1 extends English {
	public static void engLesson() {
		System.out.println("\n\t\tFirst English lessons. "
				+ "\nToday, we will explore the classic novel that is Moby Dick. \n");
	}
}

class EngChap2 extends English {
	public static void engLesson() {
		System.out.println("\t\tSecond English lessons. "
				+ "\nInspired by our Moby Dick's discussion, let's write some poems. \n");
	}
}

class EngChap3 extends English {
	public static void engLesson() {
		System.out.println("\t\tThird English lessons. \nWe will stupid one Harry Potter novel. \n");
	}
}