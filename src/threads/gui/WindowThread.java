package threads.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowThread {

	private JFrame frmDemograficthread;
	private BallThread ballThread;
	private BallThread ballThread2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowThread window = new WindowThread();
					window.frmDemograficthread.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowThread() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDemograficthread = new JFrame();
		frmDemograficthread.setTitle("DemoGraficThread");
		frmDemograficthread.setBounds(100, 100, 450, 300);
		frmDemograficthread.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDemograficthread.getContentPane().setLayout(null);
		
		JButton btnStart = new JButton("Pause!");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (btnStart.getText().equals("Pause!")) {
					btnStart.setText("Start!");
					ballThread.setStartStop(true);
				}else {
					btnStart.setText("Pause!");
					ballThread.setStartStop(false);
				}
			}
		});
		btnStart.setBounds(227, 207, 89, 23);
		frmDemograficthread.getContentPane().add(btnStart);
		
		PanelThreads panelThreads = new PanelThreads();
		PanelThreads2 panelThreads2 = new PanelThreads2();
		panelThreads.setBackground(Color.ORANGE);
		panelThreads.setBounds(34, 26, 366, 146);
		frmDemograficthread.getContentPane().add(panelThreads);
		ballThread = new BallThread(panelThreads);
		ballThread.start();
		ballThread2 = new BallThread(panelThreads);
		ballThread2.start();
	}
}
