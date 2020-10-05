import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Q3_bulb l = new Q3_bulb();
        l.set_uses(1);
        char input;
        Scanner sc = new Scanner(System.in);
        System.out.println("A new light bulb was installed. Type 'P' to flick the switch.");
        System.out.println("The light bulb is "+l.observe());
        while (sc.next().toLowerCase().toCharArray()[0] == 'p' && l.is_func()){
            if (l.is_work()){
                l.click();
                System.out.println("You flick the switch and the light is now "+l.observe());
            }
            else{
                if (l.get_runs() > l.get_uses() && Math.random()+l.get_runs()/l.get_uses() > l.get_uses() ) {
                    l.set_func(false);
                    System.out.println("You try to turn on the light bulb but to no avail. Type anything but 'P' to give up.");
                }
                else{
                    l.click();
                    System.out.println("You flick the switch and the light is now "+l.observe());
                }
            }
        }
    }
}
