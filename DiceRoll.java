import java.util.Scanner;
    class DiceRoll {

    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = 0;
        int value = 0;
        int total = 0;
        int sides = 0;
        String ans  = "yes";
        while (ans.equals("yes")) {
        System.out.println("How many dice do you want to roll?");
            num = sc.nextInt();
        System.out.println("How many sides do these dice have?");
            sides = sc.nextInt();
        System.out.println("You rolled: ");
        
        for (int i = 0; i < num; i++) {
            value = rollDie(sides);
            total = total + value;
            System.out.print(value);
        }
        System.out.println("");
        System.out.println("Total:"+ total);
        System.out.println("");
        System.out.print("Again? [yes,no] ");
        ans = sc.next();
        }
        if(ans!= "yes"){
            System.out.println("Goooood-byeeee!");
        }
    }
     public static int rollDie(int r) {
        return (int) (Math.random()*r)+1;
    }
}