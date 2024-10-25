/**
 */
package GestionRecursos;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gestor Prestamos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GestionRecursos.GestorPrestamos#getNotificaciones <em>Notificaciones</em>}</li>
 * </ul>
 *
 * @see GestionRecursos.GestionRecursosPackage#getGestorPrestamos()
 * @model
 * @generated
 */
public interface GestorPrestamos extends Usuario {
	/**
	 * Returns the value of the '<em><b>Notificaciones</b></em>' reference list.
	 * The list contents are of type {@link GestionRecursos.Notificaciones}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notificaciones</em>' reference list.
	 * @see GestionRecursos.GestionRecursosPackage#getGestorPrestamos_Notificaciones()
	 * @model
	 * @generated
	 */
	EList<Notificaciones> getNotificaciones();

} // GestorPrestamos
