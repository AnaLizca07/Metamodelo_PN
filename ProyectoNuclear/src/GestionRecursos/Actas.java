/**
 */
package GestionRecursos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GestionRecursos.Actas#getId <em>Id</em>}</li>
 *   <li>{@link GestionRecursos.Actas#getNombre <em>Nombre</em>}</li>
 *   <li>{@link GestionRecursos.Actas#getTipo <em>Tipo</em>}</li>
 *   <li>{@link GestionRecursos.Actas#getFormatoArchivo <em>Formato Archivo</em>}</li>
 * </ul>
 *
 * @see GestionRecursos.GestionRecursosPackage#getActas()
 * @model
 * @generated
 */
public interface Actas extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see GestionRecursos.GestionRecursosPackage#getActas_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link GestionRecursos.Actas#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see GestionRecursos.GestionRecursosPackage#getActas_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link GestionRecursos.Actas#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see GestionRecursos.GestionRecursosPackage#getActas_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link GestionRecursos.Actas#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Formato Archivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formato Archivo</em>' attribute.
	 * @see #setFormatoArchivo(String)
	 * @see GestionRecursos.GestionRecursosPackage#getActas_FormatoArchivo()
	 * @model
	 * @generated
	 */
	String getFormatoArchivo();

	/**
	 * Sets the value of the '{@link GestionRecursos.Actas#getFormatoArchivo <em>Formato Archivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formato Archivo</em>' attribute.
	 * @see #getFormatoArchivo()
	 * @generated
	 */
	void setFormatoArchivo(String value);

} // Actas
