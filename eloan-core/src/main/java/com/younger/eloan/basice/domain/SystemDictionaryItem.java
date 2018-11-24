package com.younger.eloan.basice.domain;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * 数据字典明细
 */
@Getter
@Setter
public class SystemDictionaryItem extends  BaseDomain {

    private Long parentId;

    private String title;

    private String intro;

    private int sequence;

    public String getJsonString(){
        Map<String, Object> json = new HashMap<>();
        json.put("id",getId());
        json.put("parentId",parentId);
        json.put("title",title);
        json.put("intro", intro);
        json.put("sequence", sequence);

        return JSONObject.toJSONString(json);
    }
}
