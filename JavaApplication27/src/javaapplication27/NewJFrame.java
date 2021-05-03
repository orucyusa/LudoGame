/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import game.Message;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Yusa
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public String side;
    private int piyon1 = 0;
    private int piyon2 = 0;
    private int piyon3 = 0;
    private int piyon4 = 0;
    private int counterPiyon = 0;
    private int counter;
    private int temp;
    private int temp1;
    private int temp2;
    private int temp3;
    private int GreenTemp;
    private int GreenTemp1;
    private int GreenTemp2;
    private int GreenTemp3;
    private int enemytemp = -1;
    private int enemytemp1 = -1;
    private int enemytemp2 = -1;
    private int enemytemp3 = -1;
    private int enemytemp4 = -1;
    private int enemytemp5 = -1;
    private int enemytemp6 = -1;
    private int enemytemp7 = -1;
    private int PiyonSeciliMi = 0;
    private int YesilPiyonSeciliMi = 0;
    private ArrayList<JLabel> Squares;
    public static NewJFrame game;
    private int redSquareCounter = 0;
    private int piyon5 = 0;
    private int piyon6 = 0;
    private int piyon7 = 0;
    private int piyon8 = 0;
    private int GreenEnemyTemp = -1;
    private boolean girdiMi1 = false;
    private boolean girdiMi2 = false;
    private boolean girdiMi3 = false;
    private boolean girdiMi4 = false;
    private boolean girdiMi5 = false;
    private boolean girdiMi6 = false;
    private boolean girdiMi7 = false;
    private boolean girdiMi8 = false;
    public int DiceCounter = 0;
    public Thread Slider;
    public int kontrol=0;

    public NewJFrame() {

        initComponents();
        game = this;
        NewJFrame.game.setBackground(Color.black);
        Client.Start("127.0.0.1", 2000);

        side = "green";
   // Labellarin arrayliste eklenmesi
        Squares = new ArrayList();
        Squares.add(Square1);
        Squares.add(Square2);
        Squares.add(Square3);
        Squares.add(Square4);
        Squares.add(Square5);
        Squares.add(Square6);
        Squares.add(Square7);
        Squares.add(Square8);
        Squares.add(Square9);
        Squares.add(Square10);
        Squares.add(Square11);
        Squares.add(Square12);
        Squares.add(Square13);
        Squares.add(Square14);
        Squares.add(Square15);
        Squares.add(Square16);
        Squares.add(Square17);
        Squares.add(Square18);
        Squares.add(Square19);
        Squares.add(Square20);
        Squares.add(Square21);
        Squares.add(Square22);
        Squares.add(Square23);
        Squares.add(Square24);
        Squares.add(Square25);
        Squares.add(Square26);
        Squares.add(Square27);
        Squares.add(Square28);
        Squares.add(Square29);
        Squares.add(Square30);
        Squares.add(Square31);
        Squares.add(Square32);
        Squares.add(Square33);
        Squares.add(Square34);
        Squares.add(Square35);
        Squares.add(Square36);
        Squares.add(Square37);
        Squares.add(Square38);
        Squares.add(Square39);
        Squares.add(Square40);

        Squares.add(GreenPiyon1);
        Squares.add(GreenPiyon2);
        Squares.add(GreenPiyon3);
        Squares.add(GreenPiyon4);

        Squares.add(RedPiyon1);
        Squares.add(RedPiyon2);
        Squares.add(RedPiyon3);
        Squares.add(RedPiyon4);

        Squares.get(40).setBackground(Color.green);
        Squares.get(41).setBackground(Color.green);
        Squares.get(42).setBackground(Color.green);
        Squares.get(43).setBackground(Color.green);

        Squares.get(44).setBackground(Color.red);
        Squares.get(45).setBackground(Color.red);
        Squares.get(46).setBackground(Color.red);
        Squares.get(47).setBackground(Color.red);
        
        jButton2.setEnabled(false);

        Slider = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        
                        // Surekli calisarak zar atildiktan sonra ki kontrolu sagliyor. 
                        Thread.sleep(300);
                        
                       
                        if (DiceCounter % 2 == 1) {
                            side = "red";
                            jLabelSide.setText("Side = RED ");
                            jLabelSide.setBackground(Color.red);

                        } else {
                            side = "green";
                            jLabelSide.setText("Side = GREEN ");
                            jLabelSide.setBackground(Color.green);
                        }
                        
                        if(kontrol == 0 && RedSquare1.getBackground() == Color.red && RedSquare2.getBackground() == Color.red  && RedSquare3.getBackground() == Color.red  && RedSquare4.getBackground() == Color.red ){
                            kontrol++;
                            JOptionPane.showMessageDialog(game, "KIRMIZI KAZANDI!.");
                            
                            
                        }
                        if(kontrol == 0 && GreenSquare.getBackground() == Color.green  && GreenSquare1.getBackground() == Color.green && GreenSquare2.getBackground() == Color.green && GreenSquare3.getBackground() == Color.green){
                            kontrol++;
                            JOptionPane.showMessageDialog(game, "YEŞİL KAZANDI!.");
                        }
                        if (zar.isEnabled()) {
                            jLabelSira.setVisible(true);

                        } else {
                            jLabelSira.setVisible(false);
                        }
                        if (jButton2.isEnabled()) {
                            jLabel1.setVisible(true);

                        } else {
                            jLabel1.setVisible(false);
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        Square1 = new javax.swing.JLabel();
        Square40 = new javax.swing.JLabel();
        Square39 = new javax.swing.JLabel();
        Square2 = new javax.swing.JLabel();
        Square38 = new javax.swing.JLabel();
        Square3 = new javax.swing.JLabel();
        Square37 = new javax.swing.JLabel();
        Square4 = new javax.swing.JLabel();
        Square36 = new javax.swing.JLabel();
        Square11 = new javax.swing.JLabel();
        Square10 = new javax.swing.JLabel();
        Square9 = new javax.swing.JLabel();
        Square12 = new javax.swing.JLabel();
        RedSquare4 = new javax.swing.JLabel();
        Square8 = new javax.swing.JLabel();
        Square13 = new javax.swing.JLabel();
        RedSquare3 = new javax.swing.JLabel();
        Square7 = new javax.swing.JLabel();
        Square14 = new javax.swing.JLabel();
        RedSquare2 = new javax.swing.JLabel();
        Square6 = new javax.swing.JLabel();
        Square15 = new javax.swing.JLabel();
        RedSquare1 = new javax.swing.JLabel();
        Square5 = new javax.swing.JLabel();
        Square16 = new javax.swing.JLabel();
        Square24 = new javax.swing.JLabel();
        Square17 = new javax.swing.JLabel();
        Square23 = new javax.swing.JLabel();
        Square18 = new javax.swing.JLabel();
        Square22 = new javax.swing.JLabel();
        Square19 = new javax.swing.JLabel();
        Square20 = new javax.swing.JLabel();
        Square21 = new javax.swing.JLabel();
        Square25 = new javax.swing.JLabel();
        GreenSquare = new javax.swing.JLabel();
        Square35 = new javax.swing.JLabel();
        Square26 = new javax.swing.JLabel();
        GreenSquare1 = new javax.swing.JLabel();
        Square34 = new javax.swing.JLabel();
        Square27 = new javax.swing.JLabel();
        GreenSquare2 = new javax.swing.JLabel();
        Square33 = new javax.swing.JLabel();
        Square28 = new javax.swing.JLabel();
        GreenSquare3 = new javax.swing.JLabel();
        Square32 = new javax.swing.JLabel();
        Square29 = new javax.swing.JLabel();
        Square30 = new javax.swing.JLabel();
        Square31 = new javax.swing.JLabel();
        GreenPiyon1 = new javax.swing.JLabel();
        GreenPiyon2 = new javax.swing.JLabel();
        GreenPiyon3 = new javax.swing.JLabel();
        GreenPiyon4 = new javax.swing.JLabel();
        RedPiyon1 = new javax.swing.JLabel();
        RedPiyon2 = new javax.swing.JLabel();
        RedPiyon3 = new javax.swing.JLabel();
        RedPiyon4 = new javax.swing.JLabel();
        zar = new javax.swing.JButton();
        ZarCounter = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabelSide = new javax.swing.JLabel();
        jLabelSira = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Square1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 38, 18));

        Square40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square40, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 38, 18));

        Square39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square39, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 38, 18));

        Square2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 38, 18));

        Square38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square38, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 38, 18));

        Square3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 38, 18));

        Square37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square37, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 38, 18));

        Square4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 38, 18));

        Square36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square36, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 38, 18));

        Square11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 38, 18));

        Square10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 38, 18));

        Square9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 38, 18));

        Square12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 38, 18));

        RedSquare4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedSquare4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(RedSquare4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 38, 18));

        Square8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 38, 18));

        Square13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 38, 18));

        RedSquare3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedSquare3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(RedSquare3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 38, 18));

        Square7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 38, 18));

        Square14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 38, 18));

        RedSquare2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedSquare2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(RedSquare2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 38, 18));

        Square6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 38, 18));

        Square15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 38, 18));

        RedSquare1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedSquare1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(RedSquare1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 38, 18));

        Square5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 38, 18));

        Square16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 38, 18));

        Square24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square24, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 38, 18));

        Square17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 38, 18));

        Square23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square23, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 38, 18));

        Square18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 38, 18));

        Square22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 38, 18));

        Square19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 38, 18));

        Square20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 38, 18));

        Square21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 38, 18));

        Square25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square25, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 38, 18));

        GreenSquare.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GreenSquare.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(GreenSquare, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 38, 18));

        Square35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square35, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 38, 18));

        Square26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square26, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 38, 18));

        GreenSquare1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GreenSquare1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(GreenSquare1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 38, 18));

        Square34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square34, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 38, 18));

        Square27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square27, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 38, 18));

        GreenSquare2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GreenSquare2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(GreenSquare2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 38, 18));

        Square33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square33, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 38, 18));

        Square28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square28, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 38, 18));

        GreenSquare3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GreenSquare3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(GreenSquare3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 38, 18));

        Square32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square32, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 38, 18));

        Square29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square29, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 38, 18));

        Square30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square30, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 38, 18));

        Square31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Square31, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 38, 18));

        GreenPiyon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GreenPiyon1.setText("1");
        GreenPiyon1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(GreenPiyon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 38, 18));

        GreenPiyon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GreenPiyon2.setText("2");
        GreenPiyon2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(GreenPiyon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 38, 18));

        GreenPiyon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GreenPiyon3.setText("3");
        GreenPiyon3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(GreenPiyon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, 38, 18));

        GreenPiyon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GreenPiyon4.setText("4");
        GreenPiyon4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(GreenPiyon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, 38, 18));

        RedPiyon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedPiyon1.setText("1");
        RedPiyon1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(RedPiyon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 38, 18));

        RedPiyon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedPiyon2.setText("2");
        RedPiyon2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(RedPiyon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 38, 18));

        RedPiyon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedPiyon3.setText("3");
        RedPiyon3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(RedPiyon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 38, 18));

        RedPiyon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedPiyon4.setText("4");
        RedPiyon4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(RedPiyon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 38, 18));

        zar.setText("ZAR AT");
        zar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zarActionPerformed(evt);
            }
        });
        getContentPane().add(zar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 97, 45));

        ZarCounter.setText("ZAR");
        getContentPane().add(ZarCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 220, 38, 18));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("jRadioButton1");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 22, 20));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("jRadioButton2");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 21, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("jRadioButton3");
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 19, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton4");
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 20, -1));

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("jRadioButton5");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 19, -1));

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("jRadioButton5");
        getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 19, -1));

        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setText("jRadioButton5");
        getContentPane().add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 19, -1));

        buttonGroup2.add(jRadioButton8);
        jRadioButton8.setText("jRadioButton5");
        getContentPane().add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 19, -1));

        jButton2.setText("Oyna");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 11, -1, -1));

        jLabelSide.setText("Side =");
        jLabelSide.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 331, 95, 69));

        jLabelSira.setText("SIRA SENDE ZAR AT");
        jLabelSira.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabelSira, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 150, 30));

        jLabel1.setText("OYNA!!!");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 180, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zarActionPerformed
        // TODO add your handling code here:
        Random rand = new Random();
        int n = rand.nextInt(1);
        n = n + 6;
        ZarCounter.setText(String.valueOf(n));
        DiceCounter++;
        /*
        if (DiceCounter % 2 == 1) {
            side = "red";
            jLabelSide.setText("Side = RED ");
            jLabelSide.setBackground(Color.red);

            Message msg = new Message(Message.Message_Type.ZarDurumu);
            msg.content = DiceCounter;
            Client.Send(msg);
        } else {
            side = "green";
            jLabelSide.setText("Side = GREEN ");
            jLabelSide.setBackground(Color.green);

            Message msg = new Message(Message.Message_Type.ZarDurumu);
            msg.content = DiceCounter;
            Client.Send(msg);
        }*/
        Message msg = new Message(Message.Message_Type.ZarDurumu);
        msg.content = DiceCounter;
        Client.Send(msg);

        jButton2.setEnabled(true);
        zar.setEnabled(false);

    }//GEN-LAST:event_zarActionPerformed
    public int TempKontrol(int n) {
        if (n > 39) {
            return n % 40;
        }
        return n;
    }

    public boolean FinishKontrol(int n) {
        if (n > 39) {
            return true;
        }
        return false;
    }

    public static void SetRedSquare() {
        RedSquare1.setBackground(Color.red);

    }

    public void ReadFromServer(Message msg) {
        // diger cliente gonderme fonksiyonum...
        // array listin 0. elemanini kontrol ederek hangi piyon oldugunu
        // ardindan 1. elemani ile tempini alarak nereye gidecegini 
        // ve gerekli kontrolleri burada sagliyorum.
        ArrayList<Integer> content = (ArrayList<Integer>) msg.content;

        if (side == "red") {
            if (enemytemp == -1 && content.get(0) == 0) {

                Squares.get(content.get(1)).setBackground(Color.red);
                enemytemp = content.get(1);
                Squares.get(44 + content.get(0)).setBackground(null);
                System.out.println(content.get(1));

            } else if (enemytemp1 == -1 && content.get(0) == 1) {
                if (Squares.get(content.get(1)).getBackground() == Color.red) {
                    System.out.println("hatalı oynadın");
                } else if (Squares.get(content.get(1)).getBackground() == Color.green) {
                    System.out.println("hata");
                } else {
                    Squares.get(content.get(1)).setBackground(Color.red);
                    enemytemp1 = content.get(1);
                    Squares.get(44 + content.get(0)).setBackground(null);
                    System.out.println(content.get(1));
                }
            } else if (enemytemp2 == -1 && content.get(0) == 2) {

                if (Squares.get(content.get(1)).getBackground() == Color.red) {
                    System.out.println("hatalı oynadın");
                } else if (Squares.get(content.get(1)).getBackground() == Color.green) {
                    System.out.println("hata");
                } else {

                    Squares.get(content.get(1)).setBackground(Color.red);
                    enemytemp2 = content.get(1);
                    Squares.get(44 + content.get(0)).setBackground(null);
                    System.out.println(content.get(1));
                }
            } else if (enemytemp3 == -1 && content.get(0) == 3) {

                if (Squares.get(content.get(1)).getBackground() == Color.red) {
                    System.out.println("hatalı oynadın");
                } else if (Squares.get(content.get(1)).getBackground() == Color.green) {
                    System.out.println("hata");
                } else {
                    Squares.get(content.get(1)).setBackground(Color.red);
                    enemytemp3 = content.get(1);
                    Squares.get(44 + content.get(0)).setBackground(null);
                    System.out.println(content.get(1));
                }
            } else if (enemytemp != -1 && content.get(0) == 0) {

                if (Squares.get(content.get(1)).getBackground() == Color.red) {
                    System.out.println("hatalı oynadın");
                } else if (Squares.get(content.get(1)).getBackground() == Color.green) {
                    System.out.println("hata");
                } else {
                    Squares.get(enemytemp).setBackground(null);
                    TempKontrol(content.get(1));
                    enemytemp = content.get(1);
                    Squares.get(content.get(1)).setBackground(Color.red);
                    int piyonKontrol = (content.get(2));
                    if (FinishKontrol(piyonKontrol)) {
                        Squares.get(content.get(1)).setBackground(null);
                        if (content.get(0) == 0) {
                            RedSquare1.setBackground(Color.red);
                        }
                    }
                }

            } else if (enemytemp1 != -1 && content.get(0) == 1) {

                if (Squares.get(content.get(1)).getBackground() == Color.red) {
                    System.out.println("hatalı oynadın");
                } else if (Squares.get(content.get(1)).getBackground() == Color.green) {
                    System.out.println("hata");
                } else {
                    Squares.get(enemytemp1).setBackground(null);
                    TempKontrol(content.get(1));
                    enemytemp1 = content.get(1);
                    Squares.get(content.get(1)).setBackground(Color.red);
                    int piyonKontrol = (content.get(2));
                    if (FinishKontrol(piyonKontrol)) {
                        Squares.get(content.get(1)).setBackground(null);
                        if (content.get(0) == 1) {
                            RedSquare2.setBackground(Color.red);
                        }
                    }
                }

            } else if (enemytemp2 != -1 && content.get(0) == 2) {

                if (Squares.get(content.get(1)).getBackground() == Color.red) {
                    System.out.println("hatalı oynadın");
                } else if (Squares.get(content.get(1)).getBackground() == Color.green) {
                    System.out.println("hata");
                } else {
                    Squares.get(enemytemp2).setBackground(null);
                    TempKontrol(content.get(1));
                    enemytemp2 = content.get(1);
                    Squares.get(content.get(1)).setBackground(Color.red);
                    int piyonKontrol = (content.get(2));
                    if (FinishKontrol(piyonKontrol)) {
                        Squares.get(content.get(1)).setBackground(null);
                        if (content.get(0) == 2) {
                            RedSquare3.setBackground(Color.red);
                        }
                    }
                }

            } else if (enemytemp3 != -1 && content.get(0) == 3) {

                if (Squares.get(content.get(1)).getBackground() == Color.red) {
                    System.out.println("hatalı oynadın");
                } else if (Squares.get(content.get(1)).getBackground() == Color.green) {
                    System.out.println("hata");
                } else {
                    Squares.get(enemytemp3).setBackground(null);
                    TempKontrol(content.get(1));
                    enemytemp3 = content.get(1);
                    Squares.get(content.get(1)).setBackground(Color.red);
                    int piyonKontrol = (content.get(2));
                    if (FinishKontrol(piyonKontrol)) {
                        Squares.get(content.get(1)).setBackground(null);
                        if (content.get(0) == 3) {
                            RedSquare4.setBackground(Color.red);
                        }
                    }
                }

            }

        }
        if (side == "green") {

            if (enemytemp4 == -1 && content.get(0) == 4) {
                Squares.get(content.get(1)).setBackground(Color.green);
                enemytemp4 = content.get(1);
                Squares.get(36 + content.get(0)).setBackground(null);
                System.out.println(content.get(1));

            } else if (enemytemp5 == -1 && content.get(0) == 5) {

                if (Squares.get(TempKontrol(content.get(1))).getBackground() == Color.red) {
                    System.out.println("hatalı oynadın");
                } else if (Squares.get((TempKontrol(content.get(1)))).getBackground() == Color.green) {
                    System.out.println("hata");
                } else {
                    Squares.get(content.get(1)).setBackground(Color.green);
                    enemytemp5 = content.get(1);
                    Squares.get(36 + content.get(0)).setBackground(null);
                    System.out.println(content.get(1));
                }
            } else if (enemytemp6 == -1 && content.get(0) == 6) {

                if (Squares.get((TempKontrol(content.get(1)))).getBackground() == Color.red) {
                    System.out.println("hatalı oynadın");
                } else if (Squares.get((TempKontrol(content.get(1)))).getBackground() == Color.green) {
                    System.out.println("hata");
                } else {
                    Squares.get(content.get(1)).setBackground(Color.green);
                    enemytemp6 = content.get(1);
                    Squares.get(36 + content.get(0)).setBackground(null);
                    System.out.println(content.get(1));
                }
            } else if (enemytemp7 == -1 && content.get(0) == 7) {

                if (Squares.get((TempKontrol(content.get(1)))).getBackground() == Color.red) {
                    System.out.println("hatalı oynadın");
                } else if (Squares.get((TempKontrol(content.get(1)))).getBackground() == Color.green) {
                    System.out.println("hata");
                } else {
                    Squares.get(content.get(1)).setBackground(Color.green);
                    enemytemp7 = content.get(1);
                    Squares.get(36 + content.get(0)).setBackground(null);
                    System.out.println(content.get(1));
                }
            } else if (enemytemp4 != -1 && content.get(0) == 4) {

                if (Squares.get((TempKontrol(content.get(1)))).getBackground() == Color.red) {
                    System.out.println("hatalı oynadın");
                } else if (Squares.get((TempKontrol(content.get(1)))).getBackground() == Color.green) {
                    System.out.println("hata");
                } else {
                    Squares.get(enemytemp4).setBackground(null);
                    TempKontrol(content.get(1));
                    enemytemp4 = content.get(1);
                    Squares.get(content.get(1)).setBackground(Color.green);
                    int piyonKontrol = (content.get(2));
                    if (FinishKontrol(piyonKontrol)) {
                        Squares.get(content.get(1)).setBackground(null);
                        if (content.get(0) == 4) {
                            GreenSquare.setBackground(Color.green);
                        }
                    }
                }

            } else if (enemytemp5 != -1 && content.get(0) == 5) {

                if (Squares.get(content.get(1)).getBackground() == Color.red) {
                    System.out.println("hatalı oynadın");
                } else if (Squares.get(content.get(1)).getBackground() == Color.green) {
                    System.out.println("hata");
                } else {
                    Squares.get(enemytemp5).setBackground(null);
                    TempKontrol(content.get(1));
                    enemytemp5 = content.get(1);
                    Squares.get(content.get(1)).setBackground(Color.green);
                    int piyonKontrol = (content.get(2));
                    if (FinishKontrol(piyonKontrol)) {
                        Squares.get(content.get(1)).setBackground(null);
                        if (content.get(0) == 5) {
                            GreenSquare1.setBackground(Color.green);
                        }
                    }
                }

            } else if (enemytemp6 != -1 && content.get(0) == 6) {

                if (Squares.get(content.get(1)).getBackground() == Color.red) {
                    System.out.println("hatalı oynadın");
                } else if (Squares.get(content.get(1)).getBackground() == Color.green) {
                    System.out.println("hata");
                } else {
                    Squares.get(enemytemp6).setBackground(null);
                    TempKontrol(content.get(1));
                    enemytemp6 = content.get(1);
                    Squares.get(content.get(1)).setBackground(Color.green);
                    int piyonKontrol = (content.get(2));
                    if (FinishKontrol(piyonKontrol)) {
                        Squares.get(content.get(1)).setBackground(null);
                        if (content.get(0) == 6) {
                            GreenSquare2.setBackground(Color.green);
                        }
                    }
                }

            } else if (enemytemp7 != -1 && content.get(0) == 7) {

                if (Squares.get(content.get(1)).getBackground() == Color.red) {
                    System.out.println("hatalı oynadın");
                } else if (Squares.get(content.get(1)).getBackground() == Color.green) {
                    System.out.println("hata");
                } else {
                    Squares.get(enemytemp7).setBackground(null);
                    TempKontrol(content.get(1));
                    enemytemp7 = content.get(1);
                    Squares.get(content.get(1)).setBackground(Color.green);
                    int piyonKontrol = (content.get(2));
                    if (FinishKontrol(piyonKontrol)) {
                        Squares.get(content.get(1)).setBackground(null);
                        if (content.get(0) == 7) {
                            GreenSquare3.setBackground(Color.green);
                        }
                    }
                }

            }
        }
    }

    private void Gonder(int n, int temp) {
        // cliente data gonderilir 
        Message msg = new Message(Message.Message_Type.Send);
        ArrayList<Integer> Info = new ArrayList();
        Info.add(n);
        Info.add(temp);
        msg.content = Info;

        Client.Send(msg);
    }

    private void Gonder(int n, int temp, int piyon) {
        // cliente data gonderilir fonksiyon override olmustur.
        Message msg = new Message(Message.Message_Type.Send);
        ArrayList<Integer> Info = new ArrayList();
        Info.add(n);
        Info.add(temp);
        Info.add(piyon);
        msg.content = Info;

        Client.Send(msg);
    }

    private void KontrolYesil(int n) {
        if (Squares.get(n).getBackground() == Color.green) {
            Squares.get(40).setBackground(Color.green);
            girdiMi5 = false;
        }
    }

    private void KontrolKirmizi(int n) {
        if (Squares.get(n).getBackground() == Color.red) {
            Squares.get(44).setBackground(Color.red);
            girdiMi1 = false;
        }
    }

    private void KontrolCiftKirmizi(int n) {
        if (Squares.get(n).getBackground() == Color.red) {
            Squares.get(n + 1).setBackground(Color.red);

        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // side'a gore degisen ve ona gore islemleri gerceklestiren yerdir. 
        // side red ve green olarak bolunur 
        // ardından zar 6 gelene kadar zar atilir 
        // zar 6 gelmeden hic bir piyon kalesinden cikmaz 
        // 6 geldikten sonra piyon cikis yapar ve kontrollerini gerceklestirerek
        // orta da ki kumeye ulasmaya calisir. 
        // temp kontrolleri, arrayList tasmalari burada kontrol edilir. 
        // piyonlara belirlenen sayaclar ile tam turu tamamlayip 
        // tamamlamadigi da burada belirlenir.
        
        int zar = Integer.valueOf(ZarCounter.getText());
        if (side == "red") {

            if (zar == 6) {

                if (jRadioButton1.isSelected() && PiyonSeciliMi == 0 && girdiMi1 == false) {
                    temp = 10;
                    Squares.get(44).setBackground(null);
                    Squares.get(temp).setBackground(Color.red);
                    Squares.get(temp).setText("1");
                    PiyonSeciliMi++;
                    girdiMi1 = true;
                    Gonder(0, temp, piyon1);

                } else if (jRadioButton2.isSelected() && PiyonSeciliMi == 1 && girdiMi2 == false) {
                    temp1 = 10;
                    if (Squares.get(temp1).getBackground() == Color.red) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else if (Squares.get(temp1).getBackground() == Color.green) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else {
                        Squares.get(45).setBackground(null);
                        Squares.get(temp1).setBackground(Color.red);
                        Squares.get(temp1).setText("2");
                        PiyonSeciliMi++;
                        girdiMi2 = true;
                        Gonder(1, temp1, piyon2);
                    }
                } else if (jRadioButton3.isSelected() && PiyonSeciliMi == 2 && girdiMi3 == false) {
                    temp2 = 10;
                    if (Squares.get(temp2).getBackground() == Color.red) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else if (Squares.get(temp2).getBackground() == Color.green) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else {
                        Squares.get(46).setBackground(null);
                        Squares.get(temp2).setBackground(Color.red);
                        Squares.get(temp2).setText("3");
                        PiyonSeciliMi++;
                        girdiMi3 = true;
                        Gonder(2, temp2, piyon3);
                    }
                } else if (jRadioButton4.isSelected() && PiyonSeciliMi == 3 && girdiMi4 == false) {
                    temp3 = 10;
                    if (Squares.get(temp3).getBackground() == Color.red) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else if (Squares.get(temp3).getBackground() == Color.green) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else {

                        Squares.get(47).setBackground(null);
                        Squares.get(temp3).setBackground(Color.red);
                        Squares.get(temp3).setText("4");
                        PiyonSeciliMi++;
                        girdiMi4 = true;
                        Gonder(3, temp3, piyon4);
                    }
                } 
                // ilk kez 6 gelip ardindan bir daha 6 ile oynamak istenilen yer 
                else {
                    if (jRadioButton1.isSelected() && girdiMi1 == true) {
                        if (Squares.get(TempKontrol(temp + zar)).getBackground() == Color.red) {
                            JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                        } else if (Squares.get(TempKontrol(temp + zar)).getBackground() == Color.green) {
                            JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                        } else {
                            Squares.get(temp).setBackground(null);
                            Squares.get(temp).setText(null);
                            piyon1 += zar;
                            temp = temp + zar;
                            temp = TempKontrol(temp);
                            Squares.get(temp).setBackground(Color.red);
                            Squares.get(temp).setText("1");
                            if (FinishKontrol(piyon1)) {
                                Squares.get(temp).setBackground(null);
                                RedSquare1.setBackground(Color.red);
                                Squares.get(temp).setText(null);
                            }
                            Gonder(0, temp, piyon1);
                        }
                    } else if (jRadioButton2.isSelected() && girdiMi2 == true) {
                        if (Squares.get(TempKontrol(temp1 + zar)).getBackground() == Color.red) {
                            JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                        } else if (Squares.get(TempKontrol(temp1 + zar)).getBackground() == Color.green) {
                            JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                        } else {
                            Squares.get(temp1).setBackground(null);
                            Squares.get(temp1).setText(null);
                            piyon2 += zar;
                            temp1 = temp1 + zar;
                            temp1 = TempKontrol(temp1);
                            Squares.get(temp1).setBackground(Color.red);
                            Squares.get(temp1).setText("2");
                            if (FinishKontrol(piyon2)) {
                                Squares.get(temp1).setBackground(null);
                                RedSquare2.setBackground(Color.red);
                                Squares.get(temp1).setText(null);
                            }
                            Gonder(1, temp1, piyon2);
                        }
                    } else if (jRadioButton3.isSelected() && girdiMi3 == true) {
                        if (Squares.get(TempKontrol(temp2 + zar)).getBackground() == Color.red) {
                            JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                        } else if (Squares.get(TempKontrol(temp2 + zar)).getBackground() == Color.green) {
                            JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                        } else {
                            Squares.get(temp2).setBackground(null);
                            Squares.get(temp2).setText(null);
                            piyon3 += zar;
                            temp2 = temp2 + zar;
                            temp2 = TempKontrol(temp2);
                            Squares.get(temp2).setBackground(Color.red);
                            Squares.get(temp2).setText("3");

                            if (FinishKontrol(piyon3)) {
                                Squares.get(temp2).setBackground(null);
                                RedSquare3.setBackground(Color.red);
                                Squares.get(temp2).setText(null);
                            }
                            Gonder(2, temp2, piyon3);
                        }
                    } else if (jRadioButton4.isSelected() && girdiMi4 == true) {
                        if (Squares.get(TempKontrol(temp3 + zar)).getBackground() == Color.red) {
                            JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                        } else if (Squares.get(TempKontrol(temp3 + zar)).getBackground() == Color.green) {
                            JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                        } else {
                            Squares.get(temp3).setBackground(null);
                            Squares.get(temp3).setText(null);
                            piyon4 += zar;
                            temp3 = temp3 + zar;
                            temp3 = TempKontrol(temp3);
                            Squares.get(temp3).setBackground(Color.red);
                            Squares.get(temp3).setText("4");
                            if (FinishKontrol(piyon4)) {
                                Squares.get(temp3).setBackground(null);
                                Squares.get(temp3).setText(null);
                                RedSquare4.setBackground(Color.red);
                            }
                            Gonder(3, temp3, piyon4);
                        }
                    }

                }

            } 
            // 6 dan baska zar gelirse islemin gerceklestigi yer 
            
            else {
                if (jRadioButton1.isSelected() && girdiMi1 == true) {
                    if (Squares.get(TempKontrol(temp + zar)).getBackground() == Color.red) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else if (Squares.get(TempKontrol(temp + zar)).getBackground() == Color.green) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else {
                        Squares.get(temp).setBackground(null);
                        Squares.get(temp).setText(null);
                        piyon1 += zar;
                        temp = temp + zar;
                        temp = TempKontrol(temp);
                        Squares.get(temp).setBackground(Color.red);
                        Squares.get(temp).setText("1");
                        if (FinishKontrol(piyon1)) {
                            Squares.get(temp).setBackground(null);
                            Squares.get(temp).setText(null);
                            RedSquare1.setBackground(Color.red);
                        }

                        Gonder(0, temp, piyon1);
                    }
                } else if (jRadioButton2.isSelected() && girdiMi2 == true) {
                    if (Squares.get(TempKontrol(temp1 + zar)).getBackground() == Color.red) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else if (Squares.get(TempKontrol(temp1 + zar)).getBackground() == Color.green) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else {

                        Squares.get(temp1).setBackground(null);
                        Squares.get(temp1).setText(null);
                        piyon2 += zar;
                        temp1 = temp1 + zar;
                        temp1 = TempKontrol(temp1);
                        Squares.get(temp1).setBackground(Color.red);
                        Squares.get(temp1).setText("2");
                        if (FinishKontrol(piyon2)) {
                            Squares.get(temp1).setBackground(null);
                            RedSquare2.setBackground(Color.red);
                            Squares.get(temp1).setText(null);
                        }
                        Gonder(1, temp1, piyon2);
                    }
                } else if (jRadioButton3.isSelected() && girdiMi3 == true) {
                    if (Squares.get(TempKontrol(temp2 + zar)).getBackground() == Color.red) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else if (Squares.get(TempKontrol(temp2 + zar)).getBackground() == Color.green) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else {
                        Squares.get(temp2).setBackground(null);
                        Squares.get(temp2).setText(null);
                        piyon3 += zar;
                        temp2 = temp2 + zar;
                        temp2 = TempKontrol(temp2);
                        Squares.get(temp2).setBackground(Color.red);
                        Squares.get(temp2).setText("3");
                        if (FinishKontrol(piyon3)) {
                            Squares.get(temp2).setBackground(null);
                            RedSquare3.setBackground(Color.red);
                            Squares.get(temp2).setText(null);
                        }
                        Gonder(2, temp2, piyon3);
                    }
                } else if (jRadioButton4.isSelected() && girdiMi4 == true) {
                    if (Squares.get(TempKontrol(temp3 + zar)).getBackground() == Color.red) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else if (Squares.get(TempKontrol(temp3 + zar)).getBackground() == Color.green) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else {
                        Squares.get(temp3).setBackground(null);
                        Squares.get(temp3).setText(null);
                        piyon4 += zar;
                        temp3 = temp3 + zar;
                        temp3 = TempKontrol(temp3);
                        Squares.get(temp3).setBackground(Color.red);
                        Squares.get(temp3).setText("4");
                        if (FinishKontrol(piyon4)) {
                            Squares.get(temp3).setBackground(null);
                            RedSquare4.setBackground(Color.red);
                            Squares.get(temp3).setText(null);
                        }
                        Gonder(3, temp3, piyon4);
                    }
                }

            }
        } 
        
        else if (side == "green") {
            // YESİL TARAF icin

            if (zar == 6) {

                if (jRadioButton5.isSelected() && YesilPiyonSeciliMi == 0 && girdiMi5 == false) {
                    GreenTemp = 30;
                    Squares.get(40).setBackground(null);
                    Squares.get(GreenTemp).setBackground(Color.green);
                    Squares.get(GreenTemp).setText("1");
                    YesilPiyonSeciliMi++;
                    girdiMi5 = true;
                    Gonder(4, GreenTemp, piyon5);
                } else if (jRadioButton6.isSelected() && YesilPiyonSeciliMi == 1 && girdiMi6 == false) {
                    GreenTemp1 = 30;
                    if (Squares.get(GreenTemp1).getBackground() == Color.red) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else if (Squares.get(GreenTemp1).getBackground() == Color.green) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else {
                        Squares.get(41).setBackground(null);
                        Squares.get(GreenTemp1).setBackground(Color.green);
                        Squares.get(GreenTemp1).setText("2");
                        YesilPiyonSeciliMi++;
                        girdiMi6 = true;
                        Gonder(5, GreenTemp1, piyon6);
                    }

                } else if (jRadioButton7.isSelected() && YesilPiyonSeciliMi == 2 && girdiMi7 == false) {
                    GreenTemp2 = 30;
                    if (Squares.get(GreenTemp2).getBackground() == Color.red) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else if (Squares.get(GreenTemp2).getBackground() == Color.green) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else {

                        Squares.get(42).setBackground(null);
                        Squares.get(GreenTemp2).setBackground(Color.green);
                        Squares.get(GreenTemp2).setText("3");
                        YesilPiyonSeciliMi++;
                        girdiMi7 = true;
                        Gonder(6, GreenTemp2, piyon7);
                    }
                } else if (jRadioButton8.isSelected() && YesilPiyonSeciliMi == 3 && girdiMi8 == false) {
                    if (Squares.get(GreenTemp3).getBackground() == Color.red) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else if (Squares.get(GreenTemp3).getBackground() == Color.green) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else {

                        GreenTemp3 = 30;
                        Squares.get(43).setBackground(null);
                        Squares.get(GreenTemp3).setBackground(Color.green);
                        Squares.get(GreenTemp3).setText("4");
                        YesilPiyonSeciliMi++;
                        girdiMi8 = true;
                        Gonder(7, GreenTemp3, piyon8);
                    }
                } 
                // cikan piyona tekrar 6 geldiyse yapilacak islem 
                else {
                    if (jRadioButton5.isSelected() && girdiMi5 == true) {
                        if (Squares.get(TempKontrol(GreenTemp + zar)).getBackground() == Color.red) {
                            JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                        } else if (Squares.get(TempKontrol(GreenTemp + zar)).getBackground() == Color.green) {
                            JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                        } else {

                            Squares.get(GreenTemp).setBackground(null);
                            Squares.get(GreenTemp).setText(null);
                            piyon5 += zar;
                            GreenTemp = GreenTemp + zar;
                            GreenTemp = TempKontrol(GreenTemp);
                            Squares.get(GreenTemp).setBackground(Color.green);
                            Squares.get(GreenTemp).setText("1");
                            if (FinishKontrol(piyon5)) {
                                Squares.get(GreenTemp).setBackground(null);
                                GreenSquare.setBackground(Color.green);
                                Squares.get(GreenTemp).setText(null);
                            }
                            Gonder(4, GreenTemp, piyon5);
                        }

                    } else if (jRadioButton6.isSelected() && girdiMi6 == true) {

                        if (Squares.get(TempKontrol(GreenTemp1 + zar)).getBackground() == Color.red) {
                            JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                        } else if (Squares.get(TempKontrol(GreenTemp1 + zar)).getBackground() == Color.green) {
                            JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                        } else {

                            Squares.get(GreenTemp1).setBackground(null);
                            Squares.get(GreenTemp1).setText(null);
                            piyon6 += zar;
                            GreenTemp1 = GreenTemp1 + zar;
                            GreenTemp1 = TempKontrol(GreenTemp1);
                            Squares.get(GreenTemp1).setBackground(Color.green);
                            Squares.get(GreenTemp1).setText("2");
                            if (FinishKontrol(piyon6)) {
                                Squares.get(GreenTemp1).setBackground(null);
                                GreenSquare1.setBackground(Color.green);
                                Squares.get(GreenTemp1).setText(null);
                            }
                            Gonder(5, GreenTemp1, piyon6);
                        }

                    } else if (jRadioButton7.isSelected() && girdiMi7 == true) {
                        if (Squares.get(TempKontrol(GreenTemp2 + zar)).getBackground() == Color.red) {
                            JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                        } else if (Squares.get(TempKontrol(GreenTemp2 + zar)).getBackground() == Color.green) {
                            JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                        } else {

                            Squares.get(GreenTemp2).setBackground(null);
                            Squares.get(GreenTemp2).setText(null);
                            piyon7 += zar;
                            GreenTemp2 = GreenTemp2 + zar;
                            GreenTemp2 = TempKontrol(GreenTemp2);
                            Squares.get(GreenTemp2).setBackground(Color.green);
                            Squares.get(GreenTemp2).setText("3");
                            if (FinishKontrol(piyon7)) {
                                Squares.get(GreenTemp2).setBackground(null);
                                GreenSquare2.setBackground(Color.green);
                                Squares.get(GreenTemp2).setText(null);
                            }
                            Gonder(6, GreenTemp2, piyon7);
                        }

                    } else if (jRadioButton8.isSelected() && girdiMi8 == true) {
                        if (Squares.get(TempKontrol(GreenTemp3 + zar)).getBackground() == Color.red) {
                            JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                        } else if (Squares.get(TempKontrol(GreenTemp3 + zar)).getBackground() == Color.green) {
                            JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                        } else {

                            Squares.get(GreenTemp3).setBackground(null);
                            Squares.get(GreenTemp3).setText(null);
                            piyon8 += zar;
                            GreenTemp3 = GreenTemp3 + zar;
                            GreenTemp3 = TempKontrol(GreenTemp3);
                            Squares.get(GreenTemp3).setBackground(Color.green);
                            Squares.get(GreenTemp3).setText("4");
                            if (FinishKontrol(piyon8)) {
                                Squares.get(GreenTemp3).setBackground(null);
                                GreenSquare3.setBackground(Color.green);
                                Squares.get(GreenTemp3).setText(null);
                            }
                            Gonder(7, GreenTemp3, piyon8);
                        }

                    }
                }
            } 
                // zar 6'dan baska gelirse burada gerceklesir.
            else {
                if (jRadioButton5.isSelected() && girdiMi5 == true) {
                    if (Squares.get(TempKontrol(GreenTemp + zar)).getBackground() == Color.red) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else if (Squares.get(TempKontrol(GreenTemp + zar)).getBackground() == Color.green) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else {

                        Squares.get(GreenTemp).setBackground(null);
                        Squares.get(GreenTemp).setText(null);
                        piyon5 += zar;
                        GreenTemp = GreenTemp + zar;
                        GreenTemp = TempKontrol(GreenTemp);
                        Squares.get(GreenTemp).setBackground(Color.green);
                        Squares.get(GreenTemp).setText("1");
                        if (FinishKontrol(piyon5)) {
                            Squares.get(GreenTemp).setBackground(null);
                            GreenSquare.setBackground(Color.green);
                            Squares.get(GreenTemp).setText(null);
                        }

                        Gonder(4, GreenTemp, piyon5);
                    }

                } else if (jRadioButton6.isSelected() && girdiMi6 == true) {
                    if (Squares.get(TempKontrol(GreenTemp1 + zar)).getBackground() == Color.red) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else if (Squares.get(TempKontrol(GreenTemp1 + zar)).getBackground() == Color.green) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else {

                        Squares.get(GreenTemp1).setBackground(null);
                        Squares.get(GreenTemp1).setText(null);
                        piyon6 += zar;
                        GreenTemp1 = GreenTemp1 + zar;
                        GreenTemp1 = TempKontrol(GreenTemp1);
                        Squares.get(GreenTemp1).setBackground(Color.green);
                        Squares.get(GreenTemp1).setText("2");
                        if (FinishKontrol(piyon6)) {
                            Squares.get(GreenTemp1).setBackground(null);
                            GreenSquare1.setBackground(Color.green);
                            Squares.get(GreenTemp1).setText(null);
                        }
                        Gonder(5, GreenTemp1, piyon6);
                    }

                } else if (jRadioButton7.isSelected() && girdiMi7 == true) {
                    if (Squares.get(TempKontrol(GreenTemp2 + zar)).getBackground() == Color.red) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else if (Squares.get(TempKontrol(GreenTemp2 + zar)).getBackground() == Color.green) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else {

                        Squares.get(GreenTemp2).setBackground(null);
                        Squares.get(GreenTemp2).setText(null);
                        piyon7 += zar;
                        GreenTemp2 = GreenTemp2 + zar;
                        GreenTemp2 = TempKontrol(GreenTemp2);
                        Squares.get(GreenTemp2).setBackground(Color.green);
                        Squares.get(GreenTemp2).setText("3");
                        if (FinishKontrol(piyon7)) {
                            Squares.get(GreenTemp2).setBackground(null);
                            GreenSquare2.setBackground(Color.green);
                            Squares.get(GreenTemp2).setText(null);
                        }
                        Gonder(6, GreenTemp2, piyon7);
                    }

                } else if (jRadioButton8.isSelected() && girdiMi8 == true) {
                    if (Squares.get(TempKontrol(GreenTemp3 + zar)).getBackground() == Color.red) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else if (Squares.get(TempKontrol(GreenTemp3 + zar)).getBackground() == Color.green) {
                        JOptionPane.showMessageDialog(game, "Piyon Piyonun üstüne gelemez başka bir piyon dene!");
                    } else {

                        Squares.get(GreenTemp3).setBackground(null);
                        Squares.get(GreenTemp3).setText(null);
                        piyon8 += zar;
                        GreenTemp3 = GreenTemp3 + zar;
                        GreenTemp3 = TempKontrol(GreenTemp3);
                        Squares.get(GreenTemp3).setBackground(Color.green);
                        Squares.get(GreenTemp3).setText("4");
                        if (FinishKontrol(piyon8)) {
                            Squares.get(GreenTemp3).setBackground(null);
                            GreenSquare3.setBackground(Color.green);
                            Squares.get(GreenTemp3).setText(null);
                        }
                        Gonder(7, GreenTemp3, piyon8);
                    }

                }

            }
        }
        //client'a side tipinde bir mesaj gonderilir. 
        Message msg1 = new Message(Message.Message_Type.Side);
        msg1.content = side;
        jLabelSide.setText(side);
        Client.Send(msg1);

        jButton2.setEnabled(false);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                NewJFrame.game.Slider.start();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GreenPiyon1;
    private javax.swing.JLabel GreenPiyon2;
    private javax.swing.JLabel GreenPiyon3;
    private javax.swing.JLabel GreenPiyon4;
    private javax.swing.JLabel GreenSquare;
    private javax.swing.JLabel GreenSquare1;
    private javax.swing.JLabel GreenSquare2;
    private javax.swing.JLabel GreenSquare3;
    private javax.swing.JLabel RedPiyon1;
    private javax.swing.JLabel RedPiyon2;
    private javax.swing.JLabel RedPiyon3;
    private javax.swing.JLabel RedPiyon4;
    public static javax.swing.JLabel RedSquare1;
    private javax.swing.JLabel RedSquare2;
    private javax.swing.JLabel RedSquare3;
    private javax.swing.JLabel RedSquare4;
    private javax.swing.JLabel Square1;
    private javax.swing.JLabel Square10;
    private javax.swing.JLabel Square11;
    private javax.swing.JLabel Square12;
    private javax.swing.JLabel Square13;
    private javax.swing.JLabel Square14;
    private javax.swing.JLabel Square15;
    private javax.swing.JLabel Square16;
    private javax.swing.JLabel Square17;
    private javax.swing.JLabel Square18;
    private javax.swing.JLabel Square19;
    private javax.swing.JLabel Square2;
    private javax.swing.JLabel Square20;
    private javax.swing.JLabel Square21;
    private javax.swing.JLabel Square22;
    private javax.swing.JLabel Square23;
    private javax.swing.JLabel Square24;
    private javax.swing.JLabel Square25;
    private javax.swing.JLabel Square26;
    private javax.swing.JLabel Square27;
    private javax.swing.JLabel Square28;
    private javax.swing.JLabel Square29;
    private javax.swing.JLabel Square3;
    private javax.swing.JLabel Square30;
    private javax.swing.JLabel Square31;
    private javax.swing.JLabel Square32;
    private javax.swing.JLabel Square33;
    private javax.swing.JLabel Square34;
    private javax.swing.JLabel Square35;
    private javax.swing.JLabel Square36;
    private javax.swing.JLabel Square37;
    private javax.swing.JLabel Square38;
    private javax.swing.JLabel Square39;
    private javax.swing.JLabel Square4;
    private javax.swing.JLabel Square40;
    private javax.swing.JLabel Square5;
    private javax.swing.JLabel Square6;
    private javax.swing.JLabel Square7;
    private javax.swing.JLabel Square8;
    private javax.swing.JLabel Square9;
    public javax.swing.JLabel ZarCounter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabelSide;
    public javax.swing.JLabel jLabelSira;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    public javax.swing.JButton zar;
    // End of variables declaration//GEN-END:variables
}
