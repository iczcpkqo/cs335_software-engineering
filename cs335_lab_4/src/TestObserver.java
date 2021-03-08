// Name: Xiang Mao
// Student Number: 20251952

import java.util.ArrayList;

public class TestObserver {

	public static void main(String[] args) {
		Subject subject = new CommentaryObject(new ArrayList<Observer>(), "Soccer Match [2014AUG24]");
		Observer observer = new SMSUsers(subject, "Adam Warner [New York]");
		observer.subscribe();
		
		System.out.println();
		
		Observer observer2 = new SMSUsers(subject, "Tim Ronney [London]");
		observer2.subscribe();
		
		Commentary cObject = ((Commentary)subject);
		cObject.setDesc("Welcome to live Soccer match");
		cObject.setDesc("Current score 0-0");
		
		// My code
		Commercial adObject = ((Commercial)subject);
		adObject.setCommertical("Aldi provides grocery products ranging from whole grain bread to ready meals.");
		
		System.out.println();
		
		observer2.unSubscribe();
		
		System.out.println();
		
		cObject.setDesc("It's a goal!!");
		cObject.setDesc("Current score 1-0");

		// My code
		adObject.setCommertical("TESCO! Get All The Food You Love Delivered Right To Your Door. ");
		
		System.out.println();
		
		Observer observer3 = new SMSUsers(subject, "Marrie [Paris]");
		observer3.subscribe();
		
		System.out.println();
		
		cObject.setDesc("It's another goal!!");
		cObject.setDesc("Half-time score 2-0");
		
		
		// My code
		adObject.setCommertical("DUNNUS! To give you the best possible experienc.");
		
	}

}
