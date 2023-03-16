package com.jayden.a3_behavior.a1_observer.a2_lottery_number_nopattern;

/**
 * 模拟买房摇号服务
 **/
public class DrawHouseService {

    //摇号抽签
    public String lots(String uId){
        if(uId.hashCode() % 2 == 0){
            return "恭喜ID为: " + uId + " 的用户,在本次摇号中中签! !";
        }else{
            return "很遗憾,ID为: " + uId + "的用户,您本次未中签! !";
        }
    }
}