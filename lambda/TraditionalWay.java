
public class TraditionalWay {

	public static void main(String[] args) {
		
		java.util.List<Person> list = java.util.Arrays.asList(
				new Person("Amit", "Upadhyay", 20),
				new Person("Katrina", "Kaif", 21),
				new Person("Deepika", "Padukone", 22),
				new Person("Naina", "Bhatiya", 19),
				new Person("Sonal", "Peru", 19)
				);
		
		// step1: sort according to last name
		java.util.Collections.sort(list, new java.util.Comparator<Person>() {

					@Override
					public int compare(Person o1, Person o2) {
						
						return o1.getLastName().compareTo(o2.getLastName());
					}
		});
		
		// step2: print them
		System.out.println("Printing all names");
		System.out.println();
		printLists(list);

		// step3: print people who have last name beginning with P
		System.out.println();
		System.out.println("Printing names whose first character of last name is P");
		System.out.println();
		printConditionally(list, new Condition() {
			@Override
			public boolean test(Person p)
			{
				return p.getLastName().startsWith("P");
			}
		});
	}

	private static void printConditionally(java.util.List<Person> list, Condition c) {
		
		for (Person p: list)
			if (c.test(p))
			{
				System.out.println(p);
			}
		
	}

	private static void printLists(java.util.List<Person> list) {

		for (Person p: list)
			System.out.println(p);// this will call the toString method defined in Person class.	
	}
}
