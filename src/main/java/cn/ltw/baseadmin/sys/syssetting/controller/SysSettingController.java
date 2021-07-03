package cn.ltw.baseadmin.sys.syssetting.controller;

import cn.ltw.baseadmin.common.controller.CommonController;
import cn.ltw.baseadmin.sys.syssetting.pojo.SysSetting;
import cn.ltw.baseadmin.sys.syssetting.service.SysSettingService;
import cn.ltw.baseadmin.sys.syssetting.vo.SysSettingVo;
import cn.ltw.baseadmin.util.SysSettingUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/sys/sysSetting/")
public class SysSettingController extends CommonController<SysSettingVo, SysSetting, String> {
    @Autowired
    private SysSettingService sysSettingService;

    @GetMapping("setting")
    public ModelAndView setting() {
        return new ModelAndView("sys/setting/setting", "sys", SysSettingUtil.getSysSetting());
    }
}
