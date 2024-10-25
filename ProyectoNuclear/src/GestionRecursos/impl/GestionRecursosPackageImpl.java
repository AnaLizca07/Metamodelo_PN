/**
 */
package GestionRecursos.impl;

import GestionRecursos.Actas;
import GestionRecursos.Equipo;
import GestionRecursos.GestionRecursosFactory;
import GestionRecursos.GestionRecursosPackage;
import GestionRecursos.GestorInventario;
import GestionRecursos.GestorPrestamos;
import GestionRecursos.GestorUsuarios;
import GestionRecursos.Inventario;
import GestionRecursos.Notificaciones;
import GestionRecursos.Prestamo;
import GestionRecursos.Reserva;
import GestionRecursos.Usuario;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GestionRecursosPackageImpl extends EPackageImpl implements GestionRecursosPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usuarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gestorInventarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prestamoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificacionesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gestorUsuariosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gestorPrestamosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actasEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see GestionRecursos.GestionRecursosPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GestionRecursosPackageImpl() {
		super(eNS_URI, GestionRecursosFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GestionRecursosPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GestionRecursosPackage init() {
		if (isInited) return (GestionRecursosPackage)EPackage.Registry.INSTANCE.getEPackage(GestionRecursosPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGestionRecursosPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GestionRecursosPackageImpl theGestionRecursosPackage = registeredGestionRecursosPackage instanceof GestionRecursosPackageImpl ? (GestionRecursosPackageImpl)registeredGestionRecursosPackage : new GestionRecursosPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGestionRecursosPackage.createPackageContents();

		// Initialize created meta-data
		theGestionRecursosPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGestionRecursosPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GestionRecursosPackage.eNS_URI, theGestionRecursosPackage);
		return theGestionRecursosPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsuario() {
		return usuarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_Id() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_TipoDocumento() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_Nombre() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_CorreoInstitucional() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_Telefono() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_Rol() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEquipo() {
		return equipoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEquipo_Id() {
		return (EAttribute)equipoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEquipo_Nombre() {
		return (EAttribute)equipoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEquipo_Marca() {
		return (EAttribute)equipoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEquipo_Sede() {
		return (EAttribute)equipoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEquipo_Estado() {
		return (EAttribute)equipoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGestorInventario() {
		return gestorInventarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGestorInventario_NivelAcceso() {
		return (EAttribute)gestorInventarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrestamo() {
		return prestamoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrestamo_Id() {
		return (EAttribute)prestamoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrestamo_FechaPrestamo() {
		return (EAttribute)prestamoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrestamo_FechaDevolucion() {
		return (EAttribute)prestamoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrestamo_Estado() {
		return (EAttribute)prestamoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrestamo_Acta() {
		return (EReference)prestamoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrestamo_Observaciones() {
		return (EAttribute)prestamoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrestamo_Reserva() {
		return (EReference)prestamoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReserva() {
		return reservaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReserva_Id() {
		return (EAttribute)reservaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReserva_FechaSolicitud() {
		return (EAttribute)reservaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReserva_FechaReserva() {
		return (EAttribute)reservaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReserva_Equipo() {
		return (EReference)reservaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReserva_Usuario() {
		return (EReference)reservaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReserva_Estado() {
		return (EAttribute)reservaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotificaciones() {
		return notificacionesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotificaciones_Id() {
		return (EAttribute)notificacionesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotificaciones_Tipo() {
		return (EAttribute)notificacionesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotificaciones_Copias() {
		return (EAttribute)notificacionesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotificaciones_Estado() {
		return (EAttribute)notificacionesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotificaciones_Prioridad() {
		return (EAttribute)notificacionesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGestorUsuarios() {
		return gestorUsuariosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGestorPrestamos() {
		return gestorPrestamosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGestorPrestamos_Notificaciones() {
		return (EReference)gestorPrestamosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventario() {
		return inventarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventario_Reporte() {
		return (EAttribute)inventarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventario_EquiposTecnologicos() {
		return (EReference)inventarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventario_Administrador() {
		return (EReference)inventarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventario_EstadoElementos() {
		return (EAttribute)inventarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActas() {
		return actasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActas_Id() {
		return (EAttribute)actasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActas_Nombre() {
		return (EAttribute)actasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActas_Tipo() {
		return (EAttribute)actasEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActas_FormatoArchivo() {
		return (EAttribute)actasEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GestionRecursosFactory getGestionRecursosFactory() {
		return (GestionRecursosFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		usuarioEClass = createEClass(USUARIO);
		createEAttribute(usuarioEClass, USUARIO__ID);
		createEAttribute(usuarioEClass, USUARIO__TIPO_DOCUMENTO);
		createEAttribute(usuarioEClass, USUARIO__NOMBRE);
		createEAttribute(usuarioEClass, USUARIO__CORREO_INSTITUCIONAL);
		createEAttribute(usuarioEClass, USUARIO__TELEFONO);
		createEAttribute(usuarioEClass, USUARIO__ROL);

		equipoEClass = createEClass(EQUIPO);
		createEAttribute(equipoEClass, EQUIPO__ID);
		createEAttribute(equipoEClass, EQUIPO__NOMBRE);
		createEAttribute(equipoEClass, EQUIPO__MARCA);
		createEAttribute(equipoEClass, EQUIPO__SEDE);
		createEAttribute(equipoEClass, EQUIPO__ESTADO);

		gestorInventarioEClass = createEClass(GESTOR_INVENTARIO);
		createEAttribute(gestorInventarioEClass, GESTOR_INVENTARIO__NIVEL_ACCESO);

		prestamoEClass = createEClass(PRESTAMO);
		createEAttribute(prestamoEClass, PRESTAMO__ID);
		createEAttribute(prestamoEClass, PRESTAMO__FECHA_PRESTAMO);
		createEAttribute(prestamoEClass, PRESTAMO__FECHA_DEVOLUCION);
		createEAttribute(prestamoEClass, PRESTAMO__ESTADO);
		createEReference(prestamoEClass, PRESTAMO__ACTA);
		createEAttribute(prestamoEClass, PRESTAMO__OBSERVACIONES);
		createEReference(prestamoEClass, PRESTAMO__RESERVA);

		reservaEClass = createEClass(RESERVA);
		createEAttribute(reservaEClass, RESERVA__ID);
		createEAttribute(reservaEClass, RESERVA__FECHA_SOLICITUD);
		createEAttribute(reservaEClass, RESERVA__FECHA_RESERVA);
		createEReference(reservaEClass, RESERVA__EQUIPO);
		createEReference(reservaEClass, RESERVA__USUARIO);
		createEAttribute(reservaEClass, RESERVA__ESTADO);

		notificacionesEClass = createEClass(NOTIFICACIONES);
		createEAttribute(notificacionesEClass, NOTIFICACIONES__ID);
		createEAttribute(notificacionesEClass, NOTIFICACIONES__TIPO);
		createEAttribute(notificacionesEClass, NOTIFICACIONES__COPIAS);
		createEAttribute(notificacionesEClass, NOTIFICACIONES__ESTADO);
		createEAttribute(notificacionesEClass, NOTIFICACIONES__PRIORIDAD);

		gestorUsuariosEClass = createEClass(GESTOR_USUARIOS);

		gestorPrestamosEClass = createEClass(GESTOR_PRESTAMOS);
		createEReference(gestorPrestamosEClass, GESTOR_PRESTAMOS__NOTIFICACIONES);

		inventarioEClass = createEClass(INVENTARIO);
		createEAttribute(inventarioEClass, INVENTARIO__REPORTE);
		createEReference(inventarioEClass, INVENTARIO__EQUIPOS_TECNOLOGICOS);
		createEReference(inventarioEClass, INVENTARIO__ADMINISTRADOR);
		createEAttribute(inventarioEClass, INVENTARIO__ESTADO_ELEMENTOS);

		actasEClass = createEClass(ACTAS);
		createEAttribute(actasEClass, ACTAS__ID);
		createEAttribute(actasEClass, ACTAS__NOMBRE);
		createEAttribute(actasEClass, ACTAS__TIPO);
		createEAttribute(actasEClass, ACTAS__FORMATO_ARCHIVO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gestorInventarioEClass.getESuperTypes().add(this.getUsuario());
		gestorUsuariosEClass.getESuperTypes().add(this.getUsuario());
		gestorPrestamosEClass.getESuperTypes().add(this.getUsuario());

		// Initialize classes, features, and operations; add parameters
		initEClass(usuarioEClass, Usuario.class, "Usuario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsuario_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_TipoDocumento(), ecorePackage.getEString(), "tipoDocumento", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_CorreoInstitucional(), ecorePackage.getEString(), "correoInstitucional", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_Telefono(), ecorePackage.getEString(), "telefono", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_Rol(), ecorePackage.getEString(), "rol", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equipoEClass, Equipo.class, "Equipo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEquipo_Id(), ecorePackage.getEString(), "id", null, 0, 1, Equipo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquipo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Equipo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquipo_Marca(), ecorePackage.getEString(), "marca", null, 0, 1, Equipo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquipo_Sede(), ecorePackage.getEString(), "sede", null, 0, 1, Equipo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquipo_Estado(), ecorePackage.getEString(), "estado", null, 0, 1, Equipo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gestorInventarioEClass, GestorInventario.class, "GestorInventario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGestorInventario_NivelAcceso(), ecorePackage.getEInt(), "nivelAcceso", null, 0, 1, GestorInventario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prestamoEClass, Prestamo.class, "Prestamo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrestamo_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Prestamo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrestamo_FechaPrestamo(), ecorePackage.getEDate(), "fechaPrestamo", null, 0, 1, Prestamo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrestamo_FechaDevolucion(), ecorePackage.getEDate(), "fechaDevolucion", null, 0, 1, Prestamo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrestamo_Estado(), ecorePackage.getEString(), "estado", null, 0, 1, Prestamo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrestamo_Acta(), this.getActas(), null, "acta", null, 1, 1, Prestamo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPrestamo_Observaciones(), ecorePackage.getEString(), "observaciones", null, 0, 1, Prestamo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrestamo_Reserva(), this.getReserva(), null, "reserva", null, 1, 1, Prestamo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reservaEClass, Reserva.class, "Reserva", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReserva_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Reserva.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReserva_FechaSolicitud(), ecorePackage.getEDate(), "fechaSolicitud", null, 0, 1, Reserva.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReserva_FechaReserva(), ecorePackage.getEDate(), "fechaReserva", null, 0, 1, Reserva.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReserva_Equipo(), this.getEquipo(), null, "equipo", null, 0, 1, Reserva.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReserva_Usuario(), this.getUsuario(), null, "usuario", null, 1, 1, Reserva.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReserva_Estado(), ecorePackage.getEString(), "estado", null, 0, 1, Reserva.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificacionesEClass, Notificaciones.class, "Notificaciones", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotificaciones_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Notificaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificaciones_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, Notificaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificaciones_Copias(), ecorePackage.getEString(), "copias", null, 0, 1, Notificaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificaciones_Estado(), ecorePackage.getEString(), "estado", null, 0, 1, Notificaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificaciones_Prioridad(), ecorePackage.getEString(), "prioridad", null, 0, 1, Notificaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gestorUsuariosEClass, GestorUsuarios.class, "GestorUsuarios", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gestorPrestamosEClass, GestorPrestamos.class, "GestorPrestamos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGestorPrestamos_Notificaciones(), this.getNotificaciones(), null, "notificaciones", null, 0, -1, GestorPrestamos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventarioEClass, Inventario.class, "Inventario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInventario_Reporte(), ecorePackage.getEString(), "reporte", null, 0, 1, Inventario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventario_EquiposTecnologicos(), this.getEquipo(), null, "EquiposTecnologicos", null, 0, 1, Inventario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventario_Administrador(), this.getGestorInventario(), null, "administrador", null, 0, -1, Inventario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventario_EstadoElementos(), ecorePackage.getEString(), "estadoElementos", null, 0, 1, Inventario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actasEClass, Actas.class, "Actas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActas_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Actas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActas_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Actas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActas_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, Actas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActas_FormatoArchivo(), ecorePackage.getEString(), "formatoArchivo", null, 0, 1, Actas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GestionRecursosPackageImpl
