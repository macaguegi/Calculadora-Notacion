package arbolbinario;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class ArbolBinario extends javax.swing.JFrame {
    /**
     * Creates new form Frame
     */
    ArbolBin ab = new ArbolBin();
    public ArbolBinario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txDato = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       
        setResizable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        txDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDatoActionPerformed(evt);
            }
        });

        jButton1.setText("Insertar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Eliminar Arbol ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Preorden");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Inorden");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Postorden");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Por Nivel");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Buscar un dato");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        
        jButton8.setText("Generar Aleatorio");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton9.setText("Eliminar Nodo");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txDato)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txDato, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jButton8)
                            .addComponent(jButton3)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton4)
                            .addComponent(jButton6)
                            .addComponent(jButton7)
                            .addComponent(jButton9)
                            )
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDatoActionPerformed
        try {
            int dato = Integer.parseInt(txDato.getText());
            txDato.setText("");
            ab.insertar(dato);
            paint(jPanel2.getGraphics());
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, "Error al Insertar el Dato");
        }
    }//GEN-LAST:event_txDatoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int dato = Integer.parseInt(txDato.getText());
            txDato.setText("");
            ab.insertar(dato);
            paint(jPanel2.getGraphics());
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, "Error al Insertar el Dato");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ab = null;
        ab = new ArbolBin();
        paint(jPanel2.getGraphics());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        LinkedList rec = new LinkedList();
        ab.preorden(ab.getRaiz(), rec);
        String cad = "Recorrido Preorden:\n";
        for (Object rec1 : rec) {
            cad += rec1 + " , ";
        }
        jTextArea1.setText(cad);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        LinkedList rec = new LinkedList();
        ab.inorden(ab.getRaiz(), rec);
        String cad = "Recorrido Inorden:\n";
        for (Object rec1 : rec) {
            cad += rec1 + " , ";
        }
        jTextArea1.setText(cad);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        LinkedList rec = new LinkedList();
        ab.postorden(ab.getRaiz(), rec);
        String cad = "Recorrido Postorden:\n";
        for (Object rec1 : rec) {
            cad += rec1 + " , ";
        }
        jTextArea1.setText(cad);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        LinkedList rec = new LinkedList();
        ab.porNivel(ab.getRaiz(), rec);
        String cad = "Recorrido Por Nivel:\n";
        for (Object rec1 : rec) {
            cad += rec1 + "  ";
        }
        jTextArea1.setText(cad);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            int dato = Integer.parseInt(JOptionPane.showInputDialog(this,"Dato a buscar"));
            JOptionPane.showMessageDialog(this,ab.existe(dato)? "Si Existe el Dato":"No Existe el dato");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this,"Error al buscar el dato");
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed
     private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         try {
            
            int dato1 = (int) (Math.random() *1000);
            int dato2 = (int)(Math.random() *1000);
            int dato3 = (int) (Math.random() *1000);
            int dato4 = (int) (Math.random() *1000);
            int dato5 = (int) (Math.random() *1000);
             
            JOptionPane.showMessageDialog(this, "Numeros generados aleatoriamente: " + dato1 + " , "+ dato2
                    + " , " + dato3 + " , "+ dato4 + " , "+ dato5);
            txDato.setText("");
            ab.insertar(dato1);
            ab.insertar(dato2);
            ab.insertar(dato3);
            ab.insertar(dato4);
            ab.insertar(dato5);
            paint(jPanel2.getGraphics());
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, "Error al Insertar el Dato");
        }
        
    }//GEN-LAST:event_jButton9ActionPerformed
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            int dato = Integer.parseInt(JOptionPane.showInputDialog(this,"Nodo a eliminar"));
           
            if(ab.eliminar(dato)){
                JOptionPane.showMessageDialog(this, "Se ha eliminado el nodo :" + dato);
                 ab.eliminar(dato);
            }
            else{
                JOptionPane.showMessageDialog(this, "No se encontro el nodo :" + dato);
            }
             paint(jPanel2.getGraphics());
             repaint();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this,"Error al buscar el dato");
        }
        
    }
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
            java.util.logging.Logger.getLogger(ArbolBinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArbolBinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArbolBinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArbolBinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArbolBinario().setVisible(true);
            }
        });
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
     private javax.swing.JButton jButton9;
    private int cont=0;
    private int numero =0;
   private int nivel =0;
  
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txDato;
    // End of variables declaration//GEN-END:variables

private void pintaArbol(Graphics g, NodoA n, int x, int y,int xoff,int yoff,int nivel,int nivelActual){
     if (n == null) return;
     g.setColor(Color.blue);
      cont=0;
        numero =0;
        altura(n,1);
        
     if((nivel > nivelActual) && n.getIzq() != null){
         
         xoff -= ((xoff*cont)/numero)-15;
     }
     else if((nivel > nivelActual) && n.getDer() != null){
          xoff += -((xoff*cont)/numero)+15;
     }
     else{
         xoff += ((xoff*cont)/numero)+15;
     }
    
    
     if(n.getIzq()!= null){
        
         g.drawLine(x, y, x - xoff+(nivel), y + yoff);
         
         
     }
     if(n.getDer()!= null){
         
         g.drawLine(x, y, x + xoff-(nivel), y + yoff);
        
     }
    
     g.fillOval(x-5, y-10, 25, 25);
     
     g.setColor(Color.white);
     g.setFont(new Font("Tahoma",0,9));
     g.drawString(n.getDato()+"", x , y );
     
     x=x+(nivel/2);
     
    pintaArbol(g, n.getIzq(), (int)(x - xoff-1), (y + yoff),xoff+nivel*2,yoff,nivel+1,nivel);
     pintaArbol(g, n.getDer(), (int)(x + xoff+1), (y + yoff),xoff-nivel*2,yoff,nivel+1,nivel);
}
public void altura(NodoA n,int nivel){
     
     if (n == null) return ;
     numero++;
     if(nivel> cont){
     cont = nivel;
     }
     altura(n.getIzq(),nivel+1);
     altura(n.getDer(),nivel+1);
    
    
}
    @Override
    public void paint(Graphics g){
        jPanel2.revalidate();
        super.paint(g);
        int X2 = (getWidth()/12);
        int Y = getHeight()/12;
      
        pintaArbol(jPanel2.getGraphics(), ab.getRaiz(), jPanel2.getWidth()/2, Y, X2, Y,1,1);
        
    }
}