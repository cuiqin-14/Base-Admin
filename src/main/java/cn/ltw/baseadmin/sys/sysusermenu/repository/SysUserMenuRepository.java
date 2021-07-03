package cn.ltw.baseadmin.sys.sysusermenu.repository;

import cn.ltw.baseadmin.common.repository.CommonRepository;
import cn.ltw.baseadmin.sys.sysusermenu.pojo.SysUserMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserMenuRepository extends CommonRepository<SysUserMenu, String> {
    List<SysUserMenu> findByUserId(String userId);
}
