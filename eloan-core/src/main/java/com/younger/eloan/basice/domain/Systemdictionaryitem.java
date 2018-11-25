package com.younger.eloan.basice.domain;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
public class Systemdictionaryitem extends BaseDomain{

    private Long parentid;

    private String title;

    private String intro;

    private Integer sequence;

    public String getJsonString(){
        Map<String, Object> json = new HashMap<>();
        json.put("id",getId());
        json.put("parentId",parentid);
        json.put("title",title);
        json.put("intro", intro);
        json.put("sequence", sequence);

        return JSONObject.toJSONString(json);
    }

}