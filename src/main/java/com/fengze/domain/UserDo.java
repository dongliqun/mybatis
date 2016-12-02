package com.fengze.domain;

import com.fengze.common.BaseDo;
import lombok.Data;

/**
 * Created by Administrator on 2016/12/1.
 */
@Data
public class UserDo extends BaseDo{

    private String userName;//用户名
    private String password;//密码
    private String cellPhone;//电话
    private String address;//地址
    private String email;//邮件
    private String userType;//用户类型
    private String realName;//真实姓名



}
