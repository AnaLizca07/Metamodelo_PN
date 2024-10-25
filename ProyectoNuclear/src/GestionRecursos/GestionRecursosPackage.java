/**
 */
package GestionRecursos;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see GestionRecursos.GestionRecursosFactory
 * @model kind="package"
 * @generated
 */
public interface GestionRecursosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GestionRecursos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gestionrecursos";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GestionRecursosPackage eINSTANCE = GestionRecursos.impl.GestionRecursosPackageImpl.init();

	/**
	 * The meta object id for the '{@link GestionRecursos.impl.UsuarioImpl <em>Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GestionRecursos.impl.UsuarioImpl
	 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getUsuario()
	 * @generated
	 */
	int USUARIO = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ID = 0;

	/**
	 * The feature id for the '<em><b>Tipo Documento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__TIPO_DOCUMENTO = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__NOMBRE = 2;

	/**
	 * The feature id for the '<em><b>Correo Institucional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CORREO_INSTITUCIONAL = 3;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__TELEFONO = 4;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ROL = 5;

	/**
	 * The number of structural features of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GestionRecursos.impl.EquipoImpl <em>Equipo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GestionRecursos.impl.EquipoImpl
	 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getEquipo()
	 * @generated
	 */
	int EQUIPO = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPO__ID = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPO__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Marca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPO__MARCA = 2;

	/**
	 * The feature id for the '<em><b>Sede</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPO__SEDE = 3;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPO__ESTADO = 4;

	/**
	 * The number of structural features of the '<em>Equipo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Equipo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GestionRecursos.impl.GestorInventarioImpl <em>Gestor Inventario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GestionRecursos.impl.GestorInventarioImpl
	 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getGestorInventario()
	 * @generated
	 */
	int GESTOR_INVENTARIO = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_INVENTARIO__ID = USUARIO__ID;

	/**
	 * The feature id for the '<em><b>Tipo Documento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_INVENTARIO__TIPO_DOCUMENTO = USUARIO__TIPO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_INVENTARIO__NOMBRE = USUARIO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Correo Institucional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_INVENTARIO__CORREO_INSTITUCIONAL = USUARIO__CORREO_INSTITUCIONAL;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_INVENTARIO__TELEFONO = USUARIO__TELEFONO;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_INVENTARIO__ROL = USUARIO__ROL;

	/**
	 * The feature id for the '<em><b>Nivel Acceso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_INVENTARIO__NIVEL_ACCESO = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gestor Inventario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_INVENTARIO_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gestor Inventario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_INVENTARIO_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GestionRecursos.impl.PrestamoImpl <em>Prestamo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GestionRecursos.impl.PrestamoImpl
	 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getPrestamo()
	 * @generated
	 */
	int PRESTAMO = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTAMO__ID = 0;

	/**
	 * The feature id for the '<em><b>Fecha Prestamo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTAMO__FECHA_PRESTAMO = 1;

	/**
	 * The feature id for the '<em><b>Fecha Devolucion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTAMO__FECHA_DEVOLUCION = 2;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTAMO__ESTADO = 3;

	/**
	 * The feature id for the '<em><b>Acta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTAMO__ACTA = 4;

	/**
	 * The feature id for the '<em><b>Observaciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTAMO__OBSERVACIONES = 5;

	/**
	 * The feature id for the '<em><b>Reserva</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTAMO__RESERVA = 6;

	/**
	 * The number of structural features of the '<em>Prestamo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTAMO_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Prestamo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTAMO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GestionRecursos.impl.ReservaImpl <em>Reserva</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GestionRecursos.impl.ReservaImpl
	 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getReserva()
	 * @generated
	 */
	int RESERVA = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVA__ID = 0;

	/**
	 * The feature id for the '<em><b>Fecha Solicitud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVA__FECHA_SOLICITUD = 1;

	/**
	 * The feature id for the '<em><b>Fecha Reserva</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVA__FECHA_RESERVA = 2;

	/**
	 * The feature id for the '<em><b>Equipo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVA__EQUIPO = 3;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVA__USUARIO = 4;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVA__ESTADO = 5;

	/**
	 * The number of structural features of the '<em>Reserva</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Reserva</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GestionRecursos.impl.NotificacionesImpl <em>Notificaciones</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GestionRecursos.impl.NotificacionesImpl
	 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getNotificaciones()
	 * @generated
	 */
	int NOTIFICACIONES = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICACIONES__ID = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICACIONES__TIPO = 1;

	/**
	 * The feature id for the '<em><b>Copias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICACIONES__COPIAS = 2;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICACIONES__ESTADO = 3;

	/**
	 * The feature id for the '<em><b>Prioridad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICACIONES__PRIORIDAD = 4;

	/**
	 * The number of structural features of the '<em>Notificaciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICACIONES_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Notificaciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICACIONES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GestionRecursos.impl.GestorUsuariosImpl <em>Gestor Usuarios</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GestionRecursos.impl.GestorUsuariosImpl
	 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getGestorUsuarios()
	 * @generated
	 */
	int GESTOR_USUARIOS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_USUARIOS__ID = USUARIO__ID;

	/**
	 * The feature id for the '<em><b>Tipo Documento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_USUARIOS__TIPO_DOCUMENTO = USUARIO__TIPO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_USUARIOS__NOMBRE = USUARIO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Correo Institucional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_USUARIOS__CORREO_INSTITUCIONAL = USUARIO__CORREO_INSTITUCIONAL;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_USUARIOS__TELEFONO = USUARIO__TELEFONO;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_USUARIOS__ROL = USUARIO__ROL;

	/**
	 * The number of structural features of the '<em>Gestor Usuarios</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_USUARIOS_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gestor Usuarios</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_USUARIOS_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GestionRecursos.impl.GestorPrestamosImpl <em>Gestor Prestamos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GestionRecursos.impl.GestorPrestamosImpl
	 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getGestorPrestamos()
	 * @generated
	 */
	int GESTOR_PRESTAMOS = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_PRESTAMOS__ID = USUARIO__ID;

	/**
	 * The feature id for the '<em><b>Tipo Documento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_PRESTAMOS__TIPO_DOCUMENTO = USUARIO__TIPO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_PRESTAMOS__NOMBRE = USUARIO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Correo Institucional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_PRESTAMOS__CORREO_INSTITUCIONAL = USUARIO__CORREO_INSTITUCIONAL;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_PRESTAMOS__TELEFONO = USUARIO__TELEFONO;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_PRESTAMOS__ROL = USUARIO__ROL;

	/**
	 * The feature id for the '<em><b>Notificaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_PRESTAMOS__NOTIFICACIONES = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gestor Prestamos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_PRESTAMOS_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gestor Prestamos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_PRESTAMOS_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GestionRecursos.impl.InventarioImpl <em>Inventario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GestionRecursos.impl.InventarioImpl
	 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getInventario()
	 * @generated
	 */
	int INVENTARIO = 8;

	/**
	 * The feature id for the '<em><b>Reporte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTARIO__REPORTE = 0;

	/**
	 * The feature id for the '<em><b>Equipos Tecnologicos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTARIO__EQUIPOS_TECNOLOGICOS = 1;

	/**
	 * The feature id for the '<em><b>Administrador</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTARIO__ADMINISTRADOR = 2;

	/**
	 * The feature id for the '<em><b>Estado Elementos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTARIO__ESTADO_ELEMENTOS = 3;

	/**
	 * The number of structural features of the '<em>Inventario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTARIO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Inventario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GestionRecursos.impl.ActasImpl <em>Actas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GestionRecursos.impl.ActasImpl
	 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getActas()
	 * @generated
	 */
	int ACTAS = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTAS__ID = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTAS__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTAS__TIPO = 2;

	/**
	 * The feature id for the '<em><b>Formato Archivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTAS__FORMATO_ARCHIVO = 3;

	/**
	 * The number of structural features of the '<em>Actas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTAS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Actas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTAS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link GestionRecursos.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuario</em>'.
	 * @see GestionRecursos.Usuario
	 * @generated
	 */
	EClass getUsuario();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Usuario#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see GestionRecursos.Usuario#getId()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Id();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Usuario#getTipoDocumento <em>Tipo Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Documento</em>'.
	 * @see GestionRecursos.Usuario#getTipoDocumento()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_TipoDocumento();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Usuario#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see GestionRecursos.Usuario#getNombre()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Usuario#getCorreoInstitucional <em>Correo Institucional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correo Institucional</em>'.
	 * @see GestionRecursos.Usuario#getCorreoInstitucional()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_CorreoInstitucional();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Usuario#getTelefono <em>Telefono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefono</em>'.
	 * @see GestionRecursos.Usuario#getTelefono()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Telefono();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Usuario#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol</em>'.
	 * @see GestionRecursos.Usuario#getRol()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Rol();

	/**
	 * Returns the meta object for class '{@link GestionRecursos.Equipo <em>Equipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipo</em>'.
	 * @see GestionRecursos.Equipo
	 * @generated
	 */
	EClass getEquipo();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Equipo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see GestionRecursos.Equipo#getId()
	 * @see #getEquipo()
	 * @generated
	 */
	EAttribute getEquipo_Id();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Equipo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see GestionRecursos.Equipo#getNombre()
	 * @see #getEquipo()
	 * @generated
	 */
	EAttribute getEquipo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Equipo#getMarca <em>Marca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marca</em>'.
	 * @see GestionRecursos.Equipo#getMarca()
	 * @see #getEquipo()
	 * @generated
	 */
	EAttribute getEquipo_Marca();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Equipo#getSede <em>Sede</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sede</em>'.
	 * @see GestionRecursos.Equipo#getSede()
	 * @see #getEquipo()
	 * @generated
	 */
	EAttribute getEquipo_Sede();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Equipo#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see GestionRecursos.Equipo#getEstado()
	 * @see #getEquipo()
	 * @generated
	 */
	EAttribute getEquipo_Estado();

	/**
	 * Returns the meta object for class '{@link GestionRecursos.GestorInventario <em>Gestor Inventario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gestor Inventario</em>'.
	 * @see GestionRecursos.GestorInventario
	 * @generated
	 */
	EClass getGestorInventario();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.GestorInventario#getNivelAcceso <em>Nivel Acceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nivel Acceso</em>'.
	 * @see GestionRecursos.GestorInventario#getNivelAcceso()
	 * @see #getGestorInventario()
	 * @generated
	 */
	EAttribute getGestorInventario_NivelAcceso();

	/**
	 * Returns the meta object for class '{@link GestionRecursos.Prestamo <em>Prestamo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prestamo</em>'.
	 * @see GestionRecursos.Prestamo
	 * @generated
	 */
	EClass getPrestamo();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Prestamo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see GestionRecursos.Prestamo#getId()
	 * @see #getPrestamo()
	 * @generated
	 */
	EAttribute getPrestamo_Id();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Prestamo#getFechaPrestamo <em>Fecha Prestamo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Prestamo</em>'.
	 * @see GestionRecursos.Prestamo#getFechaPrestamo()
	 * @see #getPrestamo()
	 * @generated
	 */
	EAttribute getPrestamo_FechaPrestamo();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Prestamo#getFechaDevolucion <em>Fecha Devolucion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Devolucion</em>'.
	 * @see GestionRecursos.Prestamo#getFechaDevolucion()
	 * @see #getPrestamo()
	 * @generated
	 */
	EAttribute getPrestamo_FechaDevolucion();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Prestamo#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see GestionRecursos.Prestamo#getEstado()
	 * @see #getPrestamo()
	 * @generated
	 */
	EAttribute getPrestamo_Estado();

	/**
	 * Returns the meta object for the reference '{@link GestionRecursos.Prestamo#getActa <em>Acta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Acta</em>'.
	 * @see GestionRecursos.Prestamo#getActa()
	 * @see #getPrestamo()
	 * @generated
	 */
	EReference getPrestamo_Acta();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Prestamo#getObservaciones <em>Observaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observaciones</em>'.
	 * @see GestionRecursos.Prestamo#getObservaciones()
	 * @see #getPrestamo()
	 * @generated
	 */
	EAttribute getPrestamo_Observaciones();

	/**
	 * Returns the meta object for the reference '{@link GestionRecursos.Prestamo#getReserva <em>Reserva</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reserva</em>'.
	 * @see GestionRecursos.Prestamo#getReserva()
	 * @see #getPrestamo()
	 * @generated
	 */
	EReference getPrestamo_Reserva();

	/**
	 * Returns the meta object for class '{@link GestionRecursos.Reserva <em>Reserva</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reserva</em>'.
	 * @see GestionRecursos.Reserva
	 * @generated
	 */
	EClass getReserva();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Reserva#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see GestionRecursos.Reserva#getId()
	 * @see #getReserva()
	 * @generated
	 */
	EAttribute getReserva_Id();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Reserva#getFechaSolicitud <em>Fecha Solicitud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Solicitud</em>'.
	 * @see GestionRecursos.Reserva#getFechaSolicitud()
	 * @see #getReserva()
	 * @generated
	 */
	EAttribute getReserva_FechaSolicitud();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Reserva#getFechaReserva <em>Fecha Reserva</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Reserva</em>'.
	 * @see GestionRecursos.Reserva#getFechaReserva()
	 * @see #getReserva()
	 * @generated
	 */
	EAttribute getReserva_FechaReserva();

	/**
	 * Returns the meta object for the reference '{@link GestionRecursos.Reserva#getEquipo <em>Equipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equipo</em>'.
	 * @see GestionRecursos.Reserva#getEquipo()
	 * @see #getReserva()
	 * @generated
	 */
	EReference getReserva_Equipo();

	/**
	 * Returns the meta object for the reference '{@link GestionRecursos.Reserva#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usuario</em>'.
	 * @see GestionRecursos.Reserva#getUsuario()
	 * @see #getReserva()
	 * @generated
	 */
	EReference getReserva_Usuario();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Reserva#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see GestionRecursos.Reserva#getEstado()
	 * @see #getReserva()
	 * @generated
	 */
	EAttribute getReserva_Estado();

	/**
	 * Returns the meta object for class '{@link GestionRecursos.Notificaciones <em>Notificaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notificaciones</em>'.
	 * @see GestionRecursos.Notificaciones
	 * @generated
	 */
	EClass getNotificaciones();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Notificaciones#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see GestionRecursos.Notificaciones#getId()
	 * @see #getNotificaciones()
	 * @generated
	 */
	EAttribute getNotificaciones_Id();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Notificaciones#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see GestionRecursos.Notificaciones#getTipo()
	 * @see #getNotificaciones()
	 * @generated
	 */
	EAttribute getNotificaciones_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Notificaciones#getCopias <em>Copias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copias</em>'.
	 * @see GestionRecursos.Notificaciones#getCopias()
	 * @see #getNotificaciones()
	 * @generated
	 */
	EAttribute getNotificaciones_Copias();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Notificaciones#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see GestionRecursos.Notificaciones#getEstado()
	 * @see #getNotificaciones()
	 * @generated
	 */
	EAttribute getNotificaciones_Estado();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Notificaciones#getPrioridad <em>Prioridad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prioridad</em>'.
	 * @see GestionRecursos.Notificaciones#getPrioridad()
	 * @see #getNotificaciones()
	 * @generated
	 */
	EAttribute getNotificaciones_Prioridad();

	/**
	 * Returns the meta object for class '{@link GestionRecursos.GestorUsuarios <em>Gestor Usuarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gestor Usuarios</em>'.
	 * @see GestionRecursos.GestorUsuarios
	 * @generated
	 */
	EClass getGestorUsuarios();

	/**
	 * Returns the meta object for class '{@link GestionRecursos.GestorPrestamos <em>Gestor Prestamos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gestor Prestamos</em>'.
	 * @see GestionRecursos.GestorPrestamos
	 * @generated
	 */
	EClass getGestorPrestamos();

	/**
	 * Returns the meta object for the reference list '{@link GestionRecursos.GestorPrestamos#getNotificaciones <em>Notificaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Notificaciones</em>'.
	 * @see GestionRecursos.GestorPrestamos#getNotificaciones()
	 * @see #getGestorPrestamos()
	 * @generated
	 */
	EReference getGestorPrestamos_Notificaciones();

	/**
	 * Returns the meta object for class '{@link GestionRecursos.Inventario <em>Inventario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventario</em>'.
	 * @see GestionRecursos.Inventario
	 * @generated
	 */
	EClass getInventario();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Inventario#getReporte <em>Reporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reporte</em>'.
	 * @see GestionRecursos.Inventario#getReporte()
	 * @see #getInventario()
	 * @generated
	 */
	EAttribute getInventario_Reporte();

	/**
	 * Returns the meta object for the reference '{@link GestionRecursos.Inventario#getEquiposTecnologicos <em>Equipos Tecnologicos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equipos Tecnologicos</em>'.
	 * @see GestionRecursos.Inventario#getEquiposTecnologicos()
	 * @see #getInventario()
	 * @generated
	 */
	EReference getInventario_EquiposTecnologicos();

	/**
	 * Returns the meta object for the reference list '{@link GestionRecursos.Inventario#getAdministrador <em>Administrador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Administrador</em>'.
	 * @see GestionRecursos.Inventario#getAdministrador()
	 * @see #getInventario()
	 * @generated
	 */
	EReference getInventario_Administrador();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Inventario#getEstadoElementos <em>Estado Elementos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado Elementos</em>'.
	 * @see GestionRecursos.Inventario#getEstadoElementos()
	 * @see #getInventario()
	 * @generated
	 */
	EAttribute getInventario_EstadoElementos();

	/**
	 * Returns the meta object for class '{@link GestionRecursos.Actas <em>Actas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actas</em>'.
	 * @see GestionRecursos.Actas
	 * @generated
	 */
	EClass getActas();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Actas#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see GestionRecursos.Actas#getId()
	 * @see #getActas()
	 * @generated
	 */
	EAttribute getActas_Id();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Actas#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see GestionRecursos.Actas#getNombre()
	 * @see #getActas()
	 * @generated
	 */
	EAttribute getActas_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Actas#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see GestionRecursos.Actas#getTipo()
	 * @see #getActas()
	 * @generated
	 */
	EAttribute getActas_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link GestionRecursos.Actas#getFormatoArchivo <em>Formato Archivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formato Archivo</em>'.
	 * @see GestionRecursos.Actas#getFormatoArchivo()
	 * @see #getActas()
	 * @generated
	 */
	EAttribute getActas_FormatoArchivo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GestionRecursosFactory getGestionRecursosFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link GestionRecursos.impl.UsuarioImpl <em>Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GestionRecursos.impl.UsuarioImpl
		 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getUsuario()
		 * @generated
		 */
		EClass USUARIO = eINSTANCE.getUsuario();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ID = eINSTANCE.getUsuario_Id();

		/**
		 * The meta object literal for the '<em><b>Tipo Documento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__TIPO_DOCUMENTO = eINSTANCE.getUsuario_TipoDocumento();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__NOMBRE = eINSTANCE.getUsuario_Nombre();

		/**
		 * The meta object literal for the '<em><b>Correo Institucional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CORREO_INSTITUCIONAL = eINSTANCE.getUsuario_CorreoInstitucional();

		/**
		 * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__TELEFONO = eINSTANCE.getUsuario_Telefono();

		/**
		 * The meta object literal for the '<em><b>Rol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ROL = eINSTANCE.getUsuario_Rol();

		/**
		 * The meta object literal for the '{@link GestionRecursos.impl.EquipoImpl <em>Equipo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GestionRecursos.impl.EquipoImpl
		 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getEquipo()
		 * @generated
		 */
		EClass EQUIPO = eINSTANCE.getEquipo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPO__ID = eINSTANCE.getEquipo_Id();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPO__NOMBRE = eINSTANCE.getEquipo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Marca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPO__MARCA = eINSTANCE.getEquipo_Marca();

		/**
		 * The meta object literal for the '<em><b>Sede</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPO__SEDE = eINSTANCE.getEquipo_Sede();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPO__ESTADO = eINSTANCE.getEquipo_Estado();

		/**
		 * The meta object literal for the '{@link GestionRecursos.impl.GestorInventarioImpl <em>Gestor Inventario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GestionRecursos.impl.GestorInventarioImpl
		 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getGestorInventario()
		 * @generated
		 */
		EClass GESTOR_INVENTARIO = eINSTANCE.getGestorInventario();

		/**
		 * The meta object literal for the '<em><b>Nivel Acceso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GESTOR_INVENTARIO__NIVEL_ACCESO = eINSTANCE.getGestorInventario_NivelAcceso();

		/**
		 * The meta object literal for the '{@link GestionRecursos.impl.PrestamoImpl <em>Prestamo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GestionRecursos.impl.PrestamoImpl
		 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getPrestamo()
		 * @generated
		 */
		EClass PRESTAMO = eINSTANCE.getPrestamo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESTAMO__ID = eINSTANCE.getPrestamo_Id();

		/**
		 * The meta object literal for the '<em><b>Fecha Prestamo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESTAMO__FECHA_PRESTAMO = eINSTANCE.getPrestamo_FechaPrestamo();

		/**
		 * The meta object literal for the '<em><b>Fecha Devolucion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESTAMO__FECHA_DEVOLUCION = eINSTANCE.getPrestamo_FechaDevolucion();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESTAMO__ESTADO = eINSTANCE.getPrestamo_Estado();

		/**
		 * The meta object literal for the '<em><b>Acta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESTAMO__ACTA = eINSTANCE.getPrestamo_Acta();

		/**
		 * The meta object literal for the '<em><b>Observaciones</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESTAMO__OBSERVACIONES = eINSTANCE.getPrestamo_Observaciones();

		/**
		 * The meta object literal for the '<em><b>Reserva</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESTAMO__RESERVA = eINSTANCE.getPrestamo_Reserva();

		/**
		 * The meta object literal for the '{@link GestionRecursos.impl.ReservaImpl <em>Reserva</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GestionRecursos.impl.ReservaImpl
		 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getReserva()
		 * @generated
		 */
		EClass RESERVA = eINSTANCE.getReserva();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVA__ID = eINSTANCE.getReserva_Id();

		/**
		 * The meta object literal for the '<em><b>Fecha Solicitud</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVA__FECHA_SOLICITUD = eINSTANCE.getReserva_FechaSolicitud();

		/**
		 * The meta object literal for the '<em><b>Fecha Reserva</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVA__FECHA_RESERVA = eINSTANCE.getReserva_FechaReserva();

		/**
		 * The meta object literal for the '<em><b>Equipo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVA__EQUIPO = eINSTANCE.getReserva_Equipo();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVA__USUARIO = eINSTANCE.getReserva_Usuario();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVA__ESTADO = eINSTANCE.getReserva_Estado();

		/**
		 * The meta object literal for the '{@link GestionRecursos.impl.NotificacionesImpl <em>Notificaciones</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GestionRecursos.impl.NotificacionesImpl
		 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getNotificaciones()
		 * @generated
		 */
		EClass NOTIFICACIONES = eINSTANCE.getNotificaciones();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICACIONES__ID = eINSTANCE.getNotificaciones_Id();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICACIONES__TIPO = eINSTANCE.getNotificaciones_Tipo();

		/**
		 * The meta object literal for the '<em><b>Copias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICACIONES__COPIAS = eINSTANCE.getNotificaciones_Copias();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICACIONES__ESTADO = eINSTANCE.getNotificaciones_Estado();

		/**
		 * The meta object literal for the '<em><b>Prioridad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICACIONES__PRIORIDAD = eINSTANCE.getNotificaciones_Prioridad();

		/**
		 * The meta object literal for the '{@link GestionRecursos.impl.GestorUsuariosImpl <em>Gestor Usuarios</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GestionRecursos.impl.GestorUsuariosImpl
		 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getGestorUsuarios()
		 * @generated
		 */
		EClass GESTOR_USUARIOS = eINSTANCE.getGestorUsuarios();

		/**
		 * The meta object literal for the '{@link GestionRecursos.impl.GestorPrestamosImpl <em>Gestor Prestamos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GestionRecursos.impl.GestorPrestamosImpl
		 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getGestorPrestamos()
		 * @generated
		 */
		EClass GESTOR_PRESTAMOS = eINSTANCE.getGestorPrestamos();

		/**
		 * The meta object literal for the '<em><b>Notificaciones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GESTOR_PRESTAMOS__NOTIFICACIONES = eINSTANCE.getGestorPrestamos_Notificaciones();

		/**
		 * The meta object literal for the '{@link GestionRecursos.impl.InventarioImpl <em>Inventario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GestionRecursos.impl.InventarioImpl
		 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getInventario()
		 * @generated
		 */
		EClass INVENTARIO = eINSTANCE.getInventario();

		/**
		 * The meta object literal for the '<em><b>Reporte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTARIO__REPORTE = eINSTANCE.getInventario_Reporte();

		/**
		 * The meta object literal for the '<em><b>Equipos Tecnologicos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTARIO__EQUIPOS_TECNOLOGICOS = eINSTANCE.getInventario_EquiposTecnologicos();

		/**
		 * The meta object literal for the '<em><b>Administrador</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTARIO__ADMINISTRADOR = eINSTANCE.getInventario_Administrador();

		/**
		 * The meta object literal for the '<em><b>Estado Elementos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTARIO__ESTADO_ELEMENTOS = eINSTANCE.getInventario_EstadoElementos();

		/**
		 * The meta object literal for the '{@link GestionRecursos.impl.ActasImpl <em>Actas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GestionRecursos.impl.ActasImpl
		 * @see GestionRecursos.impl.GestionRecursosPackageImpl#getActas()
		 * @generated
		 */
		EClass ACTAS = eINSTANCE.getActas();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTAS__ID = eINSTANCE.getActas_Id();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTAS__NOMBRE = eINSTANCE.getActas_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTAS__TIPO = eINSTANCE.getActas_Tipo();

		/**
		 * The meta object literal for the '<em><b>Formato Archivo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTAS__FORMATO_ARCHIVO = eINSTANCE.getActas_FormatoArchivo();

	}

} //GestionRecursosPackage
