
public class Person implements Comparable<Person> {

	private int age;
	private int id;
	private String name;

	public Person(int age , int id, String name){
		this.age = age;
		this.id = id;
		this.name = name;
	}

	public int getAge(){
		return age;
	}

	public String toString(){
		String str = "Person name: " + name + " Prson Id: " + id + " Person age: " + age;
		return str;
	}

	public int compareTo(Person o) {
		if(this.getAge() > o.getAge()){
			return 1;
		}
		else if(this.age < o.getAge()){
			return -1;
		}

		return 0;
	}

}