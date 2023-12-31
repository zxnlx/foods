package com.imooc.service.center;

import com.imooc.pojo.Users;
import com.imooc.pojo.bo.center.CenterUserBO;

public interface CenterUserService {
    Users queryUserInfo(String userId);

    Users updateUserInfo(String userId, CenterUserBO centerUserBO);
}
