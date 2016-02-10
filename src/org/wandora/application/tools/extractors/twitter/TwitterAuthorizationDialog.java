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
 */

package org.wandora.application.tools.extractors.twitter;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JDialog;
import org.wandora.application.Wandora;
import org.wandora.application.gui.UIBox;
import org.wandora.application.gui.simple.SimpleButton;
import org.wandora.application.gui.simple.SimpleField;
import org.wandora.application.gui.simple.SimpleLabel;
import org.wandora.utils.ClipboardBox;

/**
 *
 * @author akivela
 */


public class TwitterAuthorizationDialog extends javax.swing.JPanel {

    private boolean wasAccepted = false;
    private JDialog dialog = null;
    
    
    /**
     * Creates new form TwitterAuthorizationDialog
     */
    public TwitterAuthorizationDialog() {
        initComponents();
    }
    
    
    
    public boolean wasAccepted() {
        return wasAccepted;
    }
    
    
    public void setAuthorizationURL(String url) {
        authorizationURLTextField.setText(url);
    }
    
    public String getPin() {
        return this.pinTextField.getText();
    }

    public void open(String authorizationURL) {
        wasAccepted = false;
        Wandora w = Wandora.getWandora();
        dialog = new JDialog(w, true);
        setAuthorizationURL(authorizationURL);
        dialog.add(this);
        dialog.setSize(800, 280);
        dialog.setTitle("Twitter authorization");
        UIBox.centerWindow(dialog, w);
        dialog.setVisible(true);

        // BLOCKS UNTIL FINISHED!
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        labelLabel = new SimpleLabel();
        authorizationURLPanel = new javax.swing.JPanel();
        authorizationURLLabel = new SimpleLabel();
        authorizationURLTextField = new SimpleField();
        copyButton = new SimpleButton();
        forkButton = new SimpleButton();
        pinPanel = new javax.swing.JPanel();
        pinLabel = new SimpleLabel();
        pinTextField = new SimpleField();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        authenticateButton = new SimpleButton();
        cancelButton = new SimpleButton();

        setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        labelLabel.setText("<html>Twitter extractor uses Twitter API 1.1 and requires user authorization. Authorization has following steps: <ul>\n<li>Copy the authorization URL to your web browser.\n<li>Sign in Twitter. Twitter gives you a PIN code.\n<li>Write the PIN code into the text field below.\n<li>Press Authorize button.</ul>\n</html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 0);
        jPanel1.add(labelLabel, gridBagConstraints);

        authorizationURLPanel.setLayout(new java.awt.GridBagLayout());

        authorizationURLLabel.setText("Authorization URL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 4);
        authorizationURLPanel.add(authorizationURLLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 4);
        authorizationURLPanel.add(authorizationURLTextField, gridBagConstraints);

        copyButton.setText("copy");
        copyButton.setMargin(new java.awt.Insets(2, 6, 2, 6));
        copyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 4);
        authorizationURLPanel.add(copyButton, gridBagConstraints);

        forkButton.setText("open");
        forkButton.setMargin(new java.awt.Insets(2, 6, 2, 6));
        forkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forkButtonActionPerformed(evt);
            }
        });
        authorizationURLPanel.add(forkButton, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 0);
        jPanel1.add(authorizationURLPanel, gridBagConstraints);

        pinPanel.setLayout(new java.awt.GridBagLayout());

        pinLabel.setText("PIN code");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 4);
        pinPanel.add(pinLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        pinPanel.add(pinTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        pinPanel.add(jPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 0);
        jPanel1.add(pinPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(jPanel3, gridBagConstraints);

        authenticateButton.setText("Authorize");
        authenticateButton.setToolTipText("");
        authenticateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authenticateButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 4);
        jPanel2.add(authenticateButton, gridBagConstraints);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel2.add(cancelButton, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(jPanel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtonActionPerformed
        String u = authorizationURLTextField.getText();
        ClipboardBox.setClipboard(u);
    }//GEN-LAST:event_copyButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        if(dialog != null) {
            dialog.setVisible(false);
        }
        wasAccepted = false;
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void authenticateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authenticateButtonActionPerformed
        if(dialog != null) {
            dialog.setVisible(false);
        }
        wasAccepted = true;
    }//GEN-LAST:event_authenticateButtonActionPerformed

    private void forkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forkButtonActionPerformed
        String u = authorizationURLTextField.getText();
        Desktop dt = Desktop.getDesktop();
        try {
            dt.browse(new URI(u));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_forkButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authenticateButton;
    private javax.swing.JLabel authorizationURLLabel;
    private javax.swing.JPanel authorizationURLPanel;
    private javax.swing.JTextField authorizationURLTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton copyButton;
    private javax.swing.JButton forkButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelLabel;
    private javax.swing.JLabel pinLabel;
    private javax.swing.JPanel pinPanel;
    private javax.swing.JTextField pinTextField;
    // End of variables declaration//GEN-END:variables
}
