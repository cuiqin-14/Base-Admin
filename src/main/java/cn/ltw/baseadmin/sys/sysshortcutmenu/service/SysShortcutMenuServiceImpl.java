package cn.ltw.baseadmin.sys.sysshortcutmenu.service;

import cn.ltw.baseadmin.common.pojo.Result;
import cn.ltw.baseadmin.common.service.CommonServiceImpl;
import cn.ltw.baseadmin.sys.sysshortcutmenu.pojo.SysShortcutMenu;
import cn.ltw.baseadmin.sys.sysshortcutmenu.repository.SysShortcutMenuRepository;
import cn.ltw.baseadmin.sys.sysshortcutmenu.vo.SysShortcutMenuVo;
import cn.ltw.baseadmin.util.CopyUtil;
import cn.ltw.baseadmin.util.MenuUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@Transactional
public class SysShortcutMenuServiceImpl extends CommonServiceImpl<SysShortcutMenuVo, SysShortcutMenu, String> implements SysShortcutMenuService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private SysShortcutMenuRepository sysShortcutMenuRepository;

    @Override
    public Result<String> delete(String id) {
        //先删除子节点
        SysShortcutMenuVo sysShortcutMenuVo = new SysShortcutMenuVo();
        sysShortcutMenuVo.setShortcutMenuParentId(id);
        super.list(sysShortcutMenuVo).getData().forEach((menuVo)->{
            super.delete(menuVo.getShortcutMenuId());
        });
        //再删除自己
        return super.delete(id);
    }

    @Override
    public Result<List<SysShortcutMenuVo>> findByUserId(String userId) {
        List<SysShortcutMenuVo> sysShortcutMenuVoList = CopyUtil.copyList(sysShortcutMenuRepository.findByUserId(userId), SysShortcutMenuVo.class);
        return Result.of(MenuUtil.getChildBySysShortcutMenuVo("",sysShortcutMenuVoList));
    }
}
