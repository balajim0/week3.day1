package week3.day1;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students details = new Students();
		details.studnetInfo(4009);
		details.studentInfo("Balaji", 4009);
		details.studentInfo("balajim0707@gmail.com", 9787306414L);
	}

	public void studnetInfo(int studentID) {
		System.out.println(studentID);
	}

	public void studentInfo(String Name, int studentID) {
		System.out.println(Name + " " + studentID);
	}

	public void studentInfo(String email, long phoneNumber) {
		System.out.println(email + " " + phoneNumber);
	}

}
