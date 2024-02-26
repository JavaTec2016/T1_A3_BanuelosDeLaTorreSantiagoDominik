import java.awt.*;

import javax.swing.*;

class Ventana extends JFrame{
	GridBagConstraints gbc = new GridBagConstraints();
	GridBagLayout gbl = new GridBagLayout();
	
	Color normal = new Color(0, 0, 0); 
	public Ventana() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900,600);
		setLocationRelativeTo(null);
		setTitle("GridbagLayout");
		setVisible(true);
		
		JLabel txtList1 = new JLabel("The                             includes all visible fields for");
		gridComponente(txtList1, 0, 0, 1, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(txtList1, new Color(0, 0, 0), "Arial", 0, 13);
		
		JLabel txtList2 = new JLabel("        Classic Form");
		gridComponente(txtList2, 0, 0, 1, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(txtList2, new Color(0, 0, 0), "Arial", 1, 13);
		
		JLabel txtList3 = new JLabel("this list");
		gridComponente(txtList3, 0, 1, 1, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(txtList3, new Color(0, 0, 0), "Arial", 0, 13);
		
		JLabel txtVacio1 = new JLabel(" ");
		gridComponente(txtVacio1, 0, 2, 1, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(txtVacio1, new Color(0, 0, 0), "Arial", 0, 13);
		
		JLabel txtFormOptions = new JLabel("Form options");
		gridComponente(txtFormOptions, 0, 3, 2, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(txtFormOptions, new Color(0, 0, 0), "Arial", 0, 13);
		
		JCheckBox checTitle = new JCheckBox("a title for your form");
		gridComponente(checTitle, 0, 4, 2, 1, GridBagConstraints.BOTH);
		fuenteComponente(checTitle, new Color(0,0,0), "Arial", 0, 13);
		
		JTextField cajaTitle = new JTextField(10);
		gridComponente(cajaTitle, 0, 5, 3, 1, GridBagConstraints.BOTH);
		fuenteComponente(cajaTitle, new Color(0,0,0), "Arial", 0, 13);
		
		salto(0, 6);
		
		ButtonGroup radios = new ButtonGroup();
		
		JRadioButton radioRequired = new JRadioButton("only required fields");
		gridComponente(radioRequired, 0, 7, 2, 1, GridBagConstraints.BOTH);
		fuenteComponente(radioRequired, new Color(0,0,0), "Arial", 0, 13);
		radios.add(radioRequired);
		
		JRadioButton radioAll = new JRadioButton("all fields");
		gridComponente(radioAll, 0, 8, 2, 1, GridBagConstraints.BOTH);
		fuenteComponente(radioAll, new Color(0,0,0), "Arial", 0, 13);
		radios.add(radioAll);
		
		JLabel txtBuilder1 = new JLabel("   (edit required fields in                             )");
		gridComponente(txtBuilder1, 0, 9, 1, 1, GridBagConstraints.BOTH);
		fuenteComponente(txtBuilder1, new Color(0, 0, 0), "Arial", 0, 11);
		JLabel txtBuilder2 = new JLabel("                                      the form builder");
		gridComponente(txtBuilder2, 0, 9, 1, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(txtBuilder2, new Color(0, 200, 255), "Arial", 1, 11);
		
		salto(0, 10);
		
		JCheckBox checkInterest = new JCheckBox("interest group fields");
		gridComponente(checkInterest, 0, 11, 2, 1, GridBagConstraints.BOTH);
		fuenteComponente(checkInterest, new Color(0,0,0), "Arial", 0, 13);
		
		JCheckBox checkIndicators = new JCheckBox("required field indicators");
		gridComponente(checkIndicators, 0, 12, 2, 1, GridBagConstraints.BOTH);
		fuenteComponente(checkIndicators, new Color(0,0,0), "Arial", 0, 13);
		
		salto(0, 13);
		
		JLabel txtWidth = new JLabel("Set form width");
		gridComponente(txtWidth, 0, 14, 2, 1, GridBagConstraints.BOTH);
		fuenteComponente(txtWidth, new Color(0,0,0), "Arial", 0, 13);
		
		JTextField cajaWidth = new JTextField(10);
		gridComponente(cajaWidth, 0, 15, 3, 1, GridBagConstraints.BOTH);
		fuenteComponente(cajaWidth, new Color(0,0,0), "Arial", 0, 13);
		
		salto(0, 16);
		
		JLabel txtEnhance = new JLabel("Enhance your form");
		gridComponente(txtEnhance, 0, 17, 2, 1, GridBagConstraints.BOTH);
		fuenteComponente(txtEnhance, normal, "Arial", 0, 13);
		
		JCheckBox checkEvil = new JCheckBox("");
		JLabel txtEvil0 = new JLabel("      enable         popup mode");
		JLabel txtEvil = new JLabel("                   evil");
		
		
		gridComponente(txtEvil0, 0, 18, 1, 1, GridBagConstraints.BOTH);
		gridComponente(txtEvil, 0, 18, 1, 1, GridBagConstraints.BOTH);
		
		gridComponente(checkEvil, 0, 18, 1, 1, GridBagConstraints.NONE, GridBagConstraints.WEST);
		
		fuenteComponente(checkEvil, normal, "Arial", 0, 13);
		fuenteComponente(txtEvil0, normal, "Arial", 0, 13);
		fuenteComponente(txtEvil, normal, "Arial", 1, 13);
		
		
		JLabel txtJS0 = new JLabel("      disable all");
		gridComponente(txtJS0, 0, 19, 1, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(txtJS0, normal, "Arial", 0, 13);
		JLabel txtJS = new JLabel("                         JavaScript");
		gridComponente(txtJS, 0, 19, 1, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(txtJS, normal, "Arial", 1, 13);
		
		JCheckBox checkJS = new JCheckBox("");
		gridComponente(checkJS, 0, 19, 1, 1, GridBagConstraints.NONE, GridBagConstraints.WEST);
		fuenteComponente(checkJS, normal, "Arial", 0, 13);
		
		JCheckBox checkLink = new JCheckBox("include archive link");
		gridComponente(checkLink, 0, 20, 1, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(checkLink, normal, "Arial", 0, 13);
		
		JLabel txtMonkeyRewards0 = new JLabel("      include");
		gridComponente(txtMonkeyRewards0, 0, 21, 1, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(txtMonkeyRewards0, normal, "Arial", 0, 13);
		
		JLabel txtMonkeyRewards = new JLabel("                    MonkeyRewards link");
		gridComponente(txtMonkeyRewards, 0, 21, 1, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(txtMonkeyRewards, new Color(0, 200, 255), "Arial", 0, 13);
		
		JCheckBox checkMonkeyRewards = new JCheckBox("");
		gridComponente(checkMonkeyRewards, 0, 21, 1, 1, GridBagConstraints.NONE, GridBagConstraints.WEST);
		fuenteComponente(checkMonkeyRewards, normal, "Arial", 0, 13);
		
		/////
		
		salto(2, 0, 40, 1);
		JLabel txtPreview = new JLabel("Preview");
		gridComponente(txtPreview, 3, 0, 1, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(txtPreview, normal, "Arial", 0, 15);
		
		JTextArea marcoFalso = new JTextArea(5, 50);
		marcoFalso.setLineWrap(true);
		marcoFalso.setWrapStyleWord(true);
		marcoFalso.setText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		marcoFalso.setEditable(false);
		marcoFalso.setEnabled(false);
		marcoFalso.setVisible(false);
		JScrollPane scroll = new JScrollPane(marcoFalso);
		constraint(scroll, 3, 1, 20, 10, GridBagConstraints.BOTH);
		
		
		
		JLabel txtRequiredSymbol = new JLabel("           *");
		gridComponente(txtRequiredSymbol, 5, 1, 1, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(txtRequiredSymbol, new Color(255, 0, 0), "Arial", 1, 14);
		
		JLabel txtRequiredLine = new JLabel("                indicates required");
		gridComponente(txtRequiredLine, 5, 2, 1, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(txtRequiredLine, normal, "Arial", 0, 12);
		
		JLabel txtEmail = new JLabel("   Email Address");
		gridComponente(txtEmail,3, 3, 2, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(txtEmail, normal, "Arial", 0, 14);
		
		JFormattedTextField cajaEmail = new JFormattedTextField("                                                                                                                     *");
		gridComponente(cajaEmail, 3, 4, 3, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(cajaEmail, new Color(255, 0, 0), "Arial", 1, 14);
		
		JLabel txtFirst = new JLabel("   First Name");
		gridComponente(txtFirst,3, 5, 2, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(txtFirst, normal, "Arial", 0, 14);
		
		JTextField cajaFIrst = new JTextField(10);
		gridComponente(cajaFIrst, 3, 6, 3, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(cajaFIrst, normal, "Arial", 0, 14);
		
		JLabel txtLast = new JLabel("   Last Name");
		gridComponente(txtLast,3, 7, 2, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(txtLast, normal, "Arial", 0, 14);
		
		JTextField cajaLast = new JTextField(10);
		gridComponente(cajaLast, 3, 8, 3, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(cajaLast, normal, "Arial", 0, 14);
		
		JButton btnSUBSCRIBE = new JButton();
		btnSUBSCRIBE.setIcon(new ImageIcon("././icono/image.png"));
		gridComponente(btnSUBSCRIBE, 3, 9, 1, 1, GridBagConstraints.BOTH);
		
		add(scroll);
		
		JLabel txtCopy = new JLabel("Copy/paste onto your site");
		gridComponente(txtCopy, 3, 12, 3, 1, GridBagConstraints.HORIZONTAL);
		fuenteComponente(txtCopy, normal, "Arial", 0, 15);
		
		JTextArea areaCopy = new JTextArea(10, 15);
		JScrollPane scrollVerdadero = new JScrollPane(areaCopy);
		gridComponente(scrollVerdadero, 3, 13, 6, 9, GridBagConstraints.HORIZONTAL);
	}
	void salto(int gridx, int gridy, int w, int h) {
		JLabel e = new JLabel(" ");
		gridComponente(e, gridx, gridy, w, h, GridBagConstraints.BOTH);
		wComponente(e, h, w, h, w);
		fuenteComponente(e, new Color(0, 0, 0), "Arial", 0, 15);
	}
	void salto(int gridx, int gridy) {
		JLabel e = new JLabel(" ");
		gridComponente(e, gridx, gridy, 1, 1, GridBagConstraints.BOTH);
		fuenteComponente(e, new Color(0, 0, 0), "Arial", 0, 15);
	}
	void gridComponente(JComponent c, int gridx, int gridy, int gridw, int gridh, int fill) {
		gbc.gridx = gridx;
		gbc.gridy = gridy;
		gbc.gridwidth = gridw;
		gbc.gridheight = gridh;
		gbc.fill = fill;
		gbl.setConstraints(c, gbc);
		add(c);
	}
	void gridComponente(JComponent c, int gridx, int gridy, int gridw, int gridh, int fill, int anchor) {
		gbc.gridx = gridx;
		gbc.gridy = gridy;
		gbc.gridwidth = gridw;
		gbc.gridheight = gridh;
		gbc.fill = fill;
		gbc.anchor = anchor;
		gbl.setConstraints(c, gbc);
		add(c);
	}
	void constraint(JComponent c, int gridx, int gridy, int gridw, int gridh, int fill) {
		gbc.gridx = gridx;
		gbc.gridy = gridy;
		gbc.gridwidth = gridw;
		gbc.gridheight = gridh;
		gbc.fill = fill;
		gbl.setConstraints(c, gbc);
	}
	//padding con pasos extra
	void wComponente(JComponent c, int t, int l, int b, int r){
		Insets i = new Insets(t, l, b, r);
		gbc.insets = i;
		gbl.setConstraints(c, gbc);
	}
	void fuenteComponente(JComponent c, Color col, String font, int style, int size) {
		c.setFont(new Font(font, style, size));
		c.setForeground(col);
	}
}
public class VentanaGridBag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Ventana();
			}
		});
	}

}
