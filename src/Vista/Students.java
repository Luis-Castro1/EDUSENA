/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

/**
 *
 * @author Aprendiz
 */
public class Students extends javax.swing.JPanel {



    public Students() {
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

        Container = new javax.swing.JPanel();
        North_panel = new javax.swing.JPanel();
        btn_create = new javax.swing.JButton();
        btn_clean = new javax.swing.JButton();
        btn_moficar = new javax.swing.JButton();
        Btn_Delete = new javax.swing.JButton();
        Form = new javax.swing.JPanel();
        Lbl_Student = new javax.swing.JLabel();
        Lbl_Document = new javax.swing.JLabel();
        Txt_DocumentStudent = new javax.swing.JTextField();
        Lbl_Name1 = new javax.swing.JLabel();
        Txt_nameStudent = new javax.swing.JTextField();
        Lbl_LastName = new javax.swing.JLabel();
        Txt_LastNameStudent = new javax.swing.JTextField();
        Lbl_Born = new javax.swing.JLabel();
        Lbl_Format = new javax.swing.JLabel();
        Txt_Day_Born = new javax.swing.JTextField();
        sexo = new javax.swing.JLabel();
        btn_M = new javax.swing.JRadioButton();
        btn_F = new javax.swing.JRadioButton();
        Lbl_Direction = new javax.swing.JLabel();
        Txt_Direction = new javax.swing.JTextField();
        Lbl_Telephone = new javax.swing.JLabel();
        Txt_telephone = new javax.swing.JTextField();
        Lbl_Email = new javax.swing.JLabel();
        Txt_email = new javax.swing.JTextField();
        Lbl_password = new javax.swing.JLabel();
        TxtPass = new javax.swing.JPasswordField();
        table_container = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Container.setBackground(new java.awt.Color(255, 255, 255));

        North_panel.setBackground(new java.awt.Color(0, 173, 0));
        North_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        North_panel.setOpaque(false);

        btn_create.setBackground(new java.awt.Color(0, 173, 0));
        btn_create.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_create.setForeground(new java.awt.Color(255, 255, 255));
        btn_create.setText("Crear");
        btn_create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });

        btn_clean.setBackground(new java.awt.Color(0, 173, 0));
        btn_clean.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_clean.setForeground(new java.awt.Color(255, 255, 255));
        btn_clean.setText("Limpiar Campos");
        btn_clean.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cleanActionPerformed(evt);
            }
        });

        btn_moficar.setBackground(new java.awt.Color(0, 173, 0));
        btn_moficar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_moficar.setForeground(new java.awt.Color(255, 255, 255));
        btn_moficar.setText("Modificar");
        btn_moficar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_moficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moficarActionPerformed(evt);
            }
        });

        Btn_Delete.setBackground(new java.awt.Color(0, 173, 0));
        Btn_Delete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn_Delete.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Delete.setText("Eliminar");
        Btn_Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout North_panelLayout = new javax.swing.GroupLayout(North_panel);
        North_panel.setLayout(North_panelLayout);
        North_panelLayout.setHorizontalGroup(
            North_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(North_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(North_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_moficar, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(btn_clean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        North_panelLayout.setVerticalGroup(
            North_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, North_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_create, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btn_clean, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_moficar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        Form.setBackground(new java.awt.Color(255, 255, 255));
        Form.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Lbl_Student.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Lbl_Student.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_Student.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Student.setText("Nuevo Estudiante");

        Lbl_Document.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbl_Document.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_Document.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_Document.setText("N. Documento");

        Txt_DocumentStudent.setBackground(new java.awt.Color(235, 235, 235));
        Txt_DocumentStudent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Lbl_Name1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbl_Name1.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_Name1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_Name1.setText("Nombres");

        Txt_nameStudent.setBackground(new java.awt.Color(235, 235, 235));
        Txt_nameStudent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Lbl_LastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbl_LastName.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_LastName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_LastName.setText("Apellidos");

        Txt_LastNameStudent.setBackground(new java.awt.Color(235, 235, 235));
        Txt_LastNameStudent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Lbl_Born.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbl_Born.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_Born.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_Born.setText("Fecha de Nacimiento");

        Lbl_Format.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        Lbl_Format.setForeground(new java.awt.Color(153, 153, 153));
        Lbl_Format.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_Format.setText("Formato: yyyy-MM-dd");

        Txt_Day_Born.setBackground(new java.awt.Color(235, 235, 235));
        Txt_Day_Born.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        sexo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sexo.setForeground(new java.awt.Color(0, 173, 0));
        sexo.setText("Sexo");

        btn_M.setText("Masculino");
        btn_M.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_F.setText("Femenino");
        btn_F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Lbl_Direction.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbl_Direction.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_Direction.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_Direction.setText("Dirección");

        Txt_Direction.setBackground(new java.awt.Color(235, 235, 235));
        Txt_Direction.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Lbl_Telephone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbl_Telephone.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_Telephone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_Telephone.setText("Teléfono");

        Txt_telephone.setBackground(new java.awt.Color(235, 235, 235));
        Txt_telephone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Lbl_Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbl_Email.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_Email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_Email.setText("Email");

        Txt_email.setBackground(new java.awt.Color(235, 235, 235));
        Txt_email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Lbl_password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbl_password.setForeground(new java.awt.Color(0, 173, 0));
        Lbl_password.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_password.setText("Contraseña");

        TxtPass.setBackground(new java.awt.Color(235, 235, 235));

        javax.swing.GroupLayout FormLayout = new javax.swing.GroupLayout(Form);
        Form.setLayout(FormLayout);
        FormLayout.setHorizontalGroup(
            FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_Telephone)
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FormLayout.createSequentialGroup()
                                .addComponent(Lbl_Born)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_Day_Born, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FormLayout.createSequentialGroup()
                                .addComponent(Lbl_password)
                                .addGap(93, 93, 93)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43)
                        .addComponent(Lbl_Email)
                        .addGap(64, 64, 64)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Txt_nameStudent, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(FormLayout.createSequentialGroup()
                                    .addComponent(btn_M)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_F)))
                            .addComponent(Txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(Lbl_Direction)
                        .addGap(18, 18, 18)
                        .addComponent(Txt_Direction, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Lbl_Student)
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Lbl_Format, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lbl_Document, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addComponent(Txt_DocumentStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sexo)
                            .addGroup(FormLayout.createSequentialGroup()
                                .addComponent(Lbl_Name1)
                                .addGap(223, 223, 223)
                                .addComponent(Lbl_LastName)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_LastNameStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FormLayout.setVerticalGroup(
            FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_Student)
                .addGap(34, 34, 34)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Document, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_DocumentStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_nameStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_LastNameStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Lbl_Format, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Day_Born, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_Born, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexo)
                    .addComponent(btn_M)
                    .addComponent(btn_F)
                    .addComponent(Lbl_Direction, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Direction, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(FormLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Lbl_Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        table_container.setBackground(new java.awt.Color(255, 255, 255));
        table_container.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Tabla.setBackground(new java.awt.Color(255, 255, 255));
        Tabla.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N. Documento", "Nombres", "Apellidos", "Fecha Nacimiento", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setResizable(false);
            Tabla.getColumnModel().getColumn(3).setResizable(false);
            Tabla.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout table_containerLayout = new javax.swing.GroupLayout(table_container);
        table_container.setLayout(table_containerLayout);
        table_containerLayout.setHorizontalGroup(
            table_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        table_containerLayout.setVerticalGroup(
            table_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_containerLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(table_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(Form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(North_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(132, 132, 132))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(North_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(table_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 760));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cleanActionPerformed


    }//GEN-LAST:event_btn_cleanActionPerformed

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed

    }//GEN-LAST:event_btn_createActionPerformed

    private void Btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_DeleteActionPerformed

    private void btn_moficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moficarActionPerformed
        // Modificar

    }//GEN-LAST:event_btn_moficarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Delete;
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Form;
    private javax.swing.JLabel Lbl_Born;
    private javax.swing.JLabel Lbl_Direction;
    private javax.swing.JLabel Lbl_Document;
    private javax.swing.JLabel Lbl_Email;
    private javax.swing.JLabel Lbl_Format;
    private javax.swing.JLabel Lbl_LastName;
    private javax.swing.JLabel Lbl_Name1;
    private javax.swing.JLabel Lbl_Student;
    private javax.swing.JLabel Lbl_Telephone;
    private javax.swing.JLabel Lbl_password;
    private javax.swing.JPanel North_panel;
    public javax.swing.JTable Tabla;
    public javax.swing.JPasswordField TxtPass;
    public javax.swing.JTextField Txt_Day_Born;
    public javax.swing.JTextField Txt_Direction;
    public javax.swing.JTextField Txt_DocumentStudent;
    public javax.swing.JTextField Txt_LastNameStudent;
    public javax.swing.JTextField Txt_email;
    public javax.swing.JTextField Txt_nameStudent;
    public javax.swing.JTextField Txt_telephone;
    public javax.swing.JRadioButton btn_F;
    public javax.swing.JRadioButton btn_M;
    public javax.swing.JButton btn_clean;
    public javax.swing.JButton btn_create;
    public javax.swing.JButton btn_moficar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel sexo;
    private javax.swing.JPanel table_container;
    // End of variables declaration//GEN-END:variables



}
