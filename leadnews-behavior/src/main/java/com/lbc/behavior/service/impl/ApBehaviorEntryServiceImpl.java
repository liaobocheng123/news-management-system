package com.lbc.behavior.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lbc.behavior.mapper.ApBehaviorEntryMapper;
import com.lbc.behavior.service.ApBehaviorEntryService;
import com.lbc.model.behavior.pojos.ApBehaviorEntry;
import org.springframework.stereotype.Service;

@Service
public class ApBehaviorEntryServiceImpl extends ServiceImpl<ApBehaviorEntryMapper, ApBehaviorEntry> implements ApBehaviorEntryService {

    @Override
    public ApBehaviorEntry findByUserIdOrEquipmentId(Integer userId, Integer equipmentId){
        //根据用户查询行为实体
        if(userId != null){
          return getOne(Wrappers.<ApBehaviorEntry>lambdaQuery().eq(ApBehaviorEntry::getEntryId,userId).eq(ApBehaviorEntry::getType,1));
        }
        //根据设备id查询行为实体
        if(userId == null && equipmentId != null && equipmentId != 0){
            return getOne(Wrappers.<ApBehaviorEntry>lambdaQuery().eq(ApBehaviorEntry::getEntryId,equipmentId).eq(ApBehaviorEntry::getType,0));
        }
        return null;
    }

    @Override
    public void insert(ApBehaviorEntry apBehaviorEntry) {
        save(apBehaviorEntry);
    }
}