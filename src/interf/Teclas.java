package interf;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;

public class Teclas extends JPanel implements IntInterface{
	
	private static final long serialVersionUID = 1L;

	public JButton[] botoes = new JButton[19];
	private int btn = 0;
	public String digito;
	public Teclas(){
		//configurando caracteristicasa do elemento herdado
		setLayout(new FlowLayout(FlowLayout.CENTER,1,1));
		setPreferredSize(new Dimension(230,110));
		//Fim Config
		///declarando a array de botoes
			for(; btn<botoes.length;btn++){
				botoes[btn] = new JButton();
				botoes[btn].setPreferredSize(new Dimension(45,26));
					switch(btn){
						case 0: botoes[btn].setText("1"); break;
						case 1:	botoes[btn].setText("2"); break;
						case 2: botoes[btn].setText("3"); break; 
						case 3: botoes[btn].setText("÷"); break;
						case 4: botoes[btn].setText("<"); break;
						case 5: botoes[btn].setText("4"); break;
						case 6: botoes[btn].setText("5"); break;
						case 7: botoes[btn].setText("6"); break;
						case 8: botoes[btn].setText("x"); break;
						case 9: botoes[btn].setText("√"); break;
						case 10: botoes[btn].setText("7"); break;
						case 11: botoes[btn].setText("8"); break;
						case 12: botoes[btn].setText("9");  break;
						case 13: botoes[btn].setText("-"); break;
						case 14: botoes[btn].setText("^"); break;
						case 15: botoes[btn].setText("0");break;
						case 16: botoes[btn].setText("=");botoes[btn].setPreferredSize(new Dimension(91,26));break;
						case 17: botoes[btn].setText("+");break;
						case 18: botoes[btn].setText("C");break;
					}
			botoes[btn].setVisible(true);
			super.add(botoes[btn]);
			}
		///FimDeclaração
	}
	@Override
	public int getPrefW() {
		int W = super.getPreferredSize().width;
		return W;
	}
	@Override
	public int getPrefH() {
		int H = super.getPreferredSize().height;
		return H;
	}
}