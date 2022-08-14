package tech.pdai.springboot.mysql8.jpa.dao;

import org.springframework.stereotype.Repository;
import tech.pdai.springboot.mysql8.jpa.entity.Role;

/**
 * @author pdai
 */
@Repository
public interface IRoleDao extends IBaseDao<Role, Long> {

}
