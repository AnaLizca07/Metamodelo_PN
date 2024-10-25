/**
 */
package GestionRecursos;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prestamo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GestionRecursos.Prestamo#getId <em>Id</em>}</li>
 *   <li>{@link GestionRecursos.Prestamo#getFechaPrestamo <em>Fecha Prestamo</em>}</li>
 *   <li>{@link GestionRecursos.Prestamo#getFechaDevolucion <em>Fecha Devolucion</em>}</li>
 *   <li>{@link GestionRecursos.Prestamo#getEstado <em>Estado</em>}</li>
 *   <li>{@link GestionRecursos.Prestamo#getActa <em>Acta</em>}</li>
 *   <li>{@link GestionRecursos.Prestamo#getObservaciones <em>Observaciones</em>}</li>
 *   <li>{@link GestionRecursos.Prestamo#getReserva <em>Reserva</em>}</li>
 * </ul>
 *
 * @see GestionRecursos.GestionRecursosPackage#getPrestamo()
 * @model
 * @generated
 */
public interface Prestamo extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see GestionRecursos.GestionRecursosPackage#getPrestamo_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link GestionRecursos.Prestamo#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Fecha Prestamo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Prestamo</em>' attribute.
	 * @see #setFechaPrestamo(Date)
	 * @see GestionRecursos.GestionRecursosPackage#getPrestamo_FechaPrestamo()
	 * @model
	 * @generated
	 */
	Date getFechaPrestamo();

	/**
	 * Sets the value of the '{@link GestionRecursos.Prestamo#getFechaPrestamo <em>Fecha Prestamo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Prestamo</em>' attribute.
	 * @see #getFechaPrestamo()
	 * @generated
	 */
	void setFechaPrestamo(Date value);

	/**
	 * Returns the value of the '<em><b>Fecha Devolucion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Devolucion</em>' attribute.
	 * @see #setFechaDevolucion(Date)
	 * @see GestionRecursos.GestionRecursosPackage#getPrestamo_FechaDevolucion()
	 * @model
	 * @generated
	 */
	Date getFechaDevolucion();

	/**
	 * Sets the value of the '{@link GestionRecursos.Prestamo#getFechaDevolucion <em>Fecha Devolucion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Devolucion</em>' attribute.
	 * @see #getFechaDevolucion()
	 * @generated
	 */
	void setFechaDevolucion(Date value);

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' attribute.
	 * @see #setEstado(String)
	 * @see GestionRecursos.GestionRecursosPackage#getPrestamo_Estado()
	 * @model
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link GestionRecursos.Prestamo#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Acta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acta</em>' reference.
	 * @see #setActa(Actas)
	 * @see GestionRecursos.GestionRecursosPackage#getPrestamo_Acta()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Actas getActa();

	/**
	 * Sets the value of the '{@link GestionRecursos.Prestamo#getActa <em>Acta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acta</em>' reference.
	 * @see #getActa()
	 * @generated
	 */
	void setActa(Actas value);

	/**
	 * Returns the value of the '<em><b>Observaciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observaciones</em>' attribute.
	 * @see #setObservaciones(String)
	 * @see GestionRecursos.GestionRecursosPackage#getPrestamo_Observaciones()
	 * @model
	 * @generated
	 */
	String getObservaciones();

	/**
	 * Sets the value of the '{@link GestionRecursos.Prestamo#getObservaciones <em>Observaciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observaciones</em>' attribute.
	 * @see #getObservaciones()
	 * @generated
	 */
	void setObservaciones(String value);

	/**
	 * Returns the value of the '<em><b>Reserva</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserva</em>' reference.
	 * @see #setReserva(Reserva)
	 * @see GestionRecursos.GestionRecursosPackage#getPrestamo_Reserva()
	 * @model required="true"
	 * @generated
	 */
	Reserva getReserva();

	/**
	 * Sets the value of the '{@link GestionRecursos.Prestamo#getReserva <em>Reserva</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserva</em>' reference.
	 * @see #getReserva()
	 * @generated
	 */
	void setReserva(Reserva value);

} // Prestamo
