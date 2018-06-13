package GUI;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JToolBar.Separator;
import javax.swing.filechooser.FileNameExtensionFilter;
import logica.dataConnection;
import logica.institutoMontenegro;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Maria Alejandra Martos Diaz
 * @author Juan jeferson Alape
 */
public class VentanaAdministrador extends JFrame {

    private PreparedStatement pst;
    private Connection cn;
    private ResultSet result;
    private institutoMontenegro instituto;

    public static VentanaAdministrador ventana;

    /**
     * Creates new form VentanaAdministrador
     */
    public VentanaAdministrador() {
        instituto = new institutoMontenegro();
        cn = dataConnection.conexion();
        initComponents();
        this.getContentPane().setBackground(Color.white);

    }

    /**
     * 
     * @return 
     */
    public static VentanaAdministrador getInstanceSingleton() {
        if (ventana == null) {
            ventana = new VentanaAdministrador();
        }
        return ventana;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBarOpcionsAdmin = new JToolBar();
        jButtonCrearEstudiante = new JButton();
        jSeparador1 = new Separator();
        jButtonModificarDatos = new JButton();
        jSeparador5 = new Separator();
        GenerarInforme = new javax.swing.JButton();
        jSeparador6 = new Separator();
        jButtonCargarListado = new javax.swing.JButton();
        jSeparador7 = new Separator();
        jButtonSalir = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setName("VentanaAdministrador"); // NOI18N
        setResizable(false);

        jToolBarOpcionsAdmin.setFloatable(false);
        jToolBarOpcionsAdmin.setRollover(true);

        jButtonCrearEstudiante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonCrearEstudiante.setText("Gestionar Estudiantes");
        jButtonCrearEstudiante.setFocusable(false);
        jButtonCrearEstudiante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCrearEstudiante.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCrearEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearEstudianteActionPerformed(evt);
            }
        });
        jToolBarOpcionsAdmin.add(jButtonCrearEstudiante);
        jToolBarOpcionsAdmin.add(jSeparador1);

        jButtonModificarDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonModificarDatos.setText("Modificar Datos Administrador");
        jButtonModificarDatos.setFocusable(false);
        jButtonModificarDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonModificarDatos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarDatosActionPerformed(evt);
            }
        });
        jToolBarOpcionsAdmin.add(jButtonModificarDatos);
        jToolBarOpcionsAdmin.add(jSeparador5);

        GenerarInforme.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GenerarInforme.setText("Generar Informe");
        GenerarInforme.setFocusable(false);
        GenerarInforme.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GenerarInforme.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GenerarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarInformeActionPerformed(evt);
            }
        });
        jToolBarOpcionsAdmin.add(GenerarInforme);
        jToolBarOpcionsAdmin.add(jSeparador6);

        jButtonCargarListado.setText("Cargar Archivo");
        jButtonCargarListado.setFocusable(false);
        jButtonCargarListado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCargarListado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCargarListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarListadoActionPerformed(evt);
            }
        });
        jToolBarOpcionsAdmin.add(jButtonCargarListado);
        jToolBarOpcionsAdmin.add(jSeparador7);

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setFocusable(false);
        jButtonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jToolBarOpcionsAdmin.add(jButtonSalir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBarOpcionsAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBarOpcionsAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @param evt 
     */
    private void jButtonCrearEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearEstudianteActionPerformed
        VentanaGestionEstudiante.getInstanceSingleton().setVisible(true);

    }//GEN-LAST:event_jButtonCrearEstudianteActionPerformed

    /**
     * 
     * @param evt 
     */
    private void GenerarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarInformeActionPerformed

        VentanaGenerarInforme.getInstanceSingleton().setVisible(true);

    }//GEN-LAST:event_GenerarInformeActionPerformed

    /**
     * 
     * @param evt 
     */
    private void jButtonModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarDatosActionPerformed

        VentanaModificarDatosAdmin.getInstanceSingleton().setVisible(true);

    }//GEN-LAST:event_jButtonModificarDatosActionPerformed

    /**
     * 
     * @param evt 
     */
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed

        VentanaPrincipal.getInstaceSingleton().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    /**
     * Metodo que sirve para cargar los estudiantes desde un archivo en excel
     *
     * @param evt
     */
    private void jButtonCargarListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarListadoActionPerformed
        try {

            int i = 0;
            File archivo = null;
            String documento;
            String nombres;
            String apellidos;
            String grado;
            String grupo;
            String zonaAlumno;
            String jornada;

            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "Microsoft Excel", "xlsx");
            fileChooser.setFileFilter(filter);
            int seleccion = fileChooser.showOpenDialog(jButtonCargarListado);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                archivo = fileChooser.getSelectedFile();
            }

            if (archivo != null) {
                /*
                 * Obtenemos la primera pestaña a la que se quiera procesar indicando el indice.
                 * Una vez obtenida la hoja excel con las filas que se quieren leer obtenemos el iterator
                 * que nos permite recorrer cada una de las filas que contiene.
                 */
                try ( // Crear el objeto que tendra el libro de Excel
                        XSSFWorkbook workbook = new XSSFWorkbook(archivo)) {
                    /*
                    * Obtenemos la primera pestaña a la que se quiera procesar indicando el indice.
                    * Una vez obtenida la hoja excel con las filas que se quieren leer obtenemos el iterator
                    * que nos permite recorrer cada una de las filas que contiene.
                     */
                    XSSFSheet sheet = workbook.getSheetAt(0);
                    String[] doc;
                    Iterator<Row> rowIterator = sheet.iterator();
                    Row row;
                    Cell celda;
                    //se lee la primera fila que contiene la estructura de los datos
                    row = rowIterator.next();

                    //se verifica que el orden de las columnas este correcto
                    boolean verificacion = validarEstructuraDocumento(row);

                    if (!verificacion) {

                        JOptionPane.showMessageDialog(this, "El orden de las columnas del documento son erroneas", "ERROR",
                                 JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Recorremos todas las filas para mostrar el contenido de cada celda
                        while (rowIterator.hasNext()) {
                            row = rowIterator.next();

  
                        grupo = String.valueOf(row.getCell(0));
                        grado = String.valueOf(row.getCell(1));
                        documento = String.valueOf(row.getCell(2));
                        apellidos = String.valueOf(row.getCell(3));
                        nombres = String.valueOf(row.getCell(4));
                        zonaAlumno = String.valueOf(row.getCell(5));
                        jornada = String.valueOf(row.getCell(6));

                        procesarFila(grupo, grado, documento, apellidos, nombres, zonaAlumno, jornada);
                        i++;
                        }
                        // cerramos el libro excel
                        workbook.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Se registrarón " + i + " estudiantes.");
            }

        } catch (IOException | InvalidFormatException ex) {
            Logger.getLogger(VentanaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonCargarListadoActionPerformed

    /**
     * 
     * @return 
     */
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imagenes/Escudo.png"));

        return retValue;
    }
    
    /**
     * 
     * @param documento
     * @return 
     */
    public boolean validarDoc(String documento) {
        try {

            pst = cn.prepareStatement("select documento from estudiante");
            result = pst.executeQuery();
            while (result.next()) {
                String a = result.getString("documento");
                if (a.equals(documento)) {
                    return true;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(VentanaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    /**
     *
     * @return
     */
    public Date fechaIncio() {
        String date1 = "1999-05-24";
        Date fecha = java.sql.Date.valueOf(date1);
        return fecha;
    }

    String[] doc = new String[2];
    String[] grup = new String[3];

    /**
     * 
     * @param grupo
     * @param grado
     * @param documento
     * @param apellidos
     * @param nombres
     * @param zonaAlumno
     * @param jornada
     * @throws SQLException 
     */
    private void procesarFila(String grupo, String grado, String documento, String apellidos, String nombres, String zonaAlumno, String jornada) throws SQLException {

        documento = documento.replace(".", "");
        doc = documento.split("E");
        documento = doc[0];

        try {
            cn = dataConnection.conexion();
            pst = cn.prepareStatement("insert into estudiante (documento,nombres,apellidos,grado,grupo,"
                    + "zonaAlumno,jornada) values (?,?,?,?,?,?,?)");

            pst.setString(1, documento);
            pst.setString(2, nombres);
            pst.setString(3, apellidos);
            pst.setString(4, grado);
            pst.setString(5, grupo);
            pst.setString(6, zonaAlumno);
            pst.setString(7, jornada);

            int res = pst.executeUpdate();
            if (res > 0) {
                Date fecha = fechaIncio();

                instituto.insertarRegistro(documento, fecha, fecha);
                pst.close();
                cn.close();
            }
        } catch (ParseException ex) {
            Logger.getLogger(VentanaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MySQLIntegrityConstraintViolationException w) {

            pst = cn.prepareStatement(
                    "update estudiante set documento=?,nombres=?,apellidos=?,grado=?,grupo=?,zonaAlumno=?,jornada=? where documento=?");

            pst.setString(1, documento);
            pst.setString(2, nombres);
            pst.setString(3, apellidos);
            pst.setString(4, grado);
            pst.setString(5, grupo);
            pst.setString(6, zonaAlumno);
            pst.setString(7, jornada);
            pst.setString(8, documento);

            int res = pst.executeUpdate();
            if (res > 0) {
                pst.close();
                cn.close();

            }

        } catch (SQLException ex) {
            Logger.getLogger(VentanaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Metodo que permite verificar que el estudiante tenga los dos apellidos
     *
     * @param apell
     * @return
     */
    public boolean validarNombreCompleto(String apell) {

        String[] apellidos = apell.split(" ");
        return apellidos.length == 2;
    }

    /**
     * Metodo el cual valida que la primera fila del documento este en el orden establecido y 
     * que permite leer y cargar los datos de estudiantes de forma correcta
     * @param fila
     * @return
     */
    private boolean validarEstructuraDocumento(Row fila) {
        if (String.valueOf(fila.getCell(0)).equalsIgnoreCase("grupo")
                && String.valueOf(fila.getCell(1)).equalsIgnoreCase("grado")
                && String.valueOf(fila.getCell(2)).equalsIgnoreCase("documento")
                && String.valueOf(fila.getCell(3)).equalsIgnoreCase("apellidos")
                && String.valueOf(fila.getCell(4)).equalsIgnoreCase("nombres")
                && String.valueOf(fila.getCell(5)).equalsIgnoreCase("zonal alumno")
                && String.valueOf(fila.getCell(0)).equalsIgnoreCase("jornada")) {
            return true;
        }
        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenerarInforme;
    private javax.swing.JButton jButtonCargarListado;
    private javax.swing.JButton jButtonCrearEstudiante;
    private javax.swing.JButton jButtonModificarDatos;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JToolBar.Separator jSeparador1;
    private javax.swing.JToolBar.Separator jSeparador5;
    private javax.swing.JToolBar.Separator jSeparador6;
    private javax.swing.JToolBar.Separator jSeparador7;
    private javax.swing.JToolBar jToolBarOpcionsAdmin;
    // End of variables declaration//GEN-END:variables

    
}
