package entity;

public record Persona(
		String nombre,
	    String apellido,
	    String documento,
	    String fechaNacimiento,
	    String domicilio,
	    String telefono,
	    String localidad,
	    String codigoPostal,
	    String provincia,
	    String mail) {}
