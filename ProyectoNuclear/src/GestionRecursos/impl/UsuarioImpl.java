/**
 */
package GestionRecursos.impl;

import GestionRecursos.GestionRecursosPackage;
import GestionRecursos.Usuario;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GestionRecursos.impl.UsuarioImpl#getId <em>Id</em>}</li>
 *   <li>{@link GestionRecursos.impl.UsuarioImpl#getTipoDocumento <em>Tipo Documento</em>}</li>
 *   <li>{@link GestionRecursos.impl.UsuarioImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link GestionRecursos.impl.UsuarioImpl#getCorreoInstitucional <em>Correo Institucional</em>}</li>
 *   <li>{@link GestionRecursos.impl.UsuarioImpl#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link GestionRecursos.impl.UsuarioImpl#getRol <em>Rol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsuarioImpl extends MinimalEObjectImpl.Container implements Usuario {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoDocumento() <em>Tipo Documento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDocumento()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_DOCUMENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoDocumento() <em>Tipo Documento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDocumento()
	 * @generated
	 * @ordered
	 */
	protected String tipoDocumento = TIPO_DOCUMENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorreoInstitucional() <em>Correo Institucional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorreoInstitucional()
	 * @generated
	 * @ordered
	 */
	protected static final String CORREO_INSTITUCIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorreoInstitucional() <em>Correo Institucional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorreoInstitucional()
	 * @generated
	 * @ordered
	 */
	protected String correoInstitucional = CORREO_INSTITUCIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEFONO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected String telefono = TELEFONO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRol() <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected static final String ROL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRol() <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected String rol = ROL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsuarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GestionRecursosPackage.Literals.USUARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.USUARIO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoDocumento(String newTipoDocumento) {
		String oldTipoDocumento = tipoDocumento;
		tipoDocumento = newTipoDocumento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.USUARIO__TIPO_DOCUMENTO, oldTipoDocumento, tipoDocumento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.USUARIO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCorreoInstitucional() {
		return correoInstitucional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorreoInstitucional(String newCorreoInstitucional) {
		String oldCorreoInstitucional = correoInstitucional;
		correoInstitucional = newCorreoInstitucional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.USUARIO__CORREO_INSTITUCIONAL, oldCorreoInstitucional, correoInstitucional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTelefono() {
		return telefono;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTelefono(String newTelefono) {
		String oldTelefono = telefono;
		telefono = newTelefono;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.USUARIO__TELEFONO, oldTelefono, telefono));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRol() {
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRol(String newRol) {
		String oldRol = rol;
		rol = newRol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.USUARIO__ROL, oldRol, rol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GestionRecursosPackage.USUARIO__ID:
				return getId();
			case GestionRecursosPackage.USUARIO__TIPO_DOCUMENTO:
				return getTipoDocumento();
			case GestionRecursosPackage.USUARIO__NOMBRE:
				return getNombre();
			case GestionRecursosPackage.USUARIO__CORREO_INSTITUCIONAL:
				return getCorreoInstitucional();
			case GestionRecursosPackage.USUARIO__TELEFONO:
				return getTelefono();
			case GestionRecursosPackage.USUARIO__ROL:
				return getRol();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GestionRecursosPackage.USUARIO__ID:
				setId((Integer)newValue);
				return;
			case GestionRecursosPackage.USUARIO__TIPO_DOCUMENTO:
				setTipoDocumento((String)newValue);
				return;
			case GestionRecursosPackage.USUARIO__NOMBRE:
				setNombre((String)newValue);
				return;
			case GestionRecursosPackage.USUARIO__CORREO_INSTITUCIONAL:
				setCorreoInstitucional((String)newValue);
				return;
			case GestionRecursosPackage.USUARIO__TELEFONO:
				setTelefono((String)newValue);
				return;
			case GestionRecursosPackage.USUARIO__ROL:
				setRol((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GestionRecursosPackage.USUARIO__ID:
				setId(ID_EDEFAULT);
				return;
			case GestionRecursosPackage.USUARIO__TIPO_DOCUMENTO:
				setTipoDocumento(TIPO_DOCUMENTO_EDEFAULT);
				return;
			case GestionRecursosPackage.USUARIO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case GestionRecursosPackage.USUARIO__CORREO_INSTITUCIONAL:
				setCorreoInstitucional(CORREO_INSTITUCIONAL_EDEFAULT);
				return;
			case GestionRecursosPackage.USUARIO__TELEFONO:
				setTelefono(TELEFONO_EDEFAULT);
				return;
			case GestionRecursosPackage.USUARIO__ROL:
				setRol(ROL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GestionRecursosPackage.USUARIO__ID:
				return id != ID_EDEFAULT;
			case GestionRecursosPackage.USUARIO__TIPO_DOCUMENTO:
				return TIPO_DOCUMENTO_EDEFAULT == null ? tipoDocumento != null : !TIPO_DOCUMENTO_EDEFAULT.equals(tipoDocumento);
			case GestionRecursosPackage.USUARIO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case GestionRecursosPackage.USUARIO__CORREO_INSTITUCIONAL:
				return CORREO_INSTITUCIONAL_EDEFAULT == null ? correoInstitucional != null : !CORREO_INSTITUCIONAL_EDEFAULT.equals(correoInstitucional);
			case GestionRecursosPackage.USUARIO__TELEFONO:
				return TELEFONO_EDEFAULT == null ? telefono != null : !TELEFONO_EDEFAULT.equals(telefono);
			case GestionRecursosPackage.USUARIO__ROL:
				return ROL_EDEFAULT == null ? rol != null : !ROL_EDEFAULT.equals(rol);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", tipoDocumento: ");
		result.append(tipoDocumento);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", correoInstitucional: ");
		result.append(correoInstitucional);
		result.append(", telefono: ");
		result.append(telefono);
		result.append(", rol: ");
		result.append(rol);
		result.append(')');
		return result.toString();
	}

} //UsuarioImpl
