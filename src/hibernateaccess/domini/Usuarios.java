package hibernateaccess.domini;
// Generated Dec 14, 2016 3:52:19 PM by Hibernate Tools 4.3.1



/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private String dowId;
     private String nombre;
     private String apellidos;
     private Double vacacionesPendientes;
     private Double vacacionesPendientesArrastradas;
     private Double vacacionesDisfrutadas;
     private String departamento;
     private String planta;
     private String localizacion;
     private String funcion;
     private Double vacaciones;

    public Usuarios() {
    }

	
    public Usuarios(String dowId) {
        this.dowId = dowId;
    }

    public Usuarios(String dowId, String nombre, String apellidos) {
        this.dowId = dowId;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public Usuarios(String dowId, String nombre, String apellidos, Double vacacionesPendientes, Double vacacionesPendientesArrastradas, Double vacacionesDisfrutadas, String departamento, String planta, String localizacion, String funcion, Double vacaciones) {
       this.dowId = dowId;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.vacacionesPendientes = vacacionesPendientes;
       this.vacacionesPendientesArrastradas = vacacionesPendientesArrastradas;
       this.vacacionesDisfrutadas = vacacionesDisfrutadas;
       this.departamento = departamento;
       this.planta = planta;
       this.localizacion = localizacion;
       this.funcion = funcion;
       this.vacaciones = vacaciones;
    }
   
    public String getDowId() {
        return this.dowId;
    }
    
    public void setDowId(String dowId) {
        this.dowId = dowId;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Double getVacacionesPendientes() {
        return this.vacacionesPendientes;
    }
    
    public void setVacacionesPendientes(Double vacacionesPendientes) {
        this.vacacionesPendientes = vacacionesPendientes;
    }
    public Double getVacacionesPendientesArrastradas() {
        return this.vacacionesPendientesArrastradas;
    }
    
    public void setVacacionesPendientesArrastradas(Double vacacionesPendientesArrastradas) {
        this.vacacionesPendientesArrastradas = vacacionesPendientesArrastradas;
    }
    public Double getVacacionesDisfrutadas() {
        return this.vacacionesDisfrutadas;
    }
    
    public void setVacacionesDisfrutadas(Double vacacionesDisfrutadas) {
        this.vacacionesDisfrutadas = vacacionesDisfrutadas;
    }
    public String getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getPlanta() {
        return this.planta;
    }
    
    public void setPlanta(String planta) {
        this.planta = planta;
    }
    public String getLocalizacion() {
        return this.localizacion;
    }
    
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    public String getFuncion() {
        return this.funcion;
    }
    
    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    public Double getVacaciones() {
        return this.vacaciones;
    }
    
    public void setVacaciones(Double vacaciones) {
        this.vacaciones = vacaciones;
    }




}


