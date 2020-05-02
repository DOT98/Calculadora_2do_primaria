package Calculadora;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author anmijurane
 */
public class Proceso extends javax.swing.JFrame {

    random acc = new random();   
        
    /**
     * Creates new form Processo
     */
    public Proceso() {
        initComponents();  
        //successes();
        GetNumberRigth();
        GetNumberLeft();
        getOperator();
        Operation();
        
    }
    
    
    static int numberRigth2;
    static int numberLeft2;
    static String operator;
    static int result;
    public static int contCorrect = 0;
    public static int contIncorrect = 0;
    static int resultInt;
    static int contador = 1;
    static Resultado dl = new Resultado();
    //Arreglos
    static ArrayList<Integer> ArrRight = new ArrayList<Integer>();
    static ArrayList<String> ArrOperator = new ArrayList<String>();
    static ArrayList<Integer> ArrLeft = new ArrayList<Integer>();
    static ArrayList<Integer> ArrResultInter = new ArrayList<Integer>();
    static ArrayList<Integer> ArrResultExt = new ArrayList<Integer>();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        FirstValue = new javax.swing.JLabel();
        Operator = new javax.swing.JLabel();
        SecondValue = new javax.swing.JLabel();
        equals = new javax.swing.JLabel();
        result_kid = new javax.swing.JTextField();
        Btn_enviar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        label_numer = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resuelve la siguiente operación:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        FirstValue.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        FirstValue.setForeground(new java.awt.Color(255, 255, 255));
        FirstValue.setText("0");
        getContentPane().add(FirstValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 60, 110));

        Operator.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        Operator.setForeground(new java.awt.Color(255, 255, 255));
        Operator.setText("+/-");
        getContentPane().add(Operator, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 50, 120));

        SecondValue.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        SecondValue.setForeground(new java.awt.Color(255, 255, 255));
        SecondValue.setText("0");
        getContentPane().add(SecondValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 50, 70));

        equals.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        equals.setForeground(new java.awt.Color(255, 255, 255));
        equals.setText("=");
        getContentPane().add(equals, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 30, 50));

        result_kid.setBackground(new java.awt.Color(45, 154, 8));
        result_kid.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        result_kid.setForeground(new java.awt.Color(255, 255, 255));
        result_kid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result_kidActionPerformed(evt);
            }
        });
        getContentPane().add(result_kid, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 106, 50));

        Btn_enviar.setBackground(new java.awt.Color(204, 204, 255));
        Btn_enviar.setText("Verificar");
        Btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_enviarActionPerformed(evt);
            }
        });
        Btn_enviar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Btn_enviarKeyPressed(evt);
            }
        });
        getContentPane().add(Btn_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Proceso.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        label_numer.setText("1 / 10");
        getContentPane().add(label_numer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel4.setText("Operación: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_enviarActionPerformed
        
        try{
        successes();
        GetNumberRigth();
        GetNumberLeft();
        getOperator();
        Operation();
        result_kid.setText("");
        result_kid.requestFocus();
        contador++;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingresa un número.");
        }        
        //System.out.println("Buenas: " +contCorrect);
        //System.out.println("Malas: " +contIncorrect);
        //this.show();
        //this.dispose();  
                
        
        label_numer.setText(""+(contador)+" / 10");
        System.out.println("contador " +contador);
        
        if (contador == 11) {
            dl.show();
            this.dispose();
        }
    }//GEN-LAST:event_Btn_enviarActionPerformed
           
    public void successes(){        
        String kid_result = result_kid.getText();
        resultInt = Integer.parseInt(kid_result);
        ArrResultExt.add(resultInt);
        if (result == resultInt) {
            //JOptionPane.showMessageDialog(null, "Correcto");            
            contCorrect++;
        }else if (result != resultInt){
            //JOptionPane.showMessageDialog(null, "Incorrecto");
            contIncorrect++;
            //System.out.println("correcto: " +contIncorrect);
        }        
                                
        Resultado.setResult_ext(contCorrect, contIncorrect);
        
        //System.out.println(""+a);
        //System.out.println("Ya no hay mas operaciones");
    }
           
    private void result_kidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_result_kidActionPerformed
        
    }//GEN-LAST:event_result_kidActionPerformed

    private void Btn_enviarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Btn_enviarKeyPressed
        
    }//GEN-LAST:event_Btn_enviarKeyPressed

    public void GetNumberRigth(){
        double numberRigth = acc.getRandom(0,9);
        numberRigth2 = acc.ConvrtInteger(numberRigth);
        ArrRight.add(numberRigth2);
        FirstValue.setText(""+numberRigth2);        
    }
    
    public void GetNumberLeft(){        
        double numberLeft = acc.getRandom(0,numberRigth2-1);
        numberLeft2 = acc.ConvrtInteger(numberLeft);
        ArrLeft.add(numberLeft2);
        SecondValue.setText(""+numberLeft2);
        //System.out.println(numberLeft2);    
    }
    
    public void getOperator(){
        operator = acc.Operator();
        ArrOperator.add(operator);
        Operator.setText(operator);
    }
    
    public void Operation(){
        if(operator == "+"){            
            result = numberRigth2 + numberLeft2;            
        }else if(operator == "-"){
            result = numberRigth2 - numberLeft2;
        }        
            //System.out.println(""+result);
            ArrResultInter.add(result);
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
            java.util.logging.Logger.getLogger(Proceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proceso().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_enviar;
    private javax.swing.JLabel FirstValue;
    private javax.swing.JLabel Operator;
    private javax.swing.JLabel SecondValue;
    private javax.swing.JLabel equals;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel label_numer;
    private javax.swing.JTextField result_kid;
    // End of variables declaration//GEN-END:variables
}
