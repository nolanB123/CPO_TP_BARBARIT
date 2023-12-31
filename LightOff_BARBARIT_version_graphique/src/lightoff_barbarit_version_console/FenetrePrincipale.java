/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_barbarit_version_console;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


/**
 *
 * @author Utilisateur
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form FenetrePrincipale
     */
    GrilleDeJeu grille;
    int nbCoups;
    int i;

    public FenetrePrincipale() {
        initComponents();
        int nbLignes = 10;
        int nbColonnes = 10;
        this.grille = new GrilleDeJeu(nbLignes, nbColonnes);
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbLignes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 40, 40);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }
        PanneauBoutonVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(PanneauBoutonVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 1 * 36, nbLignes * 36));
        this.pack();
        this.revalidate();
        // cr�ation du panneau de boutons verticaux (pour les lignes)
        for (i = 0; i < nbLignes; i++) {
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    if (grille.cellulesToutesEteintes()){
            FenetreVictoire f = new FenetreVictoire() ;
            f.setVisible(true) ;
        }
                    repaint();
                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonVerticaux.add(bouton_ligne);

        }

        PanneauBoutonHorizontaux.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, nbColonnes * 36, 1 * 36));
        this.pack();
        this.revalidate();

        // cr�ation du panneau de boutons verticaux (pour les lignes)
        for (i = 0; i < nbColonnes; i++) {
            JButton bouton_colonne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int k = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(k);
                    if (grille.cellulesToutesEteintes()){
            FenetreVictoire f = new FenetreVictoire() ;
            f.setVisible(true) ;
        }
                    repaint();
                }
            };
            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonHorizontaux.add(bouton_colonne);

        }

        initialiserPartie();
        
    }

    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(10);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonVerticaux = new javax.swing.JPanel();
        PanneauBoutonHorizontaux = new javax.swing.JPanel();
        BoutonDiagoDescendante = new javax.swing.JButton();
        BoutonDiagoMontante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(204, 0, 0));
        PanneauGrille.setLayout(new java.awt.GridLayout(10, 10));
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 360, 360));

        PanneauBoutonVerticaux.setBackground(new java.awt.Color(0, 153, 0));
        getContentPane().add(PanneauBoutonVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 80, 360));

        PanneauBoutonHorizontaux.setBackground(new java.awt.Color(0, 153, 0));
        getContentPane().add(PanneauBoutonHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 360, 80));

        BoutonDiagoDescendante.setBackground(java.awt.Color.lightGray);
        BoutonDiagoDescendante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonDiagoDescendanteActionPerformed(evt);
            }
        });
        getContentPane().add(BoutonDiagoDescendante, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 44, 36, 36));

        BoutonDiagoMontante.setBackground(java.awt.Color.lightGray);
        BoutonDiagoMontante.setForeground(new java.awt.Color(0, 153, 0));
        BoutonDiagoMontante.setText(" ");
        BoutonDiagoMontante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonDiagoMontanteActionPerformed(evt);
            }
        });
        getContentPane().add(BoutonDiagoMontante, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 44, 36, 36));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonDiagoDescendanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonDiagoDescendanteActionPerformed
        this.grille.activerDiagonaleDescendante();
        if (this.grille.cellulesToutesEteintes()){
            FenetreVictoire f = new FenetreVictoire() ;
            f.setVisible(true) ;
        }
        repaint();

    }//GEN-LAST:event_BoutonDiagoDescendanteActionPerformed

    private void BoutonDiagoMontanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonDiagoMontanteActionPerformed
        this.grille.activerDiagonaleMontante();
        if (this.grille.cellulesToutesEteintes()){
            FenetreVictoire f = new FenetreVictoire() ;
            f.setVisible(true) ;
        }
        repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_BoutonDiagoMontanteActionPerformed


    
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
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonDiagoDescendante;
    private javax.swing.JButton BoutonDiagoMontante;
    private javax.swing.JPanel PanneauBoutonHorizontaux;
    private javax.swing.JPanel PanneauBoutonVerticaux;
    private javax.swing.JPanel PanneauGrille;
    // End of variables declaration//GEN-END:variables
}
