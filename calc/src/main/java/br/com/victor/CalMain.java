package br.com.victor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class CalMain extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txtres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalMain frame = new CalMain();
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
	public CalMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblFirstValue = new JLabel("first value:");
		GridBagConstraints gbc_lblFirstValue = new GridBagConstraints();
		gbc_lblFirstValue.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstValue.gridx = 1;
		gbc_lblFirstValue.gridy = 1;
		contentPane.add(lblFirstValue, gbc_lblFirstValue);
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_txt1 = new GridBagConstraints();
		gbc_txt1.insets = new Insets(0, 0, 5, 0);
		gbc_txt1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt1.gridx = 3;
		gbc_txt1.gridy = 1;
		contentPane.add(txt1, gbc_txt1);
		txt1.setColumns(10);
		
		JLabel lblSecondValue = new JLabel("second value:");
		GridBagConstraints gbc_lblSecondValue = new GridBagConstraints();
		gbc_lblSecondValue.insets = new Insets(0, 0, 5, 5);
		gbc_lblSecondValue.gridx = 1;
		gbc_lblSecondValue.gridy = 3;
		contentPane.add(lblSecondValue, gbc_lblSecondValue);
		
		txt2 = new JTextField();
		txt2.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_txt2 = new GridBagConstraints();
		gbc_txt2.insets = new Insets(0, 0, 5, 0);
		gbc_txt2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt2.gridx = 3;
		gbc_txt2.gridy = 3;
		contentPane.add(txt2, gbc_txt2);
		txt2.setColumns(10);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a,b,res;
				MathMethods math=new MathMethods();
				a=Integer.parseInt(txt1.getText());
				b=Integer.parseInt(txt2.getText());
				res=math.soma(a, b);
				txtres.setText(Integer.toString(res));
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 1;
		gbc_button.gridy = 5;
		contentPane.add(button, gbc_button);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a,b,res;
				MathMethods math=new MathMethods();
				a=Integer.parseInt(txt1.getText());
				b=Integer.parseInt(txt2.getText());
				res=math.sub(a, b);
				txtres.setText(Integer.toString(res));
			}
		});
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 6;
		contentPane.add(button_1, gbc_button_1);
		
		JLabel lblResult = new JLabel("result:");
		GridBagConstraints gbc_lblResult = new GridBagConstraints();
		gbc_lblResult.insets = new Insets(0, 0, 5, 5);
		gbc_lblResult.anchor = GridBagConstraints.EAST;
		gbc_lblResult.gridx = 2;
		gbc_lblResult.gridy = 6;
		contentPane.add(lblResult, gbc_lblResult);
		
		txtres = new JTextField();
		txtres.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtres.setEnabled(false);
		GridBagConstraints gbc_txtres = new GridBagConstraints();
		gbc_txtres.insets = new Insets(0, 0, 5, 0);
		gbc_txtres.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtres.gridx = 3;
		gbc_txtres.gridy = 6;
		contentPane.add(txtres, gbc_txtres);
		txtres.setColumns(10);
		
		JButton button_2 = new JButton("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a,b,res;
				MathMethods math=new MathMethods();
				a=Integer.parseInt(txt1.getText());
				b=Integer.parseInt(txt2.getText());
				res=math.mult(a, b);
				txtres.setText(Integer.toString(res));
			}
		});
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 1;
		gbc_button_2.gridy = 7;
		contentPane.add(button_2, gbc_button_2);
		
		JButton button_3 = new JButton("/");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a,b,res;
				MathMethods math=new MathMethods();
				a=Integer.parseInt(txt1.getText());
				b=Integer.parseInt(txt2.getText());
				res=math.div(a, b);
				txtres.setText(Integer.toString(res));
			}
		});
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 0, 5);
		gbc_button_3.gridx = 1;
		gbc_button_3.gridy = 8;
		contentPane.add(button_3, gbc_button_3);
	}

}
