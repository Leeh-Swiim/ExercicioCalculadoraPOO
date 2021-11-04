package com.company.view;

import com.company.model.Calcular;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TelaCalculadora extends JFrame implements WindowListener, ActionListener {

    protected Dimension dLabel, dButton, dTextField, dTextArea, dFrame;
    protected Label lblTitulo, lblValor1, lblValor2;
    protected Button bttAdicao, bttSubtracao, bttMultiplicacao, bttDivisao, bttLimpar;
    protected TextField txtValor1, txtValor2;
    protected TextArea txtMsg;

    protected Calcular calcular;

    public TelaCalculadora(){
        calcular = new Calcular();

        dLabel = new Dimension(40,20);
        dButton = new Dimension(20,20);
        dTextField = new Dimension(100,20);
        dTextArea = new Dimension(180,200);
        dFrame = new Dimension(250, 450);

        setResizable(false);
        setSize(dFrame);
        setLocation(600,150);
        setLayout(null);

        /////////////////////////////////////////////////////////

        lblTitulo = new Label("CALCULADORA");
        lblTitulo.setSize(120,20);
        lblTitulo.setLocation(75,5);
        add(lblTitulo);

        /////////////////////////////////////////////////////////

        lblValor1 = new Label ("Valor 1:");
        lblValor1.setSize(dLabel);
        lblValor1.setLocation(25,50);
        add(lblValor1);

        lblValor2 = new Label ("Valor 2:");
        lblValor2.setSize(dLabel);
        lblValor2.setLocation(25,80);
        add(lblValor2);

        /////////////////////////////////////////////////////////

        txtValor1 = new TextField(null);
        txtValor1.setSize(dTextField);
        txtValor1.setLocation(75,50);
        add(txtValor1);

        txtValor2 = new TextField(null);
        txtValor2.setSize(dTextField);
        txtValor2.setLocation(75,80);
        add(txtValor2);

        /////////////////////////////////////////////////////////

        bttAdicao = new Button("+");
        bttAdicao.setSize(dButton);
        bttAdicao.setLocation(75,110);
        bttAdicao.addActionListener(this);
        add(bttAdicao);

        bttSubtracao = new Button("-");
        bttSubtracao.setSize(dButton);
        bttSubtracao.setLocation(100,110);
        bttSubtracao.addActionListener(this);
        add(bttSubtracao);


        bttMultiplicacao = new Button("x");
        bttMultiplicacao.setSize(dButton);
        bttMultiplicacao.setLocation(125,110);
        bttMultiplicacao.addActionListener(this);
        add(bttMultiplicacao);

        bttDivisao = new Button("/");
        bttDivisao.setSize(dButton);
        bttDivisao.setLocation(150,110);
        bttDivisao.addActionListener(this);
        add(bttDivisao);

        /////////////////////////////////////////////////////////

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,140);
        add(txtMsg);

        /////////////////////////////////////////////////////////

        bttLimpar = new Button("Limpar histórico de contas");
        bttLimpar.setSize(180,20);
        bttLimpar.setLocation(25,350);
        bttLimpar.addActionListener(this);
        add(bttLimpar);

        /////////////////////////////////////////////////////////

        addWindowListener(this);

    }


    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(null,
                "Fechando a aplicação.",
                "Informação",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==bttAdicao) {
            double valor1 = Double.parseDouble(txtValor1.getText());
            double valor2 = Double.parseDouble(txtValor2.getText());
            calcular.adicao(valor1, valor2);


            JOptionPane.showMessageDialog(null,
                    "Calculo efetuado com sucesso!",
                    "Informação",
                    JOptionPane.INFORMATION_MESSAGE);
            txtMsg.append(valor1 + " + " + valor2 + " = " + calcular.getResultado() + "\n");
            return;
        }
        if (e.getSource()==bttSubtracao) {
            double valor1 = Double.parseDouble(txtValor1.getText());
            double valor2 = Double.parseDouble(txtValor2.getText());
            calcular.subtracao(valor1, valor2);

            JOptionPane.showMessageDialog(null,
                    "Calculo efetuado com sucesso!",
                    "Informação",
                    JOptionPane.INFORMATION_MESSAGE);
            txtMsg.append(valor1 + " - " + valor2 + " = " + calcular.getResultado() + "\n");
            return;
        }
        if (e.getSource()==bttMultiplicacao) {
            double valor1 = Double.parseDouble(txtValor1.getText());
            double valor2 = Double.parseDouble(txtValor2.getText());
            calcular.multiplicacao(valor1, valor2);

            JOptionPane.showMessageDialog(null,
                    "Calculo efetuado com sucesso!",
                    "Informação",
                    JOptionPane.INFORMATION_MESSAGE);
            txtMsg.append(valor1 + " x " + valor2 + " = " + calcular.getResultado() + "\n");
            return;
        }
        if (e.getSource()==bttDivisao) {
            double valor1 = Double.parseDouble(txtValor1.getText());
            double valor2 = Double.parseDouble(txtValor2.getText());
            calcular.divisao(valor1, valor2);

            JOptionPane.showMessageDialog(null,
                    "Calculo efetuado com sucesso!",
                    "Informação",
                    JOptionPane.INFORMATION_MESSAGE);
            txtMsg.append(valor1 + " / " + valor2 + " = " + calcular.getResultado() + "\n");
            return;
        }
        if (e.getSource()==bttLimpar){
            JOptionPane.showMessageDialog(null,
                    "Historico de contas limpo com sucesso!",
                    "Informação",
                    JOptionPane.INFORMATION_MESSAGE);


            txtMsg.selectAll();
            txtMsg.setText("");
        }

    }
}
