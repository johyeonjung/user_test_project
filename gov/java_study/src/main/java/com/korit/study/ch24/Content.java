package com.korit.study.ch24;

import java.util.HashMap;
import java.util.Map;

public class Content {



    Map<String, Object> contentMap = new HashMap<>();

    Map<String, Object> setContent(String content) {
        contentMap.put("content", content);
        return contentMap;
    }
}
