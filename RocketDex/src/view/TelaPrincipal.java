/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.CardLayout;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("rocketicon.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        PainelMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ButtonQuit = new javax.swing.JButton();
        ButtonMoves = new javax.swing.JButton();
        ButtonPokedex = new javax.swing.JButton();
        ButtonSearch = new javax.swing.JButton();
        PainelMoves1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaMoves = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        ButtonBackMoves1 = new javax.swing.JButton();
        PainelPokedex1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        ButtonBackPokedex1 = new javax.swing.JButton();
        PainelSearch1 = new javax.swing.JPanel();
        InsereCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ButtonBackSearch1 = new javax.swing.JButton();
        ButtonSearch1 = new javax.swing.JButton();
        PainelSearch2 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        code = new javax.swing.JLabel();
        hp = new javax.swing.JLabel();
        attack = new javax.swing.JLabel();
        defense = new javax.swing.JLabel();
        spattack = new javax.swing.JLabel();
        spdef = new javax.swing.JLabel();
        speed = new javax.swing.JLabel();
        type1 = new javax.swing.JLabel();
        type2 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ButtonBackSearch2 = new javax.swing.JButton();
        ButtonSearchMoves = new javax.swing.JButton();
        PainelSearchMoves = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ButtonBackSearchMoves = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pokémon RocketDex!");
        setResizable(false);

        PainelPrincipal.setLayout(new java.awt.CardLayout());

        PainelMenu.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background2.PNG"))); // NOI18N
        PainelMenu.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 600);

        ButtonQuit.setText("jButton2");
        ButtonQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonQuitActionPerformed(evt);
            }
        });
        PainelMenu.add(ButtonQuit);
        ButtonQuit.setBounds(683, 240, 50, 60);

        ButtonMoves.setText("jButton1");
        ButtonMoves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMovesActionPerformed(evt);
            }
        });
        PainelMenu.add(ButtonMoves);
        ButtonMoves.setBounds(190, 280, 170, 50);

        ButtonPokedex.setText("jButton1");
        ButtonPokedex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPokedexActionPerformed(evt);
            }
        });
        PainelMenu.add(ButtonPokedex);
        ButtonPokedex.setBounds(400, 210, 160, 50);

        ButtonSearch.setText("jButton1");
        ButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSearchActionPerformed(evt);
            }
        });
        PainelMenu.add(ButtonSearch);
        ButtonSearch.setBounds(190, 210, 170, 50);

        PainelPrincipal.add(PainelMenu, "PainelMenu");

        PainelMoves1.setLayout(null);

        tabelaMoves.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type", "Power", "Accuracy ", "Class"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaMoves);

        PainelMoves1.add(jScrollPane2);
        jScrollPane2.setBounds(60, 192, 610, 400);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackGround3.PNG"))); // NOI18N
        PainelMoves1.add(jLabel4);
        jLabel4.setBounds(0, 0, 800, 600);

        ButtonBackMoves1.setText("jButton1");
        ButtonBackMoves1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackMoves1ActionPerformed(evt);
            }
        });
        PainelMoves1.add(ButtonBackMoves1);
        ButtonBackMoves1.setBounds(680, 490, 110, 100);

        PainelPrincipal.add(PainelMoves1, "PainelMoves1");

        PainelPokedex1.setLayout(null);

        tabela.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setToolTipText("");
        jScrollPane1.setViewportView(tabela);

        PainelPokedex1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 210, 530, 380);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background4.PNG"))); // NOI18N
        PainelPokedex1.add(jLabel3);
        jLabel3.setBounds(0, 0, 800, 600);

        ButtonBackPokedex1.setText("jButton1");
        ButtonBackPokedex1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackPokedex1ActionPerformed(evt);
            }
        });
        PainelPokedex1.add(ButtonBackPokedex1);
        ButtonBackPokedex1.setBounds(680, 490, 110, 100);

        PainelPrincipal.add(PainelPokedex1, "PainelPokedex1");

        PainelSearch1.setLayout(null);
        PainelSearch1.add(InsereCodigo);
        InsereCodigo.setBounds(80, 350, 210, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background5.PNG"))); // NOI18N
        PainelSearch1.add(jLabel5);
        jLabel5.setBounds(0, 0, 800, 600);

        ButtonBackSearch1.setText("jButton1");
        ButtonBackSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackSearch1ActionPerformed(evt);
            }
        });
        PainelSearch1.add(ButtonBackSearch1);
        ButtonBackSearch1.setBounds(670, 490, 120, 100);

        ButtonSearch1.setText("jButton1");
        ButtonSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSearch1ActionPerformed(evt);
            }
        });
        PainelSearch1.add(ButtonSearch1);
        ButtonSearch1.setBounds(420, 300, 200, 210);

        PainelPrincipal.add(PainelSearch1, "PainelSearch1");

        PainelSearch2.setLayout(null);

        name.setText("jLabel1");
        PainelSearch2.add(name);
        name.setBounds(154, 174, 250, 20);

        code.setText("jLabel1");
        PainelSearch2.add(code);
        code.setBounds(40, 170, 34, 20);

        hp.setText("jLabel1");
        PainelSearch2.add(hp);
        hp.setBounds(590, 270, 34, 14);

        attack.setText("jLabel1");
        PainelSearch2.add(attack);
        attack.setBounds(590, 310, 34, 14);

        defense.setText("jLabel1");
        PainelSearch2.add(defense);
        defense.setBounds(590, 360, 34, 14);

        spattack.setText("jLabel1");
        PainelSearch2.add(spattack);
        spattack.setBounds(590, 410, 34, 14);

        spdef.setText("jLabel1");
        PainelSearch2.add(spdef);
        spdef.setBounds(590, 460, 34, 14);

        speed.setText("jLabel1");
        PainelSearch2.add(speed);
        speed.setBounds(590, 510, 34, 14);

        type1.setText("jLabel1");
        PainelSearch2.add(type1);
        type1.setBounds(70, 524, 110, 20);

        type2.setText("jLabel1");
        PainelSearch2.add(type2);
        type2.setBounds(240, 524, 100, 20);

        total.setText("jLabel1");
        PainelSearch2.add(total);
        total.setBounds(710, 390, 34, 14);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background6.PNG"))); // NOI18N
        PainelSearch2.add(jLabel6);
        jLabel6.setBounds(0, 0, 800, 600);

        ButtonBackSearch2.setText("jButton1");
        ButtonBackSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackSearch2ActionPerformed(evt);
            }
        });
        PainelSearch2.add(ButtonBackSearch2);
        ButtonBackSearch2.setBounds(670, 500, 120, 90);

        ButtonSearchMoves.setText("jButton1");
        ButtonSearchMoves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSearchMovesActionPerformed(evt);
            }
        });
        PainelSearch2.add(ButtonSearchMoves);
        ButtonSearchMoves.setBounds(670, 180, 110, 120);

        PainelPrincipal.add(PainelSearch2, "PainelSearch2");

        PainelSearchMoves.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background7.PNG"))); // NOI18N
        PainelSearchMoves.add(jLabel8);
        jLabel8.setBounds(0, 0, 800, 600);

        ButtonBackSearchMoves.setText("jButton1");
        ButtonBackSearchMoves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackSearchMovesActionPerformed(evt);
            }
        });
        PainelSearchMoves.add(ButtonBackSearchMoves);
        ButtonBackSearchMoves.setBounds(680, 490, 110, 100);

        PainelPrincipal.add(PainelSearchMoves, "PainelSearchMoves");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(800, 625));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonQuitActionPerformed
        this.setVisible(false);
        new TelaQuit().setVisible(true);
    }//GEN-LAST:event_ButtonQuitActionPerformed

    private void ButtonBackMoves1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackMoves1ActionPerformed
        CardLayout card = (CardLayout) PainelPrincipal.getLayout();
        card.show(PainelPrincipal, "PainelMenu");
    }//GEN-LAST:event_ButtonBackMoves1ActionPerformed

    private void ButtonMovesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMovesActionPerformed
        CardLayout card = (CardLayout) PainelPrincipal.getLayout();
        try {

            Move move = new Move();
            
            RandomAccessFile raf = new RandomAccessFile("moves.bin", "rw");
            
            DefaultTableModel modelMove = (DefaultTableModel) tabelaMoves.getModel();

            for (int n = 0; n < 621; n++) {
                
                move.name = raf.readLine().toUpperCase();
                move.code = raf.readInt();
                move.type = raf.readInt();
                move.accuracy = raf.readInt();
                move.priority= raf.readInt();
                move.target = raf.readInt();
                move.damClass = raf.readInt();
                move.effect = raf.readInt();
                move.effectAcc = raf.readInt();              
                String tipo = new String();
                tipo = tipificador(move.type, tipo);
                //escreve coisa na tabel
                Vector pk = new Vector();
//                String[] name = new String[2];
//                name[1]=" ";
//                name = move.name.split("-",2);
//                
//                if(!name[1].equals(" ")){
//                    name[0].concat(" ");
//                    name[0].concat(name[1]);
//                }
                
                pk.add(move.name);
                pk.add(tipo);
                pk.add(move.power);
                pk.add(move.accuracy);
                pk.add(move.damClass);
               
                modelMove.addRow(pk);
            }
            raf.close();
            
            card.show(PainelPrincipal, "PainelPokedex1");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        card.show(PainelPrincipal, "PainelMoves1");
    }//GEN-LAST:event_ButtonMovesActionPerformed

    private void ButtonBackPokedex1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackPokedex1ActionPerformed
        CardLayout card = (CardLayout) PainelPrincipal.getLayout();
        card.show(PainelPrincipal, "PainelMenu");
    }//GEN-LAST:event_ButtonBackPokedex1ActionPerformed

    private void ButtonPokedexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPokedexActionPerformed
        try {
            CardLayout card = (CardLayout) PainelPrincipal.getLayout();
            Pokemon poke = new Pokemon();
            long offset;
            RandomAccessFile raf = new RandomAccessFile("rocketdex.bin", "rw");
            Btree arvi = new Btree("arvore.bin", 25);
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();

            for (int n = 0; n < 720; n++) {
                offset = arvi.pesquisa(n);
                poke.name = raf.readLine().toUpperCase();
                poke.code = raf.readInt();
                for (int j = 0; j < 6; j++) {
                    poke.stats[j] = raf.readInt();
                }
                for (int i = 0; i < 190; i++) {
                    poke.moves[i] = raf.readInt();
                }
                poke.type[0] = raf.readInt();
                poke.type[1] = raf.readInt();
                String tipo1 = new String();
                String tipo2 = new String();
                tipo1 = tipificador(poke.type[0], tipo1);
                tipo2 = tipificador(poke.type[1], tipo2);

                if (!tipo2.equals("")) {
                    tipo1 = tipo1.concat(" & ");
                    tipo1 = tipo1.concat(tipo2);
                }

                //escreve coisa na tabel
                Vector pk = new Vector();
                pk.add(poke.code);
                pk.add(poke.name);
                pk.add(tipo1);
                model.addRow(pk);
            }
            raf.close();
            arvi.close();
            card.show(PainelPrincipal, "PainelPokedex1");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonPokedexActionPerformed

    private String tipificador(int tipo, String destino) {
        switch (tipo) {
            case 1:
                destino = "Normal";
                break;
            case 2:
                destino = "Fighting";
                break;
            case 3:
                destino = "Flying";
                break;
            case 4:
                destino = "Poison";
                break;
            case 5:
                destino = "Ground";
                break;
            case 6:
                destino = "Rock";
                break;
            case 7:
                destino = "Bug";
                break;
            case 8:
                destino = "Ghost";
                break;
            case 9:
                destino = "Steel";
                break;
            case 10:
                destino = "Fire";
                break;
            case 11:
                destino = "Water";
                break;
            case 12:
                destino = "Grass";
                break;
            case 13:
                destino = "Eletric";
                break;
            case 14:
                destino = "Psychic";
                break;
            case 15:
                destino = "Ice";
                break;
            case 16:
                destino = "Dragon";
                break;
            case 17:
                destino = "Dark";
                break;
            case 18:
                destino = "Fairy";
                break;
            case -1:
                destino = "";
                break;
        }
        return destino;
    }
    private void ButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSearchActionPerformed
        CardLayout card = (CardLayout) PainelPrincipal.getLayout();
        card.show(PainelPrincipal, "PainelSearch1");
    }//GEN-LAST:event_ButtonSearchActionPerformed
    Pokemon pkm;
    private void ButtonBackSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackSearch1ActionPerformed
        CardLayout card = (CardLayout) PainelPrincipal.getLayout();
        card.show(PainelPrincipal, "PainelMenu");
    }//GEN-LAST:event_ButtonBackSearch1ActionPerformed

    private void ButtonBackSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackSearch2ActionPerformed
        CardLayout card = (CardLayout) PainelPrincipal.getLayout();
        card.show(PainelPrincipal, "PainelSearch1");
    }//GEN-LAST:event_ButtonBackSearch2ActionPerformed

    private void ButtonSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSearch1ActionPerformed
        //int pokecode = Integer.parseInt(InsereCodigo.getText());
        String coisa = InsereCodigo.getText();
        if (coisa.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira um valor");
        } else {
            int pokecode = Integer.parseInt(coisa);
            if (pokecode < 1 || pokecode > 720) {
                JOptionPane.showMessageDialog(null, "Pokemon nao encontrado");
            } else {
                try {
                    Btree arvi = new Btree("arvore.bin", 25);
                    long off = arvi.pesquisa(pokecode);
                    arvi.close();
                    RandomAccessFile raf = new RandomAccessFile("rocketdex.bin", "rw");
                    raf.seek(off);
                    pkm = new Pokemon();
                    pkm.name = raf.readLine().toUpperCase();
                    pkm.code = raf.readInt();
                    for (int j = 0; j < 6; j++) {
                        pkm.stats[j] = raf.readInt();
                    }
                    for (int i = 0; i < 190; i++) {
                        pkm.moves[i] = raf.readInt();
                    }
                    String tipo = new String();
                    pkm.type[0] = raf.readInt();
                    pkm.type[1] = raf.readInt();
                    raf.close();
                    name.setText(pkm.name);
                    code.setText(String.valueOf(pkm.code));
                    type1.setText(tipificador(pkm.type[0], tipo));
                    type2.setText(tipificador(pkm.type[1], tipo));
                    hp.setText(String.valueOf(pkm.stats[0]));
                    attack.setText(String.valueOf(pkm.stats[1]));
                    defense.setText(String.valueOf(pkm.stats[2]));
                    spattack.setText(String.valueOf(pkm.stats[3]));
                    spdef.setText(String.valueOf(pkm.stats[4]));
                    speed.setText(String.valueOf(pkm.stats[5]));
                    total.setText(String.valueOf(pkm.stats[0] + pkm.stats[1] + pkm.stats[2] + pkm.stats[3] + pkm.stats[4] + pkm.stats[5]));

                } catch (FileNotFoundException ex) {
                    System.out.println("Erro ao abrir arquivo de dados");
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    System.out.println("Erro de IO");
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        /* if (pokecode < 1 || pokecode > 720) {
            JOptionPane.showMessageDialog(null, "Pokemon não encontrado");
        } else {*/
        CardLayout card = (CardLayout) PainelPrincipal.getLayout();
        card.show(PainelPrincipal, "PainelSearch2");
        //}
    }//GEN-LAST:event_ButtonSearch1ActionPerformed

    private void ButtonBackSearchMovesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackSearchMovesActionPerformed
        CardLayout card = (CardLayout) PainelPrincipal.getLayout();
        card.show(PainelPrincipal, "PainelSearch2");
    }//GEN-LAST:event_ButtonBackSearchMovesActionPerformed

    private void ButtonSearchMovesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSearchMovesActionPerformed
        CardLayout card = (CardLayout) PainelPrincipal.getLayout();
        card.show(PainelPrincipal, "PainelSearchMoves");
    }//GEN-LAST:event_ButtonSearchMovesActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBackMoves1;
    private javax.swing.JButton ButtonBackPokedex1;
    private javax.swing.JButton ButtonBackSearch1;
    private javax.swing.JButton ButtonBackSearch2;
    private javax.swing.JButton ButtonBackSearchMoves;
    private javax.swing.JButton ButtonMoves;
    private javax.swing.JButton ButtonPokedex;
    private javax.swing.JButton ButtonQuit;
    private javax.swing.JButton ButtonSearch;
    private javax.swing.JButton ButtonSearch1;
    private javax.swing.JButton ButtonSearchMoves;
    private javax.swing.JTextField InsereCodigo;
    private javax.swing.JPanel PainelMenu;
    private javax.swing.JPanel PainelMoves1;
    private javax.swing.JPanel PainelPokedex1;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JPanel PainelSearch1;
    private javax.swing.JPanel PainelSearch2;
    private javax.swing.JPanel PainelSearchMoves;
    private javax.swing.JLabel attack;
    private javax.swing.JLabel code;
    private javax.swing.JLabel defense;
    private javax.swing.JLabel hp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel spattack;
    private javax.swing.JLabel spdef;
    private javax.swing.JLabel speed;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tabelaMoves;
    private javax.swing.JLabel total;
    private javax.swing.JLabel type1;
    private javax.swing.JLabel type2;
    // End of variables declaration//GEN-END:variables
}
