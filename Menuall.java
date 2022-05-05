
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Menuall extends BookInheritance{
    private String[] Ma= {"1. Math Vary Fast ", "2. Math New Bie "};
    private String[] Ca= {"3. Car Vary Fast ", "4. Car New Bie "};
    private String[] An= {"5. Animal Vary Fast ", "6. Animal New Bie "};
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> AB = new ArrayList<String>();
    private ArrayList<String> BC = new ArrayList<String>();
    private int hb = 0;
    private int i = 0;
    private int day = 0;
    private int k = 0;
    private int[] hab = new int[6];

	combackbook cm = new combackbook();
	combackbook Math=new combackbook();
	combackbook Car=new combackbook();
	combackbook Anima=new combackbook();

	public void test1(){
		String[] name = {"1. Math", "2. Car", "3. Animal", "4. Exit"};
		printArray(name);

	}
	
	public void test2(){
		Math.Catagory("1. Math Vary Fast ", "2. Math New Bie");

	}
	
	public void test3(){
		Car.Catagory("3. Car Vary Fast ", "4. Car New Bie ");

	}
	
	public void test4(){
		Anima.Catagory("5. Animal Vary Fast ", "6. Animal New Bie ");

	}
    public void howbook(){
        System.out.print("How many book ");
        hb = scanner.nextInt();
        
        int[] array = new int[hb];
        for (k = 0; k < array.length;k++){
            System.out.print("Chosic ");
            hab[k] = scanner.nextInt();
            if(hab[k] == 1){
                AB.add(Ma[0]);
                BC.add(Ma[0]);
                getBook1Name();
                getBook1ID();
                getBook1Price();
            }
            if(hab[k] == 2){
                AB.add(Ma[1]);
                BC.add(Ma[1]);
                getBook2Name();
                getBook2ID();
                getBook2Price();
            }
            if(hab[k] == 3){
                AB.add(Ca[0]);
                BC.add(Ca[0]);
                getBook3Name();
                getBook3ID();
                getBook3Price();
            }
            if(hab[k] == 4){
                AB.add(Ca[1]);
                BC.add(Ca[1]);
                getBook4Name();
                getBook4ID();
                getBook4Price();
            }
            if(hab[k] == 5){
                AB.add(An[0]);
                BC.add(An[0]);
                getBook5Name();
                getBook5ID();
                getBook5Price();
            }
            if(hab[k] == 6){
                AB.add(An[1]);
                BC.add(An[1]);
                getBook6Name();
                getBook6ID();
                getBook6Price();
            }
            
            
        }
        
    }

    public void CartBook(){
        System.out.println("List of Book");
        for ( int i = 0; i < AB.size(); i++ ){
            System.out.println(AB.get(i));
        }


    }

    public void ConfriminCart(){
        System.out.print("Confirm Orders Yes/Back to Menu /Del ");
        char cf = scanner.next().charAt(0);

        if(cf == 'Y' ){
            cm.warings();
            System.out.print("Input Day " );
            day = scanner.nextInt();
            if(true){
                day = day + 7;
                int day7 = 7;
                if(day >= 31){
                    day = 1;
                    day += day7;
                    System.out.println("book come back" + day);
                }
                else{
                    System.out.println("book come back " + day);

                }
            }
            System.out.println("ไม่คือนเสียเงินนะจ๊ะ");
            System.out.println("Finish");
            AB.clear();
            
        }
        if(cf == 'B'){
            
        }
        if(cf == 'D' ){
            System.out.println("Cancel Order");
            i = 0;
            AB.clear();
            BC.clear();
        }
    }

    public void hosity(){
        System.out.println("Hosity of Book");
        for ( int i = 0; i < BC.size(); i++ ){
            System.out.println(BC.get(i) + " คืนวันที่ "+ day);
        }

    }

    public void givebook(){
        for ( int i = 0; i < BC.size(); i++ ){
            System.out.println(BC.get(i) + day);
        }
        
        System.out.print("Choos for give book : ");
        int a = scanner.nextInt();
        if(a == 1){
            BC.remove(Ma[0]);
        }
        if(a == 2){
            BC.remove(Ma[1]);
        }
        if(a == 3){
            BC.remove(Ca[0]);
        }
        if(a == 4){
            BC.remove(Ca[1]);
        }
        if(a == 5){
            BC.remove(An[0]);
        }
        if(a == 6){
            BC.remove(An[1]);
        }
        if(a >= 1){
            System.out.print("คือวันที่เท่าไหร่ ");
            int c = scanner.nextInt();
            int k = c - day;
            int l = k * 100;
            if( c >= day){
                System.out.println("เสียเล่มละ " + l);
                System.out.print("ต้องการจ่ายมั้ย Y/D ");
                char p = scanner.next().charAt(0);
                if(p == 'Y'){
                    
                    System.out.print("จ่ายเท่าไหร่");
                    int q = scanner.nextInt();
                    if(q >= l){
                        System.out.println("จ่ายเรียบร้อบ");
                        System.out.println("ทอนเงิน " + (q-l));
                    }else{
                        System.out.println("จ่ายน้อยไป");
                    }
                }
                else{
                    System.out.println("ยังไม่จ่าย");
                }
            }
            if( c <= day){
                System.out.println("Thank You");
            }
        }
        if(a <= 0){
            System.out.println("ไม่มีข้อมูล");
        }
    }
    public void printArray(String[] name){
        for(int i = 0; i < name.length; i++){
            System.out.print(name[i]+ " ");
            System.out.println();
        }
    } 
}
