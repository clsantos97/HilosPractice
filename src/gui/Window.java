/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.HiloContador;

/**
 *
 * @author Carlos
 */
public class Window extends JFrame implements ActionListener {

    HiloContador t1;
    HiloContador t2;
    HiloContador t3;

    private static final long serialVersionUID = 1L;
    private JButton btnEndAll;
    private JButton btn3Less;
    private JButton btn3End;
    private JButton btn3More;
    private JButton btn2Less;
    private JButton btn2End;
    private JButton btn2More;
    private JButton btn1Less;
    private JButton btn1End;
    private JButton btn1More;
    private JLabel lblCont1;
    private JLabel lblCont2;
    private JLabel lblCont3;
    private JLabel lblPri1;
    private JLabel lblPri2;
    private JLabel lblPri3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Window frame = new Window();
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
    public Window() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 333, 384);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        // Panels
        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(7, 1, 0, 0));

        JPanel panel2 = new JPanel();
        panel.add(panel2);
        panel2.setLayout(new GridLayout(0, 2, 0, 0));

        JPanel panel1 = new JPanel();
        panel.add(panel1);

        JPanel panel6 = new JPanel();
        panel.add(panel6);
        panel6.setLayout(new GridLayout(0, 2, 0, 0));

        JPanel panel7 = new JPanel();
        panel.add(panel7);
        panel7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        // Buttons
        btn1Less = new JButton("--");
        panel7.add(btn1Less);

        btn1End = new JButton("End thread 1");
        panel7.add(btn1End);

        btn1More = new JButton("++");
        panel7.add(btn1More);

        JPanel panel8 = new JPanel();
        panel6.add(panel8);
        panel8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JPanel panel11 = new JPanel();
        panel6.add(panel11);
        panel11.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JPanel panel12 = new JPanel();
        panel2.add(panel12);
        panel12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JPanel panel13 = new JPanel();
        panel2.add(panel13);
        panel13.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        // Labels
        JLabel lblLabel1 = new JLabel("Thread 1:");
        panel8.add(lblLabel1);
        lblLabel1.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblLabel2 = new JLabel("Pri:");
        panel11.add(lblLabel2);
        lblLabel2.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblLabel5 = new JLabel("Thread 3:");
        panel12.add(lblLabel5);
        lblLabel5.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblLabel6 = new JLabel("Pri:");
        panel13.add(lblLabel6);
        lblLabel6.setFont(new Font("Tahoma", Font.PLAIN, 18));

        lblCont1 = new JLabel("0");
        panel8.add(lblCont1);
        lblCont1.setFont(new Font("Tahoma", Font.PLAIN, 18));

        lblPri1 = new JLabel("0");
        panel11.add(lblPri1);
        lblPri1.setFont(new Font("Tahoma", Font.PLAIN, 18));

        lblCont3 = new JLabel("0");
        panel12.add(lblCont3);
        lblCont3.setFont(new Font("Tahoma", Font.PLAIN, 18));

        lblPri3 = new JLabel("0");
        panel13.add(lblPri3);
        lblPri3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        panel1.setLayout(new GridLayout(0, 2, 0, 0));

        JPanel panel9 = new JPanel();
        panel1.add(panel9);
        panel9.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JLabel lblLabel3 = new JLabel("Thread 2:");
        panel9.add(lblLabel3);
        lblLabel3.setFont(new Font("Tahoma", Font.PLAIN, 18));

        lblCont2 = new JLabel("0");
        panel9.add(lblCont2);
        lblCont2.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JPanel panel10 = new JPanel();
        panel1.add(panel10);
        panel10.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JLabel lblLabel4 = new JLabel("Pri:");
        panel10.add(lblLabel4);
        lblLabel4.setFont(new Font("Tahoma", Font.PLAIN, 18));

        lblPri2 = new JLabel("0");
        panel10.add(lblPri2);
        lblPri2.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JPanel panel3 = new JPanel();
        panel.add(panel3);

        btn2Less = new JButton("--");
        panel3.add(btn2Less);

        btn2End = new JButton("End thread 2");
        panel3.add(btn2End);

        btn2More = new JButton("++");
        panel3.add(btn2More);

        JPanel panel4 = new JPanel();
        panel.add(panel4);

        btn3Less = new JButton("--");
        panel4.add(btn3Less);

        btn3End = new JButton("End Thread 3");
        panel4.add(btn3End);

        btn3More = new JButton("++");
        panel4.add(btn3More);

        JPanel panel5 = new JPanel();
        panel.add(panel5);

        btnEndAll = new JButton("End all threads");
        panel5.add(btnEndAll);

        // LISTENERS
        btnEndAll.addActionListener(this);
        btn1More.addActionListener(this);
        btn1Less.addActionListener(this);
        btn1End.addActionListener(this);
        btn2More.addActionListener(this);
        btn2Less.addActionListener(this);
        btn2End.addActionListener(this);
        btn3More.addActionListener(this);
        btn3Less.addActionListener(this);
        btn3End.addActionListener(this);

        // LOGIC
        initThreads();
    }

    public void initThreads() {

        t1 = new HiloContador(lblCont1, lblPri1, "Thread1");
        t2 = new HiloContador(lblCont2, lblPri2, "Thread2");
        t3 = new HiloContador(lblCont3, lblPri3, "Thread3");

        t1.start();
        t2.start();
        t3.start();
    }

    public void actionPerformed(ActionEvent e) {
        JButton sourceButton = (JButton) e.getSource();

        if (sourceButton.equals(btnEndAll)) {
            t1.safeInterrupt();
            t2.safeInterrupt();
            t3.safeInterrupt();

        } else if (sourceButton.equals(btn1More)) {
            t1.setPrio(Thread.MAX_PRIORITY);
        } else if (sourceButton.equals(btn1Less)) {
            t1.setPrio(Thread.MIN_PRIORITY);
        } else if (sourceButton.equals(btn1End)) {
            t1.safeInterrupt();
        } else if (sourceButton.equals(btn2More)) {
            t2.setPrio(Thread.MAX_PRIORITY);
        } else if (sourceButton.equals(btn2Less)) {
            t2.setPrio(Thread.MIN_PRIORITY);
        } else if (sourceButton.equals(btn2End)) {
            t2.safeInterrupt();
        } else if (sourceButton.equals(btn3More)) {
            t3.setPrio(Thread.MAX_PRIORITY);
        } else if (sourceButton.equals(btn3Less)) {
            t3.setPrio(Thread.MIN_PRIORITY);
        } else if (sourceButton.equals(btn3End)) {
            t3.safeInterrupt();
        }
    }
}
