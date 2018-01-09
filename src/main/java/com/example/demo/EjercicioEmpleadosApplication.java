package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */
public class EjercicioEmpleadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioEmpleadosApplication.class, args);
		
		Departamento dept = new Departamento("Informatica", "Gran Via Parque 2", "954232124");
		Empleado emp = new Empleado("Antonio", "Rodriguez", "Calle Olmo 2", "33001753Z", "arodriguez@gmail.com");
		emp.setDepartamento("Informatica", "Gran Via Parque 2", "954232124");
		dept.setDirector("Antonio", "Rodriguez", "Calle Olmo 2", "33001753Z", "arodriguez@gmail.com");
		
		System.out.println("El director del departamento" + dept.getNombre() +" es " + dept.getDirector().getNombre() +" "+ dept.getDirector().getApellido());
	}
}
