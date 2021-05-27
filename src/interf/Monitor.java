package interf;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
@SuppressWarnings("serial")
public class Monitor extends JPanel implements IntInterface{
	public JLabel[] lbl = new JLabel[3];
	public JLabel resultado;
	public Monitor(){
		setPreferredSize(new Dimension(new Teclas().getPrefW(), 60));
		setLayout(new FlowLayout(FlowLayout.LEADING,1,0));
		for(int n =0; n<3;n++) {
			lbl[n] = new JLabel();
			lbl[n].setPreferredSize(new Dimension((getPrefW()/3)*2 - 20, 20));
			add(lbl[n]);
		}
		resultado = new JLabel("= ");
		resultado.setPreferredSize(new Dimension(getPrefW()/3+20, 20));
		add(resultado);
	}
	@Override
	public int getPrefW(){
		int W = super.getPreferredSize().width;
		return W;
	}
	@Override
	public int getPrefH() {
		int H = super.getPreferredSize().height;
		return H;
	}
	public boolean getRes() {
		boolean res;
		res = !this.resultado.getText().equals("= ");
		return res;
	}
	public void escrever(String txt, int pos){
		lbl[pos].setText(this.lbl[pos].getText()+txt);
	}
	public void mostrarResultado(String res){
		resultado.setText("= "+res);
	}
}
