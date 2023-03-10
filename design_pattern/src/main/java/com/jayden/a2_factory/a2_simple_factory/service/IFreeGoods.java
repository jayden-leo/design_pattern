package com.jayden.a2_factory.a2_simple_factory.service;

import com.jayden.a2_factory.entity.AwardInfo;
import com.jayden.a2_factory.entity.ResponseResult;

/**
 * 免费商品发放接口
 **/
public interface IFreeGoods {

    ResponseResult sendFreeGoods(AwardInfo awardInfo);

}