import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Game {
	JFrame window;
	JPanel titleScreenPanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
	JLabel titleScreenLabel;
	Font fnt = new Font("times new roman", Font.PLAIN, 60);
	Font fnt2 = new Font("arial", Font.PLAIN, 20);
	Font fnt3 = new Font ("arial", Font.PLAIN, 15);
	JButton startButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea;
	String position;
	int questionsRight = 0;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Game();
		
	}
	
	public Game() {
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		
		titleScreenPanel = new JPanel();
		titleScreenPanel.setBounds(100, 100, 600, 150);
		titleScreenPanel.setBackground(Color.black);

		titleScreenLabel = new JLabel("Public Health Project");
		titleScreenLabel.setForeground(Color.white);
		titleScreenLabel.setFont(fnt);
		
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);
		
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(fnt2);
		startButton.addActionListener(tsHandler);
		startButton.setFocusPainted(false);
		

		
		titleScreenPanel.add(titleScreenLabel);
		startButtonPanel.add(startButton);
		window.add(startButtonPanel);
		window.add(titleScreenPanel);
		
		window.setVisible(true);
	}
	
	public void createGameScreen() {
		
		titleScreenPanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 50, 600, 300);
		mainTextPanel.setBackground(Color.black);
		window.add(mainTextPanel);
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(100, 50, 600, 300);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(fnt2);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250,350,300,150);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		window.add(choiceButtonPanel);
		
		//choice 1
		choice1 = new JButton("A.");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(fnt2);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("c1");
		choice1.setFocusPainted(false);
		choiceButtonPanel.add(choice1);
		
		//choice 2
		choice2 = new JButton("B.");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(fnt2);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("c2");
		choice2.setFocusPainted(false);
		choiceButtonPanel.add(choice2);
		
		//choice 3
		choice3 = new JButton("C.");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(fnt2);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("c3");
		choice3.setFocusPainted(false);
		choiceButtonPanel.add(choice3);
		
		//choice 4
		choice4 = new JButton("D.");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(fnt2);
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("c4");
		choice4.setFocusPainted(false);
		choiceButtonPanel.add(choice4);
		
		intro();
	}
	
	public void intro() {
		position = "intro";
		mainTextArea.setText("While not necessarily an issue of importance due to the number of \nresidents affected yearly, the reality is once exposed, radiation leads to long term effects. Power plants also have a history of targeting \nlocations in which residents can’t fight back. In 1986, a reactor at the\nChernobyl nuclear power plant in Ukraine exploded, releasing huge amounts of radioactive materials into the air and leading to the worst nuclear accident in history. Throughout this game you’ll explore this environmental hazard and hopefully become knowledgeable on its \neffect on the human body, vulnerable communities as a whole, and \norganizations working hard to keep nuclear plants open/shut down. ");
		
		choice1.setText("Next");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void popup1() {
		position = "popup 1";
		mainTextArea.setText("Thank you for playing our game! Throughout this game you’ll \nexplore nuclear power plants and nuclear radiation.");
		choice1.setText("Next");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void popup2 () {
		position = "popup 2";
		mainTextArea.setText("Hello New Power Plant Employee! Welcome to Exelon! Now that \nyou’ve been hired you have one last training day to go through! \nDespite any complaints you may hear from the residents of Chicago our installation is causing no harm whatsoever. Allow me to show \nyou our facility and take you to the location of your final training.");
		
		choice1.setText("Next");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void gameStart() {
		position = "game start";
		mainTextArea.setText("Hello New Power Plant Employee and welcome to your final assessment! While this isn’t timed we encourage you to try your best. You wouldn’t want to fail at this stage would you? Anyway, good luck!\n"
		+ "\nQuiz: Test Your Nuclear Knowledge!");

		choice1.setText("Start quiz");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	// All questions
	public void quizQuestion1() {
		position = "question 1";
		mainTextArea.setText("Since 2007, there have been at least __ reported leaks, spills or \nother accidental releases in Illinois of water contaminated with \nradioactive tritium (a byproduct of nuclear power production): ");
		
		choice1.setText("18");
		choice2.setText("20");
		choice3.setText("35");
		choice4.setText("23");
	
	}
	
	public void quizQuestion2() {
		position = "question 2";
		mainTextArea.setText("NRC, which oversees all U.S. nuclear plants, doesn’t punish \ncompanies for polluting their own properties with radioactive waste \nunless it deems the accident a threat to human health or the \nenvironment:");
		
		choice1.setText("True");
		choice2.setText("False");
		choice3.setText("Probably");
		choice4.setText("idk lol");
	
	}
	
	public void quizQuestion3() {
		position = "question 3";
		mainTextArea.setText("The most significant nuclear power plant accident the USA ever had was: ");
		
		choice1.setText("Fukushima Daiichi");
		choice2.setText("Chernobyl");
		choice3.setText("Three Mile Island");
		choice4.setText("Enrico Fermi");
	
	}
	
	public void quizQuestion4() {
		position = "question 4";
		mainTextArea.setText(" Which of the following is NOT a precaution taken to ensure nuclear power plant safety?"
				+ "\na. Ensure the plant is far enough from a residential town"
				+ "\nb. Shut down operating reactors"
				+ "\nc. Cool down reactors so as to remove heat from nuclear fuel"
				+ "\nd. Contain radioactive materials");
		
		choice1.setText("a. ");
		choice2.setText("b. ");
		choice3.setText("c. ");
		choice4.setText("d. ");
	
	}
	
	public void quizResults() {
		if(questionsRight>=3) {
			position = "GOOD quiz results";
			mainTextArea.setText("You got a "+questionsRight+"/4.\nCongratulations you’ve successfully completed your training! \nHaving you around will surely ensure the prosperity of this plant.\nDid you learn a lot? It doesn’t matter anyway, the risks are rare, it’s not like \nanything of that nature would ever happen here.");
			
			choice1.setText("Final message");
			choice2.setText("Fun facts!!");
			choice3.setText("");
			choice4.setText("");
		}
		else if(questionsRight<3) {
			position = "BAD quiz results";
			mainTextArea.setText("You got a "+questionsRight+"/4.\nUnfortunately, you did not pass the final assessment. We cannot \nallow you to begin work with the knowledge you have now. Would \nyou like to go see what needs to be done?");
			
			choice1.setText("Final Message");
			choice2.setText("Try Again");
			choice3.setText("");
			choice4.setText("");
		}
	}
	
	// fun facts
	public void funFact1() {
		position = "fun fact 1";
		mainTextArea.setText("The effects of nuclear radiation are preventable but it is said \nThe United States Government Accountability Office reported more \nthan 150 incidents from 2001 to 2006 of nuclear plants not \nperforming within acceptable safety guidelines. Being informed of \neffects is essential to encouraging safety.");
		choice1.setText("Next");
		choice2.setText("Back");
		choice3.setText("Final Message");
		choice4.setText("");
	}
	
	public void funFact2() {
		position = "fun fact 2";
		mainTextArea.setText("High exposure to raidation in a short period of time, can cause \nnausea, vomiting, and death. And although it’s not as serious, \nconstant exposure to low-level radiation can increase the risk of \ncancer and cardiovasular disease.\n "
				+ "\nWhat’s YOUR radiation level? (https://www.epa.gov/radiation/calculate-your-radiation-dose) ");
		choice1.setText("Next");
		choice2.setText("Back");
		choice3.setText("Final Message");
		choice4.setText("");
	}
	
	public void funFact3() {
		position = "fun fact 3";
		mainTextArea.setText("Aging nuclear plants are a concern! They’re more likely to leak \ninto Illinois water supply. In fact Exelon’s Illinois plant is infamous for just HOW MANY leaks of highly radioactive waste they've had. \nNuclear power plants also allow for the regular release of \nradionuclides into the environment (yikes!)\r\n"
				+ "\nWhat would happen if a nuclear bomb was dropped on Chicago? \n(https://outrider.org/nuclear-weapons/interactive/bomb-blast/?airburst=false&bomb=2&lat=41.8756&location=Chicago%2C%20Illinois%2C%20United%20States&long=-87.6244) ");
		choice1.setText("");
		choice2.setText("Back");
		choice3.setText("Final Message");
		choice4.setText("");
	}
	
	public void finalMessage() {
		position = "final message";
		mainTextArea.setText("Regardless of your outcome on the final assessment, I hope you are a better worker starting today. We hope your first day was eventful! Feel free to join us again tomorrow (or not) based on your new \nknowledge and experiences today. \r\n"
				+ "");
		
		choice1.setText("Restart");
		choice2.setText("Exit");
		choice3.setText("Solutions");
		choice4.setText("");
	}
	
	public void solutions() {
		position = "solution";
		
		mainTextArea.setFont(fnt3);
		mainTextArea.setText("There are safer and better alternatives to nuclear power (hydro-power, wind, and solar). We should push for more energy conservation programs and less power plants."
				+"\nSome Anti-Nuclear groups are...\nNeis (https://neis.org/): “Nuclear Energy Information Service is a non-profit organization \ncommitted to ending nuclear power and advocating for sustainable ecologically \nsound and socially just energy solutions.”"
				+"\nAbalone Alliance, Clamshell Alliance, Greenpeace USA, Institute for Energy and Environmental Research, Musicians United for Safe Energy, Nevada Desert Experience, Nuclear Control Institute, Nuclear Information and Resource Service, Public Citizen Energy Program, Shad Alliance, and the Sierra Club.");
		
		choice1.setText("Restart");
		choice2.setText("Exit");
		choice3.setText("");
		choice4.setText("");
	}
	
	public class TitleScreenHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			createGameScreen();
		}
	}
	
	public class ChoiceHandler implements ActionListener{
		public void actionPerformed (ActionEvent event) {
			String playerChoice = event.getActionCommand();
			
			switch(position) {
			//pregame
			case "intro":
				switch(playerChoice) {
				case "c1": popup1(); break;
				}
				break;
			case "popup 1":
				switch(playerChoice) {
				case "c1": popup2(); break;
				}
				break;
			case "popup 2":
				switch(playerChoice) {
				case "c1": gameStart(); break;
				}
				break;
				
				//game
			case "game start":
				switch(playerChoice) {
				case "c1": quizQuestion1(); break;
				}
				break;
			case "question 1":
				switch(playerChoice) {
				case "c1": quizQuestion2(); break;
				case "c2": quizQuestion2(); break;
				case "c3": questionsRight++; quizQuestion2(); break;
				case "c4": quizQuestion2(); break;
				}
				break;
			case "question 2":
				switch(playerChoice) {
				case "c1": questionsRight++; quizQuestion3(); break;
				case "c2": quizQuestion3(); break;
				case "c3": quizQuestion3(); break;
				case "c4": quizQuestion3(); break;
				}
				break;
			case "question 3":
				switch(playerChoice) {
				case "c1": quizQuestion4(); break;
				case "c2": quizQuestion4(); break;
				case "c3": questionsRight++; quizQuestion4(); break;
				case "c4": quizQuestion4(); break;
				}
				break;
			case "question 4":
				switch(playerChoice) {
				case "c1": questionsRight++; quizResults(); break;
				case "c2": quizResults(); break;
				case "c3": quizResults(); break;
				case "c4": quizResults(); break;
				}
				break;
				
				//postgame
			case "GOOD quiz results":
				switch(playerChoice) {
				case "c1": finalMessage(); break;
				case "c2": funFact1(); break;
				}
				break;
				
			case "fun fact 1":
				switch(playerChoice) {
				case "c1": funFact2(); break;
				case "c2": quizResults(); break;
				case "c3": finalMessage(); break;
				}
				break;
				
			case "fun fact 2":
				switch(playerChoice) {
				case "c1": funFact3(); break;
				case "c2": funFact1(); break;
				case "c3": finalMessage(); break;
				}
				break;
				
			case "fun fact 3":
				switch(playerChoice) {
				case "c2": funFact2(); break;
				case "c3": finalMessage(); break;
				}
				break;
				
			case "BAD quiz results":
				switch(playerChoice) {
				case "c1": finalMessage(); break;
				case "c2": questionsRight=0; quizQuestion1();break;
				}
				break;
				
			case "final message":
				switch(playerChoice) {
				case "c1": questionsRight=0; mainTextArea.setFont(fnt2); break;
				case "c2": System.exit(1); break;
				case "c3": solutions(); break;
				}
				break;
				
			case "solution":
				switch(playerChoice) {
				case "c1": questionsRight=0; mainTextArea.setFont(fnt2); intro(); break;
				case "c2": System.exit(1); break;
				}
				break;
			}
		}
	}
}
