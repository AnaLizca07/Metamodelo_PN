/**
 */
package GestionRecursos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gestor Inventario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GestionRecursos.GestorInventario#getNivelAcceso <em>Nivel Acceso</em>}</li>
 * </ul>
 *
 * @see GestionRecursos.GestionRecursosPackage#getGestorInventario()
 * @model
 * @generated
 */
public interface GestorInventario extends Usuario {
	/**
	 * Returns the value of the '<em><b>Nivel Acceso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nivel Acceso</em>' attribute.
	 * @see #setNivelAcceso(int)
	 * @see GestionRecursos.GestionRecursosPackage#getGestorInventario_NivelAcceso()
	 * @model
	 * @generated
	 */
	int getNivelAcceso();

	/**
	 * Sets the value of the '{@link GestionRecursos.GestorInventario#getNivelAcceso <em>Nivel Acceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nivel Acceso</em>' attribute.
	 * @see #getNivelAcceso()
	 * @generated
	 */
	void setNivelAcceso(int value);

} // GestorInventario
