import java.security.SecureRandom;
import java.util.Scanner;

public class Test {
	private static SecureRandom randomNumber = new SecureRandom();
	private static final int upperLimit = 100;
	private static final int setSize = 10;

	public static void main(String[] args) {
		Set <Integer> firstIntSet = new Set<Integer>();
		Set <Integer> secondtIntSet = new Set<Integer>();
		Set <Integer> thirdIntSet = new Set<Integer>();

		for(int i = 0 ; i < setSize ; i ++){
			firstIntSet.insert(randomNumber.nextInt(upperLimit));
			secondtIntSet.insert(randomNumber.nextInt(upperLimit));
			thirdIntSet.insert(randomNumber.nextInt(upperLimit));
		}

		System.out.println("First set: " + firstIntSet.toString());
		System.out.println("Second set: " + secondtIntSet.toString());
		System.out.println("Third set: " + thirdIntSet.toString());

		firstIntSet.union(secondtIntSet);
		System.out.println("Union of first set and second set: " + firstIntSet);
		firstIntSet.intersect(thirdIntSet);
		System.out.println("Intersect of first set and third set: " + firstIntSet);

		System.out.println("Please insert first input");
		Scanner firstInput = new Scanner(System.in);
		while(!firstInput.hasNextInt()){
			System.out.println("That's not a number!");
			firstInput.next();
		}
		int firstInt = firstInput.nextInt();

		System.out.println("Please insert second input");
		Scanner secondInput = new Scanner(System.in);
		while(!secondInput.hasNextInt()){
			System.out.println("That's not a number!");
			secondInput.next();
		}
		int secondInt = secondInput.nextInt();

		Set<Integer> userSet = new Set<Integer>();
		userSet.insert(firstInt);
		userSet.insert(secondInt);

		if(firstIntSet.isSubset(userSet) || secondtIntSet.isSubset(userSet) || thirdIntSet.isSubset(userSet)){
			System.out.println("Your set is a subset of one of the priviest sets");
		}
		else{
			System.out.println("Your set is not a subset of one of the priviest sets");
		}

		System.out.println("Please insert number input");
		Scanner sc = new Scanner(System.in);
		while(!sc.hasNextInt()){
			System.out.println("That's not a number!");
			sc.next();
		}
		int number = sc.nextInt();

		System.out.println("If the number is member of the first set: " + firstIntSet.isMember(number));
		secondtIntSet.insert(number);
		System.out.println("Second set after inserting the number: " + secondtIntSet);

		if(thirdIntSet.delete(number)){
			System.out.println("Third set after deleting the number: " + thirdIntSet);
		}
		else{
			System.out.println("The number is not a member of the third set: " + thirdIntSet);
		}

		Person p1 = new Person(20,111,"Avi");
		Person p2 = new Person(10,112,"Dan");
		Person p3 = new Person(30,113,"Dina");
		Person p4 = new Person(40,114,"Adva");
		Person p5 = new Person(5,115,"Shlomo");
		Set<Person> personSet = new Set<Person>();
		personSet.insert(p1);
		personSet.insert(p2);
		personSet.insert(p3);
		personSet.insert(p4);
		personSet.insert(p5);


		System.out.println("The minimum age person is : " + CompareClass.min(personSet));








	}

}
