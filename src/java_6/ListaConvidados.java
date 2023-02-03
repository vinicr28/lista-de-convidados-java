
package java_6;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;


public class ListaConvidados extends javax.swing.JFrame {

    private Lista lista;
    private final Contador cont;
    DefaultListModel modelo = new DefaultListModel();


    public ListaConvidados() {
        initComponents();
        panSegundo.setVisible(false);
        panTerceiro.setVisible(false);
        panQuarto.setVisible(false);
        txtEdit.setVisible(false);
        btnConfirmEdit.setVisible(false);
        txtAdd.setVisible(false);
        btnAdd.setVisible(false);
        lista = new Lista();
        cont = new Contador();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panQuarto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCon = new javax.swing.JList<>();
        lblFinal = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTotalCon = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        txtEdit = new javax.swing.JTextField();
        btnConfirmEdit = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        txtAdd = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        panTerceiro = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCon = new javax.swing.JLabel();
        txtNomeCon = new javax.swing.JTextField();
        btnLista = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblCadastro = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblQuantos = new javax.swing.JLabel();
        panSegundo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        spiNum = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSegundo = new javax.swing.JButton();
        panInicial = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listCon.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        listCon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listCon.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "teste" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listCon);

        lblFinal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblFinal.setForeground(new java.awt.Color(102, 51, 255));
        lblFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Total de convidados:");

        lblTotalCon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotalCon.setText("0");
        lblTotalCon.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblTotalConAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(255, 0, 0));
        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Remover");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnClean.setBackground(new java.awt.Color(255, 255, 0));
        btnClean.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClean.setForeground(new java.awt.Color(0, 0, 0));
        btnClean.setText("Limpar Lista");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnConfirmEdit.setText("Confirmar");
        btnConfirmEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmEditActionPerformed(evt);
            }
        });

        btnAdicionar.setBackground(new java.awt.Color(102, 153, 0));
        btnAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panQuartoLayout = new javax.swing.GroupLayout(panQuarto);
        panQuarto.setLayout(panQuartoLayout);
        panQuartoLayout.setHorizontalGroup(
            panQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panQuartoLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(panQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panQuartoLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotalCon, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panQuartoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(panQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panQuartoLayout.createSequentialGroup()
                                .addComponent(txtEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panQuartoLayout.createSequentialGroup()
                                .addComponent(btnConfirmEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128))
                            .addGroup(panQuartoLayout.createSequentialGroup()
                                .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panQuartoLayout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128))))))
        );
        panQuartoLayout.setVerticalGroup(
            panQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panQuartoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addGroup(panQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panQuartoLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(txtEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirmEdit)
                        .addGap(74, 74, 74)
                        .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblTotalCon)))
                    .addGroup(panQuartoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panQuartoLayout.createSequentialGroup()
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)))))
                .addGap(54, 54, 54))
        );

        getContentPane().add(panQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 640));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 51, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Informe o nome dos convidados");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Convidado:");

        lblCon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCon.setForeground(new java.awt.Color(102, 51, 255));
        lblCon.setText("0");

        txtNomeCon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNomeCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeConActionPerformed(evt);
            }
        });

        btnLista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLista.setText("Confirmar");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 204, 0));
        jLabel11.setText("Convidados cadastrados:");

        lblCadastro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCadastro.setForeground(new java.awt.Color(51, 204, 0));
        lblCadastro.setText("0");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 51, 255));
        jLabel12.setText("Numero de convidados:");

        lblQuantos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblQuantos.setForeground(new java.awt.Color(0, 0, 0));
        lblQuantos.setText("1");

        javax.swing.GroupLayout panTerceiroLayout = new javax.swing.GroupLayout(panTerceiro);
        panTerceiro.setLayout(panTerceiroLayout);
        panTerceiroLayout.setHorizontalGroup(
            panTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTerceiroLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(panTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTerceiroLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblQuantos, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addGap(25, 25, 25)
                        .addComponent(txtNomeCon, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnLista, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(panTerceiroLayout.createSequentialGroup()
                        .addGroup(panTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(28, 28, 28)
                        .addGroup(panTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                            .addComponent(lblCon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panTerceiroLayout.setVerticalGroup(
            panTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTerceiroLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addGap(151, 151, 151)
                .addGroup(panTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNomeCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLista)
                    .addComponent(lblQuantos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(panTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblCon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblCadastro))
                .addGap(200, 200, 200))
        );

        getContentPane().add(panTerceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 640));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Por gentileza forneça as informações a seguir:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Essa lista será para que tipo de evento?");

        txtTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Informe a quantidade de convidados:");

        spiNum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spiNum.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Qual será o nome oficial do evento?");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("confirme se todas as informações estão corretas e prossiga");

        btnSegundo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSegundo.setText("PROXIMO >");
        btnSegundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSegundoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panSegundoLayout = new javax.swing.GroupLayout(panSegundo);
        panSegundo.setLayout(panSegundoLayout);
        panSegundoLayout.setHorizontalGroup(
            panSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panSegundoLayout.createSequentialGroup()
                .addGroup(panSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panSegundoLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(panSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(61, 61, 61)
                        .addGroup(panSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(spiNum, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panSegundoLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel7))
                    .addGroup(panSegundoLayout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(btnSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        panSegundoLayout.setVerticalGroup(
            panSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSegundoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(57, 57, 57)
                .addGroup(panSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(panSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(panSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spiNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addComponent(jLabel7)
                .addGap(97, 97, 97)
                .addComponent(btnSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        getContentPane().add(panSegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        panInicial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html>Bem vindo a configuração da sua lista de convidados!!</html>");
        panInicial.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 973, -1));

        btnInicio.setBackground(new java.awt.Color(255, 255, 255));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 0, 0));
        btnInicio.setText("Iniciar Lista");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        panInicial.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 324, 347, 107));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Para continuar aperte o botão abaixo");
        panInicial.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 973, -1));

        getContentPane().add(panInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 736));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // panInicial
        panInicial.setVisible(false);
        panSegundo.setVisible(true);
        
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnSegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegundoActionPerformed
        // TODO add your handling code here:
        panSegundo.setVisible(false);
        panTerceiro.setVisible(true);
        int numCon = (int) spiNum.getValue();
        lblCon.setText(Integer.toString(numCon));
        
        
    }//GEN-LAST:event_btnSegundoActionPerformed

    private void txtNomeConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeConActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        // TODO add your handling code here:
        int numCon = (int) spiNum.getValue();
        String nome = txtNomeCon.getText();
        lista.adicionarLista(nome);
        //lista.printLista();
        txtNomeCon.setText("");
        cont.contarConv();
        lblQuantos.setText(Integer.toString(cont.n + 1));
        lblCadastro.setText(Integer.toString(cont.n));
        
        
        
        
        if (cont.n >= numCon) {
            panSegundo.setVisible(false);
            panTerceiro.setVisible(false);
            for (int i = 0; i < lista.nomes.size(); i++) {
                modelo.addElement(lista.nomes.get(i));
                panQuarto.setVisible(true);
            }
        }
        
        listCon.setModel(modelo);
        
        String tipo = txtTipo.getText();
        String evNome = txtNome.getText();
        
        lblFinal.setText(tipo + ": " + evNome);
        lblTotalCon.setText(Integer.toString(modelo.size()));
        
    }//GEN-LAST:event_btnListaActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        txtAdd.setVisible(true);
        btnAdd.setVisible(true);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        txtEdit.setVisible(true);
        btnConfirmEdit.setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnConfirmEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmEditActionPerformed
        // TODO add your handling code here:
        int index = listCon.getSelectedIndex();
        modelo.setElementAt(txtEdit.getText(), index);
        txtEdit.setText("");
        txtEdit.setVisible(false);
        btnConfirmEdit.setVisible(false);
        
    }//GEN-LAST:event_btnConfirmEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        modelo.addElement(txtAdd.getText());
        txtAdd.setText("");
        txtAdd.setVisible(false);
        btnAdd.setVisible(false);
        lblTotalCon.setText(Integer.toString(modelo.size()));
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int index = listCon.getSelectedIndex();
        modelo.removeElementAt(index);
        lblTotalCon.setText(Integer.toString(modelo.size()));
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        // TODO add your handling code here:
        modelo.clear();
        lblTotalCon.setText(Integer.toString(modelo.size()));
    }//GEN-LAST:event_btnCleanActionPerformed

    private void lblTotalConAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblTotalConAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTotalConAncestorAdded


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
            java.util.logging.Logger.getLogger(ListaConvidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaConvidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaConvidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaConvidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaConvidados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnConfirmEdit;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSegundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCon;
    private javax.swing.JLabel lblFinal;
    private javax.swing.JLabel lblQuantos;
    private javax.swing.JLabel lblTotalCon;
    private javax.swing.JList<String> listCon;
    private javax.swing.JPanel panInicial;
    private javax.swing.JPanel panQuarto;
    private javax.swing.JPanel panSegundo;
    private javax.swing.JPanel panTerceiro;
    private javax.swing.JSpinner spiNum;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtEdit;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeCon;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
