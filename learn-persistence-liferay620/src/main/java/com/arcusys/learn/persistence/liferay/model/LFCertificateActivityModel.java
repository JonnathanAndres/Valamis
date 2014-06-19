package com.arcusys.learn.persistence.liferay.model;

import com.arcusys.learn.persistence.liferay.service.persistence.LFCertificateActivityPK;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the LFCertificateActivity service. Represents a row in the &quot;Learn_LFCertificateActivity&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.arcusys.learn.persistence.liferay.model.impl.LFCertificateActivityModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arcusys.learn.persistence.liferay.model.impl.LFCertificateActivityImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFCertificateActivity
 * @see com.arcusys.learn.persistence.liferay.model.impl.LFCertificateActivityImpl
 * @see com.arcusys.learn.persistence.liferay.model.impl.LFCertificateActivityModelImpl
 * @generated
 */
public interface LFCertificateActivityModel extends BaseModel<LFCertificateActivity> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a l f certificate activity model instance should use the {@link LFCertificateActivity} interface instead.
     */

    /**
     * Returns the primary key of this l f certificate activity.
     *
     * @return the primary key of this l f certificate activity
     */
    public LFCertificateActivityPK getPrimaryKey();

    /**
     * Sets the primary key of this l f certificate activity.
     *
     * @param primaryKey the primary key of this l f certificate activity
     */
    public void setPrimaryKey(LFCertificateActivityPK primaryKey);

    /**
     * Returns the certificate i d of this l f certificate activity.
     *
     * @return the certificate i d of this l f certificate activity
     */
    public Long getCertificateID();

    /**
     * Sets the certificate i d of this l f certificate activity.
     *
     * @param certificateID the certificate i d of this l f certificate activity
     */
    public void setCertificateID(Long certificateID);

    /**
     * Returns the activity name of this l f certificate activity.
     *
     * @return the activity name of this l f certificate activity
     */
    @AutoEscape
    public String getActivityName();

    /**
     * Sets the activity name of this l f certificate activity.
     *
     * @param activityName the activity name of this l f certificate activity
     */
    public void setActivityName(String activityName);

    /**
     * Returns the datacount of this l f certificate activity.
     *
     * @return the datacount of this l f certificate activity
     */
    public Integer getDatacount();

    /**
     * Sets the datacount of this l f certificate activity.
     *
     * @param datacount the datacount of this l f certificate activity
     */
    public void setDatacount(Integer datacount);

    /**
     * Returns the period type of this l f certificate activity.
     *
     * @return the period type of this l f certificate activity
     */
    @AutoEscape
    public String getPeriodType();

    /**
     * Sets the period type of this l f certificate activity.
     *
     * @param periodType the period type of this l f certificate activity
     */
    public void setPeriodType(String periodType);

    /**
     * Returns the period of this l f certificate activity.
     *
     * @return the period of this l f certificate activity
     */
    public Integer getPeriod();

    /**
     * Sets the period of this l f certificate activity.
     *
     * @param period the period of this l f certificate activity
     */
    public void setPeriod(Integer period);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(LFCertificateActivity lfCertificateActivity);

    @Override
    public int hashCode();

    @Override
    public CacheModel<LFCertificateActivity> toCacheModel();

    @Override
    public LFCertificateActivity toEscapedModel();

    @Override
    public LFCertificateActivity toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}