package randomShapes;

import javax.swing.*;

import java.util.Random;

public class ColoredRectangleEx extends JFrame {
    Random random = new Random();
    int a, b;

    ColoredRectangleEx() {
        initUI();
    }

    private void initUI() {
        add(new Surface1());
        setTitle("Random Colored Rectangle");
        do {
            a = random.nextInt(800 - 400) + 400;
            b = random.nextInt(720 - 200) + 200;
            System.out.println(a + " " + b);
        } while (a % 10 != 0 || b % 8 != 0);
        setSize(a , b );
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
}
