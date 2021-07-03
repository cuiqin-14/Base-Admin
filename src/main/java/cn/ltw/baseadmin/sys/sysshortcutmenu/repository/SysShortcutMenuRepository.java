package cn.ltw.baseadmin.sys.sysshortcutmenu.repository;

import cn.ltw.baseadmin.common.repository.CommonRepository;
import cn.ltw.baseadmin.sys.sysshortcutmenu.pojo.SysShortcutMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysShortcutMenuRepository extends CommonRepository<SysShortcutMenu, String> {
    List<SysShortcutMenu> findByUserId(String userId);
}
