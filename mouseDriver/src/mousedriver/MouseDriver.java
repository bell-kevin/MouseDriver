package mousedriver;

import java.util.Scanner;

public class MouseDriver {

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        double growthRate;
        Mouse gus = new Mouse();
        Mouse jaq = new Mouse();
        System.out.print("Enter % growth rate: ");
        growthRate = computerKeyboardInput.nextDouble();
        gus.setPercentGrowthRate(growthRate);
        jaq.setPercentGrowthRate(growthRate);
        gus.grow();
        jaq.grow();
        gus.grow();
        gus.display();
        jaq.display();
    }
}
