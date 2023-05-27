import java.util.*; 
public class task1
{
    static int b;
    static int a;
    public static void main(String[] args) {
        int chances=3;
        int score=0;
        int Round=1;
        System.out.println("Let's Begin the Game!");
        int i = 0;
        if (chances>0){
        while (i < 100 && chances>1) {
        int randnum = (int) (Math.random() * 100) + 1; 
        System.out.println("Round "+Round);
        System.out.println(chances+" chances left");
        System.out.println("Score : "+score);
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter the Number : ");  
        int a= sc.nextInt();
        if (a==randnum){
            System.out.println("Cogratulations,You Win!");
            Round=Round+1;
            i=i+1;
            score=score+1;
        }
        while (chances>1 && (a!=randnum || b!=randnum )){
        b=a;

        if (b>randnum){
            System.out.println("The Generated Number is Less than your Guessed Number");
            chances=chances-1;
            System.out.println((chances-1)+" chances left");
            Scanner sca= new Scanner(System.in); 
            System.out.print("Enter the Number : ");  
            int b= sca.nextInt();
            a=b;
        }
        else if (b<randnum){
            System.out.println("The Generated Number is Greater than your Guessed Number");
            chances=chances-1;
            System.out.println(chances+" chances left");
            Scanner sca= new Scanner(System.in); 
            System.out.print("Enter the Number : ");  
            int b= sca.nextInt();
            a=b;
        }
        if (chances==1){
            System.out.println("You Lost the game");
            System.out.println("The Generated Number is :"+randnum);
        }
        if (b==randnum){
            System.out.println("Cogratulations,You Win!");
            Round=Round+1;
            i=i+1;
            score=score+1;}

    }
    
        }
    }
}
}