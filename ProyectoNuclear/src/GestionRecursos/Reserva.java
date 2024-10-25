/**
 */
package GestionRecursos;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reserva</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GestionRecursos.Reserva#getId <em>Id</em>}</li>
 *   <li>{@link GestionRecursos.Reserva#getFechaSolicitud <em>Fecha Solicitud</em>}</li>
 *   <li>{@link GestionRecursos.Reserva#getFechaReserva <em>Fecha Reserva</em>}</li>
 *   <li>{@link GestionRecursos.Reserva#getEquipo <em>Equipo</em>}</li>
 *   <li>{@link GestionRecursos.Reserva#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link GestionRecursos.Reserva#getEstado <em>Estado</em>}</li>
 * </ul>
 *
 * @see GestionRecursos.GestionRecursosPackage#getReserva()
 * @model
 * @generated
 */
public interface Reserva extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see GestionRecursos.GestionRecursosPackage#getReserva_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link GestionRecursos.Reserva#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Fecha Solicitud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Solicitud</em>' attribute.
	 * @see #setFechaSolicitud(Date)
	 * @see GestionRecursos.GestionRecursosPackage#getReserva_FechaSolicitud()
	 * @model
	 * @generated
	 */
	Date getFechaSolicitud();

	/**
	 * Sets the value of the '{@link GestionRecursos.Reserva#getFechaSolicitud <em>Fecha Solicitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Solicitud</em>' attribute.
	 * @see #getFechaSolicitud()
	 * @generated
	 */
	void setFechaSolicitud(Date value);

	/**
	 * Returns the value of the '<em><b>Fecha Reserva</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Reserva</em>' attribute.
	 * @see #setFechaReserva(Date)
	 * @see GestionRecursos.GestionRecursosPackage#getReserva_FechaReserva()
	 * @model
	 * @generated
	 */
	Date getFechaReserva();

	/**
	 * Sets the value of the '{@link GestionRecursos.Reserva#getFechaReserva <em>Fecha Reserva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Reserva</em>' attribute.
	 * @see #getFechaReserva()
	 * @generated
	 */
	void setFechaReserva(Date value);

	/**
	 * Returns the value of the '<em><b>Equipo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipo</em>' reference.
	 * @see #setEquipo(Equipo)
	 * @see GestionRecursos.GestionRecursosPackage#getReserva_Equipo()
	 * @model
	 * @generated
	 */
	Equipo getEquipo();

	/**
	 * Sets the value of the '{@link GestionRecursos.Reserva#getEquipo <em>Equipo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipo</em>' reference.
	 * @see #getEquipo()
	 * @generated
	 */
	void setEquipo(Equipo value);

	/**
	 * Returns the value of the '<em><b>Usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuario</em>' reference.
	 * @see #setUsuario(Usuario)
	 * @see GestionRecursos.GestionRecursosPackage#getReserva_Usuario()
	 * @model required="true"
	 * @generated
	 */
	Usuario getUsuario();

	/**
	 * Sets the value of the '{@link GestionRecursos.Reserva#getUsuario <em>Usuario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' reference.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(Usuario value);

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' attribute.
	 * @see #setEstado(String)
	 * @see GestionRecursos.GestionRecursosPackage#getReserva_Estado()
	 * @model
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link GestionRecursos.Reserva#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

} // Reserva
