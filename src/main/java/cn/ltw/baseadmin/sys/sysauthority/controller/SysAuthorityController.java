package cn.ltw.baseadmin.sys.sysauthority.controller;

import cn.ltw.baseadmin.common.controller.CommonController;
import cn.ltw.baseadmin.sys.sysauthority.pojo.SysAuthority;
import cn.ltw.baseadmin.sys.sysauthority.service.SysAuthorityService;
import cn.ltw.baseadmin.sys.sysauthority.vo.SysAuthorityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/sys/sysAuthority/")
public class SysAuthorityController extends CommonController<SysAuthorityVo, SysAuthority, String> {
    @Autowired
    private SysAuthorityService sysAuthorityService;

    @GetMapping("authority")
    public ModelAndView authority(){
        return new ModelAndView("sys/authority/authority");
    }

}
