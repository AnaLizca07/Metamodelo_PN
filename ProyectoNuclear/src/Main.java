import GestionRecursos.Equipo;
import GestionRecursos.Usuario;
import GestionRecursos.impl.EquipoImpl;
import GestionRecursos.impl.UsuarioImpl;

public class Main {
	 public static void main(String[] args) {
	        // Crear usuarios y equipos de manera tradicional
	        Usuario usuario = crearUsuario(1, "CC", "Ana Lizcano", "ana@ejemplo.com", "123456789", "Estudiante");
	        Equipo equipo = crearEquipo("E001", "Laptop", "Dell", "Central", "Activo");

	        // Mostrar los objetos creados
	        System.out.println("Usuario creado: " + usuario.getNombre());
	        System.out.println("Equipo creado: " + equipo.getNombre());
	    }

	    // Método para crear un usuario
	    private static Usuario crearUsuario(int id, String tipoDocumento, String nombre, String correo, String telefono, String rol) {
	        Usuario usuario = new UsuarioImpl();
	        usuario.setId(id);
	        usuario.setTipoDocumento(tipoDocumento);
	        usuario.setNombre(nombre);
	        usuario.setCorreoInstitucional(correo);
	        usuario.setTelefono(telefono);
	        usuario.setRol(rol);

	        return usuario;
	    }

	    // Método para crear un equipo
	    private static Equipo crearEquipo(String id, String nombre, String marca, String sede, String estado) {
	        Equipo equipo = new EquipoImpl();
	        equipo.setId(id);
	        equipo.setNombre(nombre);
	        equipo.setMarca(marca);
	        equipo.setSede(sede);
	        equipo.setEstado(estado);

	        return equipo;
	    }
}
