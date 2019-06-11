/*
 * This up.god.file is generated by jOOQ.
 */
package com.htl.domain.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.7"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface ISysApp extends Serializable {

    /**
     * Getter for <code>DB_HTL.SYS_APP.PK_ID</code>. uniqueId,PK_ID
     */
    public String getPkId();

    /**
     * Setter for <code>DB_HTL.SYS_APP.PK_ID</code>. uniqueId,PK_ID
     */
    public ISysApp setPkId(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.T_COMMENTS</code>. comments,T_COMMENTS
     */
    public String getTComments();

    /**
     * Setter for <code>DB_HTL.SYS_APP.T_COMMENTS</code>. comments,T_COMMENTS
     */
    public ISysApp setTComments(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.V_ESERVER_ID</code>. email = true时，关联Email Server的ID（软关联）,emailServer,V_ESERVER_ID
     */
    public String getVEserverId();

    /**
     * Setter for <code>DB_HTL.SYS_APP.V_ESERVER_ID</code>. email = true时，关联Email Server的ID（软关联）,emailServer,V_ESERVER_ID
     */
    public ISysApp setVEserverId(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.S_NAME</code>. name,S_NAME
     */
    public String getSName();

    /**
     * Setter for <code>DB_HTL.SYS_APP.S_NAME</code>. name,S_NAME
     */
    public ISysApp setSName(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.S_CODE</code>. code,S_CODE
     */
    public String getSCode();

    /**
     * Setter for <code>DB_HTL.SYS_APP.S_CODE</code>. code,S_CODE
     */
    public ISysApp setSCode(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.S_AUTH</code>. OAuth对应的模式secret,auth,S_AUTH
     */
    public String getSAuth();

    /**
     * Setter for <code>DB_HTL.SYS_APP.S_AUTH</code>. OAuth对应的模式secret,auth,S_AUTH
     */
    public ISysApp setSAuth(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.S_BACK_UP</code>. 备份地址，打包备份整个应用配置文件的服务端地址,backup,S_BACK_UP
     */
    public String getSBackUp();

    /**
     * Setter for <code>DB_HTL.SYS_APP.S_BACK_UP</code>. 备份地址，打包备份整个应用配置文件的服务端地址,backup,S_BACK_UP
     */
    public ISysApp setSBackUp(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.S_CONTACT</code>. 拥有者联系方式,contact,S_CONTACT
     */
    public String getSContact();

    /**
     * Setter for <code>DB_HTL.SYS_APP.S_CONTACT</code>. 拥有者联系方式,contact,S_CONTACT
     */
    public ISysApp setSContact(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.S_CURRENCY</code>. 货币单位,currency,S_CURRENCY
     */
    public String getSCurrency();

    /**
     * Setter for <code>DB_HTL.SYS_APP.S_CURRENCY</code>. 货币单位,currency,S_CURRENCY
     */
    public ISysApp setSCurrency(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.S_DATE_FORMAT</code>. 全局时间格式,dateFormat,S_DATE_FORMAT
     */
    public String getSDateFormat();

    /**
     * Setter for <code>DB_HTL.SYS_APP.S_DATE_FORMAT</code>. 全局时间格式,dateFormat,S_DATE_FORMAT
     */
    public ISysApp setSDateFormat(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.S_ENCODING</code>. 编码方式,encoding,S_ENCODING
     */
    public String getSEncoding();

    /**
     * Setter for <code>DB_HTL.SYS_APP.S_ENCODING</code>. 编码方式,encoding,S_ENCODING
     */
    public ISysApp setSEncoding(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.S_ICP</code>. ICP备案号,icp,S_ICP
     */
    public String getSIcp();

    /**
     * Setter for <code>DB_HTL.SYS_APP.S_ICP</code>. ICP备案号,icp,S_ICP
     */
    public ISysApp setSIcp(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.S_LOGO</code>. 程序Logo,logo,S_LOGO
     */
    public String getSLogo();

    /**
     * Setter for <code>DB_HTL.SYS_APP.S_LOGO</code>. 程序Logo,logo,S_LOGO
     */
    public ISysApp setSLogo(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.S_OWNER</code>. 拥有者,owner,S_OWNER
     */
    public String getSOwner();

    /**
     * Setter for <code>DB_HTL.SYS_APP.S_OWNER</code>. 拥有者,owner,S_OWNER
     */
    public ISysApp setSOwner(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.S_PATH</code>. 路径，对应React-Router中的app参数,path,S_PATH
     */
    public String getSPath();

    /**
     * Setter for <code>DB_HTL.SYS_APP.S_PATH</code>. 路径，对应React-Router中的app参数,path,S_PATH
     */
    public ISysApp setSPath(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.S_RENEWAL</code>. 应用更新码，随机16位字符串,renewal,S_RENEWAL
     */
    public String getSRenewal();

    /**
     * Setter for <code>DB_HTL.SYS_APP.S_RENEWAL</code>. 应用更新码，随机16位字符串,renewal,S_RENEWAL
     */
    public ISysApp setSRenewal(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.S_TITLE</code>. 主标题,title,S_TITLE
     */
    public String getSTitle();

    /**
     * Setter for <code>DB_HTL.SYS_APP.S_TITLE</code>. 主标题,title,S_TITLE
     */
    public ISysApp setSTitle(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.S_TYPE</code>. 类别,type,S_TYPE
     */
    public String getSType();

    /**
     * Setter for <code>DB_HTL.SYS_APP.S_TYPE</code>. 类别,type,S_TYPE
     */
    public ISysApp setSType(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.S_VERSION</code>. 版本信息,version,S_VERSION
     */
    public String getSVersion();

    /**
     * Setter for <code>DB_HTL.SYS_APP.S_VERSION</code>. 版本信息,version,S_VERSION
     */
    public ISysApp setSVersion(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.J_CONFIG</code>. config,J_CONFIG
     */
    public String getJConfig();

    /**
     * Setter for <code>DB_HTL.SYS_APP.J_CONFIG</code>. config,J_CONFIG
     */
    public ISysApp setJConfig(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.I_ATTACH_SIZE</code>. 附件尺寸,attachSize,I_ATTACH_SIZE
     */
    public Integer getIAttachSize();

    /**
     * Setter for <code>DB_HTL.SYS_APP.I_ATTACH_SIZE</code>. 附件尺寸,attachSize,I_ATTACH_SIZE
     */
    public ISysApp setIAttachSize(Integer value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public Boolean getIsActive();

    /**
     * Setter for <code>DB_HTL.SYS_APP.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public ISysApp setIsActive(Boolean value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public String getZSigma();

    /**
     * Setter for <code>DB_HTL.SYS_APP.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public ISysApp setZSigma(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public String getZLanguage();

    /**
     * Setter for <code>DB_HTL.SYS_APP.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public ISysApp setZLanguage(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public String getZCreateBy();

    /**
     * Setter for <code>DB_HTL.SYS_APP.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public ISysApp setZCreateBy(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public LocalDateTime getZCreateTime();

    /**
     * Setter for <code>DB_HTL.SYS_APP.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public ISysApp setZCreateTime(LocalDateTime value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public String getZUpdateBy();

    /**
     * Setter for <code>DB_HTL.SYS_APP.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public ISysApp setZUpdateBy(String value);

    /**
     * Getter for <code>DB_HTL.SYS_APP.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public LocalDateTime getZUpdateTime();

    /**
     * Setter for <code>DB_HTL.SYS_APP.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public ISysApp setZUpdateTime(LocalDateTime value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISysApp
     */
    public void from(com.htl.domain.tables.interfaces.ISysApp from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISysApp
     */
    public <E extends com.htl.domain.tables.interfaces.ISysApp> E into(E into);

    default ISysApp fromJson(io.vertx.core.json.JsonObject json) {
        setPkId(json.getString("PK_ID"));
        setTComments(json.getString("T_COMMENTS"));
        setVEserverId(json.getString("V_ESERVER_ID"));
        setSName(json.getString("S_NAME"));
        setSCode(json.getString("S_CODE"));
        setSAuth(json.getString("S_AUTH"));
        setSBackUp(json.getString("S_BACK_UP"));
        setSContact(json.getString("S_CONTACT"));
        setSCurrency(json.getString("S_CURRENCY"));
        setSDateFormat(json.getString("S_DATE_FORMAT"));
        setSEncoding(json.getString("S_ENCODING"));
        setSIcp(json.getString("S_ICP"));
        setSLogo(json.getString("S_LOGO"));
        setSOwner(json.getString("S_OWNER"));
        setSPath(json.getString("S_PATH"));
        setSRenewal(json.getString("S_RENEWAL"));
        setSTitle(json.getString("S_TITLE"));
        setSType(json.getString("S_TYPE"));
        setSVersion(json.getString("S_VERSION"));
        setJConfig(json.getString("J_CONFIG"));
        setIAttachSize(json.getInteger("I_ATTACH_SIZE"));
        setIsActive(json.getBoolean("IS_ACTIVE"));
        setZSigma(json.getString("Z_SIGMA"));
        setZLanguage(json.getString("Z_LANGUAGE"));
        setZCreateBy(json.getString("Z_CREATE_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column Z_CREATE_TIME!
        setZUpdateBy(json.getString("Z_UPDATE_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column Z_UPDATE_TIME!
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("PK_ID", getPkId());
        json.put("T_COMMENTS", getTComments());
        json.put("V_ESERVER_ID", getVEserverId());
        json.put("S_NAME", getSName());
        json.put("S_CODE", getSCode());
        json.put("S_AUTH", getSAuth());
        json.put("S_BACK_UP", getSBackUp());
        json.put("S_CONTACT", getSContact());
        json.put("S_CURRENCY", getSCurrency());
        json.put("S_DATE_FORMAT", getSDateFormat());
        json.put("S_ENCODING", getSEncoding());
        json.put("S_ICP", getSIcp());
        json.put("S_LOGO", getSLogo());
        json.put("S_OWNER", getSOwner());
        json.put("S_PATH", getSPath());
        json.put("S_RENEWAL", getSRenewal());
        json.put("S_TITLE", getSTitle());
        json.put("S_TYPE", getSType());
        json.put("S_VERSION", getSVersion());
        json.put("J_CONFIG", getJConfig());
        json.put("I_ATTACH_SIZE", getIAttachSize());
        json.put("IS_ACTIVE", getIsActive());
        json.put("Z_SIGMA", getZSigma());
        json.put("Z_LANGUAGE", getZLanguage());
        json.put("Z_CREATE_BY", getZCreateBy());
        // Omitting unrecognized type java.time.LocalDateTime for column Z_CREATE_TIME!
        json.put("Z_UPDATE_BY", getZUpdateBy());
        // Omitting unrecognized type java.time.LocalDateTime for column Z_UPDATE_TIME!
        return json;
    }

}
