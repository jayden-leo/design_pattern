package com.jayden.a2_factory.a2_simple_factory.service.impl;

import com.jayden.a2_factory.a2_simple_factory.service.IFreeGoods;
import com.jayden.a2_factory.entity.AwardInfo;
import com.jayden.a2_factory.entity.ResponseResult;
import com.jayden.a2_factory.entity.SmallGiftInfo;
import net.sf.json.JSONArray;

import java.util.UUID;

/**
 * 小礼品发放服务
 * @author spikeCong
 * @date 2022/9/8
 **/
public class SmallGiftFreeGoods implements IFreeGoods {

    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {

        SmallGiftInfo smallGiftInfo = new SmallGiftInfo();
        smallGiftInfo.setUserPhone(awardInfo.getExtMap().get("phone"));
        smallGiftInfo.setUserName(awardInfo.getExtMap().get("username"));
        smallGiftInfo.setRelAddress(awardInfo.getExtMap().get("address"));
        smallGiftInfo.setOrderId(UUID.randomUUID().toString());

        System.out.println("小礼品发放成,请注意查收: " + JSONArray.fromObject(smallGiftInfo));
        return new ResponseResult("200","小礼品发送成功", smallGiftInfo);
    }
}