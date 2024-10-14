import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        System.out.println("what is 7+9");
        Scanner sc=new Scanner(System.in);
        int answer=0;
        while(true){
            answer=sc.nextInt();
            if(answer==16){
                System.out.println("you got it!");
                break;
            }
            System.out.println("Wrong ans!try again");

        }

    }
}
