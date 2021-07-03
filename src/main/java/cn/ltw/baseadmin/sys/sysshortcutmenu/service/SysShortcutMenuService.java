package cn.ltw.baseadmin.sys.sysshortcutmenu.service;

import cn.ltw.baseadmin.common.pojo.Result;
import cn.ltw.baseadmin.common.service.CommonService;
import cn.ltw.baseadmin.sys.sysshortcutmenu.pojo.SysShortcutMenu;
import cn.ltw.baseadmin.sys.sysshortcutmenu.vo.SysShortcutMenuVo;

import java.util.List;

public interface SysShortcutMenuService extends CommonService<SysShortcutMenuVo, SysShortcutMenu, String> {
    Result<List<SysShortcutMenuVo>> findByUserId(String userId);
}
