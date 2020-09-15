/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.altersoftware.hotel.checkIn.tencentcloudapi.ocr.v20181119.models;

import java.util.HashMap;

import com.altersoftware.hotel.checkIn.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IDCardOCRResponse extends AbstractModel {

    /**
     * 姓名（人像面）
     */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * 性别（人像面）
     */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
     * 民族（人像面）
     */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
     * 出生日期（人像面）
     */
    @SerializedName("Birth")
    @Expose
    private String Birth;

    /**
     * 地址（人像面）
     */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
     * 身份证号（人像面）
     */
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

    /**
     * 发证机关（国徽面）
     */
    @SerializedName("Authority")
    @Expose
    private String Authority;

    /**
     * 证件有效期（国徽面）
     */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
     * 扩展信息，根据请求的可选字段返回对应内容，不请求则不返回，具体输入参考示例3和示例4。
     * <p>
     * 目前支持的扩展字段为：
     * IdCard，身份证照片，请求 CropIdCard 时返回；
     * Portrait，人像照片，请求 CropPortrait 时返回；
     * WarnInfos，告警信息（Code - 告警码），识别出以下告警内容时返回。
     * <p>
     * Code 告警码列表和释义：
     * -9100 身份证有效日期不合法告警，
     * -9101 身份证边框不完整告警，
     * -9102 身份证复印件告警，
     * -9103 身份证翻拍告警，
     * -9105 身份证框内遮挡告警，
     * -9104 临时身份证告警，
     * -9106 身份证 PS 告警。
     */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
     * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 姓名（人像面）
     *
     * @return Name 姓名（人像面）
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名（人像面）
     *
     * @param Name 姓名（人像面）
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 性别（人像面）
     *
     * @return Sex 性别（人像面）
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 性别（人像面）
     *
     * @param Sex 性别（人像面）
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 民族（人像面）
     *
     * @return Nation 民族（人像面）
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set 民族（人像面）
     *
     * @param Nation 民族（人像面）
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get 出生日期（人像面）
     *
     * @return Birth 出生日期（人像面）
     */
    public String getBirth() {
        return this.Birth;
    }

    /**
     * Set 出生日期（人像面）
     *
     * @param Birth 出生日期（人像面）
     */
    public void setBirth(String Birth) {
        this.Birth = Birth;
    }

    /**
     * Get 地址（人像面）
     *
     * @return Address 地址（人像面）
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地址（人像面）
     *
     * @param Address 地址（人像面）
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 身份证号（人像面）
     *
     * @return IdNum 身份证号（人像面）
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * Set 身份证号（人像面）
     *
     * @param IdNum 身份证号（人像面）
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    /**
     * Get 发证机关（国徽面）
     *
     * @return Authority 发证机关（国徽面）
     */
    public String getAuthority() {
        return this.Authority;
    }

    /**
     * Set 发证机关（国徽面）
     *
     * @param Authority 发证机关（国徽面）
     */
    public void setAuthority(String Authority) {
        this.Authority = Authority;
    }

    /**
     * Get 证件有效期（国徽面）
     *
     * @return ValidDate 证件有效期（国徽面）
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set 证件有效期（国徽面）
     *
     * @param ValidDate 证件有效期（国徽面）
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get 扩展信息，根据请求的可选字段返回对应内容，不请求则不返回，具体输入参考示例3和示例4。
     * <p>
     * 目前支持的扩展字段为：
     * IdCard，身份证照片，请求 CropIdCard 时返回；
     * Portrait，人像照片，请求 CropPortrait 时返回；
     * WarnInfos，告警信息（Code - 告警码），识别出以下告警内容时返回。
     * <p>
     * Code 告警码列表和释义：
     * -9100 身份证有效日期不合法告警，
     * -9101 身份证边框不完整告警，
     * -9102 身份证复印件告警，
     * -9103 身份证翻拍告警，
     * -9105 身份证框内遮挡告警，
     * -9104 临时身份证告警，
     * -9106 身份证 PS 告警。
     *
     * @return AdvancedInfo 扩展信息，根据请求的可选字段返回对应内容，不请求则不返回，具体输入参考示例3和示例4。
     * <p>
     * 目前支持的扩展字段为：
     * IdCard，身份证照片，请求 CropIdCard 时返回；
     * Portrait，人像照片，请求 CropPortrait 时返回；
     * WarnInfos，告警信息（Code - 告警码），识别出以下告警内容时返回。
     * <p>
     * Code 告警码列表和释义：
     * -9100 身份证有效日期不合法告警，
     * -9101 身份证边框不完整告警，
     * -9102 身份证复印件告警，
     * -9103 身份证翻拍告警，
     * -9105 身份证框内遮挡告警，
     * -9104 临时身份证告警，
     * -9106 身份证 PS 告警。
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set 扩展信息，根据请求的可选字段返回对应内容，不请求则不返回，具体输入参考示例3和示例4。
     * <p>
     * 目前支持的扩展字段为：
     * IdCard，身份证照片，请求 CropIdCard 时返回；
     * Portrait，人像照片，请求 CropPortrait 时返回；
     * WarnInfos，告警信息（Code - 告警码），识别出以下告警内容时返回。
     * <p>
     * Code 告警码列表和释义：
     * -9100 身份证有效日期不合法告警，
     * -9101 身份证边框不完整告警，
     * -9102 身份证复印件告警，
     * -9103 身份证翻拍告警，
     * -9105 身份证框内遮挡告警，
     * -9104 临时身份证告警，
     * -9106 身份证 PS 告警。
     *
     * @param AdvancedInfo 扩展信息，根据请求的可选字段返回对应内容，不请求则不返回，具体输入参考示例3和示例4。
     * <p>
     * 目前支持的扩展字段为：
     * IdCard，身份证照片，请求 CropIdCard 时返回；
     * Portrait，人像照片，请求 CropPortrait 时返回；
     * WarnInfos，告警信息（Code - 告警码），识别出以下告警内容时返回。
     * <p>
     * Code 告警码列表和释义：
     * -9100 身份证有效日期不合法告警，
     * -9101 身份证边框不完整告警，
     * -9102 身份证复印件告警，
     * -9103 身份证翻拍告警，
     * -9105 身份证框内遮挡告警，
     * -9104 临时身份证告警，
     * -9106 身份证 PS 告警。
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     *
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     *
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "Birth", this.Birth);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "IdNum", this.IdNum);
        this.setParamSimple(map, prefix + "Authority", this.Authority);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
