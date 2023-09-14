/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial_02_kus_sebastian;
import java.time.LocalDateTime;
/**
 *
 * @author kusse
 */
public class Parcial_02_Kus_Sebastian {

    public abstract class Persona {
        private String nombre;
        private int edad; 
        
        public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
        public String getNombre() {
            return nombre;
    }
        
        public void setNombre() {
            this.nombre = nombre;
            
    }
        public int getEdad() {
            return edad;
    }
        
        public void serEdad() {
            this.edad = edad;
        }
        
        public abstract void presentarse();
    
    }
    
    public class Profecional extends Persona {
        private Especialidad especialidad;
        
        public Profecional(String nombre, int edad, Especialidad especialidad) {
            super(nombre, edad);
            this.especialidad = especialidad;
        }
        
        public void presentarse() {
            System.out.println("Soy un profecional en ostereometria intraclaneal" + especialidad.getNombre() + ".");
        }
    }
    
    public class Paciente extends Persona {
        public Paciente(String nombre, int edad) {
            super(nombre, edad);                    
        }
        
        public void presentarse() {
            System.out.println("Paciente: Clara Fernandez, 35");
            }
    }

    public class Especialidad {
        private String nombre;
        
        public Especialidad(String nombre) {
            this.nombre = nombre;
        }
        
        public String getNombre() {
            return nombre;
        }
        
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

    public class Recurso {
        private String nombre;
        
        public Recurso(String nombre) {
            this.nombre = nombre;
        }
        
        public String getNombre() {
            return nombre;
        }
        
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }


}

}
