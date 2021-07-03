package cn.ltw.baseadmin.sys.sysuser.service;

import cn.ltw.baseadmin.common.pojo.Result;
import cn.ltw.baseadmin.common.service.CommonService;
import cn.ltw.baseadmin.sys.sysuser.pojo.SysUser;
import cn.ltw.baseadmin.sys.sysuser.vo.SysUserVo;

public interface SysUserService extends CommonService<SysUserVo, SysUser, String> {
    Result<SysUserVo> findByLoginName(String username);
    Result<SysUserVo> resetPassword(String userId);
}
