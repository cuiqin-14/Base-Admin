package cn.ltw.baseadmin.sys.sysuser.controller;

import cn.ltw.baseadmin.annotation.Decrypt;
import cn.ltw.baseadmin.annotation.Encrypt;
import cn.ltw.baseadmin.common.controller.CommonController;
import cn.ltw.baseadmin.common.pojo.PageInfo;
import cn.ltw.baseadmin.common.pojo.Result;
import cn.ltw.baseadmin.sys.sysuser.pojo.SysUser;
import cn.ltw.baseadmin.sys.sysuser.service.SysUserService;
import cn.ltw.baseadmin.sys.sysuser.vo.SysUserVo;
import cn.ltw.baseadmin.util.SecurityUtil;
import cn.ltw.baseadmin.util.SysSettingUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sys/sysUser/")
public class SysUserController extends CommonController<SysUserVo, SysUser, String> {
    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SecurityUtil securityUtil;

    @GetMapping("user")
    public ModelAndView user(){
        return new ModelAndView("sys/user/user","initPassword", SysSettingUtil.getSysSetting().getUserInitPassword());
    }

    @PostMapping("resetPassword")
    @Decrypt
    @Encrypt
    public Result<SysUserVo> resetPassword(SysUserVo sysUserVo){
        return sysUserService.resetPassword(sysUserVo.getUserId());
    }

    @PostMapping("pageOnLine")
    @Decrypt
    @Encrypt
    public Result<PageInfo<SysUserVo>> pageOnLine(SysUserVo sysUserVo){
        ArrayList<SysUserVo> sysUserVoList = new ArrayList<>();
        List<Object> allPrincipals = securityUtil.sessionRegistryGetAllPrincipals();
        for (Object allPrincipal : allPrincipals) {
            SysUserVo userVo = new SysUserVo();
            User user = (User) allPrincipal;
            userVo.setLoginName(user.getUsername());
            sysUserVoList.add(userVo);
        }
        PageInfo<SysUserVo> pageInfo = new PageInfo<>();
        pageInfo.setPage(1);//??????
        pageInfo.setPageSize(10000);//????????????
        pageInfo.setRows(sysUserVoList);//????????????
        pageInfo.setRecords(sysUserVoList.size());//????????????
        pageInfo.setTotal(1);//?????????
        return Result.of(pageInfo);
    }

    @DeleteMapping("forced/{loginName}")
    public Result<String> forced( @PathVariable("loginName") String loginName) {
        securityUtil.sessionRegistryRemoveUserByLoginName(loginName);
        return Result.of("????????????");
    }
}
