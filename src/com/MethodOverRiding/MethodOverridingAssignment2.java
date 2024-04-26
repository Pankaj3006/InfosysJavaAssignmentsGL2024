package com.MethodOverRiding;

class Event {
	private String eventName;
	private String participantName;
	private double registrationFee;
	
    public Event(String eventName, String participantName) {
    	this.eventName = eventName;
    	this.participantName = participantName;
    } 
    
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getParticipantName() {
		return participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	public double getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	
	public void registerEvent() {
		
		double baseFee =0.0;
		if(eventName.equals("Singing"))
			baseFee=8.0;
		else if(eventName.equals("Dancing"))
			baseFee=10.0;
		else if(eventName.equals("DigitalArt"))
			baseFee=12.0;
		else if(eventName.equals("Acting"))
			baseFee=15.0;
		else
			baseFee=0.0;
		
		registrationFee = baseFee;
	}
}

class SoloEvent extends Event {
	private int participantNo;

	public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}

	public SoloEvent(String eventName, String participantName, int participantNo) {
		super(eventName, participantName);
		this.participantNo = participantNo;
	}
	
	public void registerEvent() {
		double baseFee =0.0;
		if(getEventName().equals("Singing"))
			baseFee=8.0;
		else if(getEventName().equals("Dancing"))
			baseFee=10.0;
		else if(getEventName().equals("DigitalArt"))
			baseFee=12.0;
		else if(getEventName().equals("Acting"))
			baseFee=15.0;
		else
			baseFee=0.0;
		
		setRegistrationFee(baseFee);
	}
}

class TeamEvent extends Event {
	private int noOfParticipants;
	private int teamNo;
	
	public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo) {
		super(eventName, participantName);
		this.noOfParticipants = noOfParticipants;
		this.teamNo = teamNo;
	}
	
	public int getNoOfParticipants() {
		return noOfParticipants;
	}

	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}

	public int getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}	
	
	public void registerEvent() {
		double baseFee =0.0;
		if(noOfParticipants>1) {
		if(this.getEventName().equals("Singing"))
			baseFee=4.0*this.noOfParticipants;
		else if(getEventName().equals("Dancing"))
			baseFee=6.0*this.noOfParticipants;
		else if(getEventName().equals("DigitalArt"))
			baseFee=8.0*this.noOfParticipants;
		else if(getEventName().equals("Acting"))
			baseFee=10.0*this.noOfParticipants;
		else
			baseFee=0.0*this.noOfParticipants;
		
		setRegistrationFee(baseFee);
		}
	}
}

public class MethodOverridingAssignment2 {

	public static void main(String[] args) {
        
        SoloEvent soloEvent = new SoloEvent("Dancing", "Jacob", 1);
		soloEvent.registerEvent();
		if (soloEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + soloEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + soloEvent.getRegistrationFee());
			System.out.println("Your participant number is " + soloEvent.getParticipantNo());

		} else {
			System.out.println("Please enter a valid event");
		}

		System.out.println();
		TeamEvent teamEvent = new TeamEvent("Acting", "Serena", 5, 1);
		teamEvent.registerEvent();
		if (teamEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + teamEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + teamEvent.getRegistrationFee());
			System.out.println("Your team number is " + teamEvent.getTeamNo());
		} else {
			System.out.println("Please enter a valid event");
		}
	}
}
