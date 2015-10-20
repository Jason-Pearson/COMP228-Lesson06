import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ExampleFrame extends JFrame {

	private JPanel _contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExampleFrame frame = new ExampleFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ExampleFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this._contentPane = new JPanel();
		this._contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this._contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this._contentPane);
	}

}
