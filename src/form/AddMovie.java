/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import movie.*;

/**
 *
 * @author smartkid1965
 */
public class AddMovie extends javax.swing.JFrame {
    Main main;
    int index;
    DefaultComboBoxModel model1 = new DefaultComboBoxModel();
    DefaultComboBoxModel model2 = new DefaultComboBoxModel();
    DefaultComboBoxModel model3 = new DefaultComboBoxModel();
    DecimalFormat df = new DecimalFormat("00");
    /**
     * Creates new form AddMovie
     */
    public AddMovie(Main main) {
        this.main = main;
        initialize();
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

        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CategoryBox1 = new javax.swing.JComboBox();
        QuantityField = new javax.swing.JTextField();
        ReleaseYear = new javax.swing.JTextField();
        TitleField = new javax.swing.JTextField();
        ActorField1 = new javax.swing.JTextField();
        ActorField2 = new javax.swing.JTextField();
        ActorField3 = new javax.swing.JTextField();
        GRadio = new javax.swing.JRadioButton();
        PGRadio = new javax.swing.JRadioButton();
        PG13Radio = new javax.swing.JRadioButton();
        RRadio = new javax.swing.JRadioButton();
        NC17Radio = new javax.swing.JRadioButton();
        AddMovieButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        CategoryBox2 = new javax.swing.JComboBox();
        CategoryBox3 = new javax.swing.JComboBox();
        ReleaseMonth = new javax.swing.JTextField();
        ReleaseDay = new javax.swing.JTextField();

        jTextField6.setText("jTextField6");

        setBounds(java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2 - 200, java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2-200, 0, 0);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 100, 123));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Movie");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Title");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Category");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Release Date (YYYY-MM-DD)");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Rating");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Quantity");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Title Actors");

        CategoryBox1.setBackground(new java.awt.Color(0, 100, 123));
        CategoryBox1.setForeground(new java.awt.Color(255, 255, 255));
        CategoryBox1.setModel(model1);

        QuantityField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ReleaseYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TitleField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ActorField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ActorField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ActorField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        GRadio.setForeground(new java.awt.Color(255, 255, 255));
        GRadio.setText("G");
        GRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GRadioActionPerformed(evt);
            }
        });

        PGRadio.setForeground(new java.awt.Color(255, 255, 255));
        PGRadio.setText("PG");

        PG13Radio.setForeground(new java.awt.Color(255, 255, 255));
        PG13Radio.setText("PG-13");
        PG13Radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PG13RadioActionPerformed(evt);
            }
        });

        RRadio.setForeground(new java.awt.Color(255, 255, 255));
        RRadio.setText("R");

        NC17Radio.setForeground(new java.awt.Color(255, 255, 255));
        NC17Radio.setText("NC-17");
        NC17Radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NC17RadioActionPerformed(evt);
            }
        });

        AddMovieButton.setText("Add Movie");
        AddMovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMovieButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        CategoryBox2.setBackground(new java.awt.Color(0, 100, 123));
        CategoryBox2.setForeground(new java.awt.Color(255, 255, 255));
        CategoryBox2.setModel(model2);

        CategoryBox3.setBackground(new java.awt.Color(0, 100, 123));
        CategoryBox3.setForeground(new java.awt.Color(255, 255, 255));
        CategoryBox3.setModel(model3);

        ReleaseMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ReleaseDay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 314, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel8))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(34, 34, 34)
                                .add(TitleField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 217, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel2)
                                .add(jLabel9)
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(jPanel1Layout.createSequentialGroup()
                                            .add(8, 8, 8)
                                            .add(jLabel11)
                                            .add(44, 44, 44))
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .add(ReleaseYear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(18, 18, 18)))
                                    .add(ReleaseMonth, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                    .add(ReleaseDay, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(42, 42, 42)
                                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(CategoryBox1, 0, 165, Short.MAX_VALUE)
                                        .add(CategoryBox2, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(CategoryBox3, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(46, 46, 46)
                                    .add(QuantityField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(27, 27, 27)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, ActorField3)
                                    .add(ActorField2)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jLabel12)
                                            .add(jLabel10)
                                            .add(PG13Radio)
                                            .add(jPanel1Layout.createSequentialGroup()
                                                .add(GRadio)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                .add(RRadio))
                                            .add(jPanel1Layout.createSequentialGroup()
                                                .add(PGRadio)
                                                .add(5, 5, 5)
                                                .add(NC17Radio)))
                                        .add(0, 0, Short.MAX_VALUE))))
                            .add(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(AddMovieButton)
                                .add(31, 31, 31)
                                .add(jButton2))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(27, 27, 27)
                                .add(ActorField1)))
                        .add(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jLabel12))
                .add(20, 20, 20)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(TitleField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(ActorField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(ActorField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(ActorField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jLabel10)
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(GRadio)
                            .add(RRadio))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(PGRadio)
                            .add(NC17Radio))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(PG13Radio))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(ReleaseYear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(ReleaseMonth, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(ReleaseDay, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(jLabel11)
                        .add(12, 12, 12)
                        .add(QuantityField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jLabel8)
                        .add(6, 6, 6)
                        .add(CategoryBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(CategoryBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(6, 6, 6)
                        .add(CategoryBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(14, 14, 14)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(AddMovieButton)
                            .add(jButton2))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        main.loginAdminFrame.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void GRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GRadioActionPerformed

    private void PG13RadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PG13RadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PG13RadioActionPerformed

    private void NC17RadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NC17RadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NC17RadioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        main.addMovieFrame = null;
        main.loginAdminFrame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AddMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMovieButtonActionPerformed
        // TODO add your handling code here:
        addMovie();
        
    }//GEN-LAST:event_AddMovieButtonActionPerformed

    public void initialize() {
        String bank = "select * from Category;";
        initializeComboBox(bank, model1);
        initializeComboBox(bank, model2);
        initializeComboBox(bank, model3);
    }
    
    public void initializeComboBox(String bank, DefaultComboBoxModel model) {
        
        model.addElement("");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/fall2012"
                    + "?user=greggjs&password=greggjs");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(bank);
            for (int i =0; rs.next(); i++) {
                model.addElement(rs.getString("category_name"));                
            }
          
        } catch (SQLException err) {
            System.out.println("problem has occurred");
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
    }
    
    public void addMovie() {
        
        String title = TitleField.getText();
        
        if (title.equals("") || title.length() > 80) {
            JOptionPane.showMessageDialog(this,
                    "Invalid Entry for Title");
            return;
        }
        
        int quantity = getQuantity();
        if (quantity == -1)
            return;
        Date rel_date = getDate();
        if (rel_date == null)
            return;
        
        String[] categories = new String[3];
        categories[0]= (String)CategoryBox1.getSelectedItem();
        categories[1]= (String)CategoryBox2.getSelectedItem();
        categories[2]= (String)CategoryBox3.getSelectedItem();
        
        String[] actors = new String[3];
        actors[0] = ActorField1.getText();
        actors[1] = ActorField2.getText();
        actors[2] = ActorField3.getText();
        for (int i = 0; i < actors.length; i++) {
            if (actors[i].length() > 60) {
                JOptionPane.showMessageDialog(this, 
                        "Actor name too long for insert");
            }
        }
        
        String rating = getRating();
        if (rating==null) {
            JOptionPane.showMessageDialog(this,
                    "Invalid Input for Rating");
            return;
        }
        
        index = maxIndex("movie_id", "Movie");
        
        String bank = "insert into Movie values ("+index
                +",'"+title+"', '"
                +rel_date+"', '"+rating+"', "+quantity+");";
        insert(bank);
        
        insertActors(actors);
        
        insertCategories(categories);
         
        JOptionPane.showMessageDialog(this,
                "Successfully Added Movie",
                "Movie Added", 
                JOptionPane.INFORMATION_MESSAGE);
        main.addMovieFrame.setVisible(false);
        main.addMovieFrame = null;
        main.loginAdminFrame.setVisible(true);
        
    }
    
    public String getRating() {
        
        if (GRadio.isSelected())
            return "G";
        else if (PGRadio.isSelected())
            return "PG";
        else if (PG13Radio.isSelected())
            return "PG13";
        else if (RRadio.isSelected())
            return "R";
        else if (NC17Radio.isSelected())
            return "NC17";
        return null;
            
    }
    
    public int maxIndex(String type, String table) {
        String bank = "select MAX("+type+") from "+table+";";
        int index = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/fall2012"
                    + "?user=greggjs&password=greggjs");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(bank);
            for (int i =0; rs.next(); i++) {
                index = rs.getInt("MAX("+type+")");                
            }
          
        } catch (SQLException err) {
            System.out.println("index problem");
            err.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
        return index+1;
    }
    
    public void insert(String bank) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/"
                    + "fall2012?user=greggjs&password=greggjs");
            PreparedStatement stm = conn.prepareStatement(bank);
            stm.execute();
        } catch (SQLException err) {
            System.out.println("insert problem");
            err.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
    }
    
    public void insertActors(String[] actors) {
        int insert_index;
        for (int i = 0; i < actors.length; i++) {
            if (actors[i].equals("")) {System.out.println("Null");}
            else {
                String bank = "select actor_name from Actor where "
                        + "actor_name='"+actors[i]+"';";
                String result = search(bank, "actor_name");
                if (result==null) {
                    insert_index = maxIndex("actor_id", "Actor");
                    bank = "insert into Actor values ("
                            +insert_index
                            +", '"+actors[i]+"');";
                    insert(bank);
                    bank = "insert into Starred_In values ("
                            +insert_index
                            + ", "+index+");";
                    insert(bank);
                }
                else {
                    bank = "select actor_id from Actor "
                            + "where actor_name"
                            + " = '"+actors[i]+"';";
                    int id = Integer.parseInt(search(bank,
                            "actor_id"));
                    bank = "insert into Starred_In values ("
                            +id+", "+index+");";
                    insert(bank);
                }
            }
        }
    }
    
    public void insertCategories(String[] categories) {
        for (int i = 0; i < categories.length; i++) {
            if (!(categories[i]==null)) {
                String bank = "select category_id "
                        + "from Category where category_name = '"
                        +categories[i]+"';";
                int cat_id = Integer.parseInt(search(bank,
                        "category_id"));
                bank = "insert into Has_Category values ("+cat_id
                            +", "+index+");";
                insert(bank);
                
            }
        }
    }
    
    public String search(String bank, String query) {
        String res = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/fall2012"
                    + "?user=greggjs&password=greggjs");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(bank);
            for (int i =0; rs.next(); i++) {
                res = rs.getString(query);
            }
          
        } catch (SQLException err) {
            System.out.println("search problem");
            err.printStackTrace();
            
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
        
        return res;
    }
    /**
     * @param args the command line arguments
     */
    
    public Date getDate() {
        Date date;
        try {
            int year = Integer.parseInt(ReleaseYear.getText());
            int month = Integer.parseInt(ReleaseMonth.getText());
            int day = Integer.parseInt(ReleaseDay.getText());
            
            
            date = Date.valueOf(
                    year+"-"+df.format(month)+
                    "-"+df.format(day));
            Long check = date.getTime();
            if (check > System.currentTimeMillis()) {
                JOptionPane.showMessageDialog(this,
                        "This date has not occured yet...");
                return null;
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                    "Invalid Input for Release Date"
                    + "\nor Quantity");
            return null;
        } catch (IllegalArgumentException err) {
            JOptionPane.showMessageDialog(this,
                    "Invalid Date, this date never has\n"
                    + "existed or hasn't existed to our"
                    + "knowledge...");
            return null;
        }
        return date;
    }
    
    public int getQuantity() {
        int quantity = 0;
        try {
            quantity = Integer.parseInt(QuantityField.getText());
            if (quantity < 0) {
                JOptionPane.showMessageDialog(this,
                        "Quantity needs to be greater than 0");
                return -1;
            }
        } catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(this,
                    "Please input a valid quantity");
            return -1;
        }
        return quantity;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ActorField1;
    private javax.swing.JTextField ActorField2;
    private javax.swing.JTextField ActorField3;
    private javax.swing.JButton AddMovieButton;
    private javax.swing.JComboBox CategoryBox1;
    private javax.swing.JComboBox CategoryBox2;
    private javax.swing.JComboBox CategoryBox3;
    private javax.swing.JRadioButton GRadio;
    private javax.swing.JRadioButton NC17Radio;
    private javax.swing.JRadioButton PG13Radio;
    private javax.swing.JRadioButton PGRadio;
    private javax.swing.JTextField QuantityField;
    private javax.swing.JRadioButton RRadio;
    private javax.swing.JTextField ReleaseDay;
    private javax.swing.JTextField ReleaseMonth;
    private javax.swing.JTextField ReleaseYear;
    private javax.swing.JTextField TitleField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
