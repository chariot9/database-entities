package com.chariot.shadow.company;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Trung Vu on 2017/06/20.
 */
@Entity
@Table(name = "company", schema = "company")
public class CompanyEntity {
    private Integer companyAutoId;
    private String companyId;
    private String companyNameEnglish;
    private String companyNameLocal;
    private String addressRegistered;
    private String addressCountry;
    private String telNumber;
    private String webUrl;
    private String actionCode;
    private Date publishDate;
    private Date registrationTimestamp;

    @Id
    @Column(name = "company_auto_id")
    public Integer getCompanyAutoId() {
        return companyAutoId;
    }

    public void setCompanyAutoId(Integer companyAutoId) {
        this.companyAutoId = companyAutoId;
    }

    @Basic
    @Column(name = "company_id")
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "company_name_english")
    public String getCompanyNameEnglish() {
        return companyNameEnglish;
    }

    public void setCompanyNameEnglish(String companyNameEnglish) {
        this.companyNameEnglish = companyNameEnglish;
    }

    @Basic
    @Column(name = "company_name_local")
    public String getCompanyNameLocal() {
        return companyNameLocal;
    }

    public void setCompanyNameLocal(String companyNameLocal) {
        this.companyNameLocal = companyNameLocal;
    }

    @Basic
    @Column(name = "address_registered")
    public String getAddressRegistered() {
        return addressRegistered;
    }

    public void setAddressRegistered(String addressRegistered) {
        this.addressRegistered = addressRegistered;
    }

    @Basic
    @Column(name = "address_country")
    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    @Basic
    @Column(name = "tel_number")
    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    @Basic
    @Column(name = "web_url")
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    @Basic
    @Column(name = "action_code")
    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    @Basic
    @Column(name = "publish_date")
    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Basic
    @Column(name = "registration_timestamp")
    public Date getRegistrationTimestamp() {
        return registrationTimestamp;
    }

    public void setRegistrationTimestamp(Date registrationTimestamp) {
        this.registrationTimestamp = registrationTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompanyEntity that = (CompanyEntity) o;

        if (companyAutoId != null ? !companyAutoId.equals(that.companyAutoId) : that.companyAutoId != null)
            return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (companyNameEnglish != null ? !companyNameEnglish.equals(that.companyNameEnglish) : that.companyNameEnglish != null)
            return false;
        if (companyNameLocal != null ? !companyNameLocal.equals(that.companyNameLocal) : that.companyNameLocal != null)
            return false;
        if (addressRegistered != null ? !addressRegistered.equals(that.addressRegistered) : that.addressRegistered != null)
            return false;
        if (addressCountry != null ? !addressCountry.equals(that.addressCountry) : that.addressCountry != null)
            return false;
        if (telNumber != null ? !telNumber.equals(that.telNumber) : that.telNumber != null) return false;
        if (webUrl != null ? !webUrl.equals(that.webUrl) : that.webUrl != null) return false;
        if (actionCode != null ? !actionCode.equals(that.actionCode) : that.actionCode != null) return false;
        if (publishDate != null ? !publishDate.equals(that.publishDate) : that.publishDate != null) return false;
        if (registrationTimestamp != null ? !registrationTimestamp.equals(that.registrationTimestamp) : that.registrationTimestamp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = companyAutoId != null ? companyAutoId.hashCode() : 0;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (companyNameEnglish != null ? companyNameEnglish.hashCode() : 0);
        result = 31 * result + (companyNameLocal != null ? companyNameLocal.hashCode() : 0);
        result = 31 * result + (addressRegistered != null ? addressRegistered.hashCode() : 0);
        result = 31 * result + (addressCountry != null ? addressCountry.hashCode() : 0);
        result = 31 * result + (telNumber != null ? telNumber.hashCode() : 0);
        result = 31 * result + (webUrl != null ? webUrl.hashCode() : 0);
        result = 31 * result + (actionCode != null ? actionCode.hashCode() : 0);
        result = 31 * result + (publishDate != null ? publishDate.hashCode() : 0);
        result = 31 * result + (registrationTimestamp != null ? registrationTimestamp.hashCode() : 0);
        return result;
    }
}
