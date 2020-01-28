import java.awt.EventQueue;

import javax.swing.JFrame;

public class Game extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Game() {
		add(new Board());
		setResizable(false);
		pack();

		setTitle("Snake");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {

		// Creates a new thread so our GUI can process itself
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = new Game();
			}
		});
	}
}