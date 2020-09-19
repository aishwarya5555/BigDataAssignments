package assignment1.question4;

public class Subordinate implements Comparable<Subordinate> {
	private String name;
	private Integer age;
	
	public Subordinate(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int compareTo(Subordinate o) {
		return this.age.compareTo(o.getAge()) < 0 ? -1 : 1;
	}

	@Override
	public String toString() {
		return name + " " + age;
	}

}
