package logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.io.ByteArrayInputStream;

/**
 *
 * @author Maria Alejandra Martos
 * @author Juan Jeferson Alape
 */
public class InstitutoMontenegro {

    private List<Estudiante> estudiantes;
    private Administrador administrador;
    private DataConnection dataconnection;
    private Date fecha = new Date();

    Connection cn;
    PreparedStatement pst;
    ResultSet rst;

    /**
     *
     * @param estudiantes
     * @param administrador
     * @param dataconnection
     * @param fecha
     */
    public InstitutoMontenegro(List<Estudiante> estudiantes, Administrador administrador, DataConnection dataconnection,
            Date fecha) {
        super();
        this.estudiantes = estudiantes;
        this.administrador = administrador;
        this.dataconnection = dataconnection;
        this.fecha = fecha;
    }

    /**
     *
     */
    public InstitutoMontenegro() {
        super();
    }

    /**
     *
     * @return
     */
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    /**
     *
     * @param estudiantes
     */
    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    /**
     *
     * @return
     */
    public Administrador getAdministrador() {
        return administrador;
    }

    /**
     *
     * @param administrador
     */
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    /**
     *
     * @return
     */
    public DataConnection getDataconnection() {
        return dataconnection;
    }

    /**
     *
     * @param dataconnection
     */
    public void setDataconnection(DataConnection dataconnection) {
        this.dataconnection = dataconnection;
    }

    /**
     *
     * @return @throws ParseException
     */
    public java.sql.Date fechaHoy() throws ParseException {

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 0);
        fecha = cal.getTime();

        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = format1.format(cal.getTime());
        fecha = java.sql.Date.valueOf(date1);

        return (java.sql.Date) fecha;

    }

    /**
     *
     * @param documento
     * @param fecha
     * @param ultimoIngreso
     * @throws SQLException
     * @throws ParseException
     */
    public void insertarRegistro(String documento, Date fecha, Date ultimoIngreso) throws SQLException, ParseException {

        cn = DataConnection.conexion();

        pst = cn.prepareStatement(
                "insert into instituto_montenegro (documentoEstudiante,fechaIngreso,ultimoIngreso) values(?,?,?);");

        pst.setString(1, documento);
        pst.setDate(2, (java.sql.Date) fecha);
        pst.setDate(3, (java.sql.Date) ultimoIngreso);

        int res = pst.executeUpdate();
        if (res > 0) {
            System.out.println("El registro se ingreso con exito");

        } else {
            System.out.println("ups...ocurrio un problema");
        }
        cn.close();

    }

    /**
     *
     * @param documento
     * @param fecha
     * @throws SQLException
     * @throws ParseException
     */
    public void insertarRegistro2(int documento, Date fecha) throws SQLException, ParseException {

        cn = DataConnection.conexion();

        pst = cn.prepareStatement(
                "insert into instituto_montenegro2 (documento,fechaIngreso) values(?,?);");

        pst.setInt(1, documento);
        pst.setDate(2, (java.sql.Date) fecha);

        int res = pst.executeUpdate();
        if (res > 0) {
            System.out.println("El registro se ingreso con exito");

        } else {
            System.out.println("ups...ocurrio un problema");
        }
        cn.close();

    }

    /**
     *
     * @param fechaHoy
     * @param ultimoIngresoFecha
     * @return
     */
    public boolean validarFechas(java.sql.Date fechaHoy, java.sql.Date ultimoIngresoFecha) {

        if (ultimoIngresoFecha.compareTo(fechaHoy) == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param documento
     * @return
     */
    public Date ultimaFechaIngreso(String documento) {
        Date ultimoIngreso = null;
        cn = DataConnection.conexion();
        try {
            pst = cn.prepareStatement("select ultimoIngreso from instituto_montenegro WHERE documentoEstudiante=?;");
            pst.setString(1, documento);
            rst = pst.executeQuery();
            if (rst.next()) {
                ultimoIngreso = rst.getDate(1);

            } else {
                System.out.println("error");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(ultimoIngreso);
        return ultimoIngreso;
    }

    /**
     *
     * @param fechaHoy
     * @param documento
     */
    public void actualizarUltimoIngreso(Date fechaHoy, String documento) {

        cn = dataconnection.conexion();
        try {
            pst = cn.prepareStatement("update instituto_montenegro set ultimoIngreso=? WHERE documentoEstudiante=?");
            pst.setDate(1, (java.sql.Date) fechaHoy);
            pst.setString(2, documento);
            int rst = pst.executeUpdate();
            if (rst > 0) {
                System.out.println("correcto");
            } else {
                System.out.println("error");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    

    /**
     *
     * @param documento
     * @param nombre
     * @param apellidos
     * @param grado
     * @param grupo
     * @param zonaAlumno
     * @param jornada
     * @param datosHuella
     * @param tamanoHuella
     * @return 
     * @throws SQLException
     * @throws ParseException
     */
    public boolean guardarEstudiante(String documento, String nombre, String apellidos, String grado,
            int grupo, String zonaAlumno, String jornada, ByteArrayInputStream datosHuella, int tamanoHuella) throws SQLException, ParseException {

        cn = DataConnection.conexion();
        pst = cn.prepareStatement("insert into estudiante (documento,nombres,apellidos,grado,grupo,"
                + "zonaAlumno,jornada,huella) values(?,?,?,?,?,?,?,?)");

        pst.setString(1, documento);
        pst.setString(2, nombre);
        pst.setString(3, apellidos);
        pst.setString(4, grado);
        pst.setInt(5, grupo);
        pst.setString(6, zonaAlumno);
        pst.setString(7, jornada);

        if (tamanoHuella == 0 && datosHuella == null) {
            pst.setBinaryStream(8, null);

        } else {
            pst.setBinaryStream(8, datosHuella, tamanoHuella);
        }

        int res = pst.executeUpdate();
        if (res > 0) {

            java.sql.Date fechaInicio = fechaIncio();
            insertarRegistro(documento, fechaInicio, fechaInicio);
            pst.close();
            cn.close();
            return true;
        }
        return false;
    }

    /**
     * 
     * @param documento
     * @param nombre
     * @param apellidos
     * @param grado
     * @param grupo
     * @param zonaAlumno
     * @param jornada
     * @param datosHuella
     * @param tamanoHuella
     * @return
     * @throws SQLException 
     */
    public boolean actualizarEstudiante(String documento, String nombre, String apellidos, String grado,
            int grupo, String zonaAlumno, String jornada, ByteArrayInputStream datosHuella, int tamanoHuella) throws SQLException {

        cn = DataConnection.conexion();
        pst = cn.prepareStatement(
                "update estudiante set documento=?,nombres=?,apellidos=?,grado=?,grupo=?,zonaAlumno=?,jornada=?,huella=? where documento=?");

        pst.setString(1, documento);
        pst.setString(2, nombre);
        pst.setString(3, apellidos);
        pst.setString(4, grado);
        pst.setInt(5, grupo);
        pst.setString(6, zonaAlumno);
        pst.setString(7, jornada);

        if (datosHuella == null && tamanoHuella == 0) {
            pst.setBinaryStream(8, null);
        } else {
            pst.setBinaryStream(8, datosHuella, tamanoHuella);
        }
        pst.setString(9, documento);

        int res = pst.executeUpdate();
        if (res > 0) {
            pst.close();
            cn.close();
            return true;
        }
        return false;
    }

    /**
     *
     * @return
     */
    public java.sql.Date fechaIncio() {
        String date1 = "1999-05-24";
        java.sql.Date fecha = java.sql.Date.valueOf(date1);
        return fecha;
    }
    
    
    
}
