package com.entity.model;

import com.entity.XueshengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学生
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XueshengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 宿舍
     */
    private Integer susheId;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 学号
     */
    private String xueshengUuidNumber;


    /**
     * 学生姓名
     */
    private String xueshengName;


    /**
     * 学生手机号
     */
    private String xueshengPhone;


    /**
     * 电子邮箱
     */
    private String xueshengEmail;


    /**
     * QQ号
     */
    private String xueshengQq;


    /**
     * 学生头像
     */
    private String xueshengPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 职位
     */
    private Integer zhiweiTypes;


    /**
     * 班级
     */
    private Integer banjiTypes;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：宿舍
	 */
    public Integer getSusheId() {
        return susheId;
    }


    /**
	 * 设置：宿舍
	 */
    public void setSusheId(Integer susheId) {
        this.susheId = susheId;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：学号
	 */
    public String getXueshengUuidNumber() {
        return xueshengUuidNumber;
    }


    /**
	 * 设置：学号
	 */
    public void setXueshengUuidNumber(String xueshengUuidNumber) {
        this.xueshengUuidNumber = xueshengUuidNumber;
    }
    /**
	 * 获取：学生姓名
	 */
    public String getXueshengName() {
        return xueshengName;
    }


    /**
	 * 设置：学生姓名
	 */
    public void setXueshengName(String xueshengName) {
        this.xueshengName = xueshengName;
    }
    /**
	 * 获取：学生手机号
	 */
    public String getXueshengPhone() {
        return xueshengPhone;
    }


    /**
	 * 设置：学生手机号
	 */
    public void setXueshengPhone(String xueshengPhone) {
        this.xueshengPhone = xueshengPhone;
    }
    /**
	 * 获取：电子邮箱
	 */
    public String getXueshengEmail() {
        return xueshengEmail;
    }


    /**
	 * 设置：电子邮箱
	 */
    public void setXueshengEmail(String xueshengEmail) {
        this.xueshengEmail = xueshengEmail;
    }
    /**
	 * 获取：QQ号
	 */
    public String getXueshengQq() {
        return xueshengQq;
    }


    /**
	 * 设置：QQ号
	 */
    public void setXueshengQq(String xueshengQq) {
        this.xueshengQq = xueshengQq;
    }
    /**
	 * 获取：学生头像
	 */
    public String getXueshengPhoto() {
        return xueshengPhoto;
    }


    /**
	 * 设置：学生头像
	 */
    public void setXueshengPhoto(String xueshengPhoto) {
        this.xueshengPhoto = xueshengPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：职位
	 */
    public Integer getZhiweiTypes() {
        return zhiweiTypes;
    }


    /**
	 * 设置：职位
	 */
    public void setZhiweiTypes(Integer zhiweiTypes) {
        this.zhiweiTypes = zhiweiTypes;
    }
    /**
	 * 获取：班级
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }


    /**
	 * 设置：班级
	 */
    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
