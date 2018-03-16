package ca.bc.gov.jag.shuber.persistence.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import ca.bc.gov.jag.shuber.persistence.AbstractAuditableVersionable;

/**
 * AssignmentStream generated by Hibernate Tools hbm2java.
 *
 * <p>Domain model for database table assignment_stream.
 *
 * @author hbm2java
 * @version 352
 */
@Entity
@Table(name = "assignment_stream"
    // ,schema="shersched"
)
public class AssignmentStream extends AbstractAuditableVersionable implements Serializable {

    /** UID. */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "assignment_stream_id", nullable = false, updatable = false)
    private UUID assignmentStreamId;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", nullable = false)
    private Courthouse courthouse;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "work_section_code")
    private WorkSectionCode workSectionCode;

    @NotNull
    @Column(name = "org_unit_id", nullable = false)
    private UUID orgUnitId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "assignmentStream")
    private List<Duty> duties = new ArrayList<Duty>(0);
    
    /** No args constructor. */
    public AssignmentStream() {}

    /** Required args constructor. */
    public AssignmentStream(
            UUID assignmentStreamId,
            Courthouse courthouse,
            UUID orgUnitId,
            String createdBy,
            String updatedBy,
            Date createdDtm,
            Date updatedDtm,
            long revisionCount) {
        this.assignmentStreamId = assignmentStreamId;
        this.courthouse = courthouse;
        this.orgUnitId = orgUnitId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdDtm = createdDtm;
        this.updatedDtm = updatedDtm;
        this.revisionCount = revisionCount;
    }

    /** All args constructor. */
    public AssignmentStream(
            UUID assignmentStreamId,
            Courthouse courthouse,
            WorkSectionCode workSectionCode,
            UUID orgUnitId,
            String createdBy,
            String updatedBy,
            Date createdDtm,
            Date updatedDtm,
            long revisionCount,
            List<Duty> duties) {
        this.assignmentStreamId = assignmentStreamId;
        this.courthouse = courthouse;
        this.workSectionCode = workSectionCode;
        this.orgUnitId = orgUnitId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdDtm = createdDtm;
        this.updatedDtm = updatedDtm;
        this.revisionCount = revisionCount;
        this.duties = duties;
    }

    public UUID getAssignmentStreamId() {
        return this.assignmentStreamId;
    }

    public void setAssignmentStreamId(UUID assignmentStreamId) {
        this.assignmentStreamId = assignmentStreamId;
    }

    public Courthouse getCourthouse() {
        return this.courthouse;
    }

    public void setCourthouse(Courthouse courthouse) {
        this.courthouse = courthouse;
    }

    public WorkSectionCode getWorkSectionCode() {
        return this.workSectionCode;
    }

    public void setWorkSectionCode(WorkSectionCode workSectionCode) {
        this.workSectionCode = workSectionCode;
    }

    public UUID getOrgUnitId() {
        return this.orgUnitId;
    }

    public void setOrgUnitId(UUID orgUnitId) {
        this.orgUnitId = orgUnitId;
    }

    public List<Duty> getDuties() {
        return this.duties;
    }

    public void setDuties(List<Duty> duties) {
        this.duties = duties;
    }
}
