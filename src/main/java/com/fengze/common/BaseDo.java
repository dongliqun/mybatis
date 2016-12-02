package com.fengze.common;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/1.
 */
@Data
public class BaseDo implements Serializable{

    private Integer id;//ID

    private String state;//状态

    private String createBy;//创建人

    private String createDate;//创建时间

    private String updateBy;//修改人

    private String updateDate;//修改时间

}
