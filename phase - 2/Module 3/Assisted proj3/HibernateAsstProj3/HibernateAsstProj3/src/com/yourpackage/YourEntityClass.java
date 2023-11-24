package com.yourpackage;
@Entity

public class YourEntityClass {
    @Id
    private int id;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;

    // Getters and Setters
}