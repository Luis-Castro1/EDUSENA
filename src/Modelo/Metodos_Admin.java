package Modelo;

import Modelo.Estudiantes_Modelo;
import Vista.Admin;
import Vista.Students;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Metodos_Admin extends Conexion {

    private final Students students = new Students();//Formulario students
    Estudiantes_Modelo mdl = new Estudiantes_Modelo();//Modelo estudiantes
    ProfModel pmdl = new ProfModel();//Modelo Profesor
    Admin admin = new Admin();//Formulario Admin

    //////////////////Estudiantes \\\\\\\\\\\\\\\\\\\\\\\\\\\
    public int create_Student(Estudiantes_Modelo mdl) {//Metodo para crear estudiantes en la bd
        int r = 1;

        try {

            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO estudiantes (id_Estudiante, Nombres, Apellidos, Fecha_Nacimiento, Direccion,Telefono, Email, Contraseña,Sexo) VALUES (?,?,?,?,?,?,?,?,?)");

            ps.setInt(1, mdl.getid_Estudiante());
            ps.setString(2, mdl.getNombres());
            ps.setString(3, mdl.getApellidos());
            ps.setString(4, mdl.getFecha_Nacimiento());
            ps.setString(5, mdl.getDireccion());
            ps.setLong(6, mdl.getTelefono());
            ps.setString(7, mdl.getEmail());
            ps.setString(8, mdl.getContraseña());
            ps.setString(9, mdl.getSexo());
           // ps.setString(10, mdl.getId_Curso());
            ps.executeUpdate();
            if (r == 1) {

                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

        return r;

    }

    //Método para actualizar registros
    public int modificar(Estudiantes_Modelo mdl) {
        int r = 1;
        String sql = "UPDATE estudiantes SET Nombres=?, Apellidos=?, Fecha_Nacimiento=?, Direccion=?,Telefono=?,Email=?,Contraseña=?,Sexo=? WHERE id_Estudiante=?";
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mdl.getNombres());
            ps.setString(2, mdl.getApellidos());
            ps.setString(3, mdl.getFecha_Nacimiento());
            ps.setString(4, mdl.getDireccion());
            ps.setString(5, Long.toString(mdl.getTelefono()));
            ps.setString(6, mdl.getEmail());
            ps.setString(7, mdl.getContraseña());
            ps.setString(8, mdl.getSexo());
            ps.setString(9, Integer.toString(mdl.getid_Estudiante()));
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("No se pudo modificar");
            System.out.println(e);
            return 0;
        }
        return 1;
    }

    //Método para eliminar registro por documento
    public void eliminar(int doc) {
        String sql = "DELETE FROM estudiantes WHERE id_Estudiante = " + doc;

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("No se pudo eliminar");
            System.out.println(e);

        }

    }

    public int matricular(Estudiantes_Modelo mdl) {
        int r = 1;
        String sql = "UPDATE estudiantes SET id_Curso=? WHERE id_Estudiante=?";
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mdl.getId_Curso());
            ps.setString(2, Integer.toString(mdl.getid_Estudiante()));
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("No se pudo modificar");
            System.out.println(e);
            return 0;
        }
        return 1;
    }

    public int retirar_matricula(Estudiantes_Modelo mdl) {
        int r = 1;
        String sql = "UPDATE estudiantes SET id_Curso=? WHERE id_Estudiante=?";
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mdl.getId_Curso());
            ps.setString(2, Integer.toString(mdl.getid_Estudiante()));
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("No se pudo modificar");
            System.out.println(e);
            return 0;
        }
        return 1;
    }

    public int show_e() {//Metodo para mostrar el formulario Student
        int r = 1;
        if (r == 1) {

            return 1;
        } else {
            return 0;
        }
    }

    //////////////////Profesores \\\\\\\\\\\\\\\\\\\\\\\\\\\
    public int createProf(ProfModel pmdl) {//Metodo para crear profesores en la bd
        int r = 1;

        try {

            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO profesores (id_Profesor, Nombres, Apellidos, Direccion,Telefono, Email, Contraseña, Profesion, id_Materia) VALUES (?,?,?,?,?,?,?,?,?)");

            ps.setLong(1, pmdl.getId_Profesor());
            ps.setString(2, pmdl.getNombres());
            ps.setString(3, pmdl.getApellidos());
            ps.setString(4, pmdl.getDireccion());
            ps.setLong(5, pmdl.getTelefono());
            ps.setString(6, pmdl.getEmail());
            ps.setString(7, pmdl.getContraseña());
            ps.setString(8, pmdl.getProfesion());
            ps.setInt(9, pmdl.getIdMateria());
            ps.executeUpdate();
            if (r == 1) {

                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

        return r;

    }

    //Método para actualizar registros
    public int modificarP(ProfModel pmdl) {
        int r = 1;
        String sql = "UPDATE profesores SET Nombres=?, Apellidos=?, Direccion=?, Telefono=?, Email=?, Contraseña=?, Profesion=? WHERE id_Profesor=?";
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pmdl.getNombres());
            ps.setString(2, pmdl.getApellidos());
            ps.setString(3, pmdl.getDireccion());
            ps.setString(4, Long.toString(pmdl.getTelefono()));
            ps.setString(5, pmdl.getEmail());
            ps.setString(6, pmdl.getContraseña());
            ps.setString(7, pmdl.getProfesion());
            ps.setString(8, Long.toString(pmdl.getId_Profesor()));
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("No se pudo modificar");
            System.out.println(e);
            return 0;
        }
        return 1;
    }

    //Método para asignar un curso
    public int asignarcurso(ProfModel pmdl) {
        int r = 1;
        String sql = "UPDATE profesores SET id_Curso=? WHERE id_Profesor=?";
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pmdl.getidCurso());
            ps.setString(2, Long.toString(pmdl.getId_Profesor()));
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("No se pudo modificar");
            System.out.println(e);
            return 0;
        }
        return 1;
    }

    //Método para eliminar registro por documento
    public void eliminarP(int doc) {
        String sql = "DELETE FROM profesores WHERE id_Profesor = " + doc;

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("No se pudo eliminar");
            System.out.println(e);

        }

    }
}
