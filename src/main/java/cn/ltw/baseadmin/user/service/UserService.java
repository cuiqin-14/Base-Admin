package cn.ltw.baseadmin.user.service;

import cn.ltw.baseadmin.common.pojo.Result;
import cn.ltw.baseadmin.sys.sysuser.vo.SysUserVo;

public interface UserService {
    Result<SysUserVo> updatePassword(String oldPassword, String newPassword);

    Result<SysUserVo> updateUser(SysUserVo sysUserVo);
}
