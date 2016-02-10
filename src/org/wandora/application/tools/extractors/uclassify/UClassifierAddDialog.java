/*
 * WANDORA
 * Knowledge Extraction, Management, and Publishing Application
 * http://wandora.org
 * 
 * Copyright (C) 2004-2015 Wandora Team
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * 
 * UClassifierAddDialog.java
 *
 * Created on 20.7.2011, 14:48:46
 */

package org.wandora.application.tools.extractors.uclassify;

import org.wandora.application.Wandora;
import org.wandora.application.gui.simple.SimpleButton;
import org.wandora.application.gui.simple.SimpleField;
import org.wandora.application.gui.simple.SimpleLabel;

/**
 *
 * @author akivela
 */


public class UClassifierAddDialog extends javax.swing.JDialog {

    private boolean isAccepted = false;
    
    
    
    /** Creates new form UClassifierAddDialog */
    public UClassifierAddDialog(Wandora w) {
        super(w, true);
        setTitle("Add uClassifier");
        initComponents();
    }

    
    public boolean wasAccepted() {
        return isAccepted;
    }
    
    
    public String getName() {
        return uClassifierNameTextField.getText();
    }
    public String getAuthor() {
        return uClassifierAuthorTextField.getText();
    }
    
    
    
    // -------------------------------------------------------------------------
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        formPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        uClassifierNameLabel = new SimpleLabel();
        uClassifierNameTextField = new SimpleField();
        uClassifierAuthorLabel = new SimpleLabel();
        uClassifierAuthorTextField = new SimpleField();
        buttonPanel = new javax.swing.JPanel();
        buttonFillerPanel = new javax.swing.JPanel();
        createButton = new SimpleButton();
        cancelButton = new SimpleButton();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        formPanel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("<html>Add new classifier to Wandora's uClassify extractor. You can browse public classifiers at http://www.uclassify.com/browse .</html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 0);
        formPanel.add(jLabel1, gridBagConstraints);

        uClassifierNameLabel.setText("uClassifier name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 4);
        formPanel.add(uClassifierNameLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        formPanel.add(uClassifierNameTextField, gridBagConstraints);

        uClassifierAuthorLabel.setText("uClassifier author");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 4);
        formPanel.add(uClassifierAuthorLabel, gridBagConstraints);

        uClassifierAuthorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uClassifierAuthorTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        formPanel.add(uClassifierAuthorTextField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 0, 4);
        getContentPane().add(formPanel, gridBagConstraints);

        buttonPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        buttonPanel.add(buttonFillerPanel, gridBagConstraints);

        createButton.setText("Add");
        createButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        createButton.setPreferredSize(new java.awt.Dimension(70, 23));
        createButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                createButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 4);
        buttonPanel.add(createButton, gridBagConstraints);

        cancelButton.setText("Cancel");
        cancelButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        cancelButton.setPreferredSize(new java.awt.Dimension(70, 23));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelButtonMouseReleased(evt);
            }
        });
        buttonPanel.add(cancelButton, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(buttonPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseReleased
        isAccepted = false;
        setVisible(false);
    }//GEN-LAST:event_cancelButtonMouseReleased

    private void createButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createButtonMouseReleased
        isAccepted = true;
        setVisible(false);
    }//GEN-LAST:event_createButtonMouseReleased

    private void uClassifierAuthorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uClassifierAuthorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uClassifierAuthorTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonFillerPanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton createButton;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel uClassifierAuthorLabel;
    private javax.swing.JTextField uClassifierAuthorTextField;
    private javax.swing.JLabel uClassifierNameLabel;
    private javax.swing.JTextField uClassifierNameTextField;
    // End of variables declaration//GEN-END:variables
}
