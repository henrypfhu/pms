package com.yougou.zhixiao.pms.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * Created by he.wc on 2015/2/6.
 */
@Service
public class OauthService {




    public boolean checkClientId(String clientId){
        return StringUtils.equals(clientId,"appkey1");
    }
}
