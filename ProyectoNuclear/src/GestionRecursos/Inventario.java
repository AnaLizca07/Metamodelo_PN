/**
 */
package GestionRecursos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GestionRecursos.Inventario#getReporte <em>Reporte</em>}</li>
 *   <li>{@link GestionRecursos.Inventario#getEquiposTecnologicos <em>Equipos Tecnologicos</em>}</li>
 *   <li>{@link GestionRecursos.Inventario#getAdministrador <em>Administrador</em>}</li>
 *   <li>{@link GestionRecursos.Inventario#getEstadoElementos <em>Estado Elementos</em>}</li>
 * </ul>
 *
 * @see GestionRecursos.GestionRecursosPackage#getInventario()
 * @model
 * @generated
 */
public interface Inventario extends EObject {
	/**
	 * Returns the value of the '<em><b>Reporte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporte</em>' attribute.
	 * @see #setReporte(String)
	 * @see GestionRecursos.GestionRecursosPackage#getInventario_Reporte()
	 * @model
	 * @generated
	 */
	String getReporte();

	/**
	 * Sets the value of the '{@link GestionRecursos.Inventario#getReporte <em>Reporte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporte</em>' attribute.
	 * @see #getReporte()
	 * @generated
	 */
	void setReporte(String value);

	/**
	 * Returns the value of the '<em><b>Equipos Tecnologicos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipos Tecnologicos</em>' reference.
	 * @see #setEquiposTecnologicos(Equipo)
	 * @see GestionRecursos.GestionRecursosPackage#getInventario_EquiposTecnologicos()
	 * @model
	 * @generated
	 */
	Equipo getEquiposTecnologicos();

	/**
	 * Sets the value of the '{@link GestionRecursos.Inventario#getEquiposTecnologicos <em>Equipos Tecnologicos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipos Tecnologicos</em>' reference.
	 * @see #getEquiposTecnologicos()
	 * @generated
	 */
	void setEquiposTecnologicos(Equipo value);

	/**
	 * Returns the value of the '<em><b>Administrador</b></em>' reference list.
	 * The list contents are of type {@link GestionRecursos.GestorInventario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administrador</em>' reference list.
	 * @see GestionRecursos.GestionRecursosPackage#getInventario_Administrador()
	 * @model
	 * @generated
	 */
	EList<GestorInventario> getAdministrador();

	/**
	 * Returns the value of the '<em><b>Estado Elementos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado Elementos</em>' attribute.
	 * @see #setEstadoElementos(String)
	 * @see GestionRecursos.GestionRecursosPackage#getInventario_EstadoElementos()
	 * @model
	 * @generated
	 */
	String getEstadoElementos();

	/**
	 * Sets the value of the '{@link GestionRecursos.Inventario#getEstadoElementos <em>Estado Elementos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado Elementos</em>' attribute.
	 * @see #getEstadoElementos()
	 * @generated
	 */
	void setEstadoElementos(String value);

} // Inventario
