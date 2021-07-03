package cn.ltw.baseadmin.sys.sysshortcutmenu.controller;

import cn.ltw.baseadmin.common.controller.CommonController;
import cn.ltw.baseadmin.sys.sysshortcutmenu.pojo.SysShortcutMenu;
import cn.ltw.baseadmin.sys.sysshortcutmenu.service.SysShortcutMenuService;
import cn.ltw.baseadmin.sys.sysshortcutmenu.vo.SysShortcutMenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/sysShortcutMenu/")
public class SysShortcutMenuController extends CommonController<SysShortcutMenuVo, SysShortcutMenu, String> {
    @Autowired
    private SysShortcutMenuService sysShortcutMenuService;
}
