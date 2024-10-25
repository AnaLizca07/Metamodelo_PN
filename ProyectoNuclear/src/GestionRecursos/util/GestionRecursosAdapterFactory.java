/**
 */
package GestionRecursos.util;

import GestionRecursos.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see GestionRecursos.GestionRecursosPackage
 * @generated
 */
public class GestionRecursosAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GestionRecursosPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GestionRecursosAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GestionRecursosPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GestionRecursosSwitch<Adapter> modelSwitch =
		new GestionRecursosSwitch<Adapter>() {
			@Override
			public Adapter caseUsuario(Usuario object) {
				return createUsuarioAdapter();
			}
			@Override
			public Adapter caseEquipo(Equipo object) {
				return createEquipoAdapter();
			}
			@Override
			public Adapter caseGestorInventario(GestorInventario object) {
				return createGestorInventarioAdapter();
			}
			@Override
			public Adapter casePrestamo(Prestamo object) {
				return createPrestamoAdapter();
			}
			@Override
			public Adapter caseReserva(Reserva object) {
				return createReservaAdapter();
			}
			@Override
			public Adapter caseNotificaciones(Notificaciones object) {
				return createNotificacionesAdapter();
			}
			@Override
			public Adapter caseGestorUsuarios(GestorUsuarios object) {
				return createGestorUsuariosAdapter();
			}
			@Override
			public Adapter caseGestorPrestamos(GestorPrestamos object) {
				return createGestorPrestamosAdapter();
			}
			@Override
			public Adapter caseInventario(Inventario object) {
				return createInventarioAdapter();
			}
			@Override
			public Adapter caseActas(Actas object) {
				return createActasAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link GestionRecursos.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GestionRecursos.Usuario
	 * @generated
	 */
	public Adapter createUsuarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GestionRecursos.Equipo <em>Equipo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GestionRecursos.Equipo
	 * @generated
	 */
	public Adapter createEquipoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GestionRecursos.GestorInventario <em>Gestor Inventario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GestionRecursos.GestorInventario
	 * @generated
	 */
	public Adapter createGestorInventarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GestionRecursos.Prestamo <em>Prestamo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GestionRecursos.Prestamo
	 * @generated
	 */
	public Adapter createPrestamoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GestionRecursos.Reserva <em>Reserva</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GestionRecursos.Reserva
	 * @generated
	 */
	public Adapter createReservaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GestionRecursos.Notificaciones <em>Notificaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GestionRecursos.Notificaciones
	 * @generated
	 */
	public Adapter createNotificacionesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GestionRecursos.GestorUsuarios <em>Gestor Usuarios</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GestionRecursos.GestorUsuarios
	 * @generated
	 */
	public Adapter createGestorUsuariosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GestionRecursos.GestorPrestamos <em>Gestor Prestamos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GestionRecursos.GestorPrestamos
	 * @generated
	 */
	public Adapter createGestorPrestamosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GestionRecursos.Inventario <em>Inventario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GestionRecursos.Inventario
	 * @generated
	 */
	public Adapter createInventarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GestionRecursos.Actas <em>Actas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GestionRecursos.Actas
	 * @generated
	 */
	public Adapter createActasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GestionRecursosAdapterFactory
