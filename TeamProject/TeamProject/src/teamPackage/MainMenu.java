package teamPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class MainMenu extends JFrame {

	private JPanel contentPane;
	private JPanel cardLayoutPanel;
	private final String TOPIC_CHOICE_PANEL = "panel with buttons for each topic";
	private final String MAIN_MENU_PANEL = "main menu panel with buttons for choices";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblWelcomToJavathoughts = createWelcomeLabel();
		contentPane.add(lblWelcomToJavathoughts, BorderLayout.NORTH);
		
		cardLayoutPanel = createCardLayout();
		contentPane.add(cardLayoutPanel, BorderLayout.CENTER);
	}

	private JPanel createCardLayout() {
		JPanel cardLayoutPanel = createCardLayoutPanel();
		
		JPanel mainPanel = createMainMenuPanel();
		cardLayoutPanel.add(mainPanel, MAIN_MENU_PANEL);
		
		JPanel topicChoicePanel = createTopicChoicePanel();
		cardLayoutPanel.add(topicChoicePanel, TOPIC_CHOICE_PANEL);
		return cardLayoutPanel;
	}

	private JPanel createCardLayoutPanel() {
		JPanel cardLayoutPanel = new JPanel();
		
		cardLayoutPanel.setLayout(new CardLayout(0, 0));
		return cardLayoutPanel;
	}

	private JPanel createTopicChoicePanel() {
		JPanel topicChoicePanel = new JPanel();
		
		GridBagLayout gbl_topicChoicePanel = new GridBagLayout();
		gbl_topicChoicePanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_topicChoicePanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_topicChoicePanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_topicChoicePanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		topicChoicePanel.setLayout(gbl_topicChoicePanel);
		
		JButton firstTopic = new JButton("First Topic");
		GridBagConstraints gbc_firstTopic = new GridBagConstraints();
		gbc_firstTopic.insets = new Insets(0, 0, 5, 5);
		gbc_firstTopic.gridx = 0;
		gbc_firstTopic.gridy = 0;
		topicChoicePanel.add(firstTopic, gbc_firstTopic);
		
		JButton secondTopic = new JButton("Second Topic");
		GridBagConstraints gbc_secondTopic = new GridBagConstraints();
		gbc_secondTopic.insets = new Insets(0, 0, 5, 5);
		gbc_secondTopic.gridx = 1;
		gbc_secondTopic.gridy = 1;
		topicChoicePanel.add(secondTopic, gbc_secondTopic);
		
		JButton thirdTopic = new JButton("Third Topic");
		GridBagConstraints gbc_thirdTopic = new GridBagConstraints();
		gbc_thirdTopic.insets = new Insets(0, 0, 5, 5);
		gbc_thirdTopic.gridx = 2;
		gbc_thirdTopic.gridy = 2;
		topicChoicePanel.add(thirdTopic, gbc_thirdTopic);
		
		JButton fourthTopic = new JButton("Fourth Topic");
		GridBagConstraints gbc_fourthTopic = new GridBagConstraints();
		gbc_fourthTopic.insets = new Insets(0, 0, 5, 5);
		gbc_fourthTopic.gridx = 3;
		gbc_fourthTopic.gridy = 3;
		topicChoicePanel.add(fourthTopic, gbc_fourthTopic);
		
		JButton finalTopic = new JButton("Final Topic");
		GridBagConstraints gbc_finalTopic = new GridBagConstraints();
		gbc_finalTopic.gridx = 4;
		gbc_finalTopic.gridy = 4;
		topicChoicePanel.add(finalTopic, gbc_finalTopic);
		return topicChoicePanel;
	}

	private JPanel createMainMenuPanel() {
		JPanel mainPanel = new JPanel();
		
		mainPanel.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton startNewCrseBtn = new JButton("Start New Course");
		startNewCrseBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				((CardLayout) cardLayoutPanel.getLayout()).show(cardLayoutPanel, TOPIC_CHOICE_PANEL);
				
			}
		});
		mainPanel.add(startNewCrseBtn);
		
		JButton continueCrseBtn = new JButton("Continue Course");
		mainPanel.add(continueCrseBtn);
		
		JButton rvwPrgrsBtn = new JButton("Review Progress");
		mainPanel.add(rvwPrgrsBtn);
		return mainPanel;
	}

	private JLabel createWelcomeLabel() {
		JLabel lblWelcomToJavathoughts = new JLabel("Welcome to JavaThoughts!");
		lblWelcomToJavathoughts.setHorizontalAlignment(SwingConstants.CENTER);
		return lblWelcomToJavathoughts;
	}

}
