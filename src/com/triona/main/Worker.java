package com.triona.main;

public class Worker {
	
	private String name;
	public int age;
	
	/**
	 * A worker can either be a member of the team OR a leader of a team but not both
	 */
	private boolean teamLeader;
	private boolean teamMember;
	
	private String managerName;
	
	public Worker(String name, int age, boolean teamLeader, boolean teamMember, String managerName) {
		super();
		this.name = name;
		this.age = age;
		this.teamLeader = teamLeader;
		this.teamMember = teamMember;
		this.managerName = managerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isTeamLeader() {
		return teamLeader;
	}

	public void setTeamLeader(boolean teamLeader) {
		this.teamLeader = teamLeader;
	}

	public boolean isTeamMember() {
		return teamMember;
	}

	public void setTeamMember(boolean teamMember) {
		this.teamMember = teamMember;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", managerName=" + managerName + "]";
	}
	
	

}
