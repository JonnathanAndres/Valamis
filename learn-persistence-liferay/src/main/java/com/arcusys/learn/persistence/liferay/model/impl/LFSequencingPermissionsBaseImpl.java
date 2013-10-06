package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFSequencingPermissions;
import com.arcusys.learn.persistence.liferay.service.LFSequencingPermissionsLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the LFSequencingPermissions service. Represents a row in the &quot;Learn_LFSequencingPermissions&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFSequencingPermissionsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFSequencingPermissionsImpl
 * @see com.arcusys.learn.persistence.liferay.model.LFSequencingPermissions
 * @generated
 */
public abstract class LFSequencingPermissionsBaseImpl
    extends LFSequencingPermissionsModelImpl implements LFSequencingPermissions {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a l f sequencing permissions model instance should use the {@link LFSequencingPermissions} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            LFSequencingPermissionsLocalServiceUtil.addLFSequencingPermissions(this);
        } else {
            LFSequencingPermissionsLocalServiceUtil.updateLFSequencingPermissions(this);
        }
    }
}