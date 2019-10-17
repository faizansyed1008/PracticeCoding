package model;

public abstract class Olive {
	private String name = "Kalamata";
	private long color = 10125454L;
	private int oil = 5;

	
	public abstract String getOrigin();
	
	
	
	
	public Olive() {}
	
	public Olive(String name,long color, int oil) {
		
		this.name = name;
		this.color = color;
		this.oil = oil;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getColor() {
		return color;
	}

	public void setColor(long color) {
		this.color = color;
	}

	public int crush() {
		
		String msg = "olive"+ getName()+" from "+ getOrigin()+" total oil crushed is "+oil;
		System.out.println(msg);
		System.out.println("Ouch!!");
		
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}
}