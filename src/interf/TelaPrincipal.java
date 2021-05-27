package interf;

import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame implements Runnable{

	private static final long serialVersionUID = 1L;
	public Teclas teclas;
	public Monitor monitor;
	private boolean op = false;
	public TelaPrincipal() {
		teclas = new Teclas();
		monitor = new Monitor();
		setName("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.NORMAL);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setMinimumSize(new Dimension(teclas.getPrefW()+25, (teclas.getPrefH() + monitor.getPrefH())+55));

		teclas.botoes[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
				if(monitor.getRes()==true) {
					for(int a=0;a<3;a++) {
						monitor.lbl[a].setText("");
						monitor.resultado.setText("= ");
						op = false;
					}
				}
				if(op==false) {
					monitor.escrever(teclas.botoes[0].getText(), 0);
				}else {
					monitor.escrever(teclas.botoes[0].getText(), 2);
				}
				
			}
		});
		teclas.botoes[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
				if(monitor.getRes()==true) {
					for(int a=0;a<3;a++) {
						monitor.lbl[a].setText("");
						monitor.resultado.setText("= ");
						op = false;
					}
				}
				
				if(op==false) {
					monitor.escrever(teclas.botoes[1].getText(), 0);
				}else {
					monitor.escrever(teclas.botoes[1].getText(), 2);
				}
			}
		});
		teclas.botoes[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
				if(monitor.getRes()==true) {
					for(int a=0;a<3;a++) {
						monitor.lbl[a].setText("");
						monitor.resultado.setText("= ");
						op = false;
					}
				}
				if(op==false) {
					monitor.escrever(teclas.botoes[2].getText(), 0);
				}else {
					monitor.escrever(teclas.botoes[2].getText(), 2);
				}
			}
		});
		teclas.botoes[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
				if(!monitor.lbl[0].getText().equals("")) {
					monitor.lbl[1].setText(teclas.botoes[3].getText());
					op=true;
				}
				
			}
		});
		teclas.botoes[4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
				if(!monitor.lbl[2].getText().equals("")){
					monitor.lbl[2].setText(monitor.lbl[2].getText().substring(0,monitor.lbl[2].getText().length() -1));
				}else if(!monitor.lbl[1].getText().equals("")) {
					monitor.lbl[1].setText("");
					op = false;
				}else if(!monitor.lbl[0].getText().equals("")){
					monitor.lbl[0].setText(monitor.lbl[0].getText().substring(0,monitor.lbl[0].getText().length() -1));
				}
			}
		});
		teclas.botoes[5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
					if(monitor.getRes()==true) {
						for(int a=0;a<3;a++) {
							monitor.lbl[a].setText("");
							monitor.resultado.setText("= ");
							op = false;
						}
					}				
				if(op==false) {
					monitor.escrever(teclas.botoes[5].getText(), 0);
				}else {
					monitor.escrever(teclas.botoes[5].getText(), 2);
				}
			}
		});
		teclas.botoes[6].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
					if(monitor.getRes()==true) {
						for(int a=0;a<3;a++) {
							monitor.lbl[a].setText("");
							monitor.resultado.setText("= ");
							op = false;
						}
					}				
				if(op==false) {
					monitor.escrever(teclas.botoes[6].getText(), 0);
				}else {
					monitor.escrever(teclas.botoes[6].getText(), 2);
				}
			}
		});
		teclas.botoes[7].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
					if(monitor.getRes()==true) {
						for(int a=0;a<3;a++) {
							monitor.lbl[a].setText("");
							monitor.resultado.setText("= ");
							op = false;
						}
					}				
				if(op==false) {
					monitor.escrever(teclas.botoes[7].getText(), 0);
				}else {
					monitor.escrever(teclas.botoes[7].getText(), 2);
				}
			}
		});
		teclas.botoes[8].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
				if(!monitor.lbl[0].getText().equals("")) {
					monitor.lbl[1].setText(teclas.botoes[8].getText());
					op = true;
				}
				
			}
		});
		teclas.botoes[9].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
				if(!monitor.lbl[0].getText().equals("")) {
					float n1, res;
					n1 = Integer.parseInt(monitor.lbl[0].getText());
					res = (float)Math.sqrt(n1);
					monitor.mostrarResultado(Float.toString(res));
				}	
			}
		});
		teclas.botoes[10].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
					if(monitor.getRes()==true) {
						for(int a=0;a<3;a++) {
							monitor.lbl[a].setText("");
							monitor.resultado.setText("= ");
							op = false;
						}
					}				
				if(op==false) {
					monitor.escrever(teclas.botoes[10].getText(), 0);
				}else {
					monitor.escrever(teclas.botoes[10].getText(), 2);
				}
			}
		});
		teclas.botoes[11].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
					if(monitor.getRes()==true) {
						for(int a=0;a<3;a++) {
							monitor.lbl[a].setText("");
							monitor.resultado.setText("= ");
							op = false;
						}
					}				
				if(op==false) {
					monitor.escrever(teclas.botoes[11].getText(), 0);
				}else {
					monitor.escrever(teclas.botoes[11].getText(), 2);
				}
			}
		});
		teclas.botoes[12].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
					if(monitor.getRes()==true) {
						for(int a=0;a<3;a++) {
							monitor.lbl[a].setText("");
							monitor.resultado.setText("= ");
							op = false;
						}
					}				
				if(op==false) {
					monitor.escrever(teclas.botoes[12].getText(), 0);
				}else {
					monitor.escrever(teclas.botoes[12].getText(), 2);
				}
			}
		});
		teclas.botoes[13].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
				if(!monitor.lbl[0].getText().equals("")) {
					monitor.lbl[1].setText(teclas.botoes[13].getText());
					op = true;
				}
			}
		});
		teclas.botoes[14].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
				if(!monitor.lbl[0].getText().equals("")) {
					monitor.lbl[1].setText(teclas.botoes[14].getText());
					op = true;
				}
			}
		});
		teclas.botoes[15].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
				if(monitor.getRes()==true) {
					for(int a=0;a<3;a++) {
						monitor.lbl[a].setText("");
						monitor.resultado.setText("= ");
						op = false;
					}
				}
				if(op==false) {
					monitor.escrever(teclas.botoes[15].getText(), 0);
				}else {
					monitor.escrever(teclas.botoes[15].getText(), 2);
				}
			}
		});
		teclas.botoes[16].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
				float n1, n2, res;
				if(op==true && !monitor.lbl[2].getText().equals("")){
					switch(monitor.lbl[1].getText()) {
					case "+":
						n1 = Integer.parseInt(monitor.lbl[0].getText());
						n2 = Integer.parseInt(monitor.lbl[2].getText());
						res = n1 + n2;
						monitor.mostrarResultado(Integer.toString((int)res));
						break;
					case "-":
						n1 = Integer.parseInt(monitor.lbl[0].getText());
						n2 = Integer.parseInt(monitor.lbl[2].getText());
						res = n1 - n2;
						monitor.mostrarResultado(Integer.toString((int)res));
						break;
					case "x":
						n1 = Integer.parseInt(monitor.lbl[0].getText());
						n2 = Integer.parseInt(monitor.lbl[2].getText());
						res = n1 * n2;
						monitor.mostrarResultado(Integer.toString((int)res));
						break;
					case "÷":
						n1 = Integer.parseInt(monitor.lbl[0].getText());
						n2 = Integer.parseInt(monitor.lbl[2].getText());
						res = n1 / n2;
						monitor.mostrarResultado(Float.toString(res));
						break;
					case "^":
						n1 = Integer.parseInt(monitor.lbl[0].getText());
						n2 = Integer.parseInt(monitor.lbl[2].getText());
						res = (int)Math.pow(n1, n2);
						monitor.mostrarResultado(Float.toString((int)res));
						break;
					}
				}
			}
		});
		teclas.botoes[17].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
				if(!monitor.lbl[0].getText().equals("")) {
					monitor.lbl[1].setText(teclas.botoes[17].getText());
					op=true;
				}	
			}
		});
		teclas.botoes[18].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg5) {
				for(int a=0;a<3;a++) {
					monitor.lbl[a].setText("");
					monitor.resultado.setText("= ");
					op = false;
				}
			}
		});
	}	
	@Override
	public void run() {
		add(monitor);
		add(teclas);
		setVisible(true);
	}
}
