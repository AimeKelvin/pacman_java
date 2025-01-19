import javax.swing.JFrame;
public class App{
    public static void main(String[] args) throws Exception {
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;
        JFrame frame = new JFrame("Pacman Java by Kelvin");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PacMan pacManGame = new PacMan();
        frame.add(pacManGame);
        frame.pack();
        frame.setVisible(true);

    }
}