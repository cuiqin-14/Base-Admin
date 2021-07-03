package cn.ltw.baseadmin.sys.sysuserauthority.service;

import cn.ltw.baseadmin.common.pojo.Result;
import cn.ltw.baseadmin.common.service.CommonService;
import cn.ltw.baseadmin.sys.sysuserauthority.pojo.SysUserAuthority;
import cn.ltw.baseadmin.sys.sysuserauthority.vo.SysUserAuthorityVo;

import java.util.List;

public interface SysUserAuthorityService extends CommonService<SysUserAuthorityVo, SysUserAuthority, String> {
    Result<List<SysUserAuthorityVo>> findByUserId(String userId);

    Result<Boolean> saveAllByUserId(String userId, String authorityIdList);
}
