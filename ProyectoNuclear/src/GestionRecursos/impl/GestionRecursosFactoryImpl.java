/**
 */
package GestionRecursos.impl;

import GestionRecursos.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GestionRecursosFactoryImpl extends EFactoryImpl implements GestionRecursosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GestionRecursosFactory init() {
		try {
			GestionRecursosFactory theGestionRecursosFactory = (GestionRecursosFactory)EPackage.Registry.INSTANCE.getEFactory(GestionRecursosPackage.eNS_URI);
			if (theGestionRecursosFactory != null) {
				return theGestionRecursosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GestionRecursosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GestionRecursosFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GestionRecursosPackage.USUARIO: return createUsuario();
			case GestionRecursosPackage.EQUIPO: return createEquipo();
			case GestionRecursosPackage.GESTOR_INVENTARIO: return createGestorInventario();
			case GestionRecursosPackage.PRESTAMO: return createPrestamo();
			case GestionRecursosPackage.RESERVA: return createReserva();
			case GestionRecursosPackage.NOTIFICACIONES: return createNotificaciones();
			case GestionRecursosPackage.GESTOR_USUARIOS: return createGestorUsuarios();
			case GestionRecursosPackage.GESTOR_PRESTAMOS: return createGestorPrestamos();
			case GestionRecursosPackage.INVENTARIO: return createInventario();
			case GestionRecursosPackage.ACTAS: return createActas();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usuario createUsuario() {
		UsuarioImpl usuario = new UsuarioImpl();
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Equipo createEquipo() {
		EquipoImpl equipo = new EquipoImpl();
		return equipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GestorInventario createGestorInventario() {
		GestorInventarioImpl gestorInventario = new GestorInventarioImpl();
		return gestorInventario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prestamo createPrestamo() {
		PrestamoImpl prestamo = new PrestamoImpl();
		return prestamo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reserva createReserva() {
		ReservaImpl reserva = new ReservaImpl();
		return reserva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Notificaciones createNotificaciones() {
		NotificacionesImpl notificaciones = new NotificacionesImpl();
		return notificaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GestorUsuarios createGestorUsuarios() {
		GestorUsuariosImpl gestorUsuarios = new GestorUsuariosImpl();
		return gestorUsuarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GestorPrestamos createGestorPrestamos() {
		GestorPrestamosImpl gestorPrestamos = new GestorPrestamosImpl();
		return gestorPrestamos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inventario createInventario() {
		InventarioImpl inventario = new InventarioImpl();
		return inventario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actas createActas() {
		ActasImpl actas = new ActasImpl();
		return actas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GestionRecursosPackage getGestionRecursosPackage() {
		return (GestionRecursosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GestionRecursosPackage getPackage() {
		return GestionRecursosPackage.eINSTANCE;
	}

} //GestionRecursosFactoryImpl
