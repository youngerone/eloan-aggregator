package com.younger.eloan.basice.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Systemdictionaryitem extends BaseDomain{

    private Long parentid;

    private String title;

    private String intro;

    private Integer sequence;

}