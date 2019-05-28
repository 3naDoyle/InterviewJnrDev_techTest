package com.triona.main;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 
 * Feel free to use java 7 or java 8 idioms
 *
 */
public class Main {
	
	private List<Worker> workers;
	
	public Main(){
		
		workers = Arrays.asList(
				new Worker("anne", 20, true, false,""),
				new Worker("barry", 27, false, true, "anne"),
				new Worker("catherine", 27, false, true, "anne"),
				new Worker("david", 28, true, false,""),
				new Worker("eric", 30, false, true, "david"),
				new Worker("fiona", 27, false, true, "david"),
				new Worker("gary", 21, true, false,""),
				new Worker("hannah", 19, false, true, "gary"),
				new Worker("ian", 22, true, false,""),
				new Worker("john", 44, false, true, "ian"),
				new Worker("kevin", 31, false, true, "ian"),
				new Worker("leanne", 30, false, true, "ian"),
				new Worker("michelle", 28, false, true, "ian")
			);	
		
		System.out.println("************************************");
		System.out.println("All workers");
		printAllWorkers();
		System.out.println("************************************");
		System.out.println("All leaders");
		printTeamLeaders();
		System.out.println("************************************");
		System.out.println("Members younger than 30");
		printTeamMembersYoungerThan(30);
		System.out.println("************************************");
		System.out.println("Members younger than 20");
		printTeamMembersYoungerThan(20);
		System.out.println("************************************");
		System.out.println("Oldest worker");
		printOldestWorker();
		System.out.println("************************************");
		System.out.println("3 youngest workers");
		printTheThreeYoungestWorkers();
		System.out.println("************************************");
		System.out.println("Annes team");
		printMembersForLeader(getWorkerByName("anne"));
		System.out.println("************************************");
		System.out.println("Ians team");
		printMembersForLeader(getWorkerByName("ian"));
		System.out.println("************************************");
		System.out.println("Average age");
		printAverageAge();
		System.out.println("************************************");
		System.out.println("Leader with most members");
		printLeaderWithMostMembers();
		System.out.println("************************************");
		System.out.println("Leader with youngest team");
		printLeaderWithYoungestTeam();
		
		
	}

	public static void main(String[] args) {
		new Main();	
	}
	
	public void printAllWorkers(){
		for(Worker worker : getWorkers()){
			System.out.println(worker);
		}
	}	
	
	/**
	 * Should print out team leaders only
	 */
	public void printTeamLeaders(){
		
	}	
	
	/**
	 * Prints out all team members (not managers) younger than a specified age
	 * @param age - age in years
	 */
	public void printTeamMembersYoungerThan(int age){
		
	}
	
	/**
	 * Prints out the oldest worker (includes members and leaders)
	 */
	public void printOldestWorker(){
		
	}
	
	/**
	 * Prints out the three youngest workers (includes members and leaders)
	 */
	public void printTheThreeYoungestWorkers(){
		
	}
	
	/**
	 * Prints out the members who report to the given worker
	 * @param manager - a worker (may be a member or a leader)
	 */
	public void printMembersForLeader(Worker worker){
		//if this worker is not a manager - print an error
		
	}
	
	/**
	 * Get the average of all worker ages
	 */
	public void printAverageAge(){
		
	}
	
	/**
	 * Print the leader with the most members
	 */
	public void printLeaderWithMostMembers(){
		
	}
	
	/**
	 * Print the leader with the youngest team - user the mean age of the MEMBERS to determine team age
	 */
	public void printLeaderWithYoungestTeam(){
		
	}	
	

	public List<Worker> getWorkers() {
		return workers;
	}

	public void setWorkers(List<Worker> workers) {
		this.workers = workers;
	}
	
	/**
	 * Returns a worker with a given name
	 * @param name - name of the worker you wish to find
	 * @return
	 */
	public Worker getWorkerByName(String name){
		Optional<Worker> opt = getWorkers()
								.stream()
								.filter(w -> w.getName().equalsIgnoreCase(name))
								.findFirst();		
		return opt.isPresent() ? opt.get() : null; //if the filter and find operations fail, return null				
	}
	
	

}
