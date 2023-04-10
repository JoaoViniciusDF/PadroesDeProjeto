package Exemplo1;

	public abstract class Animal implements Cloneable {
	   
		private String name;
	    private int age;

	    public Animal(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    public void setName(String string) {
			
		}
	    public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}

	    public abstract void makeSound();

	    @Override
	    public Animal clone() throws CloneNotSupportedException  {
	        return (Animal) super.clone();
	    }
	}