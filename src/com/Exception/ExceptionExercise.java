package com.Exception;

@SuppressWarnings("serial")
class InvalidAgeException extends RuntimeException {
	public InvalidAgeException(String message) {
		super(message);
	}
}

@SuppressWarnings("serial")
class InvalidJobProfileException extends RuntimeException {
	public InvalidJobProfileException(String message) {
		super(message);
	}
}

@SuppressWarnings("serial")
class InvalidNameException extends RuntimeException {
	public InvalidNameException(String message) {
		super(message);
	}
}

class Validator {
	public boolean validateName(String name) {
		if (name == null || name.equals(""))
			return false;
		else
			return true;
	}

	public boolean validateJobProfile(String jobProfile) {
		if (jobProfile.equals("Associate") || jobProfile.equals("Clerk") || jobProfile.equals("Executive")
				|| jobProfile.equals("Officer"))
			return true;
		else
			return false;
	}

	public boolean validateAge(int age) {
		if (age >= 18 && age <= 30)
			return true;
		else
			return false;
	}

	public void validate(Applicant applicant) {
		if (!validateName(applicant.getName())) {
			throw new InvalidNameException("Invalid name");
		}

		if (!validateJobProfile(applicant.getJobProfile())) {
			throw new InvalidJobProfileException("Invalid job profile");
		}

		if (!validateAge(applicant.getAge())) {
			throw new InvalidAgeException("Invalid age");
		}

	}
}

class Applicant {

	private String name;
	private String jobProfile;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobProfile() {
		return jobProfile;
	}

	public void setJobProfile(String jobProfile) {
		this.jobProfile = jobProfile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class ExceptionExercise {

	public static void main(String[] args) {

		try {
			Applicant applicant = new Applicant();
			applicant.setName("");
			applicant.setJobProfile("Clerk");
			applicant.setAge(30);

			Validator validator = new Validator();

			validator.validate(applicant);
			System.out.println("Application submitted successfully!");
		} catch (InvalidNameException | InvalidJobProfileException | InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
