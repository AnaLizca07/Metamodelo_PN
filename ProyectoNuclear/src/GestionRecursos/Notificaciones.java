/**
 */
package GestionRecursos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notificaciones</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GestionRecursos.Notificaciones#getId <em>Id</em>}</li>
 *   <li>{@link GestionRecursos.Notificaciones#getTipo <em>Tipo</em>}</li>
 *   <li>{@link GestionRecursos.Notificaciones#getCopias <em>Copias</em>}</li>
 *   <li>{@link GestionRecursos.Notificaciones#getEstado <em>Estado</em>}</li>
 *   <li>{@link GestionRecursos.Notificaciones#getPrioridad <em>Prioridad</em>}</li>
 * </ul>
 *
 * @see GestionRecursos.GestionRecursosPackage#getNotificaciones()
 * @model
 * @generated
 */
public interface Notificaciones extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see GestionRecursos.GestionRecursosPackage#getNotificaciones_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link GestionRecursos.Notificaciones#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see GestionRecursos.GestionRecursosPackage#getNotificaciones_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link GestionRecursos.Notificaciones#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Copias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copias</em>' attribute.
	 * @see #setCopias(String)
	 * @see GestionRecursos.GestionRecursosPackage#getNotificaciones_Copias()
	 * @model
	 * @generated
	 */
	String getCopias();

	/**
	 * Sets the value of the '{@link GestionRecursos.Notificaciones#getCopias <em>Copias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copias</em>' attribute.
	 * @see #getCopias()
	 * @generated
	 */
	void setCopias(String value);

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' attribute.
	 * @see #setEstado(String)
	 * @see GestionRecursos.GestionRecursosPackage#getNotificaciones_Estado()
	 * @model
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link GestionRecursos.Notificaciones#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Prioridad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prioridad</em>' attribute.
	 * @see #setPrioridad(String)
	 * @see GestionRecursos.GestionRecursosPackage#getNotificaciones_Prioridad()
	 * @model
	 * @generated
	 */
	String getPrioridad();

	/**
	 * Sets the value of the '{@link GestionRecursos.Notificaciones#getPrioridad <em>Prioridad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prioridad</em>' attribute.
	 * @see #getPrioridad()
	 * @generated
	 */
	void setPrioridad(String value);

} // Notificaciones
