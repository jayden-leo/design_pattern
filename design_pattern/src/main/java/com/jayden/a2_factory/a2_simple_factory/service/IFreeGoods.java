package com.jayden.a2_factory.a2_simple_factory.service;

import com.jayden.a2_factory.entity.AwardInfo;
import com.jayden.a2_factory.entity.ResponseResult;

/**
 * 免费商品发放接口
 * @author spikeCong
 * @date 2022/9/8
 **/
public interface IFreeGoods {

    ResponseResult sendFreeGoods(AwardInfo awardInfo);

}