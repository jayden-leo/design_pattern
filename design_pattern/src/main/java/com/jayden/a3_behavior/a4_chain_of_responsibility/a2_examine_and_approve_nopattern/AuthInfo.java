package com.jayden.a3_behavior.a4_chain_of_responsibility.a2_examine_and_approve_nopattern;

import lombok.Data;

/**
 * 审核信息
 **/
@Data
public class AuthInfo {

    private String code;

    private String info ="";

    public AuthInfo(String code, String... infos) {
        this.code = code;
        for (String str : infos) {
            info = this.info.concat(str +" ");
        }
    }
}