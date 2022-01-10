/**
 * @(#)Game.java
 *
 * Game application
 *
 * @author manoel vitor
 * @version 1.00 2022/1/9
 */
 
 import javax.swing.*;
 import java.awt.event.*;
 import java.awt.Font;
 import java.awt.Color;
 

public class Game extends JFrame{
   
   public Game()
   {
   		
   		setVisible(true);
   		setTitle("JOGO DA VELHA");
   		setDefaultCloseOperation(3);
   		setLayout(null);
   		setBounds(250, 100, 500, 500);
   		setSize(500, 500);
   		add(pontuacao);
   		add(playerA);
   		add(playerB);
   		add(position);
   		pontuacao.setBounds((10),300, 250, 30);
   		playerA.setBounds((10),320, 250, 30);
   		playerA.setFont(new Font("Arial", Font.BOLD, 14));
   		playerB.setBounds((10),340, 250, 30);
   		playerB.setFont(new Font("Arial", Font.BOLD, 14));
   		position.setBounds((10), 360, 250, 30);
   		position.setFont(new Font("Arial", Font.BOLD, 14));
   		
   		
   		int cont  = 0;
   		
   		for(int i  = 0; i < 3; i++){
   			for(int j = 0; j < 3; j++){
   				btn[cont] = new JButton();
   				add(btn[cont]);
   				btn[cont].setBorderPainted(true);
   				btn[cont].setFont(new Font("Arial", Font.PLAIN, 45));
   				btn[cont].setBounds((100 * i)+10, (100 * j)+10, 95, 95);
   				cont++;
   			}
   		}
   		
   		for(int i = 0; i < 9; i++)
   		{
   			click[i] = false;
   		}
   		
   		btn[0].addActionListener(new java.awt.event.ActionListener(){
   			@Override
   			public void actionPerformed(ActionEvent event){
   				if(click[0]==false){
   					click[0]= true;
   					changeState(btn[0], 0);
   					setPosicaoButton(0);
   				}
   				
   			}
   		});
   		
   		
   		btn[1].addActionListener(new java.awt.event.ActionListener(){
   			@Override
   			public void actionPerformed(ActionEvent event){
   				if(click[1]==false){
   					click[1]= true;
   					changeState(btn[1], 1);
   					setPosicaoButton(1);
   					
   				}
   				
   			}
   		});
   		
   		btn[2].addActionListener(new java.awt.event.ActionListener(){
   			@Override
   			public void actionPerformed(ActionEvent event){
   				if(click[2]==false){
   					click[2]= true;
   					changeState(btn[2], 2);
   					setPosicaoButton(2);
   				}
   				
   			}
   		});
   		
   		btn[3].addActionListener(new java.awt.event.ActionListener(){
   			@Override
   			public void actionPerformed(ActionEvent event){
   				if(click[3]==false){
   					click[3]= true;
   					changeState(btn[3], 3);
   					setPosicaoButton(3);
   				}
   				
   			}
   		});
   		
   		btn[4].addActionListener(new java.awt.event.ActionListener(){
   			@Override
   			public void actionPerformed(ActionEvent event){
   				if(click[4]==false){
   					click[4]= true;
   					changeState(btn[4], 4);
   					setPosicaoButton(4);
   				}
   				
   			}
   		});
   		
   		btn[5].addActionListener(new java.awt.event.ActionListener(){
   			@Override
   			public void actionPerformed(ActionEvent event){
   				if(click[5]==false){
   					click[5]= true;
   					changeState(btn[5], 5);
   					setPosicaoButton(5);
   				}
   				
   			}
   		});
   		
   		btn[6].addActionListener(new java.awt.event.ActionListener(){
   			@Override
   			public void actionPerformed(ActionEvent event){
   				if(click[6]==false){
   					click[6]= true;
   					changeState(btn[6], 6);
   					setPosicaoButton(6);
   				}
   				
   			}
   		});
   		
   		btn[7].addActionListener(new java.awt.event.ActionListener(){
   			@Override
   			public void actionPerformed(ActionEvent event){
   				if(click[7]==false){
   					click[7]= true;
   					changeState(btn[7], 7);
   					setPosicaoButton(7);
   				}
   				
   			}
   		});
   		
   		btn[8].addActionListener(new java.awt.event.ActionListener(){
   			@Override
   			public void actionPerformed(ActionEvent event){
   				if(click[8]==false){
   					click[8]= true;
   					changeState(btn[8], 8);
   					setPosicaoButton(8);
   				}
   				
   			}
   		});
   		
   }
   
   private void changeState(JButton button, int vez){
   		if(xo){
   			button.setText("X");
   			button.setForeground(Color.RED);
   			xo = false;
   		}	
   		else{
   			button.setText("O");
   			button.setForeground(Color.BLUE);
   			xo = true;
   		}	
   		getWinner();
   }
   
   private void setPosicaoButton(int posicao)
   {
   		String texto = "Posição: "+posicao;
   		System.out.println(texto);
   		this.position.setText(texto);
   }
   
   private void clear(){
   		for(int i = 0; i < 9; i++){
   			btn[i].setText("");
   			click[i] = false;
   		}
   		this.position.setText("Posicao: ");
   }
   
   private void getWinner(){
   		
   		
		int cont = 0;
		for(int i = 0; i < 9; i++){
			if(click[i] == true )
			{
				cont++;
			}
		}
		
		
   		
   		if((getTxt(btn[0]) == "X" &&  getTxt(btn[1]) == "X" && getTxt(btn[2]) == "X")
   			|| (getTxt(btn[3]) == "X" &&  getTxt(btn[4]) == "X" && getTxt(btn[5]) == "X")
   			|| (getTxt(btn[6]) == "X" &&  getTxt(btn[7]) == "X" && getTxt(btn[8]) == "X")
   			|| (getTxt(btn[0]) == "X" &&  getTxt(btn[3]) == "X" && getTxt(btn[6]) == "X")
   			|| (getTxt(btn[1]) == "X" &&  getTxt(btn[4]) == "X" && getTxt(btn[7]) == "X")
   			|| (getTxt(btn[2]) == "X" &&  getTxt(btn[5]) == "X" && getTxt(btn[8]) == "X")
   			|| (getTxt(btn[0]) == "X" &&  getTxt(btn[4]) == "X" && getTxt(btn[8]) == "X")
   			|| (getTxt(btn[6]) == "X" &&  getTxt(btn[4]) == "X" && getTxt(btn[2]) == "X")
   		){
   			String nameA = "João: "+pA;
   			JOptionPane.showMessageDialog(null, nameA);
   			pA++;
   			getUpdate();
   			xo = false;
   			clear();
   			position.setText("Posicao: ");
   		}
   		else if((getTxt(btn[0]) == "O" &&  getTxt(btn[1]) == "O" && getTxt(btn[2]) == "O")
   			|| (getTxt(btn[3]) == "O" &&  getTxt(btn[4]) == "O" && getTxt(btn[5]) == "O")
   			|| (getTxt(btn[6]) == "O" &&  getTxt(btn[7]) == "O" && getTxt(btn[8]) == "O")
   			|| (getTxt(btn[0]) == "O" &&  getTxt(btn[3]) == "O" && getTxt(btn[6]) == "O")
   			|| (getTxt(btn[1]) == "O" &&  getTxt(btn[4]) == "O" && getTxt(btn[7]) == "O")
   			|| (getTxt(btn[2]) == "O" &&  getTxt(btn[5]) == "O" && getTxt(btn[8]) == "O")
   			|| (getTxt(btn[0]) == "O" &&  getTxt(btn[4]) == "O" && getTxt(btn[8]) == "O")
   			|| (getTxt(btn[6]) == "O" &&  getTxt(btn[4]) == "O" && getTxt(btn[2]) == "O")){
   				
   			String nameB = "Maria: "+pB;
   			JOptionPane.showMessageDialog(null, nameB);
   			xo = false;
   			pB++;
   			getUpdate();
   			clear();
   			position.setText("Posicao: ");
   		}
   		else if(cont == 9)
   		{
   			JOptionPane.showMessageDialog(null, "Deu Empate");
   			xo = false;
   			clear();
   		}
   		
   }
   
   public void getUpdate(){
   		playerA.setText("João: "+pA);
   		playerB.setText("Maria: "+pB);
   }
   
   
   private String getTxt(JButton button){
   		return button.getText();
   }
   
   public static void main(String[] args){
   		new Game();
   }
   
   private int play = 0;
   private boolean xo = false;
   private boolean vez = false;
   private boolean[] click = new boolean[9];
   private int pA = 0, pB = 0;
   private JButton[] btn = new JButton[9];
   private JLabel pontuacao = new JLabel("Pontuação");
   private JLabel playerA = new JLabel("");
   private JLabel playerB = new JLabel("");
   private JLabel position = new JLabel("");
   
}
