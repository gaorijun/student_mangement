package com.suny.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author sunyuan
 * @date 2021/11/23 16:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long uid;

    /**
     * 真实姓名
     */
    private String uname;

    /**
     * 用户类型
     */
    private String type;

    /**
     * 登陆用户名
     */
    private String username;

    /**
     * 登陆密码
     */
    private String password;

    /**
     * 乐观锁
     */
    private Integer version;

    /**
     * 伪删除
     */
    private Integer isDelete;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 更新时间
     */
    private LocalDateTime gmtUpdate;

}
