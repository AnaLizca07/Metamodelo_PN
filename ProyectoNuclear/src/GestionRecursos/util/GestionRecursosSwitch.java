/**
 */
package GestionRecursos.util;

import GestionRecursos.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see GestionRecursos.GestionRecursosPackage
 * @generated
 */
public class GestionRecursosSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GestionRecursosPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GestionRecursosSwitch() {
		if (modelPackage == null) {
			modelPackage = GestionRecursosPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GestionRecursosPackage.USUARIO: {
				Usuario usuario = (Usuario)theEObject;
				T result = caseUsuario(usuario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GestionRecursosPackage.EQUIPO: {
				Equipo equipo = (Equipo)theEObject;
				T result = caseEquipo(equipo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GestionRecursosPackage.GESTOR_INVENTARIO: {
				GestorInventario gestorInventario = (GestorInventario)theEObject;
				T result = caseGestorInventario(gestorInventario);
				if (result == null) result = caseUsuario(gestorInventario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GestionRecursosPackage.PRESTAMO: {
				Prestamo prestamo = (Prestamo)theEObject;
				T result = casePrestamo(prestamo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GestionRecursosPackage.RESERVA: {
				Reserva reserva = (Reserva)theEObject;
				T result = caseReserva(reserva);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GestionRecursosPackage.NOTIFICACIONES: {
				Notificaciones notificaciones = (Notificaciones)theEObject;
				T result = caseNotificaciones(notificaciones);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GestionRecursosPackage.GESTOR_USUARIOS: {
				GestorUsuarios gestorUsuarios = (GestorUsuarios)theEObject;
				T result = caseGestorUsuarios(gestorUsuarios);
				if (result == null) result = caseUsuario(gestorUsuarios);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GestionRecursosPackage.GESTOR_PRESTAMOS: {
				GestorPrestamos gestorPrestamos = (GestorPrestamos)theEObject;
				T result = caseGestorPrestamos(gestorPrestamos);
				if (result == null) result = caseUsuario(gestorPrestamos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GestionRecursosPackage.INVENTARIO: {
				Inventario inventario = (Inventario)theEObject;
				T result = caseInventario(inventario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GestionRecursosPackage.ACTAS: {
				Actas actas = (Actas)theEObject;
				T result = caseActas(actas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usuario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsuario(Usuario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipo(Equipo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gestor Inventario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gestor Inventario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGestorInventario(GestorInventario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prestamo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prestamo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrestamo(Prestamo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reserva</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reserva</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReserva(Reserva object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notificaciones</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notificaciones</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotificaciones(Notificaciones object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gestor Usuarios</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gestor Usuarios</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGestorUsuarios(GestorUsuarios object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gestor Prestamos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gestor Prestamos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGestorPrestamos(GestorPrestamos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inventario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inventario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInventario(Inventario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActas(Actas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GestionRecursosSwitch
