package cn.ltw.baseadmin.sys.sysusermenu.service;

import cn.ltw.baseadmin.common.pojo.Result;
import cn.ltw.baseadmin.common.service.CommonService;
import cn.ltw.baseadmin.sys.sysmenu.vo.SysMenuVo;
import cn.ltw.baseadmin.sys.sysusermenu.pojo.SysUserMenu;
import cn.ltw.baseadmin.sys.sysusermenu.vo.SysUserMenuVo;

import java.util.List;

public interface SysUserMenuService extends CommonService<SysUserMenuVo, SysUserMenu, String> {
    Result<List<SysMenuVo>> findByUserId(String userId);

    Result<Boolean> saveAllByUserId(String userId, String menuIdList);
}
