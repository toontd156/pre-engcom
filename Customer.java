
import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends StudentName implements CustomStudentData{
	private String StudentID;
	private String StudentEmail;
    private String StudentPass;
    private ArrayList<String>dataNames = new ArrayList<String>();
    private ArrayList<String>dataIDs = new ArrayList<String>();
    private ArrayList<String>dataEmail = new ArrayList<String>();
    private ArrayList<String>dataPass = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);
	Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);

	public void register() {
		System.out.println("\n--------Register--------");
		System.out.print("User your Name: ");
		StudentName = input.next();
        if(StudentName != null) {
            dataNames.add(StudentName);
        }
		System.out.print("User your ID: ");
		StudentID = input.next();
        if(StudentID != null){
            dataIDs.add(StudentID);
        }
		System.out.print("User your email: ");
		StudentEmail = input.next();
        if(StudentEmail != null){
            dataEmail.add(StudentEmail);
        }
        System.out.print("User your PassWord: ");
		StudentPass = input.next();
        if(StudentPass != null){
            dataPass.add(StudentPass);
        }
        System.out.print("\033\143");		
	}

	public void Login() {
		System.out.println("\n--------Login--------");
        System.out.print("Input Email: ");
        String InputEmail = input2.next();

        System.out.print("Input Password: ");
        String InputPassword = input2.next();

        if(dataEmail.contains(InputEmail)){
            if(dataPass.contains(InputPassword)){
                if(true){
                    System.out.println("Welcome  " + StudentName);
                    MainGood();
                }
            }
            else{
                ChangeLogin();
                System.out.print("\033\143");
            }
        }
        else{
            ChangeLogin();
            System.out.print("\033\143");

            
        }
	}

    public void ChangeLogin() {
        System.out.println("error Email or Password Wrong");
        System.out.print("U want again Login Input Y and u want Change Password Input C: ");
        char Uw = input.next().charAt(0);
        if(Uw == 'Y'){
            Login();
        }
        else if(Uw == 'C'){
            updateProfile();
        }
        else{
            System.out.println("U input not valid");
        }
    }
	public void updateProfile() {
        System.out.println("Chang Password ");
        System.out.print("Input new password: ");
        String newPassword = input.next();

        if(newPassword != null ){
            dataPass.remove(StudentPass);
            dataPass.add(newPassword);
            System.out.print("\033\143");
            Login();
        }
	}

    public void MainGood(){
    	
    	System.out.println("\nWelcome  " + StudentName);
		Menuall ma = new Menuall();
		while (true) {
			System.out.println("1. Book");
			System.out.println("2. List of book");
			System.out.println("3. History of book");
			System.out.println("4. Givebook");
			System.out.println("5. Exit");
			System.out.print("Choose ");
			int C = scanner.nextInt();
    
            if(C == 1){
                ma.test1();
                System.out.print("Choos ");
                int a = scanner.nextInt(); 
            
                if(a == 1) {
                    ma.test2();
                    ma.howbook();
                }
                if(a == 2){
                    ma.test3();
                    ma.howbook();
                }
                if(a == 3){
                    ma.test4();
                    ma.howbook();
                }
                if(a == 4){
                    continue;
                }
            }
            else if(C == 2){
                ma.CartBook();
                if(true){
                    ma.ConfriminCart();
                }
                System.out.print("ทำรายการอีกมั้ย Y/N: ");
                char cd = scanner.next().charAt(0);
                if(cd == 'Y'){
                    continue;
                }
                else if(cd == 'N'){
                    System.out.println("Thank You");
                    break;
                }
                else{
                    System.out.println("try again");
                }
                
            }
            if(C == 3){
                ma.hosity();
            }
            if(C == 4){
                ma.givebook();
            }
            if(C == 5){
                System.out.println("Good Bye");
                break;
            }
            
        }
    }

    @Override
    public void Customer() {
        // TODO Auto-generated method stub
        
    }

}