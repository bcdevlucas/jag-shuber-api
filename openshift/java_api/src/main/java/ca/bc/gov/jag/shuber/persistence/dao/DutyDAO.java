package ca.bc.gov.jag.shuber.persistence.dao;

import ca.bc.gov.jag.shuber.persistence.model.Duty;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * DutyDAO generated by Hibernate Tools hbm2dao.
 *
 * <p>Domain data access object for database table duty.
 *
 * @author hbm2dao
 * @version 352
 * @see ca.bc.gov.jag.shuber.persistence.model.Duty
 */
@Repository
public interface DutyDAO extends JpaRepository<Duty, UUID> {
    // NOTE: add custom methods here

}
