/**
 */
package GestionRecursos;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see GestionRecursos.GestionRecursosPackage
 * @generated
 */
public interface GestionRecursosFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GestionRecursosFactory eINSTANCE = GestionRecursos.impl.GestionRecursosFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usuario</em>'.
	 * @generated
	 */
	Usuario createUsuario();

	/**
	 * Returns a new object of class '<em>Equipo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equipo</em>'.
	 * @generated
	 */
	Equipo createEquipo();

	/**
	 * Returns a new object of class '<em>Gestor Inventario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gestor Inventario</em>'.
	 * @generated
	 */
	GestorInventario createGestorInventario();

	/**
	 * Returns a new object of class '<em>Prestamo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prestamo</em>'.
	 * @generated
	 */
	Prestamo createPrestamo();

	/**
	 * Returns a new object of class '<em>Reserva</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reserva</em>'.
	 * @generated
	 */
	Reserva createReserva();

	/**
	 * Returns a new object of class '<em>Notificaciones</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notificaciones</em>'.
	 * @generated
	 */
	Notificaciones createNotificaciones();

	/**
	 * Returns a new object of class '<em>Gestor Usuarios</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gestor Usuarios</em>'.
	 * @generated
	 */
	GestorUsuarios createGestorUsuarios();

	/**
	 * Returns a new object of class '<em>Gestor Prestamos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gestor Prestamos</em>'.
	 * @generated
	 */
	GestorPrestamos createGestorPrestamos();

	/**
	 * Returns a new object of class '<em>Inventario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inventario</em>'.
	 * @generated
	 */
	Inventario createInventario();

	/**
	 * Returns a new object of class '<em>Actas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actas</em>'.
	 * @generated
	 */
	Actas createActas();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GestionRecursosPackage getGestionRecursosPackage();

} //GestionRecursosFactory
