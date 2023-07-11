package randomShapes;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ColoredRectangleEx exx = new ColoredRectangleEx();
                exx.setVisible(true);
            }
        });
    }
}
