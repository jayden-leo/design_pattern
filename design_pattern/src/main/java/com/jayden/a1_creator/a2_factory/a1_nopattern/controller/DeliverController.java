package com.jayden.a1_creator.a2_factory.a1_nopattern.controller;

import com.jayden.a1_creator.a2_factory.a1_nopattern.service.DiscountService;
import com.jayden.a1_creator.a2_factory.a1_nopattern.service.SmallGiftService;
import com.jayden.a1_creator.a2_factory.a1_nopattern.service.YoukuMemberService;
import com.jayden.a1_creator.a2_factory.entity.AwardInfo;
import com.jayden.a1_creator.a2_factory.entity.ResponseResult;
import com.jayden.a1_creator.a2_factory.entity.SmallGiftInfo;
import net.sf.json.JSONArray;

import java.util.UUID;

public class DeliverController {

    /**
     * 按照类型的不同发放商品
     *     奖品类型: 1 打折券 ,2 优酷会员,3 小礼品
     */
    public void awardToUser(AwardInfo awardInfo){

        if(awardInfo.getAwardType() == 1){ //打折券
            DiscountService discountService = new DiscountService();
            ResponseResult result = discountService.sendDiscount(awardInfo.getUid(), awardInfo.getAwardNumber());
            System.out.println("打折券发放成功!"+ JSONArray.fromObject(result));

        }else if(awardInfo.getAwardType() == 2){ //优酷会员
            //获取用户手机号
            String bindMobile = awardInfo.getExtMap().get("phone");

            //调用service
            YoukuMemberService youKuMemberService = new YoukuMemberService();
            youKuMemberService.openMember(bindMobile,awardInfo.getAwardNumber());
            System.out.println("优酷会员发放成功!");

        }else if(awardInfo.getAwardType() == 3){ /*
            小礼品
            封装收货用户信息
            */
            SmallGiftInfo smallGiftInfo = new SmallGiftInfo();
            smallGiftInfo.setUserName(awardInfo.getExtMap().get("username"));
            smallGiftInfo.setOrderId(UUID.randomUUID().toString());
            smallGiftInfo.setRelAddress(awardInfo.getExtMap().get("adderss"));

            SmallGiftService smallGiftService = new SmallGiftService();
            Boolean isSuccess = smallGiftService.giveSmallGift(smallGiftInfo);
            System.out.println("小礼品发放成功!" + isSuccess);
        }
    }

}
