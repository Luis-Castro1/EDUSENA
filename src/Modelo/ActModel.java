/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Timestamp;

public class ActModel {

    private int IdActividad;
    private String Titulo;
    private String Descripcion;
    private Timestamp FechaCreacion;
    private int ProfesorId;
    private String IdCurso;
    private String Materia;
    private int idMateria;
    private String Respuesta;
    private int Periodo;
    private float Nota;
    private int IdRespuesta;
    private int idestudiante;

    public ActModel() {
    }

    public ActModel(int IdActividad, String Titulo, String Descripcion, Timestamp FechaCreacion, int ProfesorId, String IdCurso, String Materia,
            int IdMateria,
            String Respuesta, int Periodo, float Notas, int IdRespuesta, int idestudiante) {
        this.IdActividad = IdActividad;
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.FechaCreacion = FechaCreacion;
        this.ProfesorId = ProfesorId;
        this.IdCurso = IdCurso;
        this.Materia = Materia;
        this.idMateria = idMateria;
        this.Respuesta = Respuesta;
        this.Periodo = Periodo;
        this.Nota = Notas;
        this.IdRespuesta = IdRespuesta;
        this.idestudiante = idestudiante;
    }

    public int getIdActividad() {
        return IdActividad;
    }

    public void setIdActividad(int IdActividad) {
        this.IdActividad = IdActividad;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Timestamp getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Timestamp FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    public int getProfesorId() {
        return ProfesorId;
    }

    public void setProfesorId(int ProfesorId) {
        this.ProfesorId = ProfesorId;
    }

    public String getIdCurso() {
        return IdCurso;
    }

    public void setIdCurso(String IdCurso) {
        this.IdCurso = IdCurso;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public String getRespuesta() {
        return Respuesta;
    }

    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(int Periodo) {
        this.Periodo = Periodo;
    }

    public float getNota() {
        return Nota;
    }

    public void setNota(float Nota) {
        this.Nota = Nota;
    }

    public int getIdRespuesta() {
        return IdRespuesta;
    }

    public void setIdRespuesta(int IdRespuesta) {
        this.IdRespuesta = IdRespuesta;
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

}
