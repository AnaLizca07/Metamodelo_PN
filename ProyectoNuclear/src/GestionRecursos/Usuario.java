/**
 */
package GestionRecursos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GestionRecursos.Usuario#getId <em>Id</em>}</li>
 *   <li>{@link GestionRecursos.Usuario#getTipoDocumento <em>Tipo Documento</em>}</li>
 *   <li>{@link GestionRecursos.Usuario#getNombre <em>Nombre</em>}</li>
 *   <li>{@link GestionRecursos.Usuario#getCorreoInstitucional <em>Correo Institucional</em>}</li>
 *   <li>{@link GestionRecursos.Usuario#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link GestionRecursos.Usuario#getRol <em>Rol</em>}</li>
 * </ul>
 *
 * @see GestionRecursos.GestionRecursosPackage#getUsuario()
 * @model
 * @generated
 */
public interface Usuario extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see GestionRecursos.GestionRecursosPackage#getUsuario_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link GestionRecursos.Usuario#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Tipo Documento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Documento</em>' attribute.
	 * @see #setTipoDocumento(String)
	 * @see GestionRecursos.GestionRecursosPackage#getUsuario_TipoDocumento()
	 * @model
	 * @generated
	 */
	String getTipoDocumento();

	/**
	 * Sets the value of the '{@link GestionRecursos.Usuario#getTipoDocumento <em>Tipo Documento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Documento</em>' attribute.
	 * @see #getTipoDocumento()
	 * @generated
	 */
	void setTipoDocumento(String value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see GestionRecursos.GestionRecursosPackage#getUsuario_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link GestionRecursos.Usuario#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Correo Institucional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correo Institucional</em>' attribute.
	 * @see #setCorreoInstitucional(String)
	 * @see GestionRecursos.GestionRecursosPackage#getUsuario_CorreoInstitucional()
	 * @model
	 * @generated
	 */
	String getCorreoInstitucional();

	/**
	 * Sets the value of the '{@link GestionRecursos.Usuario#getCorreoInstitucional <em>Correo Institucional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correo Institucional</em>' attribute.
	 * @see #getCorreoInstitucional()
	 * @generated
	 */
	void setCorreoInstitucional(String value);

	/**
	 * Returns the value of the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefono</em>' attribute.
	 * @see #setTelefono(String)
	 * @see GestionRecursos.GestionRecursosPackage#getUsuario_Telefono()
	 * @model
	 * @generated
	 */
	String getTelefono();

	/**
	 * Sets the value of the '{@link GestionRecursos.Usuario#getTelefono <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefono</em>' attribute.
	 * @see #getTelefono()
	 * @generated
	 */
	void setTelefono(String value);

	/**
	 * Returns the value of the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol</em>' attribute.
	 * @see #setRol(String)
	 * @see GestionRecursos.GestionRecursosPackage#getUsuario_Rol()
	 * @model
	 * @generated
	 */
	String getRol();

	/**
	 * Sets the value of the '{@link GestionRecursos.Usuario#getRol <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol</em>' attribute.
	 * @see #getRol()
	 * @generated
	 */
	void setRol(String value);

} // Usuario
