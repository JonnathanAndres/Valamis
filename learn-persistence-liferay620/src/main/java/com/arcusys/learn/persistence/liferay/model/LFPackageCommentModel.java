package com.arcusys.learn.persistence.liferay.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the LFPackageComment service. Represents a row in the &quot;Learn_LFPackageComment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.arcusys.learn.persistence.liferay.model.impl.LFPackageCommentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arcusys.learn.persistence.liferay.model.impl.LFPackageCommentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFPackageComment
 * @see com.arcusys.learn.persistence.liferay.model.impl.LFPackageCommentImpl
 * @see com.arcusys.learn.persistence.liferay.model.impl.LFPackageCommentModelImpl
 * @generated
 */
public interface LFPackageCommentModel extends BaseModel<LFPackageComment> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a l f package comment model instance should use the {@link LFPackageComment} interface instead.
     */

    /**
     * Returns the primary key of this l f package comment.
     *
     * @return the primary key of this l f package comment
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this l f package comment.
     *
     * @param primaryKey the primary key of this l f package comment
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this l f package comment.
     *
     * @return the ID of this l f package comment
     */
    public long getId();

    /**
     * Sets the ID of this l f package comment.
     *
     * @param id the ID of this l f package comment
     */
    public void setId(long id);

    /**
     * Returns the social package i d of this l f package comment.
     *
     * @return the social package i d of this l f package comment
     */
    public Integer getSocialPackageID();

    /**
     * Sets the social package i d of this l f package comment.
     *
     * @param socialPackageID the social package i d of this l f package comment
     */
    public void setSocialPackageID(Integer socialPackageID);

    /**
     * Returns the author i d of this l f package comment.
     *
     * @return the author i d of this l f package comment
     */
    public Integer getAuthorID();

    /**
     * Sets the author i d of this l f package comment.
     *
     * @param authorID the author i d of this l f package comment
     */
    public void setAuthorID(Integer authorID);

    /**
     * Returns the comment of this l f package comment.
     *
     * @return the comment of this l f package comment
     */
    @AutoEscape
    public String getComment();

    /**
     * Sets the comment of this l f package comment.
     *
     * @param comment the comment of this l f package comment
     */
    public void setComment(String comment);

    /**
     * Returns the publish date of this l f package comment.
     *
     * @return the publish date of this l f package comment
     */
    public Date getPublishDate();

    /**
     * Sets the publish date of this l f package comment.
     *
     * @param publishDate the publish date of this l f package comment
     */
    public void setPublishDate(Date publishDate);

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
    public int compareTo(LFPackageComment lfPackageComment);

    @Override
    public int hashCode();

    @Override
    public CacheModel<LFPackageComment> toCacheModel();

    @Override
    public LFPackageComment toEscapedModel();

    @Override
    public LFPackageComment toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}