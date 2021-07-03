package cn.ltw.baseadmin.sys.sysmenu.service;

import cn.ltw.baseadmin.common.pojo.Result;
import cn.ltw.baseadmin.common.service.CommonService;
import cn.ltw.baseadmin.sys.sysmenu.pojo.SysMenu;
import cn.ltw.baseadmin.sys.sysmenu.vo.SysMenuVo;

import java.util.List;

public interface SysMenuService extends CommonService<SysMenuVo, SysMenu, String> {
    Result<List<SysMenuVo>> listByTier(SysMenuVo entityVo);
}
