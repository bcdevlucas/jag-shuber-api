package ca.bc.gov.jag.shuber.persistence.model;

import ca.bc.gov.jag.shuber.persistence.AbstractAuditableVersionable;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SheriffQualificationXref generated by Hibernate Tools hbm2java.
 *
 * <p>Domain model for database table sheriff_qualification_xref.
 *
 * @author hbm2java
 * @version 1.0.0.243
 */
@Entity
@Table(name = "sheriff_qualification_xref"
    // ,schema="shersched"
)
@Generated(
    value = "hbm2java",
    date = "2018-02-21 07:25:02",
    comments = "Generated by Hibernate Tools hbm2java."
)
public class SheriffQualificationXref extends AbstractAuditableVersionable implements Serializable {
    /** UID. */
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(
            name = "qualificationId",
            column = @Column(name = "qualification_id", nullable = false, updatable = false)
        ),
        @AttributeOverride(
            name = "sheriffId",
            column = @Column(name = "sheriff_id", nullable = false, updatable = false)
        )
    })
    private SheriffQualificationXrefId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "qualification_id", nullable = false, insertable = false, updatable = false)
    private Qualification qualification;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sheriff_id", nullable = false, insertable = false, updatable = false)
    private Sheriff sheriff;

    @Temporal(TemporalType.DATE)
    @Column(name = "expiry_date", length = 13)
    private Date expiryDate;
    /** No args constructor. */
    public SheriffQualificationXref() {}

    /** Required args constructor. */
    public SheriffQualificationXref(
            SheriffQualificationXrefId id,
            Qualification qualification,
            Sheriff sheriff,
            String createdBy,
            String updatedBy,
            Date createdDtm,
            Date updatedDtm,
            long revisionCount) {
        this.id = id;
        this.qualification = qualification;
        this.sheriff = sheriff;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdDtm = createdDtm;
        this.updatedDtm = updatedDtm;
        this.revisionCount = revisionCount;
    }

    /** All args constructor. */
    public SheriffQualificationXref(
            SheriffQualificationXrefId id,
            Qualification qualification,
            Sheriff sheriff,
            Date expiryDate,
            String createdBy,
            String updatedBy,
            Date createdDtm,
            Date updatedDtm,
            long revisionCount) {
        this.id = id;
        this.qualification = qualification;
        this.sheriff = sheriff;
        this.expiryDate = expiryDate;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdDtm = createdDtm;
        this.updatedDtm = updatedDtm;
        this.revisionCount = revisionCount;
    }

    public SheriffQualificationXrefId getId() {
        return this.id;
    }

    public void setId(SheriffQualificationXrefId id) {
        this.id = id;
    }

    public Qualification getQualification() {
        return this.qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public Sheriff getSheriff() {
        return this.sheriff;
    }

    public void setSheriff(Sheriff sheriff) {
        this.sheriff = sheriff;
    }

    public Date getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}