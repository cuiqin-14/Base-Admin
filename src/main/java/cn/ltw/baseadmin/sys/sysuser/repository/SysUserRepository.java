package cn.ltw.baseadmin.sys.sysuser.repository;

import cn.ltw.baseadmin.common.repository.CommonRepository;
import cn.ltw.baseadmin.sys.sysuser.pojo.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRepository extends CommonRepository<SysUser, String> {
    SysUser findByLoginName(String username);
}
