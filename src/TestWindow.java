import java.awt.EventQueue;








import java.awt.Image;

import javax.swing.JFrame;

import java.awt.CardLayout;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.Timer;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Enumeration;

import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;




public class TestWindow {
	 private Timer timer;
     private long startTime = -1;
     private long duration = 3000000;
	static ResultSet rs;
	static JButton btnNewButton;
	static ButtonGroup group ;
	JLabel lblDd;
	Connection connection = null;
	String answer = "";
	int sn = 1;
	int count = 0;
	static {
	
		try {
			
			 PreparedStatement ps; 
				Connection connectQ = null;
				
				  connectQ = ConnectToQuestion.ConnectToQues();
				  String query = "SELECT * FROM SelectQ where Attendee = ?";
				ps = connectQ.prepareStatement(query);
				ps.setString(1, Welcome.name);
				rs = ps.executeQuery();
			
			
		} catch (SQLException ex) {
			
			JOptionPane.showMessageDialog(null, ex);
		}
	
	}

	 static JFrame frame;
	static TestWindow window = new TestWindow();
	/**
	 * Launch the application.
	 */
	

	
	public static void Test(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					window.frame.setVisible(true);
					
					
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	JLabel Question;
	 JRadioButton optiona;
	 JRadioButton optionb;
	 JRadioButton optionc;
	 JRadioButton optiond;
	 private JLabel lblNewLabel;
	 private JLabel lblWeWillGet;
	 private JLabel lblFdvb;
	 
	public void initialize() {
		
		
		
		 
			
			
		       
		       
		        
		 
		frame = new JFrame();
		frame.setBounds(100, 100, 843, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_797306775897636");
		panel.setLayout(null);
		
		JLabel lblTestInstructions = new JLabel("Test Instructions");
		lblTestInstructions.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTestInstructions.setBounds(288, 13, 214, 16);
		panel.add(lblTestInstructions);
		
		
		
		
		JTextArea txtrYthy = new JTextArea();
		txtrYthy.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrYthy.setText("1.This is a Multiple Choice Examination\n\n"+ 
		 "2.Exam comprises of questions from Different Category.\n\n"+ 
		"3.Every Correct answer has 5 marks and for every incorrect answer \n\n"+ "there is negative marking of -5 \n\n"+ 
		 "4.Exam has Timer & Candidate must complete exam within the time frame\n\n"+ 
		 "5.Next button will take you to next question and Reset button clears\n\n"+ 
		"the selection\n\n"+ 
		"6.Mobile phones or any reference materials,in whatever format,aren't allowed\n"+ 
		"in examination premises\n\n");
		txtrYthy.setBounds(25, 53, 765, 364);
		panel.add(txtrYthy);
		
		final JButton btnStartTest = new JButton("Start Test");
		btnStartTest.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnStartTest.setBounds(323, 430, 133, 43);
		panel.add(btnStartTest);
		
		final JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 0, 0));
		frame.getContentPane().add(panel_1, "name_797309136604820");
		panel_1.setLayout(null);
		
		final JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, "name_731197191780280");
		panel_2.setLayout(null);
		
		lblNewLabel = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/thanks.gif")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img3));
		lblNewLabel.setBounds(228, 41, 287, 208);
		panel_2.add(lblNewLabel);
		
		lblWeWillGet = new JLabel("We will get back to you!!!");
		lblWeWillGet.setForeground(new Color(220, 20, 60));
		lblWeWillGet.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblWeWillGet.setBounds(180, 293, 550, 54);
		panel_2.add(lblWeWillGet);
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, "name_797313322378876");
		
		
		lblDd = new JLabel("sn");
		lblDd.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDd.setBounds(64, 93, 33, 36);
		panel_1.add(lblDd);
		
		 Question = new JLabel("question");
		 Question.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Question.setBounds(106, 83, 562, 59);
		panel_1.add(Question);
		
		optiona = new JRadioButton("dwew");
		optiona.setFont(new Font("Tahoma", Font.PLAIN, 17));
		optiona.setBounds(106, 187, 285, 44);
		panel_1.add(optiona);
		
		 optionc = new JRadioButton("New radio button");
		 optionc.setFont(new Font("Tahoma", Font.PLAIN, 17));
		optionc.setBounds(106, 243, 285, 44);
		panel_1.add(optionc);
		
		 optionb = new JRadioButton("New radio button");
		 optionb.setFont(new Font("Tahoma", Font.PLAIN, 17));
		optionb.setBounds(395, 187, 293, 44);
		panel_1.add(optionb);
		
		 optiond = new JRadioButton("New radio button");
		 optiond.setFont(new Font("Tahoma", Font.PLAIN, 17));
		optiond.setBounds(395, 243, 273, 44);
		panel_1.add(optiond);
		
	group = new ButtonGroup();
		group.add(optiona);
		group.add(optionb);
		group.add(optionc);
		group.add(optiond);
		
		
		
		 btnNewButton = new JButton("Next");
		 btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
				if("Submit".equals(btnNewButton.getText()))
				{
					connection = Connectionclass.Connect();
					String query1 = "INSERT INTO Result (Username,Marks) VALUES (?,?)";
					
				PreparedStatement ps1 = connection.prepareStatement(query1);
				ps1.setString(1, Welcome.name);
				ps1.setInt(2, count);
				ps1.execute();
				
					
					panel_1.setVisible(false);
					panel_2.setVisible(true);
				}
					
					
				else {	for (Enumeration<AbstractButton> buttons = group.getElements(); 
							buttons.hasMoreElements();
							) 
					{
						
			            AbstractButton button = buttons.nextElement();

			            if (button.isSelected()) {
			            	answer  =  button.getText();
			            }
			        }

			       
					if(answer.equals(rs.getString("Answer")))
						count= count + 5;
					else count = count-5;
					
				
					
				//	JOptionPane.showMessageDialog(null, count);
					
		//	if(rs.next())
				//{
					group.clearSelection();
				setdata();
				//}
			
				
				
				
				}
			
			
			
				
				} catch (SQLException ex) {
					
					JOptionPane.showMessageDialog(null, ex);
				}
				
				
			}
			
			
			
		});
		btnNewButton.setBounds(149, 354, 136, 51);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					group.clearSelection();
				} 
				catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(419, 354, 129, 51);
		panel_1.add(btnNewButton_1);
		
		lblFdvb = new JLabel("",JLabel.CENTER);
		lblFdvb.setForeground(new Color(255, 0, 0));
		lblFdvb.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFdvb.setBounds(505, 29, 216, 36);
		panel_1.add(lblFdvb);
		
	
		
		
		btnStartTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					panel.setVisible(false);
					panel_1.setVisible(true);
					setdata();
					
					timer = new Timer(100, new ActionListener() {
		                @Override
		                public void actionPerformed(ActionEvent e) {
		                    if (startTime < 0) {
		                        startTime = System.currentTimeMillis();
		                    }
		                    long now = System.currentTimeMillis();
		                    long clockTime = now - startTime;
		                    if (clockTime >= duration) {
		                        clockTime = duration;
		                        timer.stop();
		                    }
		                    SimpleDateFormat df = new SimpleDateFormat("mm:ss");
		                    lblFdvb.setText(df.format(duration-clockTime));
		                }
		            });
		            timer.setInitialDelay(0);
		            timer.start();
					
				//	 countdownTimer = new Timer(1000, new CountdownTimerListener());
				       
				       // countdownTimer.start();
				}	
				
				catch(Exception ex)
				{
					
					
					 JOptionPane.showMessageDialog(null, ex);
					 
				}
			}
		});
		
		
		
	}

	private void setdata() {
		
		try
		{
			
			if(rs.next())
			{  lblDd.setText(Integer.toString(sn));
				Question.setText(rs.getString("Question"));
			optiona.setText(rs.getString("OptionA"));
			optionb.setText(rs.getString("OptionB"));
			optionc.setText(rs.getString("OptionC"));
			optiond.setText(rs.getString("OptionD"));
			sn = sn+1;}
			else { btnNewButton.setText("Submit");
			optiona.setEnabled(false);
			optionb.setEnabled(false);
			optionc.setEnabled(false);
			optiond.setEnabled(false);}
			
		}	
		
		catch(Exception ex)
		{
			
			
			 JOptionPane.showMessageDialog(null, ex);
			 
		}
		
		
	}
	
	
	
}
