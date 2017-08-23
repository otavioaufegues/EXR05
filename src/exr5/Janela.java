/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exr5;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author ice
 */
class Janela extends JFrame {
    private final JLabel txValor = new JLabel("Valor produto");
    private final JLabel txDolar = new JLabel("Valor do dolar");
    private final JLabel resultado = new JLabel();
    private final JCheckBox chkTributado = new JCheckBox("Tributado");
    private final JCheckBox chkICMS = new JCheckBox("ICMS");
    private final JTextField valor = new JTextField(10);
    private final JTextField dolar = new JTextField(10);

    public Janela() throws HeadlessException {
        super("Valor a Pagar");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(txValor);
        add(valor);
        add(txDolar);
        add(dolar);
        add(chkTributado);
        add(chkICMS);
        add(resultado);
        
    }

}
