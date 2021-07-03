package cn.ltw.baseadmin.sys.sysmenu.repository;

import cn.ltw.baseadmin.common.repository.CommonRepository;
import cn.ltw.baseadmin.sys.sysmenu.pojo.SysMenu;
import org.springframework.stereotype.Repository;

@Repository
public interface SysMenuRepository extends CommonRepository<SysMenu, String> {
}
