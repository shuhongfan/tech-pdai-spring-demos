package tech.pdai.springboot.mysql57.druid.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import tech.pdai.springboot.mysql57.druid.entity.BaseEntity;

import java.io.Serializable;

/**
 * @author pdai
 */
@NoRepositoryBean
public interface IBaseDao<T extends BaseEntity, I extends Serializable>
        extends JpaRepository<T, I>, JpaSpecificationExecutor<T> {
}
