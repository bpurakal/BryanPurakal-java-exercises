package com.techelevator;

public class HomeworkAssignment {

		private int totalMarks; //The total number of correct marks received on the assignment.
		private int possibleMarks; //The number of possible marks on the assignment.
		private String submitterName; //	The submitter's name for the assignment.
		private String letterGrade;//(derived) The letter grade for the assignment. Derived attribute that is calculated using totalMarks and possibleMarks.
		private int percentage = 100* (possibleMarks/totalMarks);
		
		public HomeworkAssignment(int possibleMarks) {
			
		}
		
		public int getTotalMarks() {	
			return totalMarks;
		}
		
		public void setTotalMarks(int totalMarks) {
			this.totalMarks = totalMarks;
		}
		
		public int getPossibleMarks() {
			return possibleMarks;
		}

		public String getSubmitterName() {
			return submitterName;
		}

		public void setSubmitterName(String submitterName) {
			this.submitterName = submitterName;
		}

		public String getLetterGrade() {
			
		if (percentage >= 90) {
			return "A";
		} else if (percentage >= 80 && percentage <=89) {
			return "B";
		} else if (percentage >= 70 && percentage <=79)  {
			return "C";
		} else if (percentage >= 60 && percentage <=69)  {
			return "D";
		} else {
			return "F";
		}
		
			
		}		
}
