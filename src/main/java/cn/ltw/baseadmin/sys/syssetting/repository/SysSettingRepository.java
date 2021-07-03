package cn.ltw.baseadmin.sys.syssetting.repository;

import cn.ltw.baseadmin.common.repository.CommonRepository;
import cn.ltw.baseadmin.sys.syssetting.pojo.SysSetting;
import org.springframework.stereotype.Repository;

@Repository
public interface SysSettingRepository extends CommonRepository<SysSetting, String> {
}
