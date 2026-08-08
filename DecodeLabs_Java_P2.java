import java.util.Scanner;
public class DecodeLabs_Java_P2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter number of subjects");
        int num=sc.nextInt();
        int total=0;
        for(int i =1;i<=num;i++){
            int marks;
           do {
               System.out.println(" Enter marks of subject : " + i);
               marks= sc.nextInt();
               if(marks>100||marks<0){
                   System.out.println(" Invalid Enter Again");
               }
           }while (marks>100||marks<0);

            total+=marks;
        }
        double averag= (double)total/num;
        System.out.printf(" Average : %.2f%% ",averag);
        if(averag>=90){
            System.out.println(" Grade A");

        } else if (averag>=80) {
            System.out.println(" Grade B");

        } else if (averag>=70) {
            System.out.println(" Grade C");

        }else {
            System.out.println("Grade D");
        }


    }
}