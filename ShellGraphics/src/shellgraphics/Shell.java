/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package shellgraphics;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class Shell extends javax.swing.JFrame {

    ArrayList<Integer> arreglo = new ArrayList<>();
//    String texto = "";
    int intercambio;
    int comparacion;
    
    public Shell() {
        initComponents();
        setSize(466,589);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        txtAceptar = new javax.swing.JTextField();
        btnEjecutar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        intercambios = new javax.swing.JLabel();
        comparaciones = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextPane();
        reset = new javax.swing.JButton();
        data = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 198, 113));

        btnAceptar.setBackground(new java.awt.Color(255, 243, 84));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptar.setFocusPainted(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        txtAceptar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtAceptar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnEjecutar.setBackground(new java.awt.Color(255, 243, 84));
        btnEjecutar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEjecutar.setFocusPainted(false);
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 198, 113));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(12, 42, 139));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Shell");
        jLabel1.setOpaque(true);

        intercambios.setBackground(new java.awt.Color(255, 198, 113));
        intercambios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        intercambios.setText("Intercambios: ");
        intercambios.setOpaque(true);

        comparaciones.setBackground(new java.awt.Color(255, 198, 113));
        comparaciones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comparaciones.setText("Compraciones: ");
        comparaciones.setOpaque(true);

        btnInfo.setBackground(new java.awt.Color(255, 243, 84));
        btnInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInfo.setText("Información");
        btnInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInfo.setFocusPainted(false);
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txtArea);

        reset.setBackground(new java.awt.Color(255, 243, 84));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reset.setText("Reset");
        reset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reset.setFocusPainted(false);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        data.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        data.setForeground(new java.awt.Color(255, 255, 255));
        data.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        data.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(intercambios, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEjecutar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comparaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comparaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intercambios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfo)
                    .addComponent(reset))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void shell(ArrayList<Integer> arreglo){
        mostrarArreglo(arreglo, 0, 0);
        appendToPane(txtArea, "\n\n", Color.BLACK);
        
        int salto, i, j, k, auxiliar;
        //dependiendo del tamaño de nuesto arreglo
        //Es e, tamaño de los saltos que dara
        salto = arreglo.size() / 2;
        appendToPane(txtArea, "Valor salto " + salto + "\n", Color.BLUE);
        while(salto > 0){
            for(i = salto; i < arreglo.size(); i++){
                j = i - salto;
                while(j >= 0){
                    k = j + salto;
                    if(arreglo.get(j) <= arreglo.get(k)){
                        
                        appendToPane(txtArea, "\nSe comparo ", Color.BLACK);
                        appendToPane(txtArea, arreglo.get(j) + " y "+ arreglo.get(k), Color.RED);
                        comparacion++;
                        j =- 1;
                    } else{
                        appendToPane(txtArea, "\n\n", Color.BLACK);
                        comparacion++;
                        intercambio++;
                        appendToPane(txtArea, "Se comparo ", Color.BLACK);
                        appendToPane(txtArea, arreglo.get(j) + " y "+ arreglo.get(k) + "\n", Color.RED);
                        mostrarArreglo(arreglo, arreglo.get(j), arreglo.get(k));
                        auxiliar = arreglo.get(j);
                        arreglo.set(j, arreglo.get(k));
                        arreglo.set(k, auxiliar);
                        appendToPane(txtArea, "\nSe intercambiaron: ", Color.BLACK);
                        appendToPane(txtArea, arreglo.get(j) + " y "+ arreglo.get(k) + "\n", Color.RED);
                        mostrarArreglo(arreglo, arreglo.get(j), arreglo.get(k));
                        appendToPane(txtArea, "\n", Color.BLACK);
                        j -= salto;
                    }
                }
            }
            salto = salto / 2;
            appendToPane(txtArea, "\n\nValor salto " + salto, Color.BLUE);
        }
        appendToPane(txtArea, "\nArreglo Ordenado", Color.BLACK);
        mostrarArreglo(arreglo, 0, 0);
        
        intercambios.setText("Intercambios: " + intercambio);
        comparaciones.setText("Comparaciones: " + comparacion);
    }
    
    public void mostrarArreglo(ArrayList<Integer> arreglo, int valorx, int valory){
        int k;
        for (k = 0; k < arreglo.size(); k++) {
            if(arreglo.get(k) == valorx || arreglo.get(k) == valory){
                appendToPane(txtArea, "[" + arreglo.get(k) + "] ", Color.GREEN);
            } else{
                appendToPane(txtArea, "[" + arreglo.get(k) + "] ", Color.BLACK);
            }
            
        }
    }
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        arreglo.add(Integer.parseInt(txtAceptar.getText()));
        txtAceptar.setText("");
        String valores = "";
        for (Integer integer : arreglo) {
            valores += "[" + integer + "] ";
        }
        data.setText(valores);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        shell(arreglo);
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        arreglo = new ArrayList<Integer>();
        txtArea.setText("");
        txtAceptar.setText("");
        data.setText("");
        intercambios.setText("Intercambios: ");
        comparaciones.setText("Comparaciones: ");
    }//GEN-LAST:event_resetActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        Info info = new Info();
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInfoActionPerformed

    private void appendToPane(JTextPane tp, String msg, Color c) {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        int len = tp.getDocument().getLength();
        tp.setCaretPosition(len);
        tp.setCharacterAttributes(aset, false);
        tp.replaceSelection(msg);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnInfo;
    private javax.swing.JLabel comparaciones;
    private javax.swing.JLabel data;
    private javax.swing.JLabel intercambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reset;
    private javax.swing.JTextField txtAceptar;
    private javax.swing.JTextPane txtArea;
    // End of variables declaration//GEN-END:variables
}
