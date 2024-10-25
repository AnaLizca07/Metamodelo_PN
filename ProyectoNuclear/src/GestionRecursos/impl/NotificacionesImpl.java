/**
 */
package GestionRecursos.impl;

import GestionRecursos.GestionRecursosPackage;
import GestionRecursos.Notificaciones;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notificaciones</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GestionRecursos.impl.NotificacionesImpl#getId <em>Id</em>}</li>
 *   <li>{@link GestionRecursos.impl.NotificacionesImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link GestionRecursos.impl.NotificacionesImpl#getCopias <em>Copias</em>}</li>
 *   <li>{@link GestionRecursos.impl.NotificacionesImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link GestionRecursos.impl.NotificacionesImpl#getPrioridad <em>Prioridad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificacionesImpl extends MinimalEObjectImpl.Container implements Notificaciones {
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
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopias() <em>Copias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopias()
	 * @generated
	 * @ordered
	 */
	protected static final String COPIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopias() <em>Copias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopias()
	 * @generated
	 * @ordered
	 */
	protected String copias = COPIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected String estado = ESTADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrioridad() <em>Prioridad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioridad()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORIDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrioridad() <em>Prioridad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioridad()
	 * @generated
	 * @ordered
	 */
	protected String prioridad = PRIORIDAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificacionesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GestionRecursosPackage.Literals.NOTIFICACIONES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.NOTIFICACIONES__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.NOTIFICACIONES__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCopias() {
		return copias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopias(String newCopias) {
		String oldCopias = copias;
		copias = newCopias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.NOTIFICACIONES__COPIAS, oldCopias, copias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEstado() {
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstado(String newEstado) {
		String oldEstado = estado;
		estado = newEstado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.NOTIFICACIONES__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrioridad() {
		return prioridad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrioridad(String newPrioridad) {
		String oldPrioridad = prioridad;
		prioridad = newPrioridad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.NOTIFICACIONES__PRIORIDAD, oldPrioridad, prioridad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GestionRecursosPackage.NOTIFICACIONES__ID:
				return getId();
			case GestionRecursosPackage.NOTIFICACIONES__TIPO:
				return getTipo();
			case GestionRecursosPackage.NOTIFICACIONES__COPIAS:
				return getCopias();
			case GestionRecursosPackage.NOTIFICACIONES__ESTADO:
				return getEstado();
			case GestionRecursosPackage.NOTIFICACIONES__PRIORIDAD:
				return getPrioridad();
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
			case GestionRecursosPackage.NOTIFICACIONES__ID:
				setId((Integer)newValue);
				return;
			case GestionRecursosPackage.NOTIFICACIONES__TIPO:
				setTipo((String)newValue);
				return;
			case GestionRecursosPackage.NOTIFICACIONES__COPIAS:
				setCopias((String)newValue);
				return;
			case GestionRecursosPackage.NOTIFICACIONES__ESTADO:
				setEstado((String)newValue);
				return;
			case GestionRecursosPackage.NOTIFICACIONES__PRIORIDAD:
				setPrioridad((String)newValue);
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
			case GestionRecursosPackage.NOTIFICACIONES__ID:
				setId(ID_EDEFAULT);
				return;
			case GestionRecursosPackage.NOTIFICACIONES__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case GestionRecursosPackage.NOTIFICACIONES__COPIAS:
				setCopias(COPIAS_EDEFAULT);
				return;
			case GestionRecursosPackage.NOTIFICACIONES__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case GestionRecursosPackage.NOTIFICACIONES__PRIORIDAD:
				setPrioridad(PRIORIDAD_EDEFAULT);
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
			case GestionRecursosPackage.NOTIFICACIONES__ID:
				return id != ID_EDEFAULT;
			case GestionRecursosPackage.NOTIFICACIONES__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
			case GestionRecursosPackage.NOTIFICACIONES__COPIAS:
				return COPIAS_EDEFAULT == null ? copias != null : !COPIAS_EDEFAULT.equals(copias);
			case GestionRecursosPackage.NOTIFICACIONES__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case GestionRecursosPackage.NOTIFICACIONES__PRIORIDAD:
				return PRIORIDAD_EDEFAULT == null ? prioridad != null : !PRIORIDAD_EDEFAULT.equals(prioridad);
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
		result.append(", tipo: ");
		result.append(tipo);
		result.append(", copias: ");
		result.append(copias);
		result.append(", estado: ");
		result.append(estado);
		result.append(", prioridad: ");
		result.append(prioridad);
		result.append(')');
		return result.toString();
	}

} //NotificacionesImpl
